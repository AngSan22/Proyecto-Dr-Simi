import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Boss3 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Boss3 extends Bacterium
{
    public  Boss3(){
        super(3, 2, EstomagoBoss.getDrSimInWorld());
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
