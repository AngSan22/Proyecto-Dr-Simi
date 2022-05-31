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
    private int vSpeed = 0;
    private int jumpHeight = -20;
    private int gravity = 1;
    
    private int direction = 1;
    private boolean isShot = false;
    private int speedShot = 12;
    private int counterShot;
    
    private DrSimHud drSimHud;
   
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
        
        setShot();
        
        checkFalling();
    }
    
    private void setShot(){
        counterShot++;
        
        if(counterShot < speedShot){
            return;
        }
        
        if(isShot && Greenfoot.isKeyDown("x")){
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
        if(!isShot && Greenfoot.isKeyDown("x")){
            isShot = true;
        }
        
    }
    
    private void moveDrSim() {
        if(Greenfoot.isKeyDown("right")){
            move(4);
            direction = 1;
            setImage(images[1]);
        }else if(Greenfoot.isKeyDown("left")){
            move(-4);
            direction = -1;
            setImage(images[2]);
        }
        //setImage(images[0]);
        if(Greenfoot.isKeyDown("space") && onPlataform() == true){
            vSpeed = jumpHeight;
            fall();
        }
    }
    
    private void fall(){
        setLocation(getX(), getY() + vSpeed);
        vSpeed = vSpeed + gravity; 
    }
    
    private boolean onPlataform(){
        Actor under = getOneObjectAtOffset(0, getImage().getHeight()/2, Plataform.class);
        return under != null;
    }
    
    public void checkFalling(){
        if(onPlataform() == false){
            fall();
        }else{
            vSpeed = 0;
        }
    }
    
    private void checkColissions(){
        Item item = (ExtraLife)getOneIntersectingObject(ExtraLife.class);
        
        if(item != null){
            getWorld().removeObject(item);
            drSimHud.setLifes();
        }
        
        item = (PowerUp)getOneIntersectingObject(PowerUp.class);
        
        if(item != null){
            getWorld().removeObject(item);
            
        }
    }
}
