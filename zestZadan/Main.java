package pl.kurs.zestZadan;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Figure[] figures = new Figure[3];

        System.out.println("Podaj promień koła");

        Scanner in = new Scanner(System.in);
        Circle circle = new Circle(in.nextDouble());

        System.out.println("Podaj długości boków trójkąta");
        Triangle triangle = new Triangle(in.nextDouble(),in.nextDouble());

        System.out.println("Podaj długości boków prostokąta");
        Rectangle rectangle = new Rectangle(in.nextDouble(), in.nextDouble());

        figures[0] = circle;
        figures[1] = triangle;
        figures[2] = rectangle;

        for (int i = 0; i < figures.length ; i++) {
            System.out.println(figures[i].getName());
            System.out.println("Pole powierzchni: "+figures[i].getArea());
            System.out.println("Obwód: "+figures[i].getPerimeter());
        }





    }
}
