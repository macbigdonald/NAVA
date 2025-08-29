
// INVENTORY SCREEN

package game.ui.screens;

import game.core.*;
import game.ui.*;

public class InventoryScreen extends MenuScreen
{
    // ---------------- DATA MEMBERS ----------------
    // ---------------- CONSTRUCTORS ----------------

    public InventoryScreen(GameState gameState)
    {
        super("INVENTORY", new MenuChoice[]
        {
            new MenuChoice("WEAPONS", ScreenType.EQUIPPABLE_LIST,
                () -> gameState.setSelectedEquippableList(StorageSlot.INVENTORY, Weapon.class)),
            new MenuChoice("ARMOR", ScreenType.EQUIPPABLE_LIST,
                () -> gameState.setSelectedEquippableList(StorageSlot.INVENTORY, Armor.class)),
            new MenuChoice("JUNK", ScreenType.INVENTORY_LIST,
                () -> gameState.setSelectedItemList(StorageSlot.INVENTORY, Junk.class)),
            new MenuChoice("(BACK)", ScreenType.HUB)
        });
    }

    // ------------------ METHODS -------------------
    // ------------ ACCESSORS / MUTATORS ------------
    // ----------------- DEBUGGING ------------------
}