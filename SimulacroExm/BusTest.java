

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * Clase de prueba para BUS
 *
 * @author  Ricardo Marqués Garay
 * @version 04/06/2019
 */
public class BusTest
{
    /**
     * Default constructor for test class BusTest
     */
    public BusTest()
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
    public void testSitDriver()
    {
        //caso 1, no hay conductor, y se utiliza el método
        Bus bus1 = new Bus();
        assertEquals(false, bus1.getDriverPresent());
        bus1.sitDriver();
        assertEquals(true, bus1.getDriverPresent());
    }

    @Test
    public void testGetOn()
    {
        Bus bus1 = new Bus();
        //1 caso, sin conductor
        assertEquals(false, bus1.getOn(18));
        //2 caso, con conductor
        bus1.sitDriver();
        //2.1 cuando hay mas asientos libres que personas que quieren entrar
        assertEquals(true, bus1.getOn(40));
        //2.2 cuando hay mas gente que quieres entrar que asientos libres
        bus1.setAvailableSeats(20);
        assertEquals(false, bus1.getOn(25));
        //2.3 cuando hay la misma gente que asientos libres
        bus1.setAvailableSeats(25);
        assertEquals(true, bus1.getOn(25));
    }

    @Test
    public void TestToString()
    {
        Bus bus1 = new Bus();
        assertEquals("OUT OF SERVICE-60", bus1.toStrin());
        bus1.sitDriver();
        assertEquals("ON DUTY-60", bus1.toStrin());
    }
}




