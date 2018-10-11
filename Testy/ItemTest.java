package pl.kurs.Testy;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ItemTest {

    @Test
    public void itemsWithSameNameAndPriceShouldBeEqual()
    {
        Assert.assertEquals(new Item("Thing", 5.50), new Item("Thing", 5.50));
    }

    @Test
    public void itemsWithSameNameDifferentPriceShouldntBeEqual()
    {
        Assert.assertNotEquals(new Item("Thing", 5.50), new Item("Thing", 5.90));
    }

    @Test
    public void itemsWithDifferentNameSamePriceShouldntBeEqual()
    {
        Assert.assertNotEquals(new Item("Thing", 5.50), new Item("Thing1", 5.50));
    }

}