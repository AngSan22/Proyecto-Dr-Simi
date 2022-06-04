import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class DrSimHud here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class DrSimHud extends Actor
{
    private int score;
    private int level;
    private int lifes = 3;
    private int special;
    
    public void act()
    {
        refresh();
        checkLifes();
    }
    
     private void refresh(){
        getWorld().showText("Level: " + level, 100, 30);
        getWorld().showText("Lifes: " + lifes, 250, 30);
        getWorld().showText("Score: " + score, 400, 30);
        getWorld().showText("Special: " + special, 550, 30);
    }
    
    public void setScore(int score){
        this.score = score;
    }
    
    public void setLifes(int lifes){
        this.lifes = this.lifes + lifes;
        
    }
    
    public void setEnergySpecial(int special){
        this.special = special;
    }
    
    private void checkLifes(){
        if(lifes == 0){
            GameRecord gameRecord = new GameRecord(Greenfoot.ask("Nombre del Jugador: "), score );
            RecordsManager recordsManager = new RecordsManager("GameRecords.txt", 100);
            recordsManager.save(gameRecord);
            Greenfoot.stop();
        }
    }
    
    public int getScore(){
        return score;
    }
}
