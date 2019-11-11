import java.util.*;

public class Methods
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("数字1→");
        int a = sc.nextInt();
        System.out.print("数字2→");
        int b = sc.nextInt();

        int max = getMax(a, b);
        System.out.println("■2つの中で一番大きいのは→" + max);

        System.out.print("数字3→");
        int c = sc.nextInt();
        int max2 = getMax(a, b, c);
        System.out.println("■3つの中で一番大きいのは→" + max2);
        
        int[] ar = {a, b, c};
        int max3 = getMax(ar);
        System.out.println("■3つの中で一番大きいのは(配列)→" + max3);
        //数字1÷数字2の計算、答えは実数
        System.out.println("数字1/数字2→" + getDev(a, b));
        
        //名前を入れると「■お疲れ様でした、(名前)と返す」
        System.out.print("あなたの名前→");
        String str = sc.next();
        System.out.println(getThanks(str));
        
        sc.close();
    }

    public static int getMax(int x, int y)
    {
        int max = Math.max(x, y);
        return max;
    }

    static int getMax(int x, int y, int z)
    {
        int max = Math.max(x, y);
        int max_ans = Math.max(max, z);
        return max_ans;
    }
    
    static int getMax(int[] x)
    {
        int max = 0;
        for(int i = 0; i < x.length; i++)
        {
            if(max < x[i])
            {
                max = x[i];
            }
        }

        return max;
    }
    
    static String getThanks(String name)
    {
        String ans = "■お疲れ様でした、" + name + "さん";
        return ans;
    }
    
    static int getDev(int x, int y)
    {
        int z = x / y;
        return z;
    }
    
}



