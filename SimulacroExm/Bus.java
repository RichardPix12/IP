
/**
 * Clase autobus
 * 
 * @author Ricardo Marqués Garay
 * @version 04/06/2019
 */
public class Bus
{
    // constantes
    public static final int MAX_NUMBER_SEATS = 60;
    // atributos
    private boolean driverPresent;  //true si hay conductor, false si no lo hay
    private int availableSeats;

    /**
     * Constructor sin parámetros
     */
    public Bus()
    {
        setDriverPresent(false);
        setAvailableSeats(MAX_NUMBER_SEATS);
    }
    
    /**
     * Constructor con 2 parámetros
     */
    public Bus(boolean driverPresent, int availableSeats)
    {
        this();
        setDriverPresent(driverPresent);
        setAvailableSeats(availableSeats);
    }
    
    /** Metodo que cambia si hay o no conductor
     *  @param el conductor de tipo boolean
     */
    public void setDriverPresent(boolean driverPresent)
    {
        this.driverPresent = driverPresent;
    }
    
    /** Metodo que te dice que conductor hay
     *  @return el conductor de tipo boolean
     */
    public boolean getDriverPresent()
    {
        return driverPresent;
    }
    
    /** Metodo que cambia los asientos libres
     *  @param asientos libres de tipo int
     */
    public void setAvailableSeats(int availableSeats)
    {
        this.availableSeats = availableSeats;
    }
    
    /** Metodo que te los asientos libres que hay
     *  @return asientos libres de tipo int
     */
    public int getAvailableSeats()
    {
        return availableSeats;
    }
    
    /**
     * Metodo que pone un conductor
     * @return conductor(true) de tipo boolean
     */
    public void sitDriver()
    {
        setDriverPresent(true);
    }
    
    /** Método para contar los pasajeros en el bus
     * @param numero de pasajeros que quieres subir de tipo int
     * @return false, si no hay conductor
     * @return true y cambia el numero de asientos libres
     */
    public boolean getOn(int pasajeros)
    {
        if(getDriverPresent() == true && getAvailableSeats() >= pasajeros)
        {
            setAvailableSeats(getAvailableSeats()- pasajeros);
            return true;
        }
        else
        {
            return false;
        }
    }
    
    /**
     * Metodo que devuelve una cadena de información
     * @return una cadena de informacion de tipo String
     * @return Por Ej "ON DUTY-23"
     */
    public String toStrin()
    {
        String result = "-" + getAvailableSeats();
        if(getDriverPresent() == true)
        {
            return "ON DUTY" + result;
        }
        else
        {
            return "OUT OF SERVICE" + result;
        }
    }
}
