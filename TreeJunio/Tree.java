
/**
 * Write a description of class Tree here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Tree
{
    // Variables de la clase:
    public static final String DEFAULT_TYPE_OF_TREE = "Manzano";
    public static final int DEFAULT_NUMBER_OF_FLOWERS= 7;
    public static final int DEFAULT_NUMBER_OF_FRUITS= 3;
    
    // Atributos de la clase:
    private String typeOfTree;
    private int maxNumberOfFlowers;
    private int numberOfFlowers;
    private int numberOfFruits;

    /**
     * Constructor sin parámetros
     */
    public Tree()
    {
        setTypeOfTree(DEFAULT_TYPE_OF_TREE);
        setMaxNumberOfFlowers();
        setNumberOfFlowers(DEFAULT_NUMBER_OF_FLOWERS);
        setNumberOfFruits(DEFAULT_NUMBER_OF_FRUITS);
    }

    /**
     * Metodo para cambiar el tipo de árbol
     * 
     * @param  El tipo de arbol de tipo String
     */
    public void setTypeOfTree(String typeOfTree)
    {
        this.typeOfTree = typeOfTree;
    }
    
    /** Metodo para saber el tipo de árbol
     * @return el tipo de arbol de tipo String
     */
    public String getTypeOfTree()
    {
        return typeOfTree;
    } 
    
    /**
     * Metodo para cambiar el número máximo de flores
     * 
     * @param  El número maximo de flores de tipo int
     */
    public void setMaxNumberOfFlowers()
    {
        if(maxNumberOfFlowers >= 0)
        this.maxNumberOfFlowers = 12;
    }
    
    /** Metodo para saber eel número máximo de flores
     * @return el número máximo de flores de tipo int
     */
    public int getMaxNumberOfFlowers()
    {
        return maxNumberOfFlowers;
    } 
    
        /**
     * Metodo para cambiar el número de flores
     * 
     * @param  El número de flores de tipo int
     */
    public void setNumberOfFlowers(int numberOfFlowers)
    {
        if(numberOfFlowers <= getMaxNumberOfFlowers() && numberOfFlowers >=0)
        {
        this.numberOfFlowers = numberOfFlowers;
        }
    }
    
    /** Metodo para saber eel número máximo de flores
    * @return el número máximo de flores de tipo int
    */
    public int getNumberOfFlowers()
    {
        return numberOfFlowers;
    } 
    
    /**
     * Metodo para cambiar el número de frutos
     * 
     * @param  El número de frutos de tipo int
     */
    public void setNumberOfFruits(int numberOfFruits)
    {
        if(numberOfFruits >=0)
        {
        this.numberOfFruits = numberOfFruits;
        }
    }
    
    /** Metodo para saber el número máximo de frutos
    * @return el número máximo de flores de tipo int
    */
    public int getNumberOfFruits()
    {
        return numberOfFruits;
    } 
    
    /** Método toString que devuelve una cadena con la información de las propiedades.
     *  @return cadena de informacion de tipo String 
     *  @return Por Ej;  “Manzano-25-7-3”
     */
    public String toString()
    {
       return "“" + this.getTypeOfTree() + "-" + this.getMaxNumberOfFlowers() + "-" + this.getNumberOfFlowers() + "-"  + this.getNumberOfFruits() + "”";
    }
    
    /** Metodo que imprima por pantalla los valores del toString
     * @return Cadena de valores del toString de tipo String
     * @return por Ej; Valores de las propiedades del árbol: Manzano-25-7-3
     */
    public String print()
    {
        return "Valores de las propiedades del árbol: " + toString();
    }
    
    /** Metodo para regar
     *  
     */
    public void water()
    {
        if(getNumberOfFlowers() < getMaxNumberOfFlowers())
        {
            setNumberOfFlowers(getNumberOfFlowers()+1);
        }
        else
        {
            if(getNumberOfFruits() < getMaxNumberOfFlowers())
            {
                setNumberOfFlowers(getNumberOfFlowers()-1);
                setNumberOfFruits(getNumberOfFruits()+1);
            }
        }
    }
    
    /** Metodo para recoger fruta
     * @return el nuevo numero de frutas, de tipo INT
     */
    public int gatherFruit()
    {
        setNumberOfFruits(getNumberOfFruits()-1);
        return getNumberOfFruits();
    }
    
    /** Metodo para recoger la cosecha completa
     *  @return el numero de frutas recogidas de tipo int
     */
    public int harvest()
    {                
        if(getNumberOfFruits() >= 0 && getNumberOfFlowers()>=0)
        {
            int result= getNumberOfFruits();
            setNumberOfFruits(0);
            return result;
        }
        else
        {
            return 0;
        }
    }
}

