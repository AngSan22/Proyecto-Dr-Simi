import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Bacteria here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Bacteria extends Actor
{
    /**
     * Act - do whatever the Bacteria wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        // Add your action code here.
    }
    
    public void spawnItem(){
        int probability = Greenfoot.getRandomNumber(10);
        Item item = null;
        
        if(probability == 3){
            item = new ExtraLife();
            getWorld().addObject(item, getX(), getY());
        }else if(probability == 7){
            item = new PowerUp();
            getWorld().addObject(item, getX(), getY());
        }
        
    }
}
