package edu.ping.stockx;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Before;
import org.junit.Test;

import edu.ping.stockx.domain.Ask;

public class AskTest {
    
    private Ask ask = null;

    @Before
    public void setup_sneaker() {
        this.ask = new Ask("9.5", 18);
        assertNotNull(ask);
    }

    @Test
    public void constructorTest() {
        assertNotNull(ask);
    }

    @Test
    public void size() {
        assertEquals("9.5", this.ask.size());
    }

    @Test
    public void value() {
        assertEquals(18, this.ask.value());
    }
}
