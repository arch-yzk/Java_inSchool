import java.util.*;

class DrawMethods
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        boolean cont = true;

        while(cont)
        {
            System.out.println("何を描く？ 1:点 2:線 3:四角 9:終了");
            System.out.print("→");
            int menu = sc.nextInt();

            switch(menu)
            {
                case 1:
                    drawPoint();
                    drawCR();
                    break;

                case 2:
                    drawLine(sc.nextInt());
                    drawCR();
                    break;

                case 3:
                    drawRectangle(sc.nextInt(), sc.nextInt());
                    drawCR();
                    break;

                case 9:
                    cont = false;
                    break;
            }
        }

        sc.close();
    }

    static void drawCR()
    {
        System.out.print("\n");
    }

    static void drawPoint()
    {
        System.out.print("■");
    }

    static void drawLine(int x)
    {
        for(int i = 0; i < x; i++)
        {
            System.out.print('■');
        }
    }

    static void drawRectangle(int x, int y)
    {
        for(int i = 0; i < x; i++)
        {
            for(int j = 0; j <= y; j++)
            {
                System.out.print('■');
            }
            System.out.print("\n");
        }
    }
}