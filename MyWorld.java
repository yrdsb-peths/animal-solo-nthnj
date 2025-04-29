import greenfoot.*;

public class MyWorld extends World {
    public MyWorld() {
        super(600, 400, 1);
        
        Elephant hero = new Elephant();
        addObject(hero, 300, 200);
        
        createPizza();
    }
    
    public void createPizza() {
        Pizza food = new Pizza();
        int x = Greenfoot.getRandomNumber(600);
        addObject(food, x, 0);
    }
}
