import java.util.Random;
import java.util.ArrayList;
/**
 * Clase que simula a una persona
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Person
{
    //Constantes de la clase:
    public static final int MAX_AGE=120;
    public static final int MIN_AGE=0;
    public static final boolean GENDER_MALE=true;
    public static final boolean GENDER_FEMALE=false;
    public static final int ADULTHOOD_AGE=18;
    public static final int RETIREMENT_AGE=65;
    private static final String femaleNames[] = {"Malena","María","Marta","Yaiza"};
    private static final String maleNames [] = {"Richard","Jeremy","David","Kevin"};
    private static final String Surnames[] = {"Ramos","González","Marqués","Barrientos","Verdes"};
    //Atributos de la clase:
    private String name;
    private String surname;
    private int age;
    private boolean gender;

    /**
     * Constructor sin parámetros
     */
    public Person()
    {
        Random r1 = new Random();
        setGender(r1.nextBoolean());
        if(getGender() == GENDER_MALE)
        {   
            setName(maleNames[r1.nextInt(maleNames.length)]);
        }
        if(getGender() == GENDER_FEMALE)
        {
            setName(femaleNames[r1.nextInt(femaleNames.length)]);
        }
        setSurname(Surnames[r1.nextInt(Surnames.length)]);
        setAge(r1.nextInt(120));
        //setName("Ricardo");
        //setSurname("Marques");
        // setAge(r1.nextInt());
        // setGender(true);
    }

    /** Constructor con un parámetro
     * @param la edad de tipo int
     */
    public Person(int age)
    {
        this(); //Invocamos al constructor sin parámetros
        setAge(age);
    }
    
    /** Constructor con todo parámetros
     * @param la edad de tipo int
     * @param El nombre de tipo String
     * @param El apellido de tipo String
     * @param El genero de tipo booleano, True si es masculino
     */
    public Person(int age, String name, String surname, boolean gender)
    {
        this();
        setAge(age);
        setName(name);
        setSurname(surname);
        setGender(gender);
    }
    
    /**
     * Metodo para cambiar el nombre
     * 
     * @param el nuevo nombre de tipo String
     *   
     */
    public void setName(String name)
    {
        this.name = name;
    }
    
    /** Metodo para saber el nombre
     * @return el nombre
     */
    public String getName()
    {
        return name;
    }
    
    /** Método para cambiar el apellido
     * @param el nuevo apellido de tipo String
     */
    public void setSurname(String surname)
    {
        this.surname = surname;
    }
    
    /** Metodo para saber el apellido
     * @return el apellido de tipo String
     */
    public String getSurname()
    {
        return surname;
    }
    
    /**
     * Metodo para cambiar la edad
     * 
     * @param la nueva edad de tipo int
     *   
     */
    public void setAge(int age)
    {
        if(age >=MIN_AGE && age <= MAX_AGE)
        {
            this.age = age;
        }
    }
    
    /** Metodo para saber la edad
     * @return el nombre de tipo int
     */
    public int getAge()
    {
        return age;
    }
    
    /**
     * Metodo para cambiar el género
     * 
     * @param El nuevo género, true si es masculino, false si es femenino
     *   
     */
    public void setGender(boolean gender)
    {
        if(gender == true)
        {
            this.gender = GENDER_MALE;
        }
        else
        {
            this.gender = GENDER_FEMALE;
        }
    }
    
    /** Metodo para saber el género
     * @return true si es masculino, false si es femenino
     */
    public boolean getGender()
    {
        return gender;
    }
    
    /** Metodo que imprime por pantalla su edad, y la que tendra al año siguiente
     * 
     */
    public void print()
    {
        System.out.println("Mi edad es" + getAge() + " pero el año que viene tendré" + (getAge()+1) + " años");
    }
    
    /**
     * Método que devuelve los valores de todos los atributos del objeto
     *
     * 
     * @return     cadena con nombre, apellido, edad, y género con el siguiente formato
     * Nombre: Ricardo; Apellido: Marqués; Edad:18; Género; Masculino
     */
    public String toString()
    {
        String result = "Nombre:" + this.getName() + "; Apellido:" + this.getSurname() + "; Edad:" + this.getAge() + "; Género:" ;
        if (getGender() == true)
        {
            return result + "Masculino"; 
        }
        else
        {
            return result + "Femenino";
        }
    }
    
    /** Metodo que devuelve un número en funcion de tu edad
     *  @return Si la persona es menor de edad, el número de años que le quedan a una persona para llegar a la mayoría de edad (18) de tipo int
     *  @return Si la persona ha llegado a la edad adulta y menor de 65 años, el número de años que le faltan para llegar a la edad de jubilación (65 años) de tipo int
     *  @return Si la persona ha llegado a la jubilación, el número de años quehan trascurrido desde la jubilación de tipo int
     */
    public int getCriticalAge()
    {
        if(getAge() <  ADULTHOOD_AGE)
        {
            return  ADULTHOOD_AGE - getAge();
        }
        else if(getAge()>= ADULTHOOD_AGE && getAge() <=RETIREMENT_AGE )
        {
            return RETIREMENT_AGE  - getAge();
        }
        else
        {
            return getAge() - RETIREMENT_AGE ;
        }
    }
    
    /** Metodo que devuelve un codigo de información sobre la persona
     * @return un codigo que devuelve la información de la persona, de la forma "EDAD-4 PRIMERAS LETRAS DEL NOMBRE-4 PRIMERAS LETRAS DEL APELLIDO-ESTADO DE TRABAJADOR"
     * @return Ej; "19-RICA-MARQ-ADULT"
     */
    public String getHashCode()
    {
        String result = getAge() + "-" + getName().substring(0,4).toUpperCase() + "-" + getSurname().substring(0,4).toUpperCase() + "-";
        if(getAge() < ADULTHOOD_AGE)
        {
            return result + "CHILD";
        }
        else if(getAge() >= ADULTHOOD_AGE && getAge()< RETIREMENT_AGE)
        {
            return result + "ADULT";
        }
        else
        {
            return result + "RETIRED";
        }
    }
}
