//CDプレーヤークラス
//Playerインタフェースを実装する
class CDPlayer implements Player //Player実装
{
    public void play()
    {
        System.out.println("□CD再生開始\n");
    }

    //停止
    public void stop()
    {
        System.out.println("□CD再生終了");
    }

    //ヘッドクリーニング
    void cleanUp()
    {
        System.out.println("□ヘッドクリーニングした\n");
    }
}