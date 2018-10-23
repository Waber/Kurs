package pl.kurs.zestZadan;

public class MyNumber {

    private double number;

    public MyNumber(double number)
    {
        this.number = number;
    }

    public boolean isOdd()
    {
        if(number % 2 > 0)
            return true;
        else
            return false;
    }

    public boolean isEven()
    {
        if(number % 2 == 0)
            return true;
        else
            return false;
    }

    public double sqrt()
    {
        return Math.sqrt(number);
    }

    public MyNumber pow(MyNumber x)
    {
        return new MyNumber(Math.pow(number,x.number));
    }

    public MyNumber add(MyNumber x)
    {
        return new MyNumber(number + x.number);
    }

    public MyNumber substract(MyNumber x)
    {
        return new MyNumber(number - x.number);
    }
}
