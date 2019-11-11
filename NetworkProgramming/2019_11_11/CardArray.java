public class CardArray
{
    public static void main(String[] args)
    {
        StudentCard[] cards = new StudentCard[3];

        cards[0] = new StudentCard();
        cards[0].name = "ああああ";
        cards[1] = new StudentCard();
        cards[1].name = "あああい";
        cards[2] = new StudentCard();
        cards[2].name = "あああう";

        for(int i = 0; i <= 2; i++)
        {
            System.out.println(cards[i].name);
        }
    }
}