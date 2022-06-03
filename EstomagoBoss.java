import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class EstomagoBoss here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class EstomagoBoss extends World
{
    public static DrSim drSim;
    private int timer = 2000;

    /**
     * Constructor for objects of class EstomagoBoss.
     * 
     */
    public EstomagoBoss()throws Exception
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(800, 800, 1); 
        prepare();
    }
    
    private void prepare() throws Exception{
        DrSimHud hud = new DrSimHud();
        addObject(hud, 0, 0);

        drSim = new DrSim(hud);
        addObject(drSim, 50, 700);
        
        Plataform3 plataforma3 = new Plataform3();
        Plataform2 plataforma2 = new Plataform2();
        
        Boss3 boss3 = new Boss3();
        addObject(boss3, 700, 700);
        
        addObject(new Plataform3(), 80, 770);
        addObject(new Plataform3(), 250, 770);
        addObject(new Plataform3(), 420, 770);
        addObject(new Plataform3(), 590, 770);
        addObject(new Plataform3(), 760, 770);
        
        //Cruzada
        addObject(new Plataform3(), 180, 600);
        addObject(new Plataform3(), 280, 430);
        addObject(new Plataform3(), 380, 260);
        
        addObject(new Plataform3(), 500, 430);
        addObject(new Plataform3(), 650, 600);
        
        //Top
        addObject(new Plataform3(), 150, 150);
        addObject(new Plataform3(), 620, 150);
    }
    
    public void act(){
        timer --;
        ExtraLife extraLife = new ExtraLife();
        PowerUp powerUp = new PowerUp();
        
        if(timer == 1500){
            addObject(extraLife, 100, 120);
        }
        
        if(timer == 1000){
            addObject(powerUp, 650, 100);
        }
    }
    
    public static DrSim getDrSimInWorld(){
        return drSim;
    }
}
