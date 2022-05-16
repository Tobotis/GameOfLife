package display;
import javax.swing.*;
import game.Engine;

// Klasse für das GUI (Erstellen eines Fensters, etc.)
public class GUI {
    // Deklarieren eines Fensters
    JFrame frame;
    // Deklarieren einer Fenstergröße
    public static final int FRAME_SIZE = 500;
    // Deklarieren einer Kachelgröße
    public static final int CELL_SIZE= FRAME_SIZE / Engine.NUMEROFCELLS;
    // Methode zum Initialisieren des Fensters
    public void setup() {
        // Erstellen eines Fensters
        frame = new JFrame("Game of Life");
        // Setzen der Fenstergröße
        frame.setSize(FRAME_SIZE, FRAME_SIZE);
        // Setzen der Schließen-Operation des Fensters
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // Ändern der Position des Fensters (zentriert)
        frame.setLocationRelativeTo(null);
        // Initialisieren der Kachelanzeige
        DrawCells dc = new DrawCells();
        // Hinzufügen der Kachelanzeige zum Fenster
        frame.add(dc);
        // Fenster sichtbar machen
        frame.setVisible(true);
    }
}
