package pl.kurs.zestZadan;

public class Loops {

    public static void from0ToX (int x)
    {
        for (int i = 0; i < x ; i++) {
            System.out.println(i);
        }
    }

    public static void while0ToX(int x)
    {
        int i = 0;
        while (i <= x) {
            System.out.println(i);
            i++;
        }
    }

    public static void printNextLine(int x)
    {
        String print = new Integer(x).toString();
        for (int i = 0; i < print.length() ; i++) {
            System.out.println(print.charAt(i));

        }
    }

    public static String reverse(String x)
    {
        return new StringBuilder(x).reverse().toString();
    }

    public static int binary(int x)
    {
        StringBuilder sum = new StringBuilder();

        while (x > 0)
        {
            if (x % 2 == 0)
            {
                sum.append(0);
            }
            else if(x % 2 > 0)
            {
                sum.append(x % 2);
            }
            x /= 2;
        }
        return  Integer.parseInt(sum.reverse().toString());
    }

    public static boolean ispPlindrom(String x)
    {
        StringBuilder pal = new StringBuilder();
        pal.append(x.toLowerCase());
        if(pal.reverse().toString().equals(x.toLowerCase()))
            return true;
        else
            return false;
    }

    public static void arrayPrint(int[] tab)
    {
        System.out.print("[");

        for (int i = 0; i < tab.length; i++) {
            System.out.print(tab[i]);
            if(i<tab.length)
                System.out.print(",");
        }
        System.out.println("]");
    }

    public static void bubbleSort(int[] tab)
    {
        int temp=0;
        int n = tab.length;
        do {
            for (int i = 0; i < tab.length - 1; i++) {
                if (tab[i] > tab[i + 1]) {
                    temp = tab[i];
                    tab[i] = tab[i + 1];
                    tab[i + 1] = temp;
                }
            }
            n -= 1;
        }
        while(n > 1);
        for (int i = 0; i < tab.length; i++) {
            System.out.print(tab[i] + ",");
        }
    }



    public static void main(String[] args) {

        int x = 10;

        from0ToX(x);
        while0ToX(x);
        printNextLine(x);
        String s = "Ana";
        System.out.println(reverse(s));
        System.out.println(binary(x));
        System.out.println(ispPlindrom(s));
        int[] tab = new int[]{4,8,2,5,1,14,22,10};
        arrayPrint(tab);
        bubbleSort(tab);

    }
}
