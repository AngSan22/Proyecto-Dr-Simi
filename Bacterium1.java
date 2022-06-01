import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Bacteria1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Bacterium1 extends Bacterium
{
    /**
     * Act - do whatever the Bacteria1 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    private int direction = -1;
    
    public void act()
    {
        moveBacteriumOnPlataform();
    }
    
}
