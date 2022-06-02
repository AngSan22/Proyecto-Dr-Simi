import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class DrSim here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class DrSim extends Actor
{
    private GreenfootImage []images;
    private int speed = 4;
    private int jumpSpeed = 0;
    private int jumpHeight = -20;
    private int gravity = 1;
    
    private int countPowerUp = 0;
    private int countInvincibility = 0;
    
    private int direction = 1;
    private boolean isShot = false;
    private int speedShot = 30;
    private int counterShot;
    
    private int energy = 90;
    private boolean isShotSpecial = false;
    private int speedShotSpecial = 8;
    private int counterShotSpecial;
    private Special vaccine = new Special();
    
    private DrSimHud drSimHud;
    private int score = 0;
   
    public DrSim(DrSimHud drSimHud){
        images = new GreenfootImage[5];
        images[0] = new GreenfootImage("Simi-Principal.png");
        images[1] = new GreenfootImage("Simi-Parado-Derecha.png");
        images[2] = new GreenfootImage("Simi-Parado-Izquierda.png");
        images[3] = new GreenfootImage("Simi-Derecha.png");
        images[4] = new GreenfootImage("Simi-Izquierda.png");
        
        this.drSimHud = drSimHud;
    }
    public void act()
    {
        moveDrSim();
        
        checkPowerUp();
        setShot();
        
        setSpecialShot();
        
        checkFalling();
        
        checkColissions();
    }
    
    private void setShot(){
        counterShot++;
        
        if(counterShot < speedShot){
            return;
        }
        
        if(isShot && Greenfoot.isKeyDown("z")){
            PillBullet pill = new PillBullet(direction);
            getWorld().addObject(pill, getX(), getY());
            if(direction == 1){
                setImage(images[3]);
            }else{
                setImage(images[4]);
            }
            
            isShot = false;
            counterShot = 0;
        }
        if(!isShot && Greenfoot.isKeyDown("z")){
            isShot = true;
        }
        
    }
    
    private void checkPowerUp(){
        if(countPowerUp == 0){
            speedShot = 30;
        }
    }
    
    private void checkSpecialShot(){
        if(energy == 100 && Greenfoot.isKeyDown("c")){
            getWorld().addObject(vaccine, getX(), getY());
            isShotSpecial = true;
        }
        
        if(isShotSpecial && energy == 0){
            getWorld().removeObject(vaccine);
            isShotSpecial = false;
        }
    }
    
    private void setSpecialShot(){
        checkSpecialShot();
        
        
        if(isShotSpecial){
            counterShotSpecial++;
        
            if(counterShotSpecial < speedShotSpecial){
                return;
            }
            
            SpecialBullet pill = new SpecialBullet(direction);
            getWorld().addObject(pill, getX(), getY());
            
            energy = energy - 10;
            counterShotSpecial = 0;
        }
    }
    
    private void moveDrSim() {
        if(Greenfoot.isKeyDown("right")){
            move(speed);
            direction = 1;
            setImage(images[1]);
        }else if(Greenfoot.isKeyDown("left")){
            move(-speed);
            direction = -1;
            setImage(images[2]);
        }
        
        if(Greenfoot.isKeyDown("space") && onPlataform() == true){
            jumpSpeed = jumpHeight;
            fall();
        }
    }
    
    private void fall(){
        setLocation(getX(), getY() + jumpSpeed);
        jumpSpeed = jumpSpeed + gravity; 
    }
    
    private boolean onPlataform(){
        Actor under = getOneObjectAtOffset(0, getImage().getHeight()/2, Plataform.class);
        return under != null;
    }
    
    private void plataformOnTheJump(){
        Plataform plataform = (Plataform)getOneObjectAtOffset(0, -getImage().getHeight()/2, Plataform.class);
        
        if(plataform != null){
           jumpSpeed = 1;
           setLocation(getX(), getY() + jumpSpeed);
        }
    }
    
    public void checkFalling(){
        if(onPlataform() == false){
            plataformOnTheJump();
            fall();
        }else{
            jumpSpeed = 0;
        }
    }
    
    public void getDamage(){
        drSimHud.setLifes(-1);
        countInvincibility = 80;
    }
    
    public void addScore(int score){
       this.score = this.score + score;
        drSimHud.setScore(this.score); 
    }
    
    public void addEnergy(int energy){
        this.energy = this.energy + energy;
        drSimHud.setEnergySpecial(this.energy);
    }
    
    private void checkColissions(){
        Item item = (ExtraLife)getOneIntersectingObject(ExtraLife.class);
        
        if(item != null){
            getWorld().removeObject(item);
            drSimHud.setLifes(1);
            
            addScore(item.getScore());
        }
        
        item = (PowerUp)getOneIntersectingObject(PowerUp.class);
        
        if(item != null){
            getWorld().removeObject(item);
            countPowerUp = 200;
            speedShot = speedShot/2;
            
            addScore(item.getScore());
        }
        
        if(countInvincibility > 0){
            countInvincibility--;
            return;
        }

        Bacterium enemy = (Bacterium)getOneIntersectingObject(Bacterium.class);
        Spike spike = (Spike)getOneIntersectingObject(Spike.class);
        
        if(enemy != null || spike != null){
            getDamage();
        }
    }
}
