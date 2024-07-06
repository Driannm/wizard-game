import greenfoot.*; 

public class MenuUtama extends World
{
    private GreenfootSound music; // Menyimpan referensi ke objek musik
    private boolean gameRunning = false; // Menyimpan status permainan

    public MenuUtama()
    {    
        super(900, 600, 1);
        prepare();
    }
    
    public void prepare() {
        btnStart start = new btnStart();
        addObject(start, 450, 370);

        btnAbout about = new btnAbout();
        addObject(about, 450, 450);
    }

    public void started() {
        // Memulai pemutaran musik saat dunia dimulai
        music = new GreenfootSound("UI-Music.mp3");
        music.play();
        gameRunning = true; // Set status permainan menjadi berjalan
    }

    public void stopped() {
        // Menghentikan pemutaran musik saat pindah ke dunia lain
        if (music != null) {
            music.stop();
            gameRunning = false; // Set status permainan menjadi tidak berjalan
        }
    }

    // Method untuk memulai permainan
    public void startGame() {
        Greenfoot.setWorld(new Level1()); // Ganti WorldLain dengan nama kelas world baru Anda
        stopped(); // Memanggil stopped() saat berpindah ke world lain
    }

    // Override method act untuk memeriksa status permainan setiap saat
    public void act() {
        // Jika permainan berjalan dan music berhenti, mulai musik lagi
        if (gameRunning && !music.isPlaying()) {
            music.play();
        }
    }
}
