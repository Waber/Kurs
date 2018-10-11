package pl.kurs.Testy;

import com.sun.org.apache.xpath.internal.operations.String;
import org.junit.Assert;
import org.junit.Before;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BasketTest {

    private Basket basket;
    private Item item;

    @BeforeEach
    public void setUp()
    {
        basket = new Basket();
        item = new Item("thing",5.24);
    }

    @Test
    public void shouldAddOneThing()
    {
        basket.add(item);
        Assert.assertTrue(item.getName(),basket.orderedItems.containsKey(item));
    }

    @Test
    public void shouldAddMany()
    {
        basket.add(item, 50);
        Assert.assertEquals(basket.orderedItems.get(item), (Integer) 50);
    }

    @Test
    public void shouldRemoveOne()
    {
        basket.add(item, 10);
        basket.remove(item);
        Assert.assertEquals(basket.orderedItems.get(item), (Integer) 9);
    }

    @Test
    public void shouldRemoveMany()
    {
        basket.add(item, 30);
        basket.remove(item, 15);
        Assert.assertEquals(basket.orderedItems.get(item), (Integer) 15);
    }

    @Test
    public void shouldRemoveItemIfQuantityInListIs0()
    {
        basket.add(item, 5);
        basket.remove(item, 5);
        Assert.assertFalse(item.getName(),basket.orderedItems.containsKey(item));
    }

    @Test
    public void shouldThrowExceptionIfAdding0Items()
    {
        IllegalArgumentException exception = assertThrows(
                IllegalArgumentException.class,
                () -> basket.add(item,0) );
        assertEquals("Ilość produktu nie może być mniejsza niż 1",exception.getMessage());
    }

    @Test
    public void shouldThrowExceptionIfAddingNegativeQuantity()
    {
        IllegalArgumentException exception = assertThrows(
                IllegalArgumentException.class,() -> basket.add(item,-10));
        assertEquals("Ilość produktu nie może być mniejsza niż 1",exception.getMessage());

    }

    @Test
    public void shouldThrowExceptionIfRemoving0Items()
    {
        IllegalArgumentException exception = assertThrows(
                IllegalArgumentException.class, () -> basket.remove(item,0));
        assertEquals("Nie możesz usunąć 0 przedmiotów",exception.getMessage());
    }

    @Test
    public void shouldThrowExceptionIfRemovingMoreThenIsInBasket()
    {
        basket.add(item);
        IllegalArgumentException exception = assertThrows(
                IllegalArgumentException.class,() -> basket.remove(item,2));
        assertEquals("Chcesz usunąć ilość większą niż masz w koszyku",exception.getMessage());
    }

    @Test
    public void shouldThrowExceptionIfTryingToRemoveItemThatIsNotInBasket()
    {
        IllegalArgumentException exception = assertThrows(
                IllegalArgumentException.class,() -> basket.remove(item));
        assertEquals("Nie masz takich produktów w koszyku",exception.getMessage());
    }

    @Test
    public void shouldPrintWholeBasket()
    {
        basket.add(item,2);
        StringBuilder test = new StringBuilder();
        test.append("thing").append(item.getPrice()).append(2).append(2*item.getPrice());
        test.append(System.lineSeparator());
        Assert.assertEquals(test.toString(),basket.toString());
    }

    @Test
    public void shouldPrintBasketValue()
    {
        basket.add(item,4);
        Assert.assertEquals(item.getPrice()*4,basket.basketValue(),1e-8);
    }

    @Test
    public void shouldDifferentiateWhenSameThingsDifferentPrice()
    {
        basket.add(new Item("thing1",20));
        basket.add(new Item("thing1",40));

        StringBuilder test = new StringBuilder();
        test.append("thing1").append(20.0).append(1).append(20.0);
        test.append(System.lineSeparator());
        test.append("thing1").append(40.0).append(1).append(40.0);
        test.append(System.lineSeparator());

        Assert.assertEquals(test.toString(),basket.toString());
    }

    @Test
    public void shouldIncreaseQuantityWhenAddingAgainTheSameThing()
    {
        basket.add(new Item("thing1",20));
        basket.add(new Item("thing1",20));

        StringBuilder test = new StringBuilder();
        test.append("thing1").append(20.0).append(2).append(40.0);
        test.append(System.lineSeparator());

        Assert.assertEquals(test.toString(),basket.toString());
    }

}