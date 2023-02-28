
/**
 * Clase que simula un mando
 * 
 * @author Ricardo Marqués Garay
 * @version 06/06/2019
 */
public class Nunchuk
{
    public static final boolean SHOOT_BURST = true;
    
    
    // instance variables - replace the example below with your own
    private Figure figure;
    private Weapon weapon;
    
    /**
     * Constructor sin parámetros
     */
    public Nunchuk()
    {
        setFigure(new Figure());
        setWeapon(new Weapon());
    }
    
    /**
     * Constructor con 2 parámetros
     * @param figure de tipo Figure
     * @param weapon de tipo weapon
     */
    public Nunchuk(Figure figure, Weapon weapon)
    {
        this();
        setFigure(figure);
        setWeapon(weapon);
    }
    
    /**
     * Metodo que permite cambiar la figura 
     * @param figure de tipo Figure
     */
    private void setFigure(Figure figure)
    {
        this.figure = figure;
    }

    /**
     * Metodo que permite saber la figura
     * @return figure de tipo figure
     */
    public Figure getFigure()
    {
        return figure;
    }
    
    /**
     * Metodo que permite cambiar el arma
     * @param weapon de tipo Weapon
     */
    private void setWeapon(Weapon weapon)
    {
        this.weapon = weapon;
    }
    
    /**
     * Metodo que permite saber la figura
     * @return weapon, de tipo Weapon
     */
    public Weapon getWeapon()
    {
        return weapon;
    }
    
    /** Metodo para avanzar un paso
     * @param movement de tipo Char
     */
    public void advance(char movement)
    {
        figure.move(movement);
    }
    
    /** Metodo para avanzar 2 pasos
     * @param movement de tipo Char
     */
    public void midleAdvance(char movement)
    {
        figure.move(movement);
        figure.move(movement);
    }
    
    /**
     * Metodo para avanzar 5 pasos
     * @parar movement de tipo Char
     */
    public void muchAdvance(char movement)
    {
        figure.move(movement);
        figure.move(movement);
        figure.move(movement);
        figure.move(movement);
        figure.move(movement);
    }
    
    /**
     * Metodo que dispara el arma 
     * @param shoots de tipo boolean
     */
    public void shootWeapon(boolean shoots)
    {
        if(shoots == SHOOT_BURST)
        {
            weapon.shoot();
            weapon.shoot();
            weapon.shoot();
            weapon.shoot();
            weapon.shoot();
        }
        else
        {
            weapon.shoot();
        }
    }
    
    /**
     * Metodo que mueve al personaje y lo dispara una vez
     * @param movement de tipo char
     */
    public void shootForward(char movement)
    {
        weapon.shoot();
        figure.move(movement);
    }
    
    /**
     * Metodo que imprime el estado de los atributos
     */
    public void print()
    {
        System.out.println(figure.toString() + weapon.toString());
    }
}
