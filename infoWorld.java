import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class InfoWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class infoWorld extends World
{

    /**
     * Constructor for objects of class InfoWorld.
     * 
     */
    public infoWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1000, 900, 1); 
        prepare();
    }
    
    private void prepare()
    {
        fDer fder = new fDer();
        addObject(fder,100,100);
        fder.setLocation(800,480);
        fIzq fizq = new fIzq();
        addObject(fizq, 100, 100);
        fizq.setLocation(800, 620);
        spacebar spaceBar = new spacebar();
        addObject(spaceBar, 100, 100);
        spaceBar.setLocation(800, 350);
        z Z = new z();
        addObject(Z, 100, 100);
        Z.setLocation(800, 740);
        c C = new c();
        addObject(C, 100, 100);
        C.setLocation(800, 860);
        Back back = new Back();
        addObject(back, 100, 100);
        back.setLocation(150, 150);
    }
}
