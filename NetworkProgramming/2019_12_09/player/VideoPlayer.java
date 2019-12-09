
//VideoPlayerクラス（Playerインタフェースを実装）

class VideoPlayer implements Player
{
    private int id;
    private static int lastId;//最新の製造番号

    VideoPlayer()
    {
        lastId++;//製造番号を付与
        id = lastId; //製造番号付与
    }

    void printInfo()
    {
        System.out.printf("製造番号→【%d】\n", id);
    }

    //再生
    public void play()
    {
        System.out.println("■ビデオ再生開始\n");
    }

    //停止
    public void stop()
    {
        System.out.println("■ビデオ再生終了\n");
    }
}