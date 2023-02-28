
/**
 * Clase que simula un interruptor
 * 
 * @author Ricardo Marqués Garay
 * @version 05/06/2019
 */
public class Interruptor
{
    // instance variables - replace the example below with your own
    private boolean state; //true si esta on, true si esta off

     /**
     * Constructor sin parámetros
     */
    public Interruptor()
    {
        setState(true);
    }

    /**
     * Metodo que cambia el estado del interruptor
     * @param state de tipo boolean
     */
    public void setState(boolean state)
    {
        this.state=state;
    }
    
    /**
     * Merodo que dice el estado del interruptor
     * @return state de tipo boolean
     */
    public boolean getState()
    {
        return state;
    }
    
    /** Metodo que enciende y apaga y el interruptor
     * 
     */
    public void press()
    {
        if(getState()==true)
        {
            setState(false);
        }
        else
        {
            setState(true);
        }
    }
    
    /**
     * Metodo que te dice el estado del interruptor
     * @return el estado de tipo String
     */
    public String toString()
    {
        if(getState()==true)
        {
            return "ON";           
        }
        else
        {
            return "OFF";
        }
    }
}
