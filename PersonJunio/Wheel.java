
/**
 * Definición de las ruedas del avión
 * 
 * @author ???? 
 * @version ???
 */
public class Wheel
{
    // Constantes estáticas para la clase
    public static final int THRESHOLD = 85;     // umbral, porcentaje sobre la presión máxima por encima del cual la rueda está operativa
    
    public static final double STANDARD_MAX_PRESSURE = 1000;
    public static final double STANDARD_PRESSURE = 900;
    
    private double pressure;       // presión actual que tiene la rueda, de tipo double
    private double maxPressure;    // presión máxima que soporta la rueda, de tipo double
    private double percentage;     // porcentaje de presión

    /**
     * Constructor para crear rueda con valores standard
     */
    public Wheel()
    {
        setMaxPressure(STANDARD_MAX_PRESSURE);
        setPressure(STANDARD_PRESSURE);
    }
    
     /**
     * Constructor para crear la rueda con las presión que se desee
     * 
     * @param pressión máxima
     * @param presión actual
     */
    public Wheel(double maxPressure, double pressure)
    {
        this();
        setMaxPressure(maxPressure);
        setPressure(pressure);
    }

    /**
     * Método que modifica la presión máxima de la rueda
     * 
     * @param  nuevo valor para la presión máxima (>=0), de tipo double  
     *  
     */
    private void setMaxPressure(double maxPressure)
    {
        if(maxPressure >= 0)
        {
            this.maxPressure = maxPressure;
        }
    }
    
       
    /**
     * Método que modifica la presión actual
     * 
     * @param  nuevo valor para la presión actual entre [0,maxPressure], de tipo double
     *  
     */
    private void setPressure(double pressure)
    {
        if(pressure >=0 && pressure<getMaxPressure())
        {
            this.pressure = pressure;
        }
    }
    
    /**
     * Método que devuelve la presión máxima
     * 
     * @return presión máxima que puede soportar la rueda, de tipo double
     */
    public double getMaxPressure()
    {
        return maxPressure;
    }
    
    /**
    /**
     * Método que devuelve la presión actual
     * 
     * @return presión actual que puede soportar la rueda, de tipo double
     */
    public double getPressure()
    {
        return pressure;
    }
    
    /**
     * Método qee comprueba si una rueda está o no operativa
     * Está operativa si su presión actual es mayor o igual que el 85% del la presión máxima
     * 
     * @return true si la rueda está operativa y false si no lo es
     */
    public boolean test()
    {
        if(getPressure() >= (getMaxPressure()*0.85))
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    
    /** Metodo que dice el porcentaje de presión de las rudas
     * 
     */
    public double percentagePressure()
    {
        percentage = (getPressure()/getMaxPressure())* 100;
        return percentage;
    }
    
     /**
     * Devuelve el estado de la rueda con el siguiente formato:
     * MaxP: 20700.0 Mb - Pressure: 19300.0 Mb - Percentage: 93,24 - Test: true
     * 
     * @return estado de la rueda con el formato anterior
     */
    public String toString()
    {
        String msg=String.format("MaxP: %.1f Mb - Pressure: %.1f Mb - Percentage : %.2f - Test: %b",       
        this.getPressure(),
        this.getMaxPressure(),
        this.percentagePressure(),
        this.test());
        return msg;
    }
    
    /**
     * Imprime los datos de la rueda en el siguiente formato
     * 
     * Max Pressure....... 34500 Mb
     * Current Pressure... 32000 Mb (92,75%)
     * Test............... OK (FAIL, si falló el test).
     * 
     */
    public void print()
    {
        String result = ( "Max pressure......." + getMaxPressure() + "Mb"); 
        String result2 = ( "Current pressure..." + getPressure() + "Mb" + "(" + percentagePressure() + "%)");
        if(test() == true)
        {
            System.out.println(result);
            System.out.println(result2);
            System.out.println("Test............... OK");
        }
        else
        {
            System.out.println(result);
            System.out.println(result2);
            System.out.println("Test............... FAIL");
        }
    }
}