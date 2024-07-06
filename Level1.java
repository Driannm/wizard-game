import greenfoot.*;  

public class Level1 extends World
{
    public Level1()
    {    
        super(900, 600, 1); 
        prepare();
    }
    
    private void prepare()
    {   
        scoreBoard score = new scoreBoard();
        addObject(score, 90, 30);
        
        Platform1 platform1 = new Platform1();
        addObject(platform1, 200, 589);
        
        Platform2 platform2 = new Platform2();
        addObject(platform2, 700, 565);
        
        int[][] platform3Positions = {
            {655, 400},
            {300, 450},
            {200, 270},
            {75, 130},
            {800, 110}
        };
        for (int[] plat : platform3Positions) {
            Platform3 pl3 = new Platform3();
            addObject(pl3, plat[0], plat[1]);
        }
        
        
        int[][] platform4Positions = {
            {865, 459},
            {800, 300},
            {665, 265},
            {470, 350},
            {125, 400},
            {34, 350},
            {275, 175},
            {380, 125},
            {500, 110},
            {620, 110},
        };
        for (int[] plat : platform4Positions) {
            Platform4 pl4 = new Platform4();
            addObject(pl4, plat[0], plat[1]);
        }
        
        int[][] platform5Positions = {
            {596, 200}
        };
        for (int[] plat : platform5Positions) {
            Platform5 pl5 = new Platform5();
            addObject(pl5, plat[0], plat[1]);
        }
        
        Wizard wizard = new Wizard();
        addObject(wizard, 10, 545);
        
        Ghost1 brownGhost1 = new Ghost1(3, 500, 800);    
        addObject(brownGhost1, 700, 480);
        
        Ghost2 redGhost1 = new Ghost2(2, 20, 150);    
        addObject(redGhost1, 75, 82);
        
        Ghost2 redGhost2 = new Ghost2(1, 100, 260);    
        addObject(redGhost2, 200, 222);
        
        int[][] item1Positions = {
            {250, 565},
            {870, 91},
            {885, 519}
        };
        for (int[] pos : item1Positions) {
            item1 item = new item1();
            addObject(item, pos[0], pos[1]);
        }
        
        int[][] item2Positions = {
            {300, 432},
            {15, 112},
            {570, 382},
            {500, 92},
        };
        for (int[] pos : item2Positions) {
            item2 item = new item2();
            addObject(item, pos[0], pos[1]);
        }
        
        int[][] item3Positions = {
            {20, 329},
            {596, 180},
            {800, 280},
        };
        for (int[] pos : item3Positions) {
            item3 item = new item3();
            addObject(item, pos[0], pos[1]);
        }
    }
}
