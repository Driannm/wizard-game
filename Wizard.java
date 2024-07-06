import greenfoot.*;
import java.util.List;

public class Wizard extends Actor
{
    private int speed = 3;
    private int skillCooldown = 0;
    private int skillCooldownTime = 50;
    private int energy = 0;
    private int jumpStrength = 14;
    private int vSpeed = 0;
    private int acceleration = 1;
    private boolean onGround;

    public void act()
    {
        checkKeys();
        checkFall();
        checkForItems();
        checkForGhost();
    }

    public void checkKeys()
    {
        if(Greenfoot.isKeyDown("left")) {
            setImage("Wizard-Left.png");
            move(-speed);
        }
        
        if(Greenfoot.isKeyDown("right")) {
            setImage("Wizard-Right.png");
            move(speed);
        }
        
        if(Greenfoot.isKeyDown("space") && onGround) {
            jump();
        }
        
        if(Greenfoot.isKeyDown("1")) {
            setImage("Wizard-Attack-Left.png");
            if (skillCooldown == 0) {
                useSkill2();
                skillCooldown = skillCooldownTime; // Reset the cooldown
            }
        }
        
        if(Greenfoot.isKeyDown("2")) {
            setImage("Wizard-Attack-Right.png");
            if (skillCooldown == 0) {
                useSkill1();
                skillCooldown = skillCooldownTime; // Reset the cooldown
            }
        }
        
        if (skillCooldown > 0) {
            skillCooldown--;
        }
    }

    public void fall()
    {
        setLocation(getX(), getY() + vSpeed);
        vSpeed += acceleration;
        onGround = false;
    }

    public void checkFall() {
        if (onGround()) {
            vSpeed = 0;
            onGround = true;
        } else {
            fall();
        }
    }
    
    public void jump() {
        vSpeed = -jumpStrength;
        fall();
    }
    
    public boolean onGround() {
    if (getY() >= getWorld().getHeight() - getImage().getHeight() / 2) {
        return true;
    }
    
    List<Platform1> platforms1 = getObjectsAtOffset(0, getImage().getHeight() / 2, Platform1.class);
    List<Platform2> platforms2 = getObjectsAtOffset(0, getImage().getHeight() / 2, Platform2.class);
    List<Platform3> platforms3 = getObjectsAtOffset(0, getImage().getHeight() / 2, Platform3.class);
    List<Platform4> platforms4 = getObjectsAtOffset(0, getImage().getHeight() / 2, Platform4.class);
    List<Platform5> platforms5 = getObjectsAtOffset(0, getImage().getHeight() / 2, Platform5.class);
    List<PlatformL2_1> platforms6 = getObjectsAtOffset(0, getImage().getHeight() / 2, PlatformL2_1.class);
    List<PlatformL2_2> platforms7 = getObjectsAtOffset(0, getImage().getHeight() / 2, PlatformL2_2.class);
    List<PlatformL2_3> platforms8 = getObjectsAtOffset(0, getImage().getHeight() / 2, PlatformL2_3.class);
    List<PlatformL2_4> platforms9 = getObjectsAtOffset(0, getImage().getHeight() / 2, PlatformL2_4.class);
    List<PlatformL2_5> platforms10 = getObjectsAtOffset(0, getImage().getHeight() / 2, PlatformL2_5.class);
    
    return 
    !platforms1.isEmpty() || 
    !platforms2.isEmpty() || 
    !platforms3.isEmpty() || 
    !platforms4.isEmpty() || 
    !platforms5.isEmpty() || 
    !platforms6.isEmpty() || 
    !platforms7.isEmpty() || 
    !platforms8.isEmpty() || 
    !platforms9.isEmpty() || 
    !platforms10.isEmpty();
    }

    public void useSkill1()
    {
        // Implementasi skill 1
        energy--;
        Greenfoot.playSound("Magic-Charge.wav");
        skill1Charge skillCharge = new skill1Charge();
        getWorld().addObject(skillCharge, getX() + 1, getY());
    }

    public void useSkill2()
    {
        // Implementasi skill 2
        energy--;
        Greenfoot.playSound("Magic-Charge.wav");
        skill2Charge skillCharge = new skill2Charge();
        getWorld().addObject(skillCharge, getX() + 1, getY());
    }

    public void checkForItems() {
        scoreBoard scoreboard = (scoreBoard) getWorld().getObjects(scoreBoard.class).get(0);
        if (isTouching(item1.class)) {
            Greenfoot.playSound("Item-Collect.mp3");
            removeTouching(item1.class);
            scoreboard.addPoints(10);
        }
        if (isTouching(item2.class)) {
            Greenfoot.playSound("Item-Collect.mp3");
            removeTouching(item2.class);
            scoreboard.addPoints(10);
        }
        if (isTouching(item3.class)) {
            Greenfoot.playSound("Item-Collect.mp3");
            removeTouching(item3.class);
            scoreboard.addPoints(10);
        }
    }
    
    public void loseCondition() {
        getWorld().addObject(new alertGameOver(), getWorld().getWidth() / 2, getWorld().getHeight() / 2);
        Greenfoot.playSound("Alert-Lose.mp3");
        getWorld().addObject(new btnResume(), getWorld().getWidth() / 2, getWorld().getHeight() / 2 + 150);
        getWorld().addObject(new btnQuit(), getWorld().getWidth() / 2, getWorld().getHeight() / 2 + 230);
    }

    public void checkForGhost() {
        if (isTouching(Ghost1.class)) {
            loseCondition();
        }
        if (isTouching(Ghost2.class)) {
            loseCondition();
        }
    }
}