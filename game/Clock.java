package game;

// Klasse für den Spielablauf (Spiel-Schleife)
public class Clock extends Thread {
    // Methode zum Starten des Spiels
    public void start() {
        // Unendliche Schleife
        while (true) {
            try {
                // Berechnen der nächsten Generation
                Engine.nextGen();
                // Warten einer Sekunde
                sleep(1000);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
