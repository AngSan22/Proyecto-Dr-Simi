import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Bacteria3 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Bacterium3 extends Bacterium
{
    public  Bacterium3(){
        super(1,4, Cerebro.getDrSimInWorld());
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
