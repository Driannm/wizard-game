import greenfoot.*;

public class MenuAbout extends World
{
    public MenuAbout()
    {    
        super(900, 600, 1);
        prepare();
    }
    
    public void prepare() {
        btnBack back = new btnBack();
        addObject(back, 750,550);
    }
}
