import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.*;

/**
 * Write a description of class Score here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Score extends World
{
    RecordsManager recordsManager = new RecordsManager("records.txt",10);

    /**
     * Constructor for objects of class Score.
     * 
     */
    public Score()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(800, 800, 1); 
        List<GameRecord> records = recordsManager.getRecords();
        Back back = new Back();
        addObject(back, 150, 750);
        
        int i = 0;
        for (GameRecord record: records)
        {
            Counter score = new Counter();
            
            score.setValue(record.getScore());
            addObject(score, 450,300+i);
            this.showText(record.getPlayerName(), 350, 300+i);
            
            i+=80;
            
        }
    }
}
