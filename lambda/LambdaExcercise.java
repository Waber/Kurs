package pl.kurs.lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.Consumer;

public class LambdaExcercise {

    public static void main(String[] args) {

        List<String> str = new ArrayList<>();
        System.out.println("Podaj cztery różne łańcuchy znaków");
        Scanner in = new Scanner(System.in);

        for(int i =0; i < 4; i++)
        {
            str.add(in.nextLine());
        }

        str.sort((a,b) -> a.length() - b.length());

        System.out.println(str);


    }
}