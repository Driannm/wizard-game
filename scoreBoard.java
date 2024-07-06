import greenfoot.*;
import java.util.Timer;

public class scoreBoard extends Actor {
    private int points = 0;
    //private boolean hasWon = false;
    
    public void act() {
        //setImage(new GreenfootImage("Points: " + points, 24, Color.WHITE, null));
        checkWinCondition();
    }

    public void addPoints(int pointsToAdd) {
        points += pointsToAdd;
    }

    public int getPoints() { // Tambahkan metode ini
        return points;
    }

    private void checkWinCondition() {
        if (points == 10) {
            setImage("Score-10.png");
        }
        if (points == 20) {
            setImage("Score-20.png");
        }
        if (points == 30) {
            setImage("Score-30.png");
        }
        if (points == 40) {
            setImage("Score-40.png");
        }
        if (points == 50) {
            setImage("Score-50.png");
        }
        if (points == 60) {
            setImage("Score-60.png");
        }
        if (points == 70) {
            setImage("Score-70.png");
        }
        if (points == 80) {
            setImage("Score-80.png");
        }
        if (points == 90) {
            setImage("Score-90.png");
        }
        
        if (points >= 100) {
            setImage("Score-100.png");
            getWorld().addObject(new alertWinner(), getWorld().getWidth() / 2, getWorld().getHeight() / 2);
            getWorld().addObject(new btnNext(), getWorld().getWidth() / 2, getWorld().getHeight() / 2 + 150);
            getWorld().addObject(new btnNew(), getWorld().getWidth() / 2, getWorld().getHeight() / 1 - 80);
            Greenfoot.playSound("Alert-Win.mp3");
        }
    }
}