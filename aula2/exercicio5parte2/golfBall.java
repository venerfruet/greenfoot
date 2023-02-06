import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class golfBall here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class golfBall extends Actor
{
    /**
     * Act - do whatever the golfBall wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    private int dirX=-10;
    private int dirY=-10;
    
    public void act()
    {
        int widthWorld=getWorld().getWidth();
        int heightWorld=getWorld().getHeight();
        int posX=getX();
        int posY=getY();
        int plus=getImage().getWidth()/2;
                
        if(posX-plus <= 0 || posX+plus >= widthWorld){
            dirX *= -1;
        }
        
        if(posY-plus <=0 || posY+plus >=heightWorld){
            dirY *= -1;
        }
        
        int newPosX=posX+dirX;
        int newPosY=posY+dirY;
        
        setLocation(posX+dirX, posY+dirY);
    }
}
