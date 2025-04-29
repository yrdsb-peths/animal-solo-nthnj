import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Hero: Elephant
 * 
 * @author (nathan) 
 * @version (04/29)
 */
public class Elephant extends Actor
{
    /**
     * Act - do whatever the Elephant wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
            if(Greenfoot.isKeyDown("left")) {
                move(-1);
            } else if(Greenfoot.isKeyDown("right")) {
                move(1);
            }
            
            removeTouching(Pizza.class);
    }
}
