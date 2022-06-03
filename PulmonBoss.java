import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class PulmonBoss here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class PulmonBoss extends World
{
    public static DrSim drSim;
    private int timer = 2000;
    public DrSimHud hud;

    /**
     * Constructor for objects of class PulmonBoss.
     * 
     */
    public PulmonBoss(DrSim drSim) throws Exception
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(800, 800, 1);
        this.drSim = drSim;
        prepare();
    }
    
    private void prepare() throws Exception{
        hud =drSim. getDrSimHud();
        addObject(hud, 0, 0);

        addObject(drSim, 50, 700);
        
        Plataform3 plataforma3 = new Plataform3();
        Plataform2 plataforma2 = new Plataform2();
        
        Boss2 boss2 = new Boss2();
        addObject(boss2, 700, 700);
        
        addObject(new Plataform3(), 80, 770);
        addObject(new Plataform3(), 250, 770);
        addObject(new Plataform3(), 420, 770);
        addObject(new Plataform3(), 590, 770);
        addObject(new Plataform3(), 760, 770);
        
        addObject(new Plataform3(), 200, 600);
        addObject(new Plataform3(), 100, 430);
        addObject(new Plataform3(), 200, 260);
        
        addObject(new Plataform3(), 600, 600);
        addObject(new Plataform3(), 700, 430);
        addObject(new Plataform3(), 600, 260);
        
        addObject(new Plataform3(), 400, 150);
    }
    
    public void act(){
        timer--;
        ExtraLife extraLife = new ExtraLife();
        PowerUp powerUp = new PowerUp();
        
        if(timer == 1500){
            addObject(extraLife, 230, 570);
        }
        
        if(timer == 1000){
            addObject(powerUp, 430, 110);
        }
        
        
        try{
            if(hud.getScore() >= 1300){
                 Greenfoot.setWorld(new Cerebro(drSim));
            }
        }catch(Exception ex){
        
        }
    }
    
    public static DrSim getDrSimInWorld(){
        return drSim;
    }
}
