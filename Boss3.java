import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Boss3 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Boss3 extends Bacterium
{
    public  Boss3(){
        super(20, 4, Cerebro.getDrSimInWorld());
    }
    
    public void act()
    {
        // Add your action code here.
    }
    
    public int getScore(){
        return 500;
    }
    
    public int getEnergySpecial(){
        return 0;
    }
}
