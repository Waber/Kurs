package pl.kurs.Testy;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ItemTest {

    @Test
    public void shouldSayThatParameterEquals()
    {
        Item item = new Item("Coś",4.25);
        Assert.assertEquals("Coś",item.getName());
        Assert.assertEquals(4.25,item.getPrice(), 1e-8);
    }

}