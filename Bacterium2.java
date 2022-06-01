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
        super(1);
    }
    
    public void act()
    {
        attackBacterium();
    }
    
    public int getScore(){
        return 50;
    }
}
