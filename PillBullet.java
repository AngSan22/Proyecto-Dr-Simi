import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class pillBullet here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class PillBullet extends Bullet
{
    int speedBullet = 6;
    int position;
    
    public PillBullet(int direction){
        super(direction);
    }
    public void act()
    {
        moveBullet(speedBullet);
        checkColissions();
    } 
}
