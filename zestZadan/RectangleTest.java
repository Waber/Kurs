package pl.kurs.zestZadan;

import org.junit.Before;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RectangleTest {

    private Rectangle rectangle;

    @BeforeEach
   public void setUp() {
       rectangle = new Rectangle(12,20);
    }

    @Test
    public void shouldCalculateArea() {
        assertTrue(rectangle.getArea() == 240);
    }
}