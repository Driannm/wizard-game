import greenfoot.*;  

public class skill2Charge extends Actor
{
    public void act() {
        setLocation(getX() - 15, getY());
        if(getX() == 0) {
             getWorld().removeObject(this);
        }
    }
}
