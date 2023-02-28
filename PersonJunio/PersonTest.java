

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class PersonTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class PersonTest
{
    /**
     * Default constructor for test class PersonTest
     */
    public PersonTest()
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
    public void testSetAge()
    {
        Person person1 = new Person();
        person1.setAge(25);
        assertEquals(25, person1.getAge());
        person1.setAge(120);
        assertEquals(120, person1.getAge());
        person1.setAge(121);
        assertEquals(120, person1.getAge());
        person1.setAge(0);
        assertEquals(0, person1.getAge());
        person1.setAge(-18);
        assertEquals(0, person1.getAge());
    }

    @Test
    public void personTest()
    {
        Person person1 = new Person(0);
        assertEquals(18, person1.getCriticalAge());
        person1.setAge(18);
        assertEquals(47, person1.getCriticalAge());
        person1.setAge(65);
        assertEquals(0, person1.getCriticalAge());
        person1.setAge(120);
        assertEquals(55, person1.getCriticalAge());
    }

    @Test
    public void testGetHashCode()
    {
        Person person1 = new Person();
        assertEquals("0-RICA-MARQ-CHILD", person1.getHashCode());
        person1.setAge(18);
        assertEquals("18-RICA-MARQ-ADULT", person1.getHashCode());
        person1.setAge(65);
        assertEquals("65-RICA-MARQ-RETIRED", person1.getHashCode());
    }
}








