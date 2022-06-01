import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class extraLife here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ExtraLife extends Item
{
    /**
     * Act - do whatever the extraLife wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
       checkFalling(); 
    }
    
    public int getScore(){
        return 100;
    }

}
