package pl.kurs.zestZadan;

public class Circle implements Figure {

    double r;

    public Circle( double r)
    {
        this.r = r;
    }

    @Override
    public double getPerimeter()
    {
        return 2*Math.PI*r;
    }

    @Override
    public double getArea() {
        return Math.PI*(r*r);
    }

    public String getName()
    {
        return "Koło";
    }
}
