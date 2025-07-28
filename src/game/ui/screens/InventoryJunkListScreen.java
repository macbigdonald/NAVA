
// INVENTORY JUNK LIST SCREEN

package game.ui.screens;

import game.core.GameState;
import game.core.Junk;
import game.ui.MenuChoice;
import game.ui.MenuScreen;
import game.ui.ScreenType;

public class InventoryJunkListScreen extends MenuScreen
{
    // ---------------- DATA MEMBERS ----------------
    // ---------------- CONSTRUCTORS ----------------

    public InventoryJunkListScreen(GameState gameState)
    {
        super("INVENTORY JUNK", buildChoices(gameState));
    }

    // ------------------ METHODS -------------------

    private static MenuChoice[] buildChoices(GameState gameState)
    {
        int numberOfJunks = gameState.getNumberOfInventoryJunks();
        MenuChoice[] choices = new MenuChoice[numberOfJunks + 1];
        for (int i = 0; i < numberOfJunks; i++)
        {
            Junk inventoryJunk = gameState.getInventoryJunk(i);
            choices[i] = new MenuChoice(inventoryJunk.getName(), ScreenType.INVENTORY_JUNK,
                () -> gameState.setSelectedJunk(inventoryJunk));
        }
        choices[numberOfJunks] = new MenuChoice("(BACK)", ScreenType.INVENTORY);
        return choices;
    }

    // ------------ ACCESSORS / MUTATORS ------------
    // ----------------- DEBUGGING ------------------
}