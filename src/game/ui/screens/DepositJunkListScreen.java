
// DEPOSIT JUNK LIST SCREEN

package game.ui.screens;

import game.core.GameState;
import game.core.Junk;
import game.ui.MenuChoice;
import game.ui.MenuScreen;
import game.ui.ScreenType;

public class DepositJunkListScreen extends MenuScreen
{
    // ---------------- DATA MEMBERS ----------------
    // ---------------- CONSTRUCTORS ----------------

    public DepositJunkListScreen(GameState gameState)
    {
        super("DEPOSIT JUNK", buildChoices(gameState));
    }

    // ------------------ METHODS -------------------

    private static MenuChoice[] buildChoices(GameState gameState)
    {
        int numberOfJunks = gameState.getNumberOfInventoryJunks();
        MenuChoice[] choices = new MenuChoice[numberOfJunks + 1];
        for (int i = 0; i < numberOfJunks; i++)
        {
            Junk inventoryJunk = gameState.getInventoryJunk(i);
            choices[i] = new MenuChoice(inventoryJunk.getName(), ScreenType.DEPOSIT_JUNK,
                () -> gameState.setSelectedJunk(inventoryJunk));
        }
        choices[numberOfJunks] = new MenuChoice("(BACK)", ScreenType.DEPOSIT);
        return choices;
    }

    // ------------ ACCESSORS / MUTATORS ------------
    // ----------------- DEBUGGING ------------------
}