package pl.kurs.formatter;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FormatterExcercise {

    public static void main(String[] args) throws IOException {



    String fileSrc = "C:\\Users\\Standard\\Desktop\\test.csv";
    BufferedReader input = null;
    String str = "";

    try {
        input = new BufferedReader(new FileReader(fileSrc));
        while(true)
        {
            if((str = input.readLine()) == null){
                break;
            }
            String[] format = str.split(",");
            //Formatowanie - justowanie do lewej strony + szerokość odpowiednia
            System.out.format(" | %1$-7s | %2$-7.2f | %3$-12s | %n",format[0], Double.valueOf(format[1]),format[2]);
        }

    } finally{
        if(input != null)
        {
            input.close();
        }
    }
}
}
