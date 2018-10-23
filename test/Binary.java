package pl.kurs.test;

import com.sun.deploy.util.StringUtils;

import java.util.Scanner;

public class Binary {

    private int system;


    public Binary(int system)
    {
        this.system = system;
    }

    String algo (int number)
    {
        StringBuilder sum = new StringBuilder();

        while (number > 0)
        {
            if (number % system == 0)
            {
                sum.append(0);
            }
            else if(number % system > 0)
            {
                sum.append(number % system);
            }
            else
                System.out.println("Błąd");

            number /= system;
        }

        return sum.reverse().toString();

    }

    public static void main(String[] args) {

        System.out.println("Wybierz system liczbowy z jakiego chcesz skorzystać (2,4,8 itp");
        Scanner in = new Scanner((System.in));

        Binary binary = new Binary(in.nextInt());

        System.out.println("Wprowadź liczbę, którą chcesz zapisać w wybranym systemie");
        int number = in.nextInt();

        System.out.printf("Liczba %d zapisana w wybranym systemie wygląda tak: %s\n", number, binary.algo(number));

    }

}
