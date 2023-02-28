
/**
 * Clase que simula una fecha
 * 
 * @author Ricardo Marqués Garay
 * @version 10/06/2019
 */
public class Date
{
    // Constantes
    public static final int MIN_DAYS = 1;
    public static final int MAX_DAYS = 30;
    public static final int MIN_MONTHS= 1;
    public static final int MAX_MONTHS= 12;
    // Atributos
    private int day;
    private int month;
    private int year;
    
    /**
     * Constructor para una fecha con 3 parámetros
     * @param day de tipo int
     * @param month de tipo int
     * @param year de tipo int
     */
    public Date(int day, int month, int year)
    {
        setDay(day);
        setMonth(month);
        setYear(year);
    }

    /**
     * Metodo para cambiar el dia
     * @param day de tipo int
     */
    private void setDay(int day)
    {
        if(day >= MIN_DAYS && day <=MAX_DAYS)
        {
            this.day = day;
        }
    }
    
    /**
     * Metodo para saber el dia
     * @return day, de tipo int
     */
    public int getDay()
    {
        return day;
    }
    
    /**
     * Metodo para cambiar el mes
     * @param month de tipo int
     */
    private void setMonth(int month)
    {
        if(month >= MIN_MONTHS && month <= MAX_MONTHS)
        {
            this.month = month;
        }
    }
    
    /**
     * Metodo para saber el mes
     * @return month de tipo int
     */
    public int getMonth()
    {
        return month;
    }
    
     /**
     * Metodo para cambiar el año
     * @param year de tipo int
     */
    private void setYear(int year)
    {
            this.year = year;       
    }
    
    /**
     * Metodo para saber el año
     * @return year de tipo int
     */
    public int getYear()
    {
        return year;
    }
}
