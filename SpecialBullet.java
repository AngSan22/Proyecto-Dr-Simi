import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class SpecialBullet here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class SpecialBullet extends Bullet
{
    private int speedBullet;
    
    public SpecialBullet(int direction){
        super(direction);
    }
    
    public void act()
    {
        moveBullet(speedBullet);
        checkColissions();
    }
    
    public void checkColissions(){
        
    }
}
