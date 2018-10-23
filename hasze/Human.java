package pl.kurs.hasze;

import java.util.Objects;

public class Human {

    private String name;
    private String surname;
    private String ID; // Numer PESEL

    public Human(String name, String surname, String ID)
    {
        this.ID = ID;
        this.name = name;
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getID() {
        return ID;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj == null)
            return false;
        if(obj instanceof Human) {
            Human otherHuman = (Human) obj;
            return (ID.equals(otherHuman.ID));
        }
        return false;
    }

    @Override
    public String toString() {
        return name + " " + surname + " " + ID;
    }

    @Override
    public int hashCode() {
        return Objects.hash(ID);
    }

    public static void main(String[] args) {

        Human h1 = new Human("Jan", "Kowalski", "89082405811");
        Human h2 = new Human("Jan", "Kowalski", "89082405811");
        Human h3 = new Human("Jan", "Kowalski", "80082405411");

        System.out.println(h1.hashCode() + " == " + h2.hashCode() + " " + h1.equals(h2));
        System.out.println(h1 + " == " + h3 + " " + h1.equals(h3));
        System.out.println(h2 + " == " + h3 + " " + h2.equals(h3));

    }

}
