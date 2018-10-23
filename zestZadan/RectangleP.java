package pl.kurs.zestZadan;

public class RectangleP {

    private double length;
    private double width;

    public RectangleP(double length, double width)
    {
        this.length = length;
        this.width = width;
    }

    public double getField()
    {
        return length * width;
    }

    public double getPerimeter()
    {
        return 2 * length + 2 * width;
    }

    public double getDiagonal()
    {
        return Math.sqrt(length * length + width * width);
    }

}
