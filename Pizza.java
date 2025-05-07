import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Food for elephant
 * 
 * @author (nathan) 
 * @version (04/29)
 */
public class Pizza extends Actor
{
    int speed = 1;
    
    public void act()
    {
        setLocation(getX(), getY() + 1);
        
        MyWorld world = (MyWorld) getWorld();
        if(getY() >= 399) {
            world.gameOver();
            world.removeObject(this);
        }
    }
    
    public void setSpeed(int spd) {
        speed = spd;
    }
}
