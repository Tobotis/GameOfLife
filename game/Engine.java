package game;

// Klasse für die Spiel-Mechnik (Regeln, etc.)
public class Engine {
  // Anzahl an Zellen in einer Reihe bzw. einer Spalte (echte Anzahl ist x^2)
  public static final int NUMEROFCELLS = 40;
  // 2 dimensionales Array von Wahrheitswerte für die Zellen (1: leben, 0: tot)
  public static Boolean[][] cells = new Boolean[NUMEROFCELLS][NUMEROFCELLS];

  // Methode um eine neue Liste zu erstellen (=> ein neues Spiel starten)
  public void newList() {
    // Iteration über alle Reihen
    for (int i = 0; i < NUMEROFCELLS; i++) {
      // Iteration über alle Spalten
      for (int j = 0; j < NUMEROFCELLS; j++) {
        // Generieren eines Zufallswertes im Intervall [0,1]
        double random = Math.random();
        // Setzen des Zustandes der Zelle in Abhängigkeit des Zufallswertes
        if (random > 0.5) {
          cells[i][j] = true;
        } else {
          cells[i][j] = false;
        }
      }
    }
  }

  // Methode für das Berechnen der nächsten Generation
  public static void nextGen() {
    // Iteration über alle Zellen
    for (int i = 0; i < cells.length; i++) {
      for (int j = 0; j < cells[i].length; j++) {
        // Berchnen der Anzahl an Nachbarn
        int neighbors = getAdj(i, j);
        // === Regeln ===
        // Eine Zelle ist in der nächsten Generation nur am Leben,
        // wenn sie zwei oder drei lebende Nachbarn hat
        if (neighbors == 2 || neighbors == 3) {
          cells[i][j] = true;
        } else {
          cells[i][j] = false;
        }
      }
    }
  }

  // Methode für das Berechnen der Anzahl an Nachbarzellen
  // i: Reihenkoordinate der zu betrachtenden Zelle
  // j: Spaltenkoordinate der zu betrachtenden Zelle
  public static int getAdj(int i, int j) {
    // Anzahl an gefundenen Nachbarn
    int counter = 0;
    // Iteration über alle Reihen in Reichweite
    for (int r = 0; r < 3; r++) {
      // Iteration über alle Spalten in Reichweite
      for (int c = 0; c < 3; c++) {
        // Vermeidung der eigenen Zelle
        if (r != 1 && c != 1) {
          // Berechnen der zu überprüfenden Indizes
          // => Modulo Operation um die Grenze zu berücksichtigen
          int rCheck = (i + r - 1 + cells.length) % cells.length;
          int cCheck = (j + c - 1 + cells[i].length) % cells[i].length;
          // Überprüfung ob die Zelle lebt
          if (cells[rCheck][cCheck] == true) {
            // Inkrementieren der Nachbarzellen
            counter++;
          }
        }
      }
    }
    // Zurückgeben der Anzahl an Nachbarn
    return counter;
  }

}

