import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Hero: Elephant
 * 
 * @author (nathan) 
 * @version (04/29)
 */
public class Elephant extends Actor
{
    GreenfootSound elephantSound = new GreenfootSound("eat.mp3");
    GreenfootImage[] idleRight = new GreenfootImage[8];
    GreenfootImage[] idleLeft = new GreenfootImage[8];
    SimpleTimer animationTimer = new SimpleTimer();
    
    String facing = "right";
    
    public Elephant() {
        for(int i = 0; i < idleRight.length; i++) {
            idleRight[i] = new GreenfootImage("images/ezgif-split/tile00" + i + ".png");
            idleRight[i].scale(100, 100);
        }
        
        for(int i = 0; i < idleRight.length; i++) {
            idleLeft[i] = new GreenfootImage("images/ezgif-split/tile00" + i + ".png");
            idleLeft[i].mirrorHorizontally();
            idleLeft[i].scale(100, 100);
        }
        
        animationTimer.mark();
        
        setImage(idleRight[0]);
    }
    
    int imageIndex = 0;
    public void animateElephant() {
        if(animationTimer.millisElapsed() < 50) {
            return;
        }
        animationTimer.mark();
        
        if(facing.equals("right")){
            setImage(idleRight[imageIndex]);
            imageIndex = (imageIndex + 1) % idleRight.length;
        } else {
            setImage(idleLeft[imageIndex]);
            imageIndex = (imageIndex + 1) % idleLeft.length;
        }
    }
    
    public void act()
    {
            if(Greenfoot.isKeyDown("left")) {
                move(-2);
                facing = "left";
            } else if(Greenfoot.isKeyDown("right")) {
                move(2);
                facing = "right";
            }
            
            eat();
            
            animateElephant();
    }
    
    public void eat() {
        if(isTouching(Pizza.class)) {
            removeTouching(Pizza.class);
            MyWorld world = (MyWorld) getWorld();
            world.createPizza();
            world.increaseScore();
            elephantSound.play();
        }
    }
}
