

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class WeaponTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class WeaponTest
{
    /**
     * Default constructor for test class WeaponTest
     */
    public WeaponTest()
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
    public void testConstructor()
    {
        Weapon weapon1 = new Weapon();
        assertEquals("Pistola", weapon1.getName());
        assertEquals(50, weapon1.getAmmunition());
    }

    @Test
    public void testConstructorWithParams()
    {
        Weapon weapon1 = new Weapon("AK47", 240);
        assertEquals("AK47", weapon1.getName());
        assertEquals(240, weapon1.getAmmunition());
    }

    @Test
    public void testShoot()
    {
        Weapon weapon1 = new Weapon();
        assertEquals(50, weapon1.getAmmunition());
        weapon1.shoot();
        assertEquals(49, weapon1.getAmmunition());
    }

    @Test
    public void testToString()
    {
        Weapon weapon1 = new Weapon();
        assertEquals("(“Pistola”,50)", weapon1.toString());
    }
}




