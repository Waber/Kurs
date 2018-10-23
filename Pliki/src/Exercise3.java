package pl.kurs.Pliki.src;

import java.io.DataOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class Exercise3 {

    public static void main(String[] args) throws IOException {
        System.out.println("Podaj ścieżkę do pliku");
        DataOutputStream outputStream = null;
        Scanner in = new Scanner(System.in);

        try
        {
            outputStream = new DataOutputStream(new FileOutputStream(in.nextLine()));
            System.out.println("Podaj datę urodzenia - dzień");
            int birthday = in.nextInt();
            outputStream.writeInt(birthday);
            System.out.println("Podaj miesiąc urodzenia");
            int birthMonth = in.nextInt();
            outputStream.writeInt(birthMonth);
            System.out.println("Podaj rok urodzenia");
            int birthYear = in.nextInt();
            outputStream.writeInt(birthYear);
        } finally {
            if(outputStream != null)
            {
                outputStream.close();
            }
        }
    }
}
