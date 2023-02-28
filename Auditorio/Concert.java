
/**
 * Clase que simula un concierto
 * 
 * @author Ricardo Marqués Garay 
 * @version 10/06/2019
 */
public class Concert
{
    // constantes
    
    // Atributos
    private String name;
    private double price;
    private Date date;
    /**
     * Constructor con 3 parámetros
     * @param name de tipo String
     * @param price de tipo double
     * @param date de tipo Date
     */
    public Concert(String name, double price, Date date)
    {
        setName(name);
        setPrice(price);
        setDate(date);
    }

    /**
     * Metodo para cambiar el nombre
     * @param name de tipo String
     */
    private void setName(String name)
    {
        this.name = name;
    }
    
    /**
     * Metodo para saber el nombre
     * @return name de tipo String     
     */
    public String getName()
    {
        return name;
    }
    
    /**
     * Metodo para cambiar el precio de la butaca de patio
     *  @param price de tipo double
     */
    private void setPrice(double price)
    {
        this.price = price;
    }
    
    /**
     * Metodo para saber el precio
     * @return price de tipo double    
     */
    public double getPrice()
    {
        return price;
    }
    
      /**
     * Metodo para cambiar la fecha
     *  @param date de tipo Date
     */
    private void setDate(Date date)
    {
        this.date = date;
    }
    
    /**
     * Metodo para saber la fecha
     * @return date de tipo Date
     */
    public Date getDate()
    {
        return date;
    }
}
