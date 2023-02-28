

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class TeamTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class TeamTest
{
    /**
     * Default constructor for test class TeamTest
     */
    public TeamTest()
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
    public void testAddWithOneParam()
    {
        Team team1 = new Team();
        team1.add(new Player ("Malena",16));
        assertEquals("Malena",team1.seekPlayer(16).getName());
        team1.add(new Player ("Maria",20));
        assertEquals("Maria",team1.seekPlayer(20).getName());
    }
    
    @Test
    public void testAddWithTwoParams()
    {
    }
        
    @Test
    public void testSeekPlayer()
    {
        Team team1 = new Team();
        team1.add(new Player ("Malena",16));
        assertEquals("Malena",team1.seekPlayer(16).getName());
        assertEquals(16,team1.seekPlayer(16).getNumber());
        team1.removePlayers(16);
        assertEquals(null,team1.seekPlayer(16));
    }
    
    @Test
    public void testTrainPlayes()
    {
    }
    
    @Test
    public void removePlayer()
    {
        Team team1 = new Team();
        team1.add(new Player ("Maria",20));
        assertEquals("Maria",team1.seekPlayer(20).getName());
        assertEquals(20,team1.seekPlayer(20).getNumber());
        team1.removePlayers(20);
        assertEquals(null,team1.seekPlayer(20));
    }
}

