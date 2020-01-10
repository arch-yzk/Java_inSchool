import java.util.Random;

class Souko
{
    private int zaiko;

    Souko(int n)
    {
        this.zaiko = n;
    }

    int getZaiko()
    {
        return zaiko;
    }

    synchronized int pickZaiko(int n)
    {
        zaiko = zaiko - n;
        return zaiko;
    }
}

class Operator extends Thread
{
    private Souko souko;
    private String name;
    private int pickCount;
    private static Object monitor = new Object(); //ロックを確実にする専用オブジェクト

    Operator(Souko souko, String name, int pickCount)
    {
        this.souko = souko;
        this.name = name;
        this.pickCount = pickCount;
    }

    public void run()
    {
        while(souko.getZaiko() != 0)
        {
            synchronized(monitor)
            {
                if(souko.getZaiko() < this.pickCount)
                {
    
                    System.out.println(name + "さんが一度に取れる個数以下なので終了");
                    break;
                }
                souko.pickZaiko(this.pickCount);
                System.out.println(this.name + "さんが" + pickCount + "とったので、残り" + souko.getZaiko());
            }
            Random randomGenerator = new Random();
            int num = randomGenerator.nextInt(500);
            try
            {
                sleep(num);
            }
            catch(InterruptedException e)
            {
                System.out.println(e);
            }
        }
    }
}

public class SoukoMain
{
    public static void main(String[] args)
    {
        System.out.println("このプログラムはランダムにスレッドを実行したいため、sleep()を使って処理を重くしています。");
        Souko souko = new Souko(10);
        Operator A = new Operator(souko, "A", 1);
        Operator B = new Operator(souko, "B", 2);

        
        souko.getZaiko();
        A.start();
        B.start();

        try
        {
            A.join();
            B.join();
        }
        catch(InterruptedException e)
        {
            System.out.println(e);
        }

        System.out.println("作業終了");
    }
}