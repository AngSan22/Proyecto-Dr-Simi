import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class EstomagoBoss here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class EstomagoBoss extends World
{
    public static DrSim drSim;

    /**
     * Constructor for objects of class EstomagoBoss.
     * 
     */
    public EstomagoBoss()throws Exception
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(800, 800, 1); 
        prepare();
    }
    
    private void prepare() throws Exception{
        
    }
    
    public static DrSim getDrSimInWorld(){
        return drSim;
    }
}
