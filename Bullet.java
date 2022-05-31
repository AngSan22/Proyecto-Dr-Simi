import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class bullet here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public abstract class Bullet extends Actor
{
    int speedBullet;
    int position;
    
    public void act()
    {
        // Add your action code here.
    }
    
    protected void moveBullet(int speedBullet){
        switch(position){
            case 1:
                setLocation(getX() + speedBullet,getY());
            break;
            case -1:
                setLocation(getX() - speedBullet,getY());
            break;
        }
    }
    
    protected abstract void checkColissions();
}
