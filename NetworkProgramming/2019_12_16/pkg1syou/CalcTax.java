import java.io.*;

public class CalcTax
{
    public static double TAX = 1.1;

    public static void main(String[] args) throws IOException
    {
        BufferedReader br = 
        new BufferedReader(new InputStreamReader(System.in));

        System.out.println("消費税計算");
        System.out.print("定価を入力→");

        String str = br.readLine();
        int num = Integer.parseInt(str);

        System.out.printf("税込みの値段は" + Math.ceil((double)(num * TAX)) + "円です");

        br.close();
    }
}