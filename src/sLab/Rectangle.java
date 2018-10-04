package sLab;

public class Rectangle extends Shape {
    private int height;
    private int width;

    public Rectangle(int height,int width)
    {
        super("Rectangle");
        this.width = width;
        this.height = height;
    }
    public double getArea()
    {
        return width * height;
    }
    public double getPerimeter()
    {
        return 2 * (width+height);
    }
}
