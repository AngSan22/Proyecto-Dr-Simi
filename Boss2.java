import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Boss2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Boss2 extends Bacterium
{
    public  Boss2(){
        super(20, 2, PulmonBoss.getDrSimInWorld());
        GreenfootImage myImage = getImage();
        int myNewHeight = (int)myImage.getHeight()*2;
        int myNewWidth = (int)myImage.getWidth()*2;
        myImage.scale(myNewWidth, myNewHeight);
    }
    
    public void act()
    {
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
