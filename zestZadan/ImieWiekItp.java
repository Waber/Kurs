package pl.kurs.zestZadan;

public class ImieWiekItp {

    private static int myAge()
    {
        return 29;
    }

    private static String name()
    {
        return "Przemek";
    }

    private static void addSubMulDiv(int a, int b)
    {
        System.out.println("Dodawanie: "+(a+b));
        System.out.println("Odejmowania: "+(a-b));
        System.out.println("Mnożenie: "+(a*b));
        System.out.println("Dzielenie: "+(a/b));
    }

    private static boolean isEven (int a)
    {
        if(a % 2 == 0)
            return true;
        else
            return false;
    }

    private static boolean isDivby (int a)
    {
        if(a % 3 ==0 && a % 5 ==0)
            return true;
        else
            return false;
    }

    private static double pow(int a)
    {
        return Math.pow(a,3);
    }

    private static double square(int a)
    {
        return Math.sqrt(a);
    }

    private static boolean isTriangle(int a, int b, int c)
    {
        if((a*a) + (b*b) == (c*c) || (a*a) + (c*c) == (b*b) || (b*b) + (c*c) == (a*a))
            return true;
        else
            return false;
    }

    public static void main(String[] args) {
        System.out.println(myAge());
        System.out.println(name());
        addSubMulDiv(4,8);
        System.out.println(isEven(4));
        System.out.println(isDivby(7));
        System.out.println(pow(3));
        System.out.println(square(24));
        System.out.println(isTriangle(5,6,8));

    }
}
