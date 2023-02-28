

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class InterruptorTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class InterruptorTest
{
    /**
     * Default constructor for test class InterruptorTest
     */
    public InterruptorTest()
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
    public void testPress()
    {
        Interruptor interrup1 = new Interruptor();
        assertEquals(true, interrup1.getState());
        interrup1.press();
        assertEquals(false, interrup1.getState());
        interrup1.press();
        assertEquals(true, interrup1.getState());
    }

    @Test
    public void testToString()
    {
        Interruptor interrup1 = new Interruptor();
        assertEquals(true, interrup1.getState());
        assertEquals("ON", interrup1.toString());
        interrup1.press();
        assertEquals("OFF", interrup1.toString());
    }
}


