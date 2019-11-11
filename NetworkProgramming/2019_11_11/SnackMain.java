public class SnackMain
{
    public static void main(String[] args)
    {
        Snack snack[] = new Snack[3];

        snack[0] = new Snack();
        snack[1] = new Snack();
        snack[2] = new Snack();

        snack[0].id = 1;
        snack[0].name = "ココナッツサブレ";//好きなお菓子無いので勘弁してください
        snack[0].makerName = "日清シスコ";
        snack[0].price = 100;
        snack[0].taste = "サクサクして、ココナッツの香ばしさがたまらない!!";
        snack[0].favorite = true;

        snack[1].id = 2;
        snack[1].name = "カラムーチョ";
        snack[1].makerName = "湖池屋";
        snack[1].price = 200;
        snack[1].taste = "細切りで食べにくいけど、チリパウダーの粉っぽいところがうますぎる。";
        snack[1].favorite = true;

        snack[2].id = 3;
        snack[2].name = "HARIBOグミ";
        snack[2].makerName = "HARIBO";
        snack[2].price = 250;
        snack[2].taste = "硬すぎる。人気ある理由がわからない。";;
        snack[2].favorite = false;

        printSnack(snack);
    }


    static void printSnack(Snack x[])
    {
        for(int i = 0; i <= 2; i++)
        {
            System.out.println("★お菓子の紹介" + x[i].id);
            System.out.println("【商品名】" + x[i].name);
            System.out.println("【メーカー名】" + x[i].makerName);
            System.out.println("【価格】\\" + x[i].price);
            System.out.println("【味】" + x[i].taste);
            if(x[i].favorite == true)
            {
                System.out.println("【好き嫌い】好き");
            }
            else
            {
                System.out.println("【好き嫌い】嫌い");
            }
        }
    }
}


class Snack
{
    int id;
    String name;
    String makerName;
    int price;
    String taste;
    boolean favorite;
}
