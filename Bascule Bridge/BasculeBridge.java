
/**
 * Write a description of class BasculeBridge here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class BasculeBridge
{
    //constantes de la clase
    public static final int MIN_SLOPE = 0;
    public static final int MAX_SLOPE = 60;
    
    // atributos de la clse
    private int slope;

    /**
     * Constructor del puente con parametro
     * @param slope, de tipo int
     */
    public BasculeBridge(int slope)
    {
        if(slope >= MIN_SLOPE && slope <= MAX_SLOPE)
        setSlope(slope);
    }

    /**
     * Metodo que permite modificar la inclinación del puente
     * @param slope de tipo int
     */
    private void setSlope(int slope)
    {
        this.slope = slope;
    }
    
    /**
     * Metodo que permite saber la inclinación del puente
     * @return slope de tipo int
     */
    public int getSlope()
    {
        return this.slope;
    }
    
    /**
     * Metodo que incrementa la posición del puente 
     * @param slope de tipo int
     */
    public void raiseBridge(int slope)
    {
        if (slope >= MIN_SLOPE)
        {
            if(getSlope()+slope <= MAX_SLOPE)
            {
                setSlope(getSlope()+slope);
        
            }
        }
    }
    
    /**
     * Metodo que disminuye la posición del puente
     * @param slope de tipo int
     */
    public void dropBridge(int slope)
    {
        if(slope >= MIN_SLOPE)
        {
            if (getSlope()-slope >= MIN_SLOPE)
            {
                setSlope(getSlope()-slope);
            }
        }
    }
    
}
