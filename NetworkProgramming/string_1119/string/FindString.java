import java.io.*;

public class FindString
{
    public static void main(String[] args) throws IOException
    {
        String str1, str2;

        BufferedReader br = 
        new BufferedReader(new InputStreamReader(System.in));

        System.out.print("文字列は→");
        str1 = br.readLine();
        System.out.print("検索文字列は→");
        str2 = br.readLine();

        System.out.println("検索結果→" + ((str1.indexOf(str2)) + 1) + "文字目");

        br.close();
    }
}