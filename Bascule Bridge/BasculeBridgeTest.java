
import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class BasculeBridgeTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class BasculeBridgeTest
{
    /**
     * Default constructor for test class BasculeBridgeTest
     */
    public BasculeBridgeTest()
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
        //caso 1: crear un puente entre los valores máximos y minimos
        BasculeBridge basculeBridge1 = new BasculeBridge(40);
        assertEquals(40,basculeBridge1.getSlope());
        //caso 2: crear un puente por encima del máximo
        BasculeBridge basculeBridge2 = new BasculeBridge(65);
        assertEquals(0,basculeBridge2.getSlope());
        //caso 3: crear un puente por debajo del mínimo
        BasculeBridge basculeBridge3 = new BasculeBridge(-5);
        assertEquals(0,basculeBridge3.getSlope());
        //caso 4: crear un puente en el mínimo
        BasculeBridge basculeBridge4 = new BasculeBridge(0);
        assertEquals(0,basculeBridge4.getSlope());
        //caso 5: crear un puente en el máximo
        BasculeBridge basculeBridge5 = new BasculeBridge(60);
        assertEquals(60,basculeBridge5.getSlope());
    }
    
    @Test
    public void testRaiseBridge()
    {
        BasculeBridge basculeBridge1 = new BasculeBridge(40);
        //caso 1: recibe un parámetro que no supera ni el máximo 
        basculeBridge1.raiseBridge(1);
        assertEquals(41, basculeBridge1.getSlope());
        //caso 2: recibe un parámetro que supera el máximo
        basculeBridge1.raiseBridge(50);
        assertEquals(41, basculeBridge1.getSlope());
        //caso 3: recibe un parámetro que de el máximo
        basculeBridge1.raiseBridge(19);
        assertEquals(60, basculeBridge1.getSlope());
    }

    @Test
    public void testDropBridge()
    {
        BasculeBridge basculeBridge1 = new BasculeBridge(40);
        //caso 1: recibe un parámetro que no supera el minimo 
        basculeBridge1.dropBridge(1);
        assertEquals(39, basculeBridge1.getSlope());
        //caso 2: recibe un parámetro que supera el minimo
        basculeBridge1.dropBridge(50);
        assertEquals(39, basculeBridge1.getSlope());
        //caso 3: recibe un parámetro que de el minimo
        basculeBridge1.dropBridge(39);
        assertEquals(0, basculeBridge1.getSlope());
    }
}


