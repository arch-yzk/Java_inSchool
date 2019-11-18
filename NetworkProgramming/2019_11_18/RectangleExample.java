public class RectangleExample
{
    public static void main(String[] args)
    {
        Rectangle a = new Rectangle(20.3, 30.4);
        double area = a.getArea();
        System.out.printf("面積は%fです\n", area);

        Rectangle b = new Rectangle(10.2, 40.5);
        if(a.isLarger(b) == true)
        {
            System.out.println("aのほうが大きい");
        }
        else
        {
            System.out.println("bのほうが大きい");
        }
    }
}