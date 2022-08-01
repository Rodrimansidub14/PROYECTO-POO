import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class King here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class King extends Actor

{

private int coin1 = 0;
int score = 1;
SCORE scoreObj = null;
    /**
     * Act - do whatever the King wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public King()
    {
        getImage().scale(getImage().getWidth()/25, getImage().getHeight()/25);
    }
    public void act()
    {
        moveAround();
        COINS();
    }
    public void moveAround()
    {
         if(Greenfoot.isKeyDown("up"))
        {
           
            setLocation(getX(),getY()-10);
            Actor Obstacle = getOneIntersectingObject(walls.class);

            if(Obstacle!=null)
            {
                setLocation(getX(),getY()+10);
            }
        }
        if(Greenfoot.isKeyDown("down"))
        {
            setLocation(getX(),getY()+10);

            Actor Obstacle = getOneIntersectingObject(walls.class);
            if(Obstacle!=null)
            {
                setLocation(getX(),getY()-10);
            }
        } 
        if(Greenfoot.isKeyDown("left"))
        {
            setLocation(getX()-10,getY());

            Actor Obstacle = getOneIntersectingObject(walls.class);
            if(Obstacle!=null)
            {
                setLocation(getX()+-10,getY());
            }
        }
        if(Greenfoot.isKeyDown("right"))
        {
            setLocation(getX()+10,getY());

            Actor Obstacle = getOneIntersectingObject(walls.class);
            if(Obstacle!=null)
            {
                setLocation(getX()-10,getY());
            }
        }
        if(isTouching(JAGUAR.class))
        {
            displayGameOver();
        }
    }
    public void COINS() {
        if(isTouching(COIN.class) == false) {

        } else {
            // Create score object
            scoreObj = new SCORE();

            // Add it to our world
            //getWorld().addObject (scoreObj, 50, 50);
            getWorld().showText ("Score:" + score,100, 70);

            score=score+1;
            coin1++;
            removeCoin(); 

        }
        
        if (coin1 == 4) {
            //Greenfoot.playSound("Super Mario Vine Growing Sound Effect.mp3");
            WIN();
        }
        
       
        
        
}
public void removeCoin()
 {
        if(isTouching(COIN.class) == true) {
            
            removeTouching(COIN.class);
        }
    }
private void displayGameOver()
        {
        GameOver gameOver = new GameOver();
        getWorld().addObject(gameOver, getWorld().getWidth()/2, getWorld().getHeight()/2 );
        
        Greenfoot.stop();
        }
        public void WIN()
        {
            WIN WIN = new WIN();
            getWorld().addObject(WIN,getWorld().getWidth()/2,getWorld().getHeight()/2);
        }
    }

