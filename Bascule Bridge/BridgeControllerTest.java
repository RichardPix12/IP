

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
/**
   * The test class BridgeControllerTest.
   *
   * @author  (your name)
   * @version (a version number or a date)
   */
public class BridgeControllerTest
         {
    /**
     * Default constructor for test class BridgeControllerTest
     */
    public BridgeControllerTest()
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
    public void testChangeClutch()
    {
        BridgeController bridgeController1 = new BridgeController();
        assertEquals(false,bridgeController1.getClutch());
        bridgeController1.changeClutch();
        assertEquals(true,bridgeController1.getClutch());
        bridgeController1.changeClutch();
        assertEquals(false,bridgeController1.getClutch());
    }
    }


