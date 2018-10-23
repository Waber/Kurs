package pl.kurs.Pliki.src;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class Exercise4 {

    public static void main(String[] args) throws IOException {
        System.out.println("Podaj ścieżkę do pliku");
        DataInputStream inputStream = null;
        Scanner in = new Scanner(System.in);
        int birthday, birthMonth, birthYear;

        try
        {
            inputStream = new DataInputStream(new FileInputStream(in.nextLine()));
             birthday = inputStream.readInt();
             birthMonth = inputStream.readInt();
             birthYear = inputStream.readInt();
        } finally {
            if(inputStream != null)
            {
                inputStream.close();
            }
        }
        System.out.println("Data urodzenia: "+birthday +" "+ birthMonth + " " + birthYear );

    }
}
