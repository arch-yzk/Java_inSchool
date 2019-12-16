class PortablePlayer implements Player, Coloring
{
    public void changeColor(int color)
    {
        System.out.println("▲色を" + colorName[color] + "に変更");
    }

    public void play()
    {
        System.out.println("▲再生開始\n");
    }

    public void stop()
    {
        System.out.println("▲再生終了");
    }
}