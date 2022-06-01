import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Bacteria6 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Bacterium6 extends Bacterium
{
    public  Bacterium6(){
        super(1, Cerebro.getDrSimInWorld());
    }
    
    public void act()
    {
         moveBacteriumToPersecute();
    }
    
    public int getScore(){
        return 50;
    }
    
    public int getEnergySpecial(){
        return 10;
    }
}
