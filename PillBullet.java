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
        position = direction;
    }
    public void act()
    {
        moveBullet();
        checkColissions();
    } 
    
    protected void moveBullet(){
        switch(position){
            case 1:
                setLocation(getX() + speedBullet,getY());
            break;
            case -1:
                setLocation(getX() - speedBullet,getY());
            break;
        }
    }
    
    protected void checkColissions(){
        Bacteria enemy = (Bacteria)getOneIntersectingObject(Bacteria.class);
        
        if(enemy != null){
            getWorld().removeObject(enemy);
            getWorld().removeObject(this);
        }
    }
}
