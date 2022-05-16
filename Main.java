import display.GUI;
import game.Engine;
import game.Clock;

// Main-Klasse (Startpunkt des Programmes)
public class Main {
    // Main-Methode (Startpunkt des Programmes)
    public static void main(String[] args){
        // GUI-Objekt erzeugen
        GUI gui = new GUI();
        // Spiel-Engine erzeugen
        Engine gol = new Engine();
        // Spiel-Uhr erzeugen
        Clock clock = new Clock(); 
        // Initilisieren der Engine (Erstellen der Zellen)
        gol.newList();
        // Initialisieren des GUI
        gui.setup();
        // Starten der Spielschleife
        clock.start();
    }
}
