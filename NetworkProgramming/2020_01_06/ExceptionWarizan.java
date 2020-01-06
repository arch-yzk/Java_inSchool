import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class ExceptionWarizan
{
    public static void main(String[] args)throws IOException
    {
        for(;;)
        {
            try
            {
                int num1 = 0;
                int num2 = 1;
                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

                System.out.print("割られる数 > ");
                String str1 = br.readLine();
                num1 = Integer.parseInt(str1);
        
                System.out.print("割る数 > ");
                String str2 = br.readLine();
                num2 = Integer.parseInt(str2);
        
                System.out.printf("%d / %d = %d", num1, num2, num1/num2);
            }
            
            catch(ArithmeticException e)
            {
                System.out.println("0で除算しないで");
            }

            catch(NumberFormatException e)
            {
                System.out.println("int以外を入力しないで");
            }
        }
    }
}