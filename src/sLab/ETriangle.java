package sLab;

import static java.lang.StrictMath.sqrt;

public class ETriangle extends Shape {
    private int side;

    public ETriangle(int side)
    {
        super("ETriangle");
        this.side = side;
    }
    public double getArea()
    {
        return (sqrt(3)/4) * (side * side);

    }
    public double getPerimeter()
    {
        return 3 * side;
    }
}
