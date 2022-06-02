import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Estomago extends World
{
    public static DrSim drSim;
    int x = 100, y = 730;
    int xx = Greenfoot.getRandomNumber(800), yy = Greenfoot.getRandomNumber(800);
    private int timer = 250;
    private int timer0 = 1;
    private int timer2 = 450;
    
    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public Estomago() throws Exception
    {    
        super(800, 800, 1);
        prepare();
    }
    
    private void prepare() throws Exception
    {
        DrSimHud hud = new DrSimHud();
        addObject(hud, 0, 0);
        drSim = new DrSim(hud);
        
        Bacterium6 bac6 = new Bacterium6();
        addObject(bac6, 640, 100);
        //Bacterium6 bac66 = new Bacterium6();
        //addObject(bac66, 100, 100);
        
        //Bacterium1 bac1 = new Bacterium1();
        //addObject(bac1, 470, 470);

        drSim = new DrSim(hud);
        addObject(drSim, 150, 150);
        drSim.setLocation(100,670);

        Plataform1 plataforma1 = new Plataform1();
        //addObject(new Plataform1(), 0, 735);
        addObject(new Plataform1(), 100, 735);
        addObject(new Plataform1(), 270, 735);
        addObject(new Plataform1(), 390, 790);
        addObject(new Plataform1(), 530, 735);
        addObject(new Plataform1(), 700, 735);
        
        //2da fila
        addObject(new Plataform1(), 180, 535);
        addObject(new Plataform1(), 470, 535);
        addObject(new Plataform1(), 640, 535);
        
        //3ra fila
        addObject(new Plataform1(), 350, 320);
        addObject(new Plataform1(), 650, 320);
        
        //4ta fila
        addObject(new Plataform1(), 150, 200);
        
        if(hud.getScore() == 150){
             Greenfoot.setWorld(new EstomagoBoss());
        }
    }
    
    public void act() {
    timer--;
    timer0--;
    timer2 --;
    
    if (timer == 0) {
        Bacterium6 bac666 = new Bacterium6();
        addObject(bac666, xx, yy);
        Bacterium1 bac1 = new Bacterium1();
        addObject(bac1, 470, 470);
    }
    
    if (timer2 == 0) {
        Bacterium1 bac11 = new Bacterium1();
        addObject(bac11, 200, 670);
    }
}
    
    public static DrSim getDrSimInWorld(){
        return drSim;
    }
    
}
