package pl.kurs.exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionTest {

    double pierwiastek(double number )
    {
        return Math.sqrt(number);
    }


    public static void main(String[] args) {

        System.out.println("Proszę podać liczbę do spierwiastkowania ");
        Scanner in = new Scanner(System.in);
        ExceptionTest pierw = new ExceptionTest();
        Double l=0.0;

        while (true)
            try {
                l = in.nextDouble();
                if(l < 0)
                    throw new IllegalArgumentException();
                break;
            }
            catch (InputMismatchException exception) {
                System.out.println("Miałeś podać liczbę a nie jakieś farmazony!");
            }
            catch (IllegalArgumentException exception) {
                System.out.println("Miałeś podać liczbę dodatnią!");
                l *= -1;
                break;
            }
            finally {
                in.nextLine();
            }


        System.out.printf("Pierwiastek z %f to %f",l, pierw.pierwiastek(l));

    }
}
