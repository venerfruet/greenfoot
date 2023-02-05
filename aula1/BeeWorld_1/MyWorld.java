import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (Vener Fruet daSilveira) 
 * @version (1)
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
        Abelha abelha = new Abelha();
        addObject(abelha,297,181);
        Aranha aranha = new Aranha();
        addObject(aranha,76,83);
        Mosca mosca = new Mosca();
        addObject(mosca,467,292);
        Mosca mosca2 = new Mosca();
        addObject(mosca2,379,331);
        Mosca mosca3 = new Mosca();
        addObject(mosca3,390,203);
        Mosca mosca4 = new Mosca();
        addObject(mosca4,172,64);
        Mosca mosca5 = new Mosca();
        addObject(mosca5,521,155);
        abelha.setLocation(371,155);
        abelha.setLocation(393,95);
        Abelha abelha2 = new Abelha();
        addObject(abelha2,118,187);
        Abelha abelha3 = new Abelha();
        addObject(abelha3,155,278);
        Abelha abelha4 = new Abelha();
        addObject(abelha4,260,325);
        Aranha aranha2 = new Aranha();
        addObject(aranha2,265,123);
        Aranha aranha3 = new Aranha();
        addObject(aranha3,289,199);
        Aranha aranha4 = new Aranha();
        addObject(aranha4,515,221);
        Aranha aranha5 = new Aranha();
        addObject(aranha5,560,342);
        removeObject(aranha);
        removeObject(abelha2);
        abelha3.setLocation(24,86);
        abelha3.setLocation(55,83);
        abelha3.setLocation(39,85);
        mosca4.setLocation(156,96);
        aranha2.setLocation(262,99);
        removeObject(abelha);
        removeObject(aranha3);
        removeObject(abelha4);
        removeObject(mosca3);
        removeObject(mosca2);
        removeObject(mosca);
        removeObject(aranha5);
        removeObject(aranha4);
        removeObject(mosca5);
        Duke duke = new Duke();
        addObject(duke,388,80);
        Elefante elefante = new Elefante();
        addObject(elefante,520,87);
    }
}
