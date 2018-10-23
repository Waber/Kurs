package pl.kurs.test;

public class Loops {
    public static void main(String[] args) {

        System.out.println("For loop");
        for (int i = 20; i >= 10 ; i--) {
            System.out.println(i);
        }

        System.out.println("While loop");
        int wh = 10;
        while(wh <= 20)
        {
            System.out.println(wh);
            wh++;
        }

        System.out.println("Odd number from for loop");
        for (int i = -10; i < 40 ; i++) {
            if((i % 2) != 0)
                System.out.println(i);

        }

        System.out.println("Odd number from while loop");
        int oddWh = -10;
        while (oddWh <= 40) {
            if ((oddWh % 2) != 0)
                System.out.println(oddWh);
            oddWh++;
        }
    }
}
