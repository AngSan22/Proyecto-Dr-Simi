import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class PulmonDer here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class PulmonDer extends World
{
    public static DrSim drSim;
    private int timer = 2000;

    /**
     * Constructor for objects of class PulmonDer.
     * 
     */
    public PulmonDer() throws Exception
    {    
        super(800, 800, 1); 
        prepare();
    }
    
    private void prepare() throws Exception{
        //Simi
        DrSimHud hud = new DrSimHud();
        addObject(hud, 0, 0);
        drSim = new DrSim(hud);
        addObject(drSim, 150, 150);
        drSim.setLocation(400,320);
        
        
        //Bacteria
        Bacterium3 bac3 = new Bacterium3();
        addObject(bac3, 100, 650);
        //Bacterium2 bac2 = new Bacterium2();
        //addObject(bac2, 600, 130);
        
        
        Plataform2 plataforma2 = new Plataform2();
        addObject(new Plataform2(), 100, 735);
        addObject(new Plataform2(), 270, 735);
        addObject(new Plataform2(), 390, 790);
        addObject(new Plataform2(), 530, 735);
        addObject(new Plataform2(), 700, 735);
        
        addObject(new Plataform2(), 600, 550);
        addObject(new Plataform2(), 300, 550);
        
        addObject(new Plataform2(), 100, 380);
        addObject(new Plataform2(), 400, 380);
        addObject(new Plataform2(), 700, 380);
        
        addObject(new Plataform2(), 250, 200);
        addObject(new Plataform2(), 610, 200);
    }
    
    public static DrSim getDrSimInWorld(){
        return drSim;
    }
    
    public void act(){
        timer--;
        Bacterium3 bac3 = new Bacterium3();
        Bacterium2 bac2 = new Bacterium2();
        ExtraLife extraLife = new ExtraLife();
        //addObject(bac2, 600, 130);
        
        if(timer == 1750){
            addObject(bac3, 700, 650);
        }
        
        if(timer == 1500){
            addObject(bac3, 100, 100);
        }
        
        if(timer == 1250){
            addObject(bac3, 700, 700);
            addObject(extraLife, 700, 700);
        }
        
        if(timer == 1000){
            addObject(bac3, 100, 400);
            addObject(bac2, 600, 130);
        }
        
        if(timer == 750){
            addObject(bac3, 700, 650);
        }
        
        if(timer == 500){
            addObject(bac3, 100, 100);
        }
        
        if(timer == 250){
            addObject(bac3, 700, 700);
        }
        
        if(timer == 0){
            addObject(bac3, 100, 400);
            addObject(bac3, 700, 400);
            addObject(bac2, 700, 700);
        }
    }
}
