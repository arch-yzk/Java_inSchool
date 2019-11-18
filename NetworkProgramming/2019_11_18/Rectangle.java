class Rectangle
{
    double width;
    double height;

    Rectangle()
    {
        this(0, 0);
    }

    Rectangle(double width, double height)
    {
        this.width = width;
        this.height = height;
    }

    double getArea()
    {
        double area = this.width * this.height;
        return area;
    }

    boolean isLarger(Rectangle x)
    {
        if(this.getArea() >= x.getArea())
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}