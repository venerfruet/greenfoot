import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{

    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        prepare();
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private int widthBrick=60;
    private int heightBrick=20;
    private int posX=widthBrick/2;
    private int posY=heightBrick/2;

    private void prepare()
    {
        //adiciona 5 linhas de tijolos
        for(int row=0; row<5; row++){
            //adiciona 10 tijolos por linha
            for(int column=0; column<10; column++){
                addObject(new Brick001(),posX,posY);
                posX+=widthBrick;
            }
            posX=widthBrick/2; //restaura posição X
            posY+=heightBrick; //define posição Y
        }
        
        //adiciona a bola
        golfBall golfBall = new golfBall();
        addObject(golfBall,272,279);
    }
}
