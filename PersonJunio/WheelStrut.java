
/**
 * Clase que simula el puntal del avión
 * 
 * @author Ricardo Marqués Garay
 * @version 06/06/2019
 */
public class WheelStrut
{
    // instance variables - replace the example below with your own
    private boolean deployed;
    private Wheel leftWheel;
    private Wheel rightWheel;
    /**
     * Constructor sin parámetros
     */
    public WheelStrut()
    {   
        setDeployed(true);
        setLeftWheel(new Wheel(Wheel.STANDARD_MAX_PRESSURE,Wheel.STANDARD_PRESSURE));
        setRightWheel(new Wheel(Wheel.STANDARD_MAX_PRESSURE,Wheel.STANDARD_PRESSURE));
    }

    /**
     * Método que te permite cambiar el estado del puntal
     * 
     * @param  deployed de tipo boolean
     */
    public void setDeployed(boolean deployed)
    {
        this.deployed = deployed;
    }
    
    /** Método que te permite saber el estado del puntal
     *  @return deployed de tipo boolean
     */
    public boolean getDeployed()
    {   
        return deployed;
    }
    
    /**
     * Método que te permite cambiar el estado de la rueda izquierda
     * 
     * @param  leftWheel de tipo Wheel
     */
    public void setLeftWheel(Wheel leftWheel)
    {
        this.leftWheel = leftWheel;
    }
    
    /** Método que te permite saber el estado del puntal
     *  @return leftWheel de tipo Wheel
     */
    public Wheel getLeftWheel()
    {   
        return leftWheel;
    }
    
    /**
     * Método que te permite cambiar el estado de la rueda derecha
     * 
     * @param  rightWheel de tipo Wheel
     */
    public void setRightWheel(Wheel rightWheel)
    {
        this.rightWheel = rightWheel;
    }
    
    /** Método que te permite saber el estado del puntal
     *  @return rightWheel de tipo Wheel
     */
    public Wheel getRightWheel()
    {   
        return rightWheel;
    }
    
    /** Metodo que testea las dos ruedas
     * @return true si las dos ruedas estan a true
     * @return false en los otros casos
     */
    public boolean test()
    {
        if(rightWheel.test() == true && leftWheel.test() == true)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    
    /** Metodo que te devuelve el estado del puntal
     * @return el estado del puntal, de tipo String
     */
    public String toString()
    {
        return "Deployed: " + getDeployed() + " - Test: " + test() + " [L: " + leftWheel.test() + "] [R: " + rightWheel.test() + "]";
    }
    
    /** Metodo que imprime por pantalla los datos del avión
     * 
     */
    public void print()
    {
        if(getDeployed() == true)
        {
            System.out.println ("DEPLOYED");
        }
        else
        {
            System.out.println ("RETRACTED");
        }
        if(test() == true)
        {
            System.out.println ("Test............... TRUE");
        }
        else
        {
            System.out.println ("Test............... FALSE");
        }
        System.out.println ("LEFT Wheel");
        System.out.println ("Max pressure....... " + leftWheel.getMaxPressure());
        System.out.println ("Current Pressure... " + leftWheel.getPressure());
        if(leftWheel.test() == true)
        {
            System.out.println ("Test............... OK");
        }
        else
        {
            System.out.println ("Test............... FAIL");
        }
        System.out.println (" ");
        System.out.println ("RIGHT Wheel");
        System.out.println ("Max pressure....... " + rightWheel.getMaxPressure());
        System.out.println ("Current Pressure... " + rightWheel.getPressure());
        if(rightWheel.test() == true)
        {
            System.out.println ("Test............... OK");
        }
        else
        {
            System.out.println ("Test............... FAIL");
        }
    }
    
    /**
     * Método que simula el repliegue de un puntal (pone el valor de deployed a false y se repliega)
     *
     */
    public void retract()
    {

        setDeployed(false);

    }

    /**
     * Método  que simula el despliegue de un puntal (pone el valor de deployed a true y se abre)
     *
     */
    public void deploy()
    {
        setDeployed(true);
    }
}


