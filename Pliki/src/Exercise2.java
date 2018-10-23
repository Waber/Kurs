package pl.kurs.Pliki.src;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Exercise2 {

    public static void main(String[] args) throws IOException {
        System.out.println("Podaj ścieżkę do pliku");
        BufferedReader input = null;
        String str="";
        int lines=0;
        Scanner in = new Scanner(System.in);

        try{
            input = new BufferedReader(new FileReader(in.nextLine()));
            while (true)
            {
                if((str = input.readLine()) == null)
                {
                    break;
                }
                System.out.println(str);
              lines++;
            }

        }finally {
            if(input != null)
            {
                input.close();
            }
        }
        System.out.println(lines);
    }
}
