package edu.ping.stockx;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Before;
import org.junit.Test;

import edu.ping.stockx.domain.offer.Sale;

public class SaleTest {
    
    private Sale sale = null;

    @Before
    public void setup_sneaker() {
        this.sale = new Sale("9.5", 18);
        assertNotNull(sale);
    }

    @Test
    public void constructorTest() {
        assertNotNull(sale);
    }

    @Test
    public void size() {
        assertEquals("9.5", this.sale.size());
    }

    @Test
    public void value() {
        assertEquals(18, this.sale.value());
    }
}
