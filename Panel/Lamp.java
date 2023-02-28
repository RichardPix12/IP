
/**
 * Simula el funcionamiento de una bombilla
 * 
 * @author Ricardo Marqués Garay 
 * @version 05/06/2019
 */
public class Lamp
{
    //constantes
    public static final boolean LAMP_ON = true;
    public static final boolean LAMP_OFF = false;
    // atributos
    private boolean state;

    /**
     * Constructor sin parámetros
     */
    public Lamp()
    {
        setState(LAMP_OFF);
    }

    /**
     * Metodo que cambia el estado de la bombilla
     * @param state de tipo boolean
     */
    public void setState(boolean state)
    {
        this.state = state;
    }
    
    /** Metodo que dice el estado de la bombilla
     * @return state de tipo boolean
     */
    public boolean getState()
    {
        return state;
    }
    
    /**
     * Metodo que enciende la bombilla
     * 
     */
    public void turnOn()
    {
        setState(LAMP_ON);
    }
    
    /**
     * Metodo que apaga la bombilla
     * @param turnOff de tipo boolean
     */
    public void turnOff()
    {
        setState(LAMP_OFF);
    }
    
    /**
     * Metodo que te dice si la bombilla esta encendida o apagada
     * Encendida o apagada de tipo String
     */
    public String toString()
    {
        if(getState() == LAMP_ON)
        {
            return "ENCENDIDA";
        }
        else 
        {
            return "APAGADA";
        }
    }
}

