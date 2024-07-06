import greenfoot.*;

public class btnNew extends Actor
{
    public void act()
    {
        if(Greenfoot.mousePressed(this))
        {
            getImage().scale((int)Math.round(getImage().getWidth()*0.9),(int)Math.round(getImage().getHeight()*0.9));
        }
        if(Greenfoot.mousePressed(this))
        {
            Greenfoot.playSound("Button-Click.mp3");
            Greenfoot.delay(5);
            Greenfoot.setWorld(new Level1());
        }
    }
}
