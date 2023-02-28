

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class FigureTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class FigureTest
{
    /**
     * Default constructor for test class FigureTest
     */
    public FigureTest()
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
    public void testConstructorWithOutParams()
    {
        Figure figure1 = new Figure();
        assertEquals("Marta", figure1.getName());
        assertEquals(0, figure1.getXPos());
        assertEquals(0, figure1.getYPos());
    }

    @Test
    public void TestConstructorWith3Params()
    {
        //caso 1, cuando los valores de las coordenadas son mínimos
        Figure figure1 = new Figure("Marta", 0, 0);
        assertEquals(Figure.X_LOWER_EDGE, figure1.getXPos());
        assertEquals(Figure.Y_LOWER_EDGE, figure1.getYPos());
        assertEquals("Marta", figure1.getName());
        //caso 2, cuando los valores de las coordenadas son máximos
        Figure figure2 = new Figure("Marta", 640, 320);
        assertEquals(Figure.X_UPPER_EDGE, figure2.getXPos());
        assertEquals(Figure.Y_UPPER_EDGE, figure2.getYPos());
        assertEquals("Marta", figure1.getName());
        //caso 3, cuando los valores de las coordenadas son intermedios
        Figure figure3 = new Figure("Marta", 233, 120);
        assertEquals(233, figure3.getXPos());
        assertEquals(120, figure3.getYPos());
        assertEquals("Marta", figure3.getName());
        //caso 4, cuando los valores estan por debajo de las coordenadas minimas
        Figure figure4= new Figure("Marta", -1, -1);
        assertEquals(0, figure4.getXPos());
        assertEquals(0, figure4.getYPos());
        assertEquals("Marta", figure4.getName());
        //caso 5, cuando el valor "y" esta por encima de las coordenadas máximas
        Figure figure5= new Figure("Marta", 120, 322);
        assertEquals(120, figure5.getXPos());
        assertEquals(0, figure5.getYPos());
        assertEquals("Marta", figure5.getName());
        //caso 6, cuando el valor "x" esta por encima de las coordenadas maximas
        Figure figure6= new Figure("Marta", 650, 160);
        assertEquals(0, figure6.getXPos());
        assertEquals(160, figure6.getYPos());
        assertEquals("Marta", figure6.getName());
    }
    
    @Test
    public void testMove()
    {
        
        Figure figure1 = new Figure();
        //caso 1: sumar 1, cuando esta en el mínimo
        figure1.move('L');
        figure1.move('U');
        assertEquals(1,figure1.getXPos());
        assertEquals(1,figure1.getYPos());
        //caso 2: restar 1, cuando no esta en el mínimo ni en el máximo
        figure1.move('R');
        figure1.move('D');
        assertEquals(0,figure1.getXPos());
        assertEquals(0,figure1.getYPos());
        //caso 3: restar 1, cuando estan en el mínimo
        figure1.move('R');
        figure1.move('D');
        assertEquals(0,figure1.getXPos());
        assertEquals(0,figure1.getYPos());
        //caso 4: restar 1, cuando está en el maximo
        Figure figure2 = new Figure("Marta",640,320);
        figure2.move('R');
        figure2.move('D');
        assertEquals(639, figure2.getXPos());
        assertEquals(319, figure2.getYPos());
        //caso 5: sumar 1 cuando no esta ni en el minimo ni en el máximo
        figure2.move('L');
        figure2.move('U');
        assertEquals(640, figure2.getXPos());
        assertEquals(320, figure2.getYPos());
        //caso 6: sumar 1 cuando esta en el máximo
        figure2.move('L');
        figure2.move('U');
        assertEquals(640, figure2.getXPos());
        assertEquals(320, figure2.getYPos());
      
    }

    @Test
    public void testToString()
    {
        Figure figure1 = new Figure();
        assertEquals("Marta-0-0", figure1.toString());
        Figure figure2 = new Figure("Marta",120,130);
        assertEquals("Marta-120-130", figure2.toString());
    }
}



