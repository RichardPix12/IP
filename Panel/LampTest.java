

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class LampTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class LampTest
{
    /**
     * Default constructor for test class LampTest
     */
    public LampTest()
    {
    }

    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @Before
    public void setUp()
    {
    }

    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    @After
    public void tearDown()
    {
    }

    @Test
    public void testTurnOn()
    {
        Lamp lamp1 = new Lamp();
        assertEquals(false, lamp1.getState());
        lamp1.turnOn();
        assertEquals(true, lamp1.getState());
    }

    @Test
    public void testTurnOff()
    {
        Lamp lamp1 = new Lamp();
        lamp1.setState(true);
        lamp1.turnOff();
        assertEquals(false, lamp1.getState());
    }

    @Test
    public void testToString()
    {
        Lamp lamp1 = new Lamp();
        assertEquals("APAGADA", lamp1.toString());
        lamp1.turnOn();
        assertEquals("ENCENDIDA", lamp1.toString());
    }
}



