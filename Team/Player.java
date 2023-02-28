
/**
 * Write a description of class Player here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Player
{
    // Constantes
    
    // Atributos
    private String name;
    private int number;

    /**
     * Constructor del jugador
     */
    public Player(String name, int number)
    {
        setName(name);
        setNumber(number);
    }
    
    /**
     * Metodo que cambia el nombre
     * @param name de tipo String
     */
    public void setName(String name)
    {
        this.name = name;
    }
    
    /**
     * Metodo que te dice el nombre
     * @return name de tipo String
     */
    public String getName()
    {
        return this.name;
    }
    
    /**
     * Metodo que cambia el numero
     * @param number de tipo int
     */
    public void setNumber(int number)
    {
        this.number = number;
    }
    
    /**
     * Metodo que te dice el número
     * @return number de tipo int
     */
    public int getNumber()
    {
        return this.number;
    }
    
    /**
     * Metodo que te da las características del jugador
     * @return los datosd el jugador de tipo String
     * @return Por Ej: Richard-9
     */
    public String toString()
    {
        return getName() + "-" + getNumber();
    }
}

