import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Item here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public abstract class Item extends Actor
{
    private int vSpeed = 0;
    private int gravity = 1;
    
    
    public void act()
    {
    }
    
    private void fall(){
        setLocation(getX(), getY() + vSpeed);
        vSpeed = vSpeed + gravity; 
    }
    
    private boolean onPlataform(){
        Actor under = getOneObjectAtOffset(0, getImage().getHeight()/2, Plataform.class);
        return under != null;
    }
    
    public void checkFalling(){
        if(onPlataform() == false){
            fall();
        }else{
            vSpeed = 0;
        }
    }
}
