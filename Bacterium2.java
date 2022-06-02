import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Bacteria2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Bacterium2 extends Bacterium
{
    public  Bacterium2(){
        super(1, 4, Cerebro.getDrSimInWorld());
    }
    
    public void act()
    {
        attackBacterium();
    }
    
    public int getScore(){
        return 50;
    }
    
    public int getEnergySpecial(){
        return 10;
    }
}
