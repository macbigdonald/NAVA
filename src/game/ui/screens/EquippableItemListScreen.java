
// EQUIPPABLE ITEM LIST SCREEN

package game.ui.screens;

import game.core.*;
import game.ui.*;

public class EquippableItemListScreen extends MenuScreen
{
    // ---------------- DATA MEMBERS ----------------
    // ---------------- CONSTRUCTORS ----------------

    public EquippableItemListScreen(GameState gameState)
    {
        super("INVENTORY ITEMS",
            ScreenFunctions.buildEquippableList(ScreenType.INVENTORY, ScreenType.EQUIPPABLE_ITEM, gameState));
    }

    // ------------------ METHODS -------------------
    // ------------ ACCESSORS / MUTATORS ------------
    // ----------------- DEBUGGING ------------------
}