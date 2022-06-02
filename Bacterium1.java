import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Bacteria1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Bacterium1 extends Bacterium
{
    private int direction = -1;
    
    public  Bacterium1(){
        super(3, 4, Estomago.getDrSimInWorld());
        GreenfootImage myImage = getImage();
        int myNewHeight = (int)myImage.getHeight()/2;
        int myNewWidth = (int)myImage.getWidth()/2;
        myImage.scale(myNewWidth, myNewHeight);
    }
    
    public void act()
    {
        moveBacteriumOnPlataform();
    }
    
    public int getScore(){
        return 50;
    }
    
    public int getEnergySpecial(){
        return 10;
    }
}
