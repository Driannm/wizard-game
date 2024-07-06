import greenfoot.*; 

public class skill1Charge extends Actor
{
    public void act() {
        setLocation(getX() + 15, getY());
        if(getX() == 899) {
             getWorld().removeObject(this);
        }
    }
}
