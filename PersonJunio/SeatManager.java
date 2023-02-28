import java.util.ArrayList;

/**
 * Clase responsable de sentar a los pasajeros
 * 
 * @author Ricardo Marqués Garay
 * @version 10/06/2019
 */
public class SeatManager
{
    //constantes
    public static final int MIN_FIRST_ROWS=3 ;
    public static final int MIN_STANDARD_ROWS=4 ;
    public static final int COLUMNS=6 ;
    public static final int MAX_STANDARD_ROWS= 40;
    public static final int MAX_FIRST_ROWS=10;
    
    public static final byte FIRST_CLASS = 1;
    public static final byte STANDARD_CLASS = 2;
    public static final byte ALL_CLASS = 3;
    // atributos
    private Person [][] seats;
    private int firstClassRows;
    private int standardClassRows;
    /**
     * Constructor de la calse sin parámetros
     */
  
    public SeatManager()
    {
        setSeats(MIN_FIRST_ROWS + MIN_STANDARD_ROWS,COLUMNS);
        setFirstClassRows(MIN_FIRST_ROWS);
        setStandardClassRows(MIN_STANDARD_ROWS);
    }

    /**
     * Constructor con 2 parámetros
     * @param rowsFirstClass de tipo int
     * @param rowsStandardClass de tipo int
     */
    public SeatManager(int rowsFirstClass, int rowsStandardClass)
    {
        this();
        
        assertParams(rowsFirstClass,rowsStandardClass);
        setSeats(rowsStandardClass + rowsFirstClass, COLUMNS);
        setFirstClassRows(rowsFirstClass);
        setStandardClassRows(rowsStandardClass);
    }
    
    /**
     * Metodo para validar parámetros del constructor
     * @param rowsFirstClass de tipo int
     * @param rowsStandardClass de tipo int
     */
    private void assertParams(int rowsFirstClass, int rowsStandardClass)
    {
        if(rowsFirstClass > MAX_FIRST_ROWS || rowsFirstClass < MIN_FIRST_ROWS)
        {
            throw new RuntimeException("Error: debe tener al menos 3 filas y 10 como máximo");
        }
        if(rowsStandardClass > MAX_STANDARD_ROWS || rowsStandardClass < MIN_STANDARD_ROWS)
        {
            throw new RuntimeException("Error: debe tener al menos 4 filas y 40 como máximo");
        }
    }
    
    /**
     * Metodo para cambiar los asientos
     * @param rows de tipo int
     * @param columns de tipo int
     */
    private void setSeats(int row, int column)
    {
        this.seats  = new Person [row][column];
    }
    
    /**
     * metodo para cambiar las filas de primera clase
     * @params firstClassRows de tipo int
     */
    private void setFirstClassRows(int rows)
    {
        this.firstClassRows = rows;
    }
    
    /**
     * Metodo para saber las filas de primera clase
     */
    public int getFirstClassRows()
    {
        return firstClassRows;
    }    
    
    /**
     * Metodo para cambiar las filas de clase estandar
     * @params rows de tipo int
     */
    private void setStandardClassRows(int rows)
    {
        this.standardClassRows = rows;
    }
    
    /**
     * Metodo para sentar a una persona en un asiento en la posicion recibida
     * @param person de tipo Person
     * @param row de tipo int
     * @param column de tipo int
     */
    public boolean bookSeat(Person person, int row, int column)
    {
        assertPerson(person);
        assertRow(row);
        assertColumn(column);
        
        if(seats[row][column] == null)
        {
            seats[row][column] = person;
            return true;
        }
        return false;
    }
    
    /**
     * Metodo para validad los parametros persona
     * @param person de tipo Person
     */
    private void assertPerson(Person person)
    {
        if(person == null)
        {
            throw new RuntimeException("Error: Esa persona no existe");
        }
    }
    
    /**
     * Metodo para validar los parametros fila
     * @param row de tipo int
     */
    private void assertRow(int row)
    {
        if(row > seats.length || row < 0)
        {
            throw new RuntimeException("Error: No existe esa fila");
        }
    }
    
    /**
     * Metodo para validar los parámetros column
     * @param column de tipo int
     */
    private void assertColumn(int column)
    {
        if ( column != COLUMNS || column < 0)     
        {
            throw new RuntimeException("Error: No existe esa column");
        }
    }
    
    /**
     * Metodo para dejar libre un asiento
     * @param row de tipo int
     * @param column de tipo int
     */
    public Person releaseSeat(int row, int column)
    {
        assertRow(row);
        assertColumn(column);
        
        if(seats[row][column] != null )
        {
           Person person = seats[row][column];
           seats[row][column] = null;
           return person;
        }
        else 
        {
            return null;
        }
    }
    
    /**
     * Metodo que imprime por pantalla la situacion de los asientos del avión
     */
    public void print()
    {
        System.out.println("   A B C    D E F");
        for(int i=0; i<seats.length;i++)
        {
            System.out.print(i + "  ");
            for(int j=0;j<seats[i].length;j++)
            {
                if(seats[i][j] == null)
                {
                    System.out.print("? ");
                }
                else if(seats[i][j].getAge() < seats[i][j].ADULTHOOD_AGE)
                {
                    System.out.print("C ");
                }
                else if(seats[i][j].getAge() >= seats[i][j].ADULTHOOD_AGE)
                {
                    System.out.print("X ");
                }
                
                if(j == 2)
                {
                    System.out.print("   ");
                }
                
                
            }
            if(i == 3)
                {
                    System.out.print("\n" + "----------------");
                }
                System.out.println();
        }
    }
    
    /**
     * Metodo que devuelva el primer pasajero que se encuentra en el avión
     * @return person de tipo Person
     */
    public Person firstPassenger()
    {
        for(int i = 0; i< seats.length; i++)
        {
            for(int j= 0;j< seats[i].length; j++)
            {
                if(seats[i][j] != null)
                {
                    Person person = seats[i][j];
                    return person;
                }
            }
        }
        return null;
    }
    
    /**
     * Metodo que devuelva un arraylist con las personas menores de edad
     * @ un arraylist de tipo Person
     */
    public ArrayList<Person> getYoungestPeople()
    {
        ArrayList<Person> youngestPeople = new ArrayList<Person>();
        int minAge= getMinAge();
        for(int i = 0; i<seats.length; i++)
        {
            for(int j= 0;j<seats[i].length;j++)
            {
                if(seats[i][j].getAge() == minAge && seats[i][j] != null)
                {
                    youngestPeople.add(seats[i][j]);
                }
            }
        }
        return youngestPeople;
    }
    
    /**
     * Metodo que encuentra la persona de menor edad
     * @return la edad minima de tipo int
     */
    private int getMinAge()
    {
        int minAge = 121;
        for(int i = 0; i<seats.length;i++)
        {
            for(int j = 0;j<seats[i].length; j++)
            {
                if(seats[i][j].getAge() < minAge && seats[i][j] != null)
                {
                    minAge = seats[i][j].getAge();
                }
            }
        }
        return minAge;
    }
    
    /**
     * Metodo que devuelva una lista con los pasajero menores de edad
     * @return un ArrayList de tipo Person
     */
    public ArrayList<Person> childrenPassenger()
    {
        ArrayList<Person> childrenPassenger = new ArrayList<Person>();
        
        for( int i = 0; i<seats.length; i++)
        {
            for( int j=0; j<seats[i].length; j++)
            {
                if( seats[i][j] != null && seats[i][j].getAge() < seats[i][j].ADULTHOOD_AGE)
                {
                    childrenPassenger.add(seats[i][j]);
                }
            }
        }
        return childrenPassenger;
    }
    
    /**
     * Metodo que devuelve el pasajero de más edad
     * @return person de tipo Person
     */
    public Person oldestPassenger()
    {
        Person person1 = new Person();
        int maxAge= getMaxAge();
        for(int i=0; i<seats.length;i++)
        {
            for( int j=0;j<seats[i].length;j++)
            {
                if(seats[i][j] != null && seats[i][j].getAge() == maxAge)
                {
                    person1 = seats[i][j];
                }
            }
        }
        return person1;
    }
    
    /**
     * Metodo para saber la edad maxima del avión
     * @return maxAge de tipo int
     */
    private int getMaxAge()
    {
        int maxAge = 0;
        for(int i =0; i<seats.length;i++)
        {
            for(int j =0;j<seats[i].length;j++)
            {
                if(seats[i][j] != null && seats[i][j].getAge() > maxAge)
                {
                    maxAge = seats[i][j].getAge();
                }
            }
        }
        return maxAge;
    }
    
    /**
     *  Metodo que dice el numero de asientos libres 
     *  @return asientos libres de tipo int
     */
    public int numberOfFreeSeats()
    {
        int freeSeats = 0;
        for(int i=0; i<seats.length; i++)
        {
            for(int j=0; j<seats[i].length; j++)
            {
                if(seats[i][j] == null)
                {
                    freeSeats++;
                }
            }
        }
        return freeSeats;
    }
    
    /**
     * Metodo que devuelve el nombre del pasajero de una determinada posición
     * @param row de tipo int
     * @param column de tipo int
     * @return name de tipo String
     */
    public String passengerName(int row, int column)
    {
        assertRow(row);
        assertColumn(column);
        
        if( seats[row][column] != null )     
        {
            return seats[row][column].getName();
        }
        return null;
    }
    
    /**
     * Metodo que sienta a una persona en el primer asiento libre del avión
     * @param person de tipo Person
     * @return true de tipo boolean si la consigue sentar
     * @return false de tipo boolean si no lo consigue
     */
    public boolean seatPassenger(Person p)
    {
        for(int i=0; i<seats.length; i++)
        {
            for( int j=0; j<seats[i].length; j++)
            {
                if (seats[i][j] == null)
                {
                    seats[i][j] = p;
                    return true;
                }
            }
        }        
        return false;
    }
    
    /**
     * Metodo que sienta a un conjunto de personas recibidas como parámetro
     * @param list de tipo ArrayList<Person>
     * @return numero de personas sentadas de tipo int
     */
    public int seatPassenger(ArrayList<Person> list)
    {
        int number = 0;
        
        for(int i=0; i<seats.length; i++)
        {
            for( int j=0; j<seats[i].length; j++)
            {
                if(seats[i][j] != null)
                {                                                            
                 seats[i][j] = new Person();
                 number++;                      
                }
            }
        }
        
        return number;
    }
    
    /**
     * Método que devuelve el numero de pasajeros sentando en un área del avión
     * @param zone de tipo byte
     * @return numero de pasajeros de tipo int
     */
    public int getNumPax(byte area)
    {
        int passenger = 0;
        for(int i= 0; i < seats.length; i++)
        {
            for( int j=0; j< seats[i].length; j++)
            {
                if(seats[i][j] != null && area == ALL_CLASS)
                {
                    passenger ++;
                }
                else if(seats[i][j] != null && area == STANDARD_CLASS && i > getFirstClassRows())
                {
                    passenger ++;
                }
                else if(seats[i][j] != null && area == FIRST_CLASS && i <= getFirstClassRows())
                {
                    passenger ++;
                }
            }
        }        
        return passenger;
    }
    
    /**
     * Metodo para sentar en orden en el avión a un numero dado de pasajeros
     * @param paxNumber de tipo int
     */
    public void loadPax(int PaxNumber)
    {
        int number = 0;
        for( int i=0; i<seats.length; i++)
        {
            for( int j=0; j<seats[i].length; j++)
            {
                if( seats[i][j] != null && number < PaxNumber)
                {
                    seats[i][j] = new Person();
                    number++;
                }
            }
        }
    }
    
    //load passenger
    
    /**
     * Metodo que busca si hay algun sitio libre
     * @return true de tipo boolean si hay sitio libre
     * @return false de tipo boolean si no hay sitio libre
     */
    public boolean isAnyFree()
    {
        for (int i=0; i<seats.length; i++)
        {
            for( int j=0; j<seats[i].length; j++)
            {
                if(seats[i][j] == null)
                {
                    return true;
                }
            }
        }
        return false;
    }
    
    /**
     * Metodo que devuelve el numero de asientos libres en una fila
     * @param row de tipo int
     * @paran freeSeats de tipo int
     */
    public int freeSeatsInRow(int row)
    {
        int freeSeats = 0;
        for(int j = 0; j<seats[row].length; j++)
        {
            if(seats[row][j] == null)
            {
                freeSeats++;
            }
        }
        return freeSeats;
    }
    
    /**
     * Metodo que devuelve la lista de todos los pasajeros
     * @return names de tipo ArrayList<String>
     */
    public ArrayList<String> passengerList()
    {
        ArrayList<String> names = new ArrayList<String>();
        for(int i=0; i<seats.length; i++)
        {
            for(int j=0; j<seats[i].length; j++)
            {
                if(seats[i][j] != null)
                {
                    names.add(seats[i][j].getName());
                }
            }
        }
        return names;
    }
}

