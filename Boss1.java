import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Boss1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Boss1 extends Bacterium
{
    public  Boss1(){
        super(20, 1, CerebroBoss.getDrSimInWorld());
        GreenfootImage myImage = getImage();
        int myNewHeight = (int)myImage.getHeight()/2;
        int myNewWidth = (int)myImage.getWidth()/2;
        myImage.scale(myNewWidth, myNewHeight);
    }
    
    public void act()
    {
        // Add your action code here.
        moveBacteriumToPersecute();
        attackBacterium();
    }
    
    public int getScore(){
        return 500;
    }
    
    public int getEnergySpecial(){
        return 0;
    }
}
