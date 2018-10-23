package pl.kurs.enumy;

public class Human {

    public enum EyeColor{
        BLUE,
        GREEN,
        BLACK,
        BROWN};
    public enum HairColor{
        RED,
        GREEN,
        BROWN,
        BLOND};

    private String name;
    private int age;
    private EyeColor eyeColor;
    private HairColor hairColor;


    public Human(String name, int age, EyeColor eyeColor, HairColor hairColor) {
        this.name = name;
        this.age = age;
        this.eyeColor = eyeColor;
        this.hairColor = hairColor;
    }

    public static void main(String[] args) {
        Human human = new Human("Ziomek", 27, EyeColor.GREEN,HairColor.BLOND);
        System.out.println(human.name + " "+ human.age + " " + human.eyeColor + " " + human.hairColor);
    }



}
