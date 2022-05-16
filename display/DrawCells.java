package display;
import javax.swing.*;
import java.awt.*;
import game.Engine;

// Anzeigen der Zellen als einzelne Kacheln
public class DrawCells extends JPanel {
    // Überschreiben der paintComponent-Methode => Anzeigen eines JPanels
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        // Iteration über alle Zellen
        for (int i = 0; i < Engine.cells.length; i++) {
            for (int j = 0; j < Engine.cells[i].length; j++) {
                // Wenn die Zelle lebt, soll eine Kachel gezeichnet werden
                if (Engine.cells[i][j]) {
                    // Setzen der Farbe der Kachel
                    g.setColor(Color.BLACK);
                    // Anzeigen der Kachel
                    g.fillRect(i * GUI.CELL_SIZE, j * GUI.CELL_SIZE, GUI.CELL_SIZE, GUI.CELL_SIZE);
                }
            }
        }
        // Wiederholen der Anzeigen (Selbstaufruf)
        repaint();
    }
}
