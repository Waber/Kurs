package pl.kurs.zestZadan;

public class Rectangle implements Figure {

    double a;
    double b;

    public Rectangle(double a, double b)
    {
        this.a = a;
        this.b = b;
    }

    public double getPerimeter()
    {
        return 2 * a + 2 * b;
    }

    @Override
    public double getArea()
    {
        return a*b;
    }

    public String getName()
    {
        return "Prostokąt";
    }

}
