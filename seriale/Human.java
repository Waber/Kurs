package pl.kurs.seriale;

import java.io.*;
import java.util.Calendar;

public class Human implements Serializable {

    private String name;
    private transient int age;

    public Human(String name, int age)
    {
        this.name = name;
        this.age = age;
    }

    private void writeObject(ObjectOutputStream outputStream) throws IOException {
        outputStream.defaultWriteObject();
        outputStream.writeInt(Calendar.getInstance().get(Calendar.YEAR) - age);
    }

    private void readObject(ObjectInputStream inputStream) throws IOException, ClassNotFoundException {
        inputStream.defaultReadObject();
        age = Calendar.getInstance().get(Calendar.YEAR) - inputStream.readInt();
    }

    public static void main(String[] args) throws IOException, ClassNotFoundException {

        Human human = new Human("Piotrek", 35);

        try(ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream("czlowiek.bin")))
        {
            outputStream.writeObject(human);
        }

        try(ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream("czlowiek.bin")))
        {
            Human newHuman = (Human) inputStream.readObject();
            System.out.println("Wiek klona: "+newHuman.age);
        }
    }
}
