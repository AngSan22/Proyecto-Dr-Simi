import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Turtle here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Score extends Button
{
    public  void clicked(){
        Greenfoot.setWorld(new ScoreWorld());
    }
}
