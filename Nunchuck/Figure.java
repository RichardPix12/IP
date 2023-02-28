
/**
 * Write a description of class Figure here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Figure
{
    //Constantes
    public static final int X_UPPER_EDGE = 640;
    public static final int Y_UPPER_EDGE = 320;
    public static final int X_LOWER_EDGE = 0;
    public static final int Y_LOWER_EDGE = 0;
    public static final char LEFT = 'L';
    public static final char RIGHT = 'R';
    public static final char UP = 'U';
    public static final char DOWN = 'D';
    public static final int STEP = 10;
    //Atributos
    private String name;
    private int xPos;
    private int yPos;

    /**
     * Constructor por defecto
     */
    public Figure()
    {
        setName("Marta");
        setXPos(X_LOWER_EDGE);
        setYPos(Y_LOWER_EDGE);
    }
    
    /**
     * Constructor con 3 parámetros
     * @param name de tipo String
     * @param xPos de tipo int
     * @param yPos de tipo int
     */
    public Figure(String name, int xPos, int yPos)
    {
        this();
        setName(name);
        setXPos(xPos);
        setYPos(yPos);
    }
    
    /**
     * Metodo que te permite cambiar el nombre
     * @param name de tipo String
     */
    private void setName(String name)
    {
        this.name = name;
    }
    
    /**
     * Metodo que te permite saber el nombre
     * @return name de tipo String
     */
    public String getName()
    {
        return name;
    }
    
    /**
     * Metodo que te permite cambiar la posición X
     * @param xPos de tipo int
     */
    private void setXPos(int xPos)
    {
        if(xPos >= X_LOWER_EDGE && xPos <= X_UPPER_EDGE)
        {
            this.xPos = xPos;
        }
    }
    
    /**
     * Metodo que te permite saber la posición X
     * @return xPos de tipo int
     */
    public int getXPos()
    {
        return xPos;
    }
    
    /**
     * Metodo que te permite cambiar la posición Y
     * @param yPos de tipo int
     */
    private void setYPos(int yPos)
    {
        if(yPos >= Y_LOWER_EDGE && yPos <= Y_UPPER_EDGE)
        {
            this.yPos = yPos;
        }
    }
    
    /**
     * Metodo que te permite saber la posición Y
     * @return yPos de tipo int
     */
    public int getYPos()
    {
        return yPos;
    }
    
    /** 
     * Metodo para mover al personaje
     * @param movement, de tipo char
     */
    public void move(char movement)
    {
        if(movement == LEFT )
        {
            setXPos(getXPos() + 1);
        }
        if(movement == RIGHT)
        {
            setXPos(getXPos() - 1);
        }
        if(movement == UP)
        {
            setYPos(getYPos() + 1);
        }
        if(movement == DOWN)
        {
            setYPos(getYPos() - 1);
        }
    }
    
    /** Metodo para saber su información
     * @return una cade de informacion de la figura, de tipo Sting
     */
    public String toString()
    {
        String result = getName() + "-" + getXPos() + "-" + getYPos();
        return result;
    }
}
