
/**
 * Clase que simula el controlador de un puente
 * 
 * @author Ricardo Marqués Garay
 * @version 09/06/2019
 */
public class BridgeController
{
    // Constantes de la clase
    public static final int FIRST_POSITION = 0;
    public static final int SECOND_POSITION = 1;
    public static final int THIRD_POSITION = 2;
    public static final int FIRST_POSITION_VALOR = 0;
    public static final int SECOND_POSITION_VALOR = 30;
    public static final int THIRD_POSITION_VALOR = 60;
    // Atributos de la clase
    private int lever;
    private boolean clutch;
    private BasculeBridge bridge;

    /**
     * Constructor inicial sin parámetros
     */
    public BridgeController()
    {
        setLever(FIRST_POSITION);
        setClutch(false);
        setBridge(new BasculeBridge(0));        
    }

    /**
     * Constructor con parámetro
     * @param leverPosition (la posicion de la palanca) de tipo int
     */
    public BridgeController(int leverPosition)
    {
        if(leverPosition >= FIRST_POSITION && leverPosition <= THIRD_POSITION)
        {
            setLever(leverPosition);
            setClutch(false);
            if(leverPosition == FIRST_POSITION)
            {
                setBridge(new BasculeBridge(0));
            }
            else if(leverPosition == SECOND_POSITION)
            {
                setBridge(new BasculeBridge(30));
            }
            else if(leverPosition == THIRD_POSITION)
            {
                setBridge(new BasculeBridge(60));
            }
        }
    }
    
    /**
     * Metodo que cambia la posicion de la palanca
     *  @param lever de tipo int
     */
    private void setLever(int lever)
    {
        this.lever = lever;
    }
    
    /**
     * Metodo que te dice la posicion de la palanca
     * @return lever de tipo int
     */
    public int getLever()
    {
        return lever;
    }
    
    /**
     * Metodo que cambia la posicion del embrague
     *  @param clutch de tipo boolean
     */
    private void setClutch(boolean clutch)
    {
        this.clutch = clutch;
    }
    
    /**
     * Metodo que te dice la posicion del embraghe
     * @return clutch de tipo boolean
     */
    public boolean getClutch()
    {
        return clutch;
    }
    
    /**
     * Metodo que cambia el puente
     *  @param bridge de tipo BasculeBridge
     */
    private void setBridge(BasculeBridge bridge)
    {
        this.bridge = bridge;
    }
    
    /**
     * Metodo que te dice el puente que es
     * @return bridge de tipo BasculeBridge
     */
    public BasculeBridge getBridge()
    {
        return bridge;
    }
    
    /**
     * Metodo que cambia la presión del embrague
     */
    public void changeClutch()
    {
        if(getClutch() == true)
        {
            setClutch(false);
        }
        if(getClutch() == false)
        {
            setClutch(true);
        }
    }
    
    /**
     * Metodo que cambia la posición de la palanca
     * @param lever Position de tipo int
     */
    public void changeLever(int leverPosition)
    {
        if(getClutch() == true && getLever()>= FIRST_POSITION && getLever() <= THIRD_POSITION)
        {
            setLever(leverPosition);
            if(leverPosition == FIRST_POSITION)
            {
                if(bridge.getSlope() >= FIRST_POSITION_VALOR)
                {
                    bridge.dropBridge(bridge.getSlope());
                }
            }
            if(leverPosition == SECOND_POSITION)
            {
                if(bridge.getSlope() <= SECOND_POSITION_VALOR)
                {
                    bridge.raiseBridge(SECOND_POSITION_VALOR - bridge.getSlope());
                }
                if(bridge.getSlope() >= SECOND_POSITION_VALOR)
                {
                    bridge.dropBridge(SECOND_POSITION_VALOR - bridge.getSlope());
                }
            }
            if(leverPosition == THIRD_POSITION)
            {
                if(bridge.getSlope() <= THIRD_POSITION_VALOR)
                {
                    bridge.raiseBridge(THIRD_POSITION_VALOR - bridge.getSlope());
                }
            }
        }
        }
}

