import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class germBullet here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class GermBullet extends Bullet
{
    int speedBullet = 6;
    
    public GermBullet(int direction){
        super(direction);
    }
    
    public void act()
    {
        moveBullet(speedBullet);
    }
    

}
