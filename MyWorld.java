import greenfoot.*;

public class MyWorld extends World {
    
    public int score = 0;
    Label scoreLabel;
    
    public MyWorld() {
        super(600, 400, 1);
        
        scoreLabel = new Label(0, 50);
        addObject(scoreLabel, 50, 50);
        
        Elephant hero = new Elephant();
        addObject(hero, 300, 200);
        
        createPizza();
    }
    
    public void increaseScore() {
        score++;
        scoreLabel.setValue(score);
    }
    
    public void createPizza() {
        Pizza food = new Pizza();
        int x = Greenfoot.getRandomNumber(600);
        addObject(food, x, 0);
    }
}
