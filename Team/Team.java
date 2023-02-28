import java.util.ArrayList;
/**
 * Clase que simula un equipo
 * 
 * @author Ricardo Marqués Garay
 * @version 09/06/2019
 */
public class Team
{
    // constantes
    
    // atributos
    private ArrayList<Player> team;

    /**
     * Constructor 
     */
    public Team()
    {
        team = new ArrayList<Player>();
    }

    /**
     * Método para añadir un jugador al equipo
     * @param player de tipo Player
     */
    public void add(Player player)
    {
       team.add(player);
    }
    
    /**
     * Metodo para añadir un jugador y sus datos
     * @param player de tipo Player
     * @index int index
     */
    public void add(Player player, int index)
    {
        team.add(index, player);
    }
    
    /**
     * Metodo que devuelve al jugador o null
     * @param el numero del jugador de tipo int
     * @return si hay un jugador con ese numero devuelve un player de tipo Player
     * @return si no hay un jugador con ese número devuelve null
     */
    public Player seekPlayer(int number)
    {
         for(int i = 0; i<team.size();i++)
         {
             if(team.get(i).getNumber() == number)
             {
                 return team.get(i);
             }

         }
         return null;
    }
    
    /**
      * Metodo que devuelve un ArrayList con los jugadores que tienen numero impar
      */
    public ArrayList<Player> trainPlayers()
    {
        ArrayList<Player> playersList = new ArrayList<>(); 
        for(int i=0;i<team.size();i++)
            {
                if(i%2 != 0)
                {                    
                    playersList.add(seekPlayer(i));
                }
            }
            return playersList;
    }
    
    /**
     * Metodo que elimina jugadores del equipo
     * @param number de tipo int
     */
    public void removePlayers(int number)
    {
        for(int i = 0; i<team.size(); i++)
        {
            if(team.get(i).getNumber() == number)
            {
                team.remove(team.get(i));
            }
        }
    }
    
    /**
     * Metodo que imprime por pantalla a los jugadores
     */
    public void seePlayers()
    {
        for(int i=0; i<team.size();i++)
        {
            System.out.println(team.get(i));    
        }
    }
}
