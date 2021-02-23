package edu.ping.stockx;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

import edu.ping.stockx.domain.item.Sneaker;


public class SneackerTest {
    
    private Sneaker sneak = null;
    
    @Before
    public void setup_sneaker() {
        this.sneak = new Sneaker("Jordan", "Air1");
        assertNotNull(sneak);
    }

    @Test
    public void constructorTest() {
        assertNotNull(sneak);
    }

    @Test
    public void getStyle() {
        assertEquals("Jordan", this.sneak.getStyle());
    }

    @Test
    public void getName() {
        assertEquals("Air1", this.sneak.getName());
    }

    /*@Test
    public void toStringTest() {
        assertEquals("Air1 Jordan", sneaker.toString());
    }*/
}
