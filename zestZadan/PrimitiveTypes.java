package pl.kurs.zestZadan;
import pl.kurs.zestZadan.Loops;

import java.util.Scanner;

public class PrimitiveTypes {

    public static void printBinary()
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Podaj liczbę, którą chces zamienić na system binarny");
        System.out.println(Loops.binary(in.nextInt()));
    }

    public static void printSortTable()
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Podaj długość tablicy");
        int length = in.nextInt();
        int tab[] = new int[length];
        for (int i = 0; i < length ; i++) {
            System.out.println("Wprowadź kolejny element tablicy");
            tab[i] = in.nextInt();
        }
        Loops.bubbleSort(tab);
        Loops.arrayPrint(tab);
    }

    public static void checkString()
    {
        System.out.println("Wprowadź łańcuch znaków");
        Scanner in = new Scanner(System.in);
        String chain = in.nextLine().toString();

        System.out.println(chain.length());
        System.out.println(Loops.ispPlindrom(chain));
        System.out.println(Loops.reverse(chain));

    }

    public static void main(String[] args) {
        printBinary();
        printSortTable();
        checkString();

    }
}
