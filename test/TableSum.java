package pl.kurs.test;

import java.util.Scanner;

public class TableSum {

    public static void main(String[] args) {

        Scanner read = new Scanner(System.in);
        System.out.println("Wprowadź wielkość dwuwymiarowej tablicy");
        int[][] table = new int[read.nextInt()][read.nextInt()];

        for (int i = 0; i < table.length ; i++) {
            for (int j = 0; j < table[i].length ; j++) {
                table[i][j] = j;

            }

        }

        int sum = 0;

        for (int i = 0; i < table.length ; i++) {
            for (int j = 0; j < table[i].length ; j++) {
                sum += table[i][j];

            }
        }

        System.out.printf("Wynik zsumowania wartośc tablicy %d\n ", sum);

    }
}
