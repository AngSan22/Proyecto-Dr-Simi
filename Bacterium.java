import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Bacteria here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public abstract class Bacterium extends Actor
{
    protected int direction = -1;
    protected int vida;
    
    public Bacterium(int vida){
        this.vida = vida;
    }
    
    public void act()
    {
        // Add your action code here.
    }
    
    public abstract int getScore();
    
    public void spawnItem(){
        int probability = Greenfoot.getRandomNumber(10);
        Item item = null;
        
        if(probability == 3){
            item = new ExtraLife();
            getWorld().addObject(item, getX(), getY());
        }else if(probability == 7){
            item = new PowerUp();
            getWorld().addObject(item, getX(), getY());
        }
        
    }
    
    private boolean onPlataform(){
        Actor under = getOneObjectAtOffset(0, getImage().getHeight()/2, Plataform.class);
        return under != null;
    }
    
    protected void moveBacteriumOnPlataform(){
       if(onPlataform() == false){
           takeDirection();
       }
       
       move(4 * direction);
    }
    
    private void takeDirection(){
        if(direction < 0){
               direction = 1;
           }else{
               direction = -1;
           }
    }
    
    protected void moveBacteriumToPersecute(){
        DrSim drSim = Cerebro.getDrSimInWorld();
        
       turnTowards(drSim.getX(), drSim.getY());
       moveRandom();
    }
    
     public void moveRandom(){
        move(1);
        if(Greenfoot.getRandomNumber(100)<10){
            turn(Greenfoot.getRandomNumber(100)-45);
        }
    }
    
    protected void moveBacteriumOnAir(int x){
        if(getX() > x + 90 || getX() < x - 90){
            direction = direction * -1;
        }
        
        move(4 * direction);
    }
    
    protected void attackBacterium(){
        int probability = Greenfoot.getRandomNumber(50);
        
        if(probability == 25){
            GermBullet germ = new GermBullet(direction);
            getWorld().addObject(germ, getX(), getY());
        }
    }
    
    public void getDamage(){
        vida--;
        
        if(vida == 0){
            DrSim drSim = Cerebro.getDrSimInWorld();
            drSim.addScore(getScore());
            spawnItem();
            getWorld().removeObject(this);
        }
    }
}
