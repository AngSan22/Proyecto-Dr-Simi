import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Spike here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Spike extends Plataform
{
    /**
     * Act - do whatever the Spike wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {

    }
    
     private void checkColissions(){
         DrSim drSim = (DrSim)getOneIntersectingObject(DrSim.class);
        
        if(drSim != null){
            drSim.getDamage();
        }
     }
}
