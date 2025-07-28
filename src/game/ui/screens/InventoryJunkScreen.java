
// INVENTORY JUNK SCREEN

package game.ui.screens;

import game.core.GameState;
import game.ui.MenuChoice;
import game.ui.MenuScreen;
import game.ui.ScreenType;

public class InventoryJunkScreen extends MenuScreen
{
    // ---------------- DATA MEMBERS ----------------
    // ---------------- CONSTRUCTORS ----------------

    public InventoryJunkScreen(GameState gameState)
    {
        super(gameState.getSelectedJunk().getName(), new String[]{gameState.getSelectedJunk().toString()},
            new MenuChoice[]
            {
                new MenuChoice("(BACK)", ScreenType.INVENTORY_JUNK_LIST, () -> gameState.setSelectedJunk(null))
            });
    }

    // ------------------ METHODS -------------------
    // ------------ ACCESSORS / MUTATORS ------------
    // ----------------- DEBUGGING ------------------
}