import greenfoot.*;

public class Ghost1 extends Actor
{
    private int speed;
    private boolean movingRight;
    private int stopPointLeft;
    private int stopPointRight;
    
    public Ghost1(int speed, int stopPointLeft, int stopPointRight) {
        this.speed = speed;
        this.movingRight = true; // default ke kanan
        this.stopPointLeft = stopPointLeft;
        this.stopPointRight = stopPointRight;
    }
    
    public void act()
    {
        if (getWorld() == null) {
            return; // Jika objek telah dihapus dari dunia, hentikan eksekusi
        }
        checkCollision();
        if (getWorld() == null) {
            return; // Jika objek telah dihapus dari dunia, hentikan eksekusi
        }
        moveHorizontally();
    }
    
    public void moveHorizontally() {
        if (getWorld() == null) {
            return; // Jika objek telah dihapus dari dunia, hentikan eksekusi
        }
        checkCollision();
        if (getWorld() == null) {
            return; // Jika objek telah dihapus dari dunia, hentikan eksekusi
        }
        if (movingRight) {
            move(speed);
            if (isAtEdge() || isTouching(Platform2.class) || getX() >= stopPointRight) {
                movingRight = false;
                setImage("Ghost1-Run-Left.png");
            }
        } else {
            move(-speed);
            if (isAtEdge() || isTouching(Platform2.class) || getX() <= stopPointLeft) {
                movingRight = true;
                setImage("Ghost1-Run-Right.png");
            }
        }
    }

    private void checkCollision() {
        skill1Charge skill1 = (skill1Charge) getOneIntersectingObject(skill1Charge.class);
        skill2Charge skill2 = (skill2Charge) getOneIntersectingObject(skill2Charge.class);
        if (skill1 != null) {
            Greenfoot.playSound("Magic-Explode.mp3");
            getWorld().removeObject(this);
        }
        if (skill2 != null) {
            Greenfoot.playSound("Magic-Explode.mp3");
            getWorld().removeObject(this);
        }
    }
}
