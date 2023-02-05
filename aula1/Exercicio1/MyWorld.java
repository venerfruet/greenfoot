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
    private void prepare()
    {
        Duke duke = new Duke();
        addObject(duke,47,95);
        Abelha abelha = new Abelha();
        addObject(abelha,152,102);
        Elefante elefante = new Elefante();
        addObject(elefante,260,100);
        Hipopotamo hipopotamo = new Hipopotamo();
        addObject(hipopotamo,368,102);
        Peixe peixe = new Peixe();
        addObject(peixe,474,97);
    }
}
