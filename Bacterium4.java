import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Bacteria4 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Bacterium4 extends Bacterium
{
    public  Bacterium4(){
        super(3, 1, Cerebro.getDrSimInWorld());
        GreenfootImage myImage = getImage();
        int myNewHeight = (int)myImage.getHeight()/2;
        int myNewWidth = (int)myImage.getWidth()/2;
        myImage.scale(myNewWidth, myNewHeight);
    }
    
    public void act()
    {
          moveBacteriumToPersecute();
          attackBacterium();
    }
    
    public int getScore(){
        return 50;
    }
    
    public int getEnergySpecial(){
        return 10;
    }
}
