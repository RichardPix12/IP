import java.util.Random;
/**
 * Write a description of class Plane here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Plane
{
    //constantes
    public static final int MAX_X=10;
    public static final int MAX_Y=10;
    public static final int MIN_X=0;
    public static final int MIN_Y=0;
    public static final int MIN_XSPEED=-1;
    public static final int MIN_YSPEED=-1;
    public static final int MAX_YSPEED=1;
    public static final int MAX_XSPEED=1;
    //valores para la creacion del avion
    public static final Person DEFAULT_PILOT = null;
    public static final char DEFAULT_IDENTIFIER = 'A';
    public static final int DEFAULT_FUEL = 500;
    public static final int DEFAULT_XPOS = 0;
    public static final int DEFAULT_YPOS = 0;
    public static final int DEFAULT_SPEED_X = 1;
    public static final int DEFAULT_SPEED_Y = 1;

   
    // instance variables - replace the example below with your own
    private Person person;
    private char identifier;
    private int fuel;
    private int xPos;
    private int yPos;
    private int xSpeed;
    private int ySpeed;

    /**
     * Constructor con 1 parámetro
     * @param identifier de tipo char
     */
    public Plane()
    {
        setPilot(this.DEFAULT_PILOT);
        setFuel(this.DEFAULT_FUEL);
        setIdentifier(this.DEFAULT_IDENTIFIER);
        setXPos(this.DEFAULT_XPOS);
        setYPos(this.DEFAULT_YPOS);
        setYSpeed(this.DEFAULT_SPEED_Y);
        setXSpeed(this.DEFAULT_SPEED_X);
    }
    
    /** Constructor con 3 parámetros
     *  @param person de tipo Person
     *  @param identifier de tipo char
     *  @param fuel de tipo int
     */
    public Plane(Person person, char identifier, int fuel)
    {
        this();
        setPilot(person);
        setIdentifier(identifier);
        setFuel(fuel);
    }
          
    /** Constructor con 1 parámetro
     * @param person de tipo Person
     */
    public Plane (Person person)
    {
        this();
        setPilot(person);
    }
    
    /** Constructor con 1 parámetro
     *  @param fuel de tipo int
     */
    public Plane(int fuel)
    {
        this();
        setFuel(fuel);
    }
    
    /**
     * Constructor random con 1 parámetro
     * @param identifier de tipo char
     */
    public Plane(char identifier)
    {
        this();
        Random r1 = new Random();
        setPilot(new Person());
        setFuel(r1.nextInt());
        setIdentifier(identifier);
        setXPos(r1.nextInt());
        setYPos(r1.nextInt());
        setYSpeed(r1.nextInt());
        setXSpeed(r1.nextInt());
    }    
    
    /**
     * Método que cambia la persona
     * @param la persona de tipo Person
     */
    public void setPilot(Person person)
    {
        this.person = person;
    }
    
    /** Método que dice que persona es
     *  @return las persona, de tipo Person
     */
    public Person getPilot()
    {
        return person;
    }
    
    /**
     * Método que cambia el identificadpr
     * @param el identificador de tipo char
     */
    public void setIdentifier(char identifier)
    {
        this.identifier = identifier;
    }
    
    /** Método que dice que identificador es
     *  @return el identificador, de tipo char
     */
    public char getIdentifier()
    {
        return identifier;
    }
    
    /**
     * Método que cambia el combustible
     * @param el combustible de tipo int
     */
    public void setFuel(int fuel)
    {
        this.fuel = fuel;
    }
    
    /** Método que dice cuanto combustible hay
     *  @return el combustible, de tipo int
     */
    public int getFuel()
    {
        return fuel;
    }
    
    /**
     * Método que cambia la posicion X
     * @param la posicion X  de tipo int
     */
    public void setXPos(int xPos)
    {
        if( xPos <= MAX_X && xPos >= MIN_X)
        {
            this.xPos = xPos;
        }
    }
    
    /** Método que dice la posicion X
     *  @return la posicion X, de tipo int
     */
    public int getXPos()
    {
        return xPos;
    }    
    
    /**
     * Método que cambia la posicion Y
     * @param la posicion Y  de tipo int
     */
    public void setYPos(int yPos)
    {
        if( yPos <= MAX_Y && yPos >= MIN_Y)
        {
            this.yPos = yPos;
        }
    }
    
    /** Método que dice la posicion Y
     *  @return la posicion Y, de tipo int
     */
    public int getYPos()
    {
        return yPos;
    } 
    
    /**
     * Método que cambia la velocidad x
     * @param la velocidad x  de tipo int
     */
    public void setXSpeed(int xSpeed)
    {
        if( xSpeed <= MAX_XSPEED && xSpeed >= MIN_XSPEED)
        {
            this.xSpeed = xSpeed;
        }
    }
    
    /** Método que dice la velocidad x
     *  @return la posicion x, de tipo int
     */
    public int getXSpeed()
    {
        return xSpeed;
    } 
    
    /**
     * Método que cambia la velocidad Y
     * @param la velocidad Y  de tipo int
     */
    public void setYSpeed(int ySpeed)
    {
        
        this.ySpeed = ySpeed;
    }
    
    /** Método que dice la velocidad Y
     *  @return la velocidad Y, de tipo int
     */
    public int getYSpeed()
    {
        return ySpeed;
    } 
    
    /** Método que dice cuanto combustible hay, y si hay resta 1 litro
     * @return false si no hay combustible
     * @return true si hay combustible, y a ese combustible se le resta 1 litro
     */
    public boolean fly()
    {
        if(getFuel() == 0)
        {
            return false;
        }
        else
        {
            if(getXPos()>MIN_X && getXSpeed() > MIN_XSPEED)
            {
                setXPos(getXPos()+getXSpeed());
            }
            if(getYPos()>MIN_Y && getYSpeed() > MIN_YSPEED) 
            {
                setYPos(getYPos()+getYSpeed());
            }
            if(getXPos()<MAX_X && getXSpeed() < MAX_XSPEED)
            {
                setXPos(getXPos()+getXSpeed());
            }
            if(getYPos()<MAX_Y && getYSpeed() < MAX_YSPEED)
            {
                setYPos(getYPos()+getYSpeed());
            }
            setFuel(getFuel()-1);
            return true;
        }
    }
    
    /** Método que devuelve los valores 
     * @return una cadena que dice el idedntificador, el combustible, y
     * @return si hay piloto su Hashcode
     * @return si no hay piloto la cadena "NO PILOT"
     */
    public String toString()
    {
        String result = getIdentifier() + "-" + getFuel() + "-";
        String result2 ="-(" + getXPos() + "," + getYPos()+ ")-(" + getXSpeed() + "," + getYSpeed() + ")."; 
        if(getPilot()==null)
        {
            return result + "NO PILOT" + result2;
        }
        else
        {
            return result + person.getHashCode() + result2;
        }
    }

    /** Metodo que sirve para acelerar el avión
     * @param el nuevo valor de xSpeed de tipo int
     * @param el nuevo valor de ySpeed de tipo int
     */
    public void accelerate(int xSpeed, int ySpeed)
    {
        if(xSpeed >= -1 && xSpeed <=1)
        {
            setXSpeed(xSpeed);
        }
        if(ySpeed >= -1 && ySpeed <=1)
        {
            setYSpeed(ySpeed);
        }
    }
}
