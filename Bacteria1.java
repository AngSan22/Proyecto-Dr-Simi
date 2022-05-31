import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Bacteria1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Bacteria1 extends Bacteria
{
    /**
     * Act - do whatever the Bacteria1 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    private int direction = -1;
    
    public void act()
    {
        moveBacterium();
    }
    
    private boolean onPlataform(){
        Actor under = getOneObjectAtOffset(0, getImage().getHeight()/2, Plataform.class);
        return under != null;
    }
    
    private void moveBacterium(){
       if(onPlataform() == false){
           takeDirection();
       }
       
       move(4*direction);
    }
    
    private void takeDirection(){
        if(direction < 0){
               direction = 1;
           }else{
               direction = -1;
           }
    }
}
