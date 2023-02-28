
/**
 * Write a description of class LandingGear here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class LandingGear
{
    // Constantes
    public final static boolean LEVER_UP = true;
    public final static boolean LEVER_DOWN = false;
    public final static String ok = "OK";
    public final static String on = "ON";
    public final static String off = "OFF";
    public final static String fail = "FAIL";
    public final static String up = "UP";
    public final static String down = "DOWN";

    // Atributos
    private boolean lever; // posición de la palanca del tren de aterrizaje 
    private WheelStrut nose; // estructura de ruedas o puntal del morro
    private WheelStrut left; // puntal del ala izq.
    private WheelStrut right; //puntal del ala drch.

    /**
     * Constructor para los objetos de la clase LandingGear
     */
    public LandingGear()
    {
        setLever(LEVER_DOWN);
        setNose(new WheelStrut());
        setRight(new WheelStrut());
        setLeft(new WheelStrut());
    }

    /**
     * Constructor para los objetos de la clase LandingGear
     */
    public LandingGear(WheelStrut nose, WheelStrut left, WheelStrut right)
    {
        this();
        setNose(nose);
        setRight(right);
        setLeft(left);
    }

    /**
     * Método que modifica la palanca del tren de aterrizaje
     *
     * @param lever Un parámetro de la palanca 
     */
    private void setLever(boolean lever)
    {
        this.lever = lever;
    }

    private void setNose(WheelStrut nose)
    {
        this.nose = nose;
    }

    private void setLeft(WheelStrut left)
    {
        this.left = left;
    }

    private void setRight(WheelStrut right)
    {
        this.right = right;
    }

    /**
     * Método que devuelve el estado de la palanca
     *
     * @return El valor de la palanca
     */
    public boolean isLever()
    {
        return lever;
    }

    public  WheelStrut getNose()
    {
        return nose;
    }

    public  WheelStrut getLeft()
    {
        return left;
    }

    public  WheelStrut getRight()
    {
        return right;
    }

    /**
     * Método que modifica la posición de la palanca y el despliegue o repliegue de los puntales dependiendo 
     * de la acción recibida
     *
     * @param action (LEVER_UP) (LEVER_DOWN)
     */
    public void moveLever(boolean action)
    {
        if ( action == LEVER_DOWN &&  isLever() == LEVER_UP )
        {
            nose.deploy();
            left.deploy();
            right.deploy();
        }

        else if ( action == LEVER_UP && isLever() == LEVER_DOWN )

        {
            nose.retract();
            left.retract();
            right.retract();
        }

        setLever(action);
    }

    /**
     * Método que comprueba si las tres estrucutras superan los tests sobre la presión de las ruedas 
     *
     * @return true si se supera el test y false en caso contrario
     */
    public boolean Test()
    {
        return (nose.test() && left.test() && right.test());
    }

    /**
     * Method que imprime por consola
     *
     */
    public void print()
    {

        if(isLever())  

        {
            System.out.println("Lever........." + up);
        } 

        else

        {
            System.out.println("Lever........." + down);
        }

        if(Test())

        {
            System.out.println("Test.........." + ok);
        }

        else

        { 
            System.out.println("Test.........." + fail);
        }

        System.out.println();

        if(nose.getDeployed())
        {
            System.out.println("      " + on);        
        }
        else
        {
            System.out.println("      " + off);
        }

        System.out.println();

        if(left.getDeployed())
        {
            System.out.print("   " + on);        
        }

        else
        {
            System.out.print("   " + off);
        }

        if(right.getDeployed())
        {
            System.out.print("   " + on);        
        }

        else
        {
            System.out.print("   " + off);
        }

    }

    /**
     * Method test
     *
     * @return The return value
     */
    public String test()
    {
        if (nose.test() && left.test() && right.test())
            return "OK";
        else
            return "FAIL";

    }

    /**
     * Method que develve una cadena de caracteres con el valor de la palanca, el tren de aterrrizaje, y los distintos puntales izq. drch.
     * y delantero.
     *
     * @return una cadena de caracteres
     */
    public String toString()
    {
        return String.format("Lever: %b " + "Status: %b " + "nose: %b " + "left: %b " + "right: %b ", 
        isLever(), 
        Test(),
        getNose(),
        getLeft(), 
        getRight()); 
    }
}

