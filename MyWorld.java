import greenfoot.*;

public class MyWorld extends World {
    
    public int score = 0;
    Label scoreLabel;
    int level = 1;
    
    public MyWorld() {
        super(600, 400, 1);
        
        setBackground(new GreenfootImage("preview.jpg"));
        
        scoreLabel = new Label(0, 50);
        addObject(scoreLabel, 50, 50);
        
        Elephant hero = new Elephant();
        addObject(hero, 300, 200);
        
        createPizza();
    }
    
    public void gameOver() {
        Label gameOverLabel = new Label("Game over", 100);
        addObject(gameOverLabel, 300, 200);
    }
    
    public void increaseScore() {
        score++;
        scoreLabel.setValue(score);
        
        if(score % 5 == 0) {
            level += 1;   
        }
    }
    
    public void createPizza() {
        Pizza food = new Pizza();
        food.setSpeed(level);
        int x = Greenfoot.getRandomNumber(600);
        addObject(food, x, 0);
    }
}
