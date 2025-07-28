
// INVENTORY ITEM LIST SCREEN

package game.ui.screens;

import game.core.GameState;
import game.ui.MenuChoice;
import game.ui.MenuScreen;

import java.util.ArrayList;

public class InventoryItemListScreen extends MenuScreen
{
    // ---------------- DATA MEMBERS ----------------
    // ---------------- CONSTRUCTORS ----------------

    public InventoryItemListScreen(GameState gameState)
    {
        super("INVENTORY ITEMS", buildChoices(gameState));
    }

    // ------------------ METHODS -------------------

    private static MenuChoice[] buildChoices(GameState gameState)
    {
        ArrayList<Item> list = gameState.getSelectedList();
    }

    // ------------ ACCESSORS / MUTATORS ------------
    // ----------------- DEBUGGING ------------------
}