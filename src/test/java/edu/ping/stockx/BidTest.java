package edu.ping.stockx;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Before;
import org.junit.Test;

import edu.ping.stockx.domain.offer.Bid;


public class BidTest {
    
    private Bid bid = null;

    @Before
    public void setup_sneaker() {
        this.bid = new Bid("9.5", 18);
        assertNotNull(bid);
    }

    @Test
    public void constructorTest() {
        assertNotNull(bid);
    }

    @Test
    public void size() {
        assertEquals("9.5", this.bid.size());
    }

    @Test
    public void value() {
        assertEquals(18, this.bid.value());
    }
}