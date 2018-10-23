package pl.kurs.rzutowanie;

import java.util.Scanner;

public class Rzutowania {

    public static void main(String[] args) {

        int calkowita;
        Scanner in = new Scanner(System.in);

        System.out.println("Podaj liczbę do pomnożenia przez PI");
        calkowita = in.nextInt();

        System.out.println("Liczba całkowita "+(int)(calkowita * Math.PI));

        System.out.println("Zmiennoprzecinkowa "+ calkowita * Math.PI);

    }

}
