import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Boss2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Boss2 extends Bacterium
{
    public  Boss2(){
        super(20, Cerebro.getDrSimInWorld());
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
