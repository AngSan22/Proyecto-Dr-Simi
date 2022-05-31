import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{

    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1000, 900, 1); 
        prepare(); 
    }
    
    private void prepare()
    {
        Start start = new Start();
        addObject(start,500,500);
        start.setLocation(400,830);
        Exit exit = new Exit();
        addObject(exit,222,194);
        Info info = new Info();
        addObject(info,200,830);
        Score score = new Score();
        addObject(score,353,269);
        exit.setLocation(600,830);
        score.setLocation(800,830);
    }
}
