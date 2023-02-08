import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Bola de golfe que fica quicando nas laterais da tela.
 * 
 * @author (Vener Fruet daSilveira) 
 * @version (2023-02-05)
 */
public class GolfBall extends Actor
{
    /**
     * Act - do whatever the GolfBall wants to do. This method is called whenever
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
        
        if(posY-plus <= 30 || posY+plus >=heightWorld){
            dirY *= -1;
        }
        
        int newPosX=posX+dirX;
        int newPosY=posY+dirY;
        
        setLocation(posX+dirX, posY+dirY);
        detectBlocker();
    }
    
    private void detectBlocker(){
        if(isTouching(Blocker.class)){
            dirY*=-1;
            getWorld().showText("TOCOU", 300, 360);
        }else{
            getWorld().showText("...", 300, 360);
        }
    }
}
