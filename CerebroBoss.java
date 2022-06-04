import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class CerebroBoss here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class CerebroBoss extends World
{
    public static DrSim drSim;
    private int timer = 1000;

    /**
     * Constructor for objects of class CerebroBoss.
     * 
     */
    public CerebroBoss() throws Exception
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1000, 800, 1);
        prepare();
    }
    
    private void prepare() throws Exception{
        DrSimHud hud = new DrSimHud();
        addObject(hud, 0, 0);

        drSim = new DrSim(hud);
        addObject(drSim, 50, 700);
        
        Plataform3 plataforma3 = new Plataform3();
        Plataform2 plataforma2 = new Plataform2();
        
        Boss1 boss1 = new Boss1();
        addObject(boss1, 700, 700);
        
        addObject(new Plataform3(), 80, 770);
        addObject(new Plataform3(), 250, 770);
        addObject(new Plataform3(), 420, 770);
        addObject(new Plataform3(), 590, 770);
        addObject(new Plataform3(), 760, 770);
        addObject(new Plataform3(), 930, 770);
        
        addObject(new Plataform2(), 700, 600);
        addObject(new Plataform2(), 400, 600);
        addObject(new Plataform2(), 150, 600);
        addObject(new Plataform2(), 200, 430);
        addObject(new Plataform2(), 500, 430);
        addObject(new Plataform2(), 800, 430);
        addObject(new Plataform2(), 350, 250);
        addObject(new Plataform2(), 710, 250);
    }
    
    public void act(){
        timer--;
        ExtraLife extraLife = new ExtraLife();
        PowerUp powerUp = new PowerUp();
        
        if(timer == 500){
            addObject(extraLife, 710, 200);
        }
        
        if(timer == 250){
            addObject(powerUp, 80, 730);
        }
    }
    
    public static DrSim getDrSimInWorld(){
        return drSim;
    }
}
