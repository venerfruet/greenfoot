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
        int widthBrick=60;
        int heightBrick=20;
        int posX=widthBrick/2;
        int posY=heightBrick*2;
        int score=0;
        int level=1;
        int lifes=3;
        
        //define o placar
        showText("Pontuação: "+ score, 60, 10);
        showText("Nível: "+ level, 280, 10);
        showText("Vidas: "+ lifes, 540, 10);
        
        //retorna a fase atual
        Actor[][] bricks=Fase1();
        
        //adiciona 3 linhas de tijolos
        for(int row=0; row<bricks.length; row++){
            //adiciona 10 tijolos por linha
            for(int column=0; column<bricks[0].length; column++){
                addObject(bricks[row][column],posX,posY);
                posX+=widthBrick;
            }
            posX=widthBrick/2; //restaura posição X
            posY+=heightBrick; //define posição Y
        }
        
        //adiciona a bola
        golfBall golfBall = new golfBall();
        addObject(golfBall,272,279);
    }
    
    private Actor[][] Fase1(){
        Actor[][] Bricks=new Actor[8][10];
        
        for(int i=0; i<10; i++){
            Bricks[0][i]=new Brick001();
        }
        
        for(int i=0; i<10; i++){
            Bricks[1][i]=new Brick002();
        }
        
        for(int i=0; i<10; i++){
            Bricks[2][i]=new Brick005();
        }

        for(int i=0; i<10; i++){
            Bricks[3][i]=new Brick004();
        }
        
        for(int i=0; i<10; i++){
            Bricks[4][i]=new Brick006();
        }
        
        for(int i=0; i<10; i++){
            Bricks[5][i]=new Brick007();
        }

        for(int i=0; i<10; i++){
            Bricks[6][i]=new Brick008();
        }

        for(int i=0; i<10; i++){
            Bricks[7][i]=new Brick003();
       }
       
        return Bricks;        
    }
}
