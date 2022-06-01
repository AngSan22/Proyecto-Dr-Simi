import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Bacteria4 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Bacteria4 extends Bacteria
{
    /**
     * Act - do whatever the Bacteria4 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        moveBacterium();
    }
    
    private void moveBacterium(){
        DrSim drSim = Cerebro.getDrSimInWorld();
        
       turnTowards(drSim.getX(), drSim.getY());
       moveRandom();
    }
    
     public void moveRandom(){
        move(1);
        if(Greenfoot.getRandomNumber(100)<10){
            turn(Greenfoot.getRandomNumber(100)-45);
        }
    }
}
