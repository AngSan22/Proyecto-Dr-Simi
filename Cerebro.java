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
    int x = 100, y = 100;
    
    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public Cerebro() throws Exception
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1000, 800, 1); 
        prepare();
    }
    
    private void prepare() throws Exception
    {
        DrSimHud hud = new DrSimHud();
        addObject(hud, 0, 0);

        drSim = new DrSim(hud);
        addObject(drSim, x, y);

        Plataform1 plataforma1 = new Plataform1();
        addObject(new Plataform1(), 500, 400);
        plataforma1.setLocation(330,489);
        plataforma1.setLocation(177,615);
        Plataform1 plataforma12 = new Plataform1();
        addObject(plataforma12,444,483);
        Plataform1 plataforma13 = new Plataform1();
        addObject(plataforma13,783,337);
        Bacterium1 bacteria1 = new Bacterium1();
        addObject(bacteria1,781,173);
        bacteria1.setLocation(791,220);
        bacteria1.setLocation(789,212);
        plataforma1.setLocation(75,572);
        plataforma1.setLocation(120,337);
        plataforma12.setLocation(457,330);
        bacteria1.setLocation(786,204);
        plataforma1.setLocation(114,328);
        plataforma1.setLocation(140,331);
        plataforma12.setLocation(433,350);
        plataforma12.setLocation(112,347);
        plataforma1.setLocation(513,339);
        bacteria1.setLocation(808,235);
        plataforma1.setLocation(655,338);
        Plataform1 plataforma14 = new Plataform1();
        addObject(plataforma14,344,465);
        drSim.setLocation(115,295);
        plataforma1.setLocation(687,332);
        plataforma14.setLocation(676,337);
        Bacterium4 bacteria4 = new Bacterium4();
        addObject(bacteria4,729,493);
        bacteria4.setLocation(774,545);
        bacteria4.setLocation(849,576);
        bacteria4.setLocation(808,559);
        plataforma1.setLocation(825,336);
        bacteria1.setLocation(787,203);
        bacteria1.setLocation(802,252);
    }
    
    public static DrSim getDrSimInWorld(){
        return drSim;
    }
    
}
