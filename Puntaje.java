import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Puntaje here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Puntaje extends Button
{
    /**
     * Act - do whatever the Puntaje wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public  void clicked(){
        Greenfoot.setWorld(new Score());
    }
}
