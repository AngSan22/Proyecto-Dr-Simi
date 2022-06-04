import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class spacebar here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class spacebar extends Actor
{
    
    public spacebar(){
        GreenfootImage myImage = getImage();
        int myNewHeight = (int)myImage.getHeight()/10;
        int myNewWidth = (int)myImage.getWidth()/10;
        myImage.scale(myNewWidth, myNewHeight);
    }
    /**
     * Act - do whatever the spacebar wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        // Add your action code here.
    }
}
