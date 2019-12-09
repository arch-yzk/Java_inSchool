interface Coloring
{
    int BLACK = 0;
    int RED = 1;
    int YELLOW = 2;
    int BLUE = 3;
    int PINK = 4;
    String[] colorName = {"黒", "赤", "黄", "青", "桃"};

    void changeColor(int color);
}