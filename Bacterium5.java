import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Bacteria5 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Bacterium5 extends Bacterium
{
    public  Bacterium5(){
        super(1, 4, Cerebro.getDrSimInWorld());
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
