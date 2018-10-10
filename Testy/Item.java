package pl.kurs.Testy;

public class Item {

    private double price;
    private String name;

    public Item(String name, double price)
    {
        if(price <0)
            price *= -1;
        this.name = name;
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public String getName() {
        return name;
    }
}
