package pl.kurs.Testy;

import java.util.Objects;

public class Item {

    private double price;
    private final String name;

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
    @Override
    public boolean equals(Object obj)
    {
        if(obj == null)
        {
            return false;
        }

        if(!(obj instanceof Item))
        {
            return false;
        }
        Item otherItem = (Item) obj;
        if (Double.compare(price,otherItem.price) != 0 ) {
            return false;
        }
        else {
            return name.equals(otherItem.name);
        }
    }

    @Override
    public int hashCode()
    {
        return Objects.hash(name);
    }
}
