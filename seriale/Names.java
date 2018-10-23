package pl.kurs.seriale;

import java.io.*;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Names implements Serializable {

    private static List<String> name = new LinkedList<>();

    public Names()
    {
        System.out.println("Wprowadzaj kolejne imiona, gdy będziesz chciał zakończyć wpisz -");
        Scanner in = new Scanner(System.in);
        String temp="";
        while(true)
        {
            temp = in.next();
            if(temp.equals("-"))
                break;
            name.add(temp);
        }
    }

    public static List<String> getName() {
        return name;
    }

    public static void main(String[] args) throws IOException, ClassNotFoundException {

        Names names = new Names();

        try(ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream("objects.db"))){
            outputStream.writeObject(names);
        }

        try(ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream("objects.db"))){
            Names afterNames = (Names) inputStream.readObject();
            List<String> listOfNames = afterNames.getName();

            for (String name : listOfNames) {
                System.out.println(name);

            }
        }

    }


}
