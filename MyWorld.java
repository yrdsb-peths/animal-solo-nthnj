import greenfoot.*;

public class MyWorld extends World {
    public MyWorld() {
        super(600, 400, 1);
        
        Elephant hero = new Elephant();
        addObject(hero, 300, 200);
        
        Pizza food = new Pizza();
        addObject(food, 300, 0);
    }
}
