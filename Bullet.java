import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class bullet here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public abstract class Bullet extends Actor
{
    int position;
    
    public Bullet(int direction){
        position = direction;
    }
    
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
    
    protected void checkColissions(){
        Bacterium enemy = (Bacterium)getOneObjectAtOffset(0,0,Bacterium.class);
        
        if(enemy != null){
            getWorld().removeObject(enemy);
            getWorld().removeObject(this);
        }else if((getX() >= getWorld().getWidth()-5) || (getX() <= 5) ){
            getWorld().removeObject(this);
        }
    }
}
