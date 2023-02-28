

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class TreeTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class TreeTest
{
    /**
     * Default constructor for test class TreeTest
     */
    public TreeTest()
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
    public void testSetNumberOfFlowers()
    {
        Tree tree1 = new Tree();
        tree1.setNumberOfFlowers(13);
        assertEquals(7, tree1.getNumberOfFlowers());
        tree1.setNumberOfFlowers(12);
        assertEquals(12, tree1.getNumberOfFlowers());
        tree1.setNumberOfFlowers(5);
        assertEquals(5, tree1.getNumberOfFlowers());
        tree1.setNumberOfFlowers(0);
        assertEquals(0, tree1.getNumberOfFlowers());
        tree1.setNumberOfFlowers(-5);
        assertEquals(0, tree1.getNumberOfFlowers());
    }

    @Test
    public void testGatherFruit()
    {
        Tree tree1 = new Tree();
        assertEquals(3, tree1.getNumberOfFruits());
        assertEquals(2, tree1.gatherFruit());
        assertEquals(1, tree1.gatherFruit());
        assertEquals(0, tree1.gatherFruit());
        assertEquals(0, tree1.gatherFruit());
    }

    @Test
    public void testHarvest()
    {
        Tree tree1 = new Tree();
        assertEquals(3, tree1.harvest());
        assertEquals(0, tree1.getNumberOfFruits());
    }
}




