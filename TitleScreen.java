import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Nathan J 
 * 05/7
 */
public class TitleScreen extends World
{
    Label titleLabel = new Label("Hungry Elephant", 60);

    /**
     * Constructor for objects of class TitleScreen.
     * 
     */
    public TitleScreen()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 

        Elephant elephant = new Elephant();
        addObject(titleLabel, 230, 100);
        addObject(elephant, 500, 100);

        prepare();
    }

    public void act() {
        if(Greenfoot.isKeyDown("space")) {
            MyWorld gameWorld = new MyWorld();
            Greenfoot.setWorld(gameWorld);
        }
    }
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Label label = new Label("Press <space> to Start", 40);
        addObject(label,197,306);
        label.setLocation(217,308);
        Label label2 = new Label("Use \u2190 and \u2192 to move", 40);
        addObject(label2,135,247);
        label2.setLocation(231,248);
        label2.setLocation(213,243);
    }
}
