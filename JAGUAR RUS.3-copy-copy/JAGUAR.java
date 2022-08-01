import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class JAGUAR here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class JAGUAR extends Actor
{
    /**
     * Act - do whatever the JAGUAR wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public JAGUAR()
    {
         {
        getImage().scale(getImage().getWidth()/8, getImage().getHeight()/8);
    }
    }
    public void act()
       {
           move(2);
        //animatewalk();
        Actor Obstacle = getOneIntersectingObject(walls.class);//check if theres an obstacle
        if(getX()>900 ||getX()<45||Obstacle!=null)
        {
            setRotation(getRotation()+180);
            getImage().mirrorVertically();
        }
       }
}
