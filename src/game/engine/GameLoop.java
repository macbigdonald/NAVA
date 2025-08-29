
// GAME LOOP

package game.engine;

import game.core.*;
import game.ui.*;
import java.util.Scanner;

public class GameLoop
{
    // ---------------- DATA MEMBERS ----------------

    private final Scanner scanner = new Scanner(System.in);
    private final ScreenManager screenManager;

    // ---------------- CONSTRUCTORS ----------------

    public GameLoop()
    {
        screenManager = new ScreenManager(new GameState());
    }

    // ------------------ METHODS -------------------

    public void run()
    {
        while (true)
        {
            clearConsole();                           // clears terminal
            screenManager.render();                   // displays screen
            String input = scanner.nextLine();        // waits for user input
            if (!screenManager.update(input)) break;  // changes screen (leaves if exit was chosen)
        }
        clearConsole();
        scanner.close();
    }

    private void clearConsole()
    {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }

    // ------------ ACCESSORS / MUTATORS ------------
    // ----------------- DEBUGGING ------------------
}
