import java.util.ArrayList;
/**
 * Clase que simula un auditorio
 * 
 * @author Ricardo Marqués Garay 
 * @version 10/06/2019
 */
public class Auditorium
{
    // Atributos
    private ArrayList<Concert> concerts;

    /**
     * Constructor del auditorio
     */
    public Auditorium()
    {
        concerts = new ArrayList<Concert>();
    }

    /**
     * Metodo que busca un concierto por su nombre
     * 
     * @param  concertName de tipo String
     * @return   el concierto de tipo Concert si coincide
     * @return null si no coincide
     */
    public Concert seekConcert(String concertName)
    {
        for(int i=0;i<concerts.size();i++)
        {
            if(concerts.get(i).getName() == concertName)
            {
                return concerts.get(i);
            }
        }
        return null;
    }
    
    /**
     * Metodo que añade un concierto a la lista siempre que no haya uno en esa fecha
     * @param concertName de tipo Concert
     * @param price de tipo double
     * @param date de tipo Date
     */
    public void addConcert (String concertName, double price, Date date)
    {
        for(int i = 0; i <= concerts.size(); i++)
        {
            if (concerts.get(i).getDate() == date)
            {
                concerts.add(new Concert(concertName, price, date));
            }
        }
    }
    
    /**
     * Metodo que borra todos los conciertos que haya habido en ese año
     * @param year de tipo int
     */
    public void removeConcerts(int year)
    {
        int i= 0;
        while( i<= concerts.size())
        {
            if(concerts.get(i).getDate().getYear() == year)
            {
                concerts.remove(concerts.get(i));
                i++;
            }
        }
        i++;
    }
}
