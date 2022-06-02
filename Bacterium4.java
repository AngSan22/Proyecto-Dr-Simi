import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Bacteria4 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Bacterium4 extends Bacterium
{
    public  Bacterium4(){
        super(2, Cerebro.getDrSimInWorld());
    }
    
    public void act()
    {
          moveBacteriumToPersecute();
          attackBacterium();
    }
    
    public int getScore(){
        return 50;
    }
    
    public int getEnergySpecial(){
        return 10;
    }
}
