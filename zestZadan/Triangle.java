package pl.kurs.zestZadan;

public class Triangle implements Figure {

    double a;
    double b;

    public Triangle(double a, double b)
    {
        this.a = a;
        this.b = b;
    }

    public double getPerimeter()
    {
        double c = Math.sqrt(a*a + b*b);
        return a + b + c;
    }

    @Override
    public double getArea() {
        return (a*b)/2;
    }

    public String getName(){
        return "Trójkąt";
    }
}
