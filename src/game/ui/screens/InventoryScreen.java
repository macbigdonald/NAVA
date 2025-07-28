
// INVENTORY SCREEN

package game.ui.screens;

import game.core.ItemType;
import game.core.GameState;
import game.ui.MenuChoice;
import game.ui.MenuScreen;
import game.ui.ScreenType;

public class InventoryScreen extends MenuScreen
{
    // ---------------- DATA MEMBERS ----------------
    // ---------------- CONSTRUCTORS ----------------

    public InventoryScreen(GameState gameState)
    {
        super("INVENTORY", new MenuChoice[]
        {
            new MenuChoice("WEAPONS", ScreenType.INVENTORY_ITEM_LIST, () -> gameState.setSelectedList(ItemType.WEAPON)),
            new MenuChoice("ARMOR", ScreenType.INVENTORY_ITEM_LIST, () -> gameState.setSelectedList(ItemType.ARMOR)),
            new MenuChoice("JUNK", ScreenType.INVENTORY_ITEM_LIST, () -> gameState.setSelectedList(ItemType.JUNK)),
            new MenuChoice("(BACK)", ScreenType.HUB)
        });
    }

    // ------------------ METHODS -------------------
    // ------------ ACCESSORS / MUTATORS ------------
    // ----------------- DEBUGGING ------------------
}