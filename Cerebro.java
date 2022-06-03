import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Cerebro extends World
{
    public static DrSim drSim;
    public DrSimHud hud;
    
    int x = 100, y = 100;
    private int timer = 350;
    private int timer2 = 700;
    private int timer3 = 100;
    
    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public Cerebro(DrSim drSim) throws Exception
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1000, 800, 1);
        this.drSim = drSim;
        prepare();
    }
    
    private void prepare() throws Exception
    {
        hud =drSim. getDrSimHud();
        addObject(hud, 0, 0);

        addObject(drSim, 50, 700);
        
        //Enemigos
        Bacterium4 bac4= new Bacterium4();
        addObject(bac4, 700, 680);
        Bacterium5 bac5 = new Bacterium5();
        addObject(bac5, 730, 150);

        Plataform3 plataforma3 = new Plataform3();
        
        addObject(new Plataform3(), 80, 770);
        addObject(new Plataform3(), 250, 770);
        addObject(new Plataform3(), 420, 770);
        addObject(new Plataform3(), 590, 770);
        addObject(new Plataform3(), 760, 770);
        addObject(new Plataform3(), 930, 770);
        
        //2do nivel plataorma
        addObject(new Plataform3(), 300, 600);
        
        //3er nivel
        addObject(new Plataform3(), 70, 450);
        
        //Otros niveles
        addObject(new Plataform3(), 650, 200);
        addObject(new Plataform3(), 820, 200);
        
        addObject(new Plataform3(), 820, 500);
        addObject(new Plataform3(), 600, 600);
        addObject(new Plataform3(), 300, 300);
    }
    
    public void act() {
    timer--;
    timer2--;
    timer3--;
    
    if (timer == 0) {
        Bacterium4 bac44 = new Bacterium4();
        addObject(bac44, 750, 50);
    }
    
    if (timer2 == 0) {
        Bacterium4 bac444 = new Bacterium4();
        addObject(bac444, 50, 50);
    }
    
    try{
        if(hud.getScore() >= 1450){
                 Greenfoot.setWorld(new CerebroBoss(drSim));
        }
    }catch(Exception ex){
        
    }
    
}
    
    public static DrSim getDrSimInWorld(){
        return drSim;
    }
    
}
