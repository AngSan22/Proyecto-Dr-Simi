import greenfoot.*; 

public class Start extends Button
{
    public  void clicked(){
        try{
             Greenfoot.setWorld(new Estomago());
        }catch(Exception ex){

        }
    }
}
