package pl.kurs.Pliki.src;


import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Exercise1 {

    public static void main(String[] args) throws IOException {
        System.out.println("Podaj ścieżkę do pliku");
        Scanner in = new Scanner(System.in);
        FileWriter output = null;
        String userText;

        try
        {
            output = new FileWriter(in.nextLine());
            System.out.println("Wprowadzaj kolejne linie tekstu, które chcesz zapisać w pliku, żeby zakończy wpisz -");
            while (true)
            {
                userText = in.nextLine();
                if(userText.equals("-"))
                {
                    break;
                }
                output.write(userText);
                output.write(System.lineSeparator());
            }

        } finally {
            if(output != null)
            {
                output.close();
            }
        }
    }
}
