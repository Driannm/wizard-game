import greenfoot.*;  

public class Level2 extends World
{
    public Level2()
    {    
        super(900, 600, 1); 
        prepare();
        platform();
        callActor();
    }
    
    private void platform() {
        PlatformL2_1 platform1 = new PlatformL2_1();
        addObject(platform1, 152, 555);
        
        PlatformL2_2 platform2 = new PlatformL2_2();
        addObject(platform2, 576, 595);
        
        PlatformL2_4 platform3 = new PlatformL2_4();
        addObject(platform3, 870, 595);
        
        int[][] platform4Positions = {
            {750, 500},
            {600, 450},
            {450, 370},
            {285, 330},
            {190, 330},
            {100, 330},
            {40, 330},
            {230, 230},
            {390, 170},
            {480, 170}
        };
        
        for (int[] plat : platform4Positions) {
            PlatformL2_5 pl4 = new PlatformL2_5();
            addObject(pl4, plat[0], plat[1]);
        }
        
        int[][] platform6Positions = {
            {800, 120}
        };
        for (int[] plat : platform6Positions) {
            PlatformL2_3 pl5 = new PlatformL2_3();
            addObject(pl5, plat[0], plat[1]);
        }
        
    }
    
    private void callActor() {
        Wizard wizard = new Wizard();
        addObject(wizard, 10, 475);
        
        Ghost1 brownGhost1 = new Ghost1(3, 340, 600);    
        addObject(brownGhost1, 700, 535);
        
        Ghost1 brownGhost2 = new Ghost1(3, 615, 800);    
        addObject(brownGhost2, 700, 55);
        
        Ghost2 redGhost1 = new Ghost2(2, 20, 150);    
        addObject(redGhost1, 75, 280);
        
        Ghost2 redGhost2 = new Ghost2(1, 350, 490);    
        addObject(redGhost2, 350, 122);
        
        int[][] item1Positions = {
            {200, 497},
            {200, 497},
            {870, 85},
        };
        for (int[] pos : item1Positions) {
            item1 item = new item1();
            addObject(item, pos[0], pos[1]);
        }
        
        int[][] item2Positions = {
            {800, 575},
            {15, 311},
            {470, 350},
            {470, 350},
        };
        for (int[] pos : item2Positions) {
            item2 item = new item2();
            addObject(item, pos[0], pos[1]);
        }
        
        int[][] item3Positions = {
            {200, 210},
            {400, 150},
            {400, 150},
        };
        for (int[] pos : item3Positions) {
            item3 item = new item3();
            addObject(item, pos[0], pos[1]);
        }
    }
    
    private void prepare()
    {   
        scoreBoard score = new scoreBoard();
        addObject(score, 90, 30);
    }
}
