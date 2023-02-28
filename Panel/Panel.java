
/**
 * Clase que simula un panel
 * 
 * @author Ricardo Marqués Garay
 * @version 05/06/2019
 */
public class Panel
{
    // instance variables - replace the example below with your own
    private Lamp lamp;
    private Interruptor interruptor;

    /**
     * Constructor for objects of class Panel
     */
    public Panel()
    {
        setLamp(new Lamp());
        setInterruptor(new Interruptor());
    }
    
    /** Método que selecciona la lampara
     * @param la lampara de tipo Lamp
     */
    public void setLamp(Lamp lamp)
    {
        this.lamp = lamp;
    }
    
    /** Metodo que dice la lampara
     * @return la lampara de tipo Lamp
     */
    public Lamp getLamp()
    {
        return lamp;
    }
    
    /** Método que selecciona el interruptor
     * @param el interruptor de tipo interruptor
     */
    public void setInterruptor(Interruptor interruptor)
    {
        this.interruptor = interruptor;
    }
    
    /** Metodo que dice el interruptor
     * @return el interruptor de tipo Interruptor
     */
    public Interruptor getInterruptor()
    {
        return interruptor;
    }
    
    /**
     * Método que imprime el estado del panel
 
     */
    public void print()
    {
        System.out.println("Interruptor: " + interruptor.toString());
        System.out.println("Bombilla: " + lamp.toString());
    }
    
    /**
     * Metodo que permita encender o apagar la bombilla
     */
    public void press()
    {
        interruptor.press();
        if(interruptor.getState() == true)
        {
            lamp.setState(true);
        }
        else
        {
            lamp.setState(false);
        }
    }
}
