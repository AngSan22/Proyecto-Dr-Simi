import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Bacteria1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Bacterium1 extends Bacterium
{
    private int direction = -1;
    
    public  Bacterium1(){
        super(3, Cerebro.getDrSimInWorld());
    }
    
    public void act()
    {
        moveBacteriumOnPlataform();
    }
    
    public int getScore(){
        return 50;
    }
    
    public int getEnergySpecial(){
        return 10;
    }
}
