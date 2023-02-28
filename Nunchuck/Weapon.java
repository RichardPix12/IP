
/**
 * Clase que simula un arma
 * 
 * @author Ricardo Marqués Garay
 * @version 06/06/2019
 */
public class Weapon
{
    // instance variables - replace the example below with your own
    private String name;
    private int ammunition;

    /**
     * Constructor sin parámetro
     */
    public Weapon()
    {
        setName("Pistola");
        setAmmunition(50);
    }
    
    /**
     * Constructor con 2 parámetros
     * @param name de tipo String
     * @param ammunition de tipo int
     */
    public Weapon(String name, int ammunition)
    {
        this();
        setName(name);
        setAmmunition(ammunition);
    }
    
    /**
     * Metodo que te permite cambiar el nombre del arma
     * @param name de tipo String
     */
    private void setName(String name)
    {
        this.name = name;
    }
    
    /**
     * Metodo que te permite saber el nombre del arma
     * @return name de tipo String
     */
    public String getName()
    {
        return name;
    }
    
    /**
     * Metodo que te permite cambiar la municion del arma
     * @param ammunition de tipo int
     */
    private void setAmmunition(int ammunition)
    {
        this.ammunition = ammunition;
    }
    
    /**
     * Metodo que te permite saber la municion del arma
     * @return ammunition de tipo int
     */
    public int getAmmunition()
    {
        return ammunition;
    }
    
    /**
     * Metodo que dispara la pistola
     */
    public void shoot()
    {
        if(getAmmunition()>0)
        {
            setAmmunition(getAmmunition()-1);
            System.out.println("BANG");
        }
    } 
    
    /** Metodo que devuelve una cadena de información
     *  @return Una cadena de información, de tipo String
     *  @return Por ej; ("Pistola",50)
     */
    public String toString()
    {
        return "(“" + getName() + "”," + getAmmunition() + ")";
    }
}
