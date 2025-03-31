/*
Bagel-Shop Final Project
CS5004 Spring 2025
Sam Duddy
3/17/2025
 */

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class ItemTest {

    Item i1;
    Item i2;


    @Before
    public void setUp(){
        i1 = new Item("Test1", 2);
        i2 = new Item("Test2", 1);

    }
    @Test
    public void testConstructor(){
        assertEquals("Test1", i1.getName());
        assertEquals("Test2", i2.getName());
        assertEquals(2, i1.getQuantity());
        assertEquals(1, i2.getQuantity());
        assertEquals(20.0, i1.getPrice(), 0.001);
        assertEquals(5.0, i2.getPrice(), 0.001);
    }
    @Test
    public void testAddQuantity(){
        i1.addQuantity(1);
        i2.addQuantity(2);

        assertEquals(3, i1.getQuantity());
        assertEquals(3, i2.getQuantity());

        assertEquals(30.0, i1.getPrice(), 0.001);
        assertEquals(15.0, i2.getPrice(), 0.001);

    }

    @Test
    public void testToString(){
        assertEquals("2 x Test1: $20.00", i1.toString());

        i1.addQuantity(1);

        assertEquals("3 x Test1: $30.00", i1.toString());
    }
}
