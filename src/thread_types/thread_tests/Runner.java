package thread_types.thread_tests;

import java.util.Random;

public class Runner extends Thread{
    private final String name;
    private final Random random = new Random();

    public Runner(final String  name) { // Namen mitgeben
        super();
        this.name = name;
    }

    // Wird bei aufruf von start ausgeführt
    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            // Für eine zufällige Zeit zwischen 0 und 999 Millisekunden warten
            try {
                Thread.sleep(random.nextInt(1000));
            } catch (Exception ex) {
                // not needed
            }

            // Nach jeder Runde etwas ausgeben
            System.out.println(String.format("Ich, %s, bin mit Runde %d fertig", name, i + 1));
        }

        // Am Ende etwas ausgeben
        System.out.println(String.format("Ich, %s, bin Fertig", name));
    }
}
