
// INVENTORY ITEM LIST SCREEN

package game.ui.screens;

import game.core.*;
import game.ui.*;

public class InventoryItemListScreen extends MenuScreen
{
    // ---------------- DATA MEMBERS ----------------
    // ---------------- CONSTRUCTORS ----------------

    public InventoryItemListScreen(GameState gameState)
    {
        super("INVENTORY ITEMS",
            ScreenFunctions.buildItemList(ScreenType.INVENTORY, ScreenType.INVENTORY_ITEM, gameState));
    }

    // ------------------ METHODS -------------------
    // ------------ ACCESSORS / MUTATORS ------------
    // ----------------- DEBUGGING ------------------
}