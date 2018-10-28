package thread_types.runnable;

public class Main {
    public static void main(String[] args) {
        // Runner objekte erstellen
        var mario = new Runner("Mario");
        var luigi = new Runner("Luigi");

        var marioThread = new Thread(mario);
        var luigiThread = new Thread(luigi);

        marioThread.start();
        luigiThread.start();
    }
}
