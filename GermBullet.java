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
        checkColissions();
    }
    
    protected void checkColissions(){
        DrSim drSim = (DrSim)getOneObjectAtOffset(0,0,DrSim.class);
        
        if(drSim != null){
            getWorld().removeObject(this);
            drSim.getDamage();
        }else if((getX() >= getWorld().getWidth()-5) || (getX() <= 5) ){
            getWorld().removeObject(this);
        }
    }
}
