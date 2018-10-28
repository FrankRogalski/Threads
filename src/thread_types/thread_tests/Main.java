package thread_types.thread_tests;

public class Main {
    public static void main(String[] args) {
        // Runner objekte erstellen
        var mario = new Runner("Mario");
        var luigi = new Runner("Luigi");

        //Threads starten
        mario.start();
        luigi.start();
    }
}
