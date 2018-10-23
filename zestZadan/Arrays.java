package pl.kurs.zestZadan;

public class Arrays {

    private static String[] alpha()
    {
        return new String[] {"a","b","c","d","e"};
    }

    private static double[] reverse(double[] tab)
    {
        return new double[]{tab[2],tab[1],tab[0]};
    }

    public static void main(String[] args) {

        alpha();

        double[] tab = {33, 46, 89};

        reverse(tab);

    }
}
