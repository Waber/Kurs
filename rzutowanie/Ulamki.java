package pl.kurs.rzutowanie;

import java.util.Scanner;

public class Ulamki {

    public static void main(String[] args) {

        double l1, l2;

        Scanner in = new Scanner((System.in));
        System.out.println("Podaj dwie liczby całkowite");

        l1 = in.nextInt();
        l2 = in.nextInt();
        double sum = l1/l2;

        System.out.println("Wynik dzielenia dwóch liczb całkowitych wraz z częściami ułamkowymi: "+ l1 / l2);


    }
}
