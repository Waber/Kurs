package pl.kurs.Testy;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class Basket  {

    Map<Item, Integer> orderedItems = new LinkedHashMap<>();

    public void add(Item item, int quantity)
    {
        if(quantity <= 0)
            throw new IllegalArgumentException("Ilość produktu nie może być mniejsza niż 1");

        if(orderedItems.containsKey(item))
        {
            quantity += orderedItems.get(item);
            orderedItems.put(item,quantity);
        }
        else
            orderedItems.put(item,quantity);
    }

    public void add(Item item)
    {
        add(item,1);
    }

    public void remove(Item item, int quantity)
    {
        if(quantity == 0)
            throw new IllegalArgumentException("Nie możesz usunąć 0 przedmiotów");

        if(!orderedItems.containsKey(item))
            throw new IllegalArgumentException("Nie masz takich produktów w koszyku");
        quantity = orderedItems.get(item) - quantity;


        if(quantity < 0)
            throw new IllegalArgumentException("Chcesz usunąć ilość większą niż masz w koszyku");
        else if(quantity == 0)
            orderedItems.remove(item);
        else
            orderedItems.put(item,quantity);
    }

    public void remove(Item item)
    {
        remove(item, 1);
    }

    @Override
    public String toString() {
        StringBuilder total = new StringBuilder();

        //System.out.println("Nazwa produktu | cena | ilość w koszyku | suma");
        for (Map.Entry<Item, Integer> entry:orderedItems.entrySet())
        {
            Item item = entry.getKey();
            int quantity = entry.getValue();
            total.append(item.getName()).append(item.getPrice()).append(quantity).append(item.getPrice() * quantity);
            total.append(System.lineSeparator());
        }
        return total.toString();
    }

    public double basketValue()
    {
        double sum = 0;
        for (Map.Entry<Item,Integer> entry : orderedItems.entrySet())
        {
            Item item = entry.getKey();
            sum += entry.getValue() * item.getPrice();
        }
        return sum;
    }
}
