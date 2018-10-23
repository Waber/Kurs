package pl.kurs.zestZadan;

public class Human {

    private Integer age;
    private Integer weight;
    private Integer height;
    private String name;
    private  String sex;

    public Integer getAge() {
        return age;
    }

    public Integer getWeight() {
        return weight;
    }

    public Integer getHeight() {
        return height;
    }

    public String getName() {
        return name;
    }

    private boolean isMale(String sex)
    {
        if(sex.equalsIgnoreCase("male"))
            return true;
        else
            return false;
    }
}
