
// INVENTORY ITEM SCREEN

package game.ui.screens;

import game.core.*;
import game.ui.*;

public class InventoryItemScreen extends MenuScreen
{
    // ---------------- DATA MEMBERS ----------------
    // ---------------- CONSTRUCTORS ----------------

    public InventoryItemScreen(GameState gameState)
    {
        super(buildTitle(gameState), buildSections(gameState), new MenuChoice[]
        {
            new MenuChoice("(BACK)", ScreenType.INVENTORY_LIST, () -> gameState.setSelectedItem(null))
        });
    }

    // ------------------ METHODS -------------------

    private static String buildTitle(GameState gameState)
    {
        Item selectedItem = gameState.getSelectedItem();
        if (selectedItem == null) return "ITEM";
        return selectedItem.getName();
    }

    private static String[] buildSections(GameState gameState)
    {
        Item selectedItem = gameState.getSelectedItem();
        if (selectedItem == null) return null;
        return new String[]{selectedItem.toString()};
    }

    // ------------ ACCESSORS / MUTATORS ------------
    // ----------------- DEBUGGING ------------------
}