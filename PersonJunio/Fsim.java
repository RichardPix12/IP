import java.util.ArrayList;
import java.util.Iterator;
/**
 * Write a description of class Fsim here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Fsim
{
    // Constantes
    public static final char DOT = '.';
    
    private static final String IDs = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    // Atributos
    private ArrayList<Plane> planes;
    private char[][] map;
    
    /**
     * Constructor del simulador
     * @param 
     */
    public Fsim()
    {
        planes = new ArrayList<Plane>();
        map = new char[Plane.MAX_X + 1][Plane.MIN_Y + 1];
    }

    /**
     * Constructor con un parámetro
     * @param planeNumber de tipo int
     */
    public Fsim(int planeNumber)
    {
        this();
        assertParams(planeNumber);
        
        for (int i=0;i<planeNumber;i++)
        {
            planes.add(new Plane(IDs.charAt(i)));
        }
    }
    
    /**
     * Metodo que rellena el mapa con una constante
     */
    public void fillWithDots()
    {
        for(int i=0; i<map.length; i++)
        {
            for( int j=0; j<map[i].length; j++)
            {
                    map[i][j] = DOT;                
            }
        }
    }
    
    /**
     * Metodo que simula el vuelo de todos los aviones. Se produce una colision si hay un avión en una posición distinta de '.', y ambos aviones se borran.
     */
    public void simulate()
    {
         fillWithDots();
         for( Plane plane: planes)
         {
             plane.fly();
             if(map[plane.getXPos()][plane.getYPos()] == DOT)
             {
                 map[plane.getXPos()][plane.getYPos()] = plane.getIdentifier();
             }
             else if(map[plane.getXPos()][plane.getYPos()] != DOT)
             {
                 map[plane.getXPos()][plane.getYPos()] = '%';
                 removePlanes();
             }
         }
         print();
    }
    
    /**
     * Metodo para borrar un avión colisionado
     */
    private void removePlanes()
    {
        for( int i=0; i<map.length; i++)
        {
            for(int j=0; j<map[i].length; j++)
            {
                if(map[i][j] == '%')
                {
                    removePlanes1(i,j);
                }
            }
        }
    }
    
     /**
     * Metodo privado que da la posición del avión que hay que borrar
     * @param row de tipo int
     * @param param de tipo int
     */
    private void removePlanes1(int i, int j)
    {
        Iterator<Plane> it = planes.iterator();
        while(it.hasNext())
        {
            Plane plane=it.next();
            if(it.next().getXPos() == i && it.next().getYPos() == j)
            {
                System.out.println("Borrando " + plane.toString());
                planes.remove(plane);
            }
        }
    }
    
    /**
     * Metodo que imprime por pantalla la matriz
     */
    public void print()
     {
        int x = 0;
        for (int i=0; i<map.length; i++)
        {
            for ( int j=0; j<map[i].length; j++)
            {
                if(map[i][j] == DOT)
                {
                    System.out.println(". ");
                }
                if(map[i][j] != DOT)
                {
                    Plane plane = planes.get(x);
                    System.out.println(plane.getIdentifier());
                    x++;
                }
                System.out.print(map[i][j] + "\t");
            }
            System.out.println("");
        }
    }
    
    /**
     * Metodo que comprueba si el parámetro es null
     * @param plane de tipo Plane
     * @throws Runtime exception si el paramentro es null
     */
    private void checkNull(Plane plane)
    {
        if(plane == null)
        {   
            throw new RuntimeException("El parámetro es null");
        }
    }
    
    /**
     * Método para aceptar parámetros
     * @param planeNumber de tipo int
     */
    private void assertParams(int planeNumber)
    {
        if(planeNumber > IDs.length())
        {
            throw new RuntimeException("Error: el número de aviones es elevado");
        }
    }
}
