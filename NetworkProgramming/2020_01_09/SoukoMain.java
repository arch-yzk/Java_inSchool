import java.util.Random;

class Souko
{
    private int zaiko;

    Souko(int n)
    {
        this.zaiko = n;
    }

    synchronized int getZaiko()
    {
        return zaiko;
    }

    synchronized int pickZaiko(int n)
    {
        return zaiko -= n;
    }
}

class Operator extends Thread
{
    private Souko souko;
    private String name;
    private int pickCount;
    Random random = new Random();
    private int flag = random.nextInt(2);
    private static Object monitor = new Object(); //ロックを確実にする専用オブジェクト

    Operator(Souko souko, String name, int pickCount)
    {
        this.souko = souko;
        this.name = name;
        this.pickCount = pickCount;
    }

    public void run()
    {
        for(;;)
        {
            synchronized(monitor)
            {
                if(souko.getZaiko() == 0)
                {
                    break;
                }
                else if(souko.getZaiko() < pickCount)
                {
                    int buffer = souko.getZaiko();
                    souko.pickZaiko(souko.getZaiko());
                    System.out.println(this.name + "さんが" + buffer + "個とったので、残り" + souko.getZaiko());
                    break;
                }
                souko.pickZaiko(this.pickCount);
                System.out.println(this.name + "さんが" + this.pickCount + "個とったので、残り" + souko.getZaiko());
            }
            Thread.yield();
            this.flag++;
            if(this.flag >= random.nextInt(10))
            {
                try
                {
                    sleep(5);
                }
                catch(InterruptedException e)
                {
                    System.out.println(e);
                }
                finally
                {
                    //Random random = new Random();
                    this.flag = random.nextInt(2);
                }
            }
        }
    }
}

public class SoukoMain
{
    public static void main(String[] args)
    {
        //System.out.println("このプログラムはランダムにスレッドを実行したいため、sleep()を使って処理を重くしています。");
        Souko souko = new Souko(10);
        Operator A = new Operator(souko, "A", 1);
        Operator B = new Operator(souko, "B", 2);
        
        souko.getZaiko();
        
        A.start();
        B.start();

        try
        {
            B.join();
            A.join();
        }
        catch(InterruptedException e)
        {
            System.out.println(e);
        }
        

        System.out.println("作業終了");
    }
}