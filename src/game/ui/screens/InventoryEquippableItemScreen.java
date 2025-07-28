
// INVENTORY EQUIPPABLE ITEM SCREEN todo STORABLE

package game.ui.screens;

import game.core.GameState;
import game.ui.MenuChoice;
import game.ui.MenuScreen;
import game.ui.ScreenType;

public class InventoryEquippableItemScreen extends MenuScreen
{
    // ---------------- DATA MEMBERS ----------------
    // ---------------- CONSTRUCTORS ----------------

    public InventoryEquippableItemScreen(GameState gameState)
    {
        super(buildTitle(gameState), buildSections(gameState), buildChoices(gameState));
    }

    // ------------------ METHODS -------------------

    private static String buildTitle(GameState gameState)
    {
        Item selectedItem = gameState.getSelectedEquippable();
        if (selectedItem != null)
            return selectedItem.getName();
        else
            return "ITEM";
    }

    private static String[] buildSections(GameState gameState)
    {
        Item selectedItem = gameState.getSelectedItem();
        if (selectedItem != null)
            return new String[]{selectedItem.toString()};
        else
            return null;
    }

    private static MenuChoice[] buildChoices(GameState gameState)
    {
        Equippable selectedItem = gameState.getSelectedItem();
        if (selectedItem != null)
            return new MenuChoice[]
            {
                new MenuChoice("EQUIP", ScreenType.INVENTORY_WEAPON, () ->
                {
                    if (gameState.equip(selectedItem))
                        gameState.setSelectedEquippable(null);
                }),
                new MenuChoice("(BACK)", ScreenType.INVENTORY_ITEM_LIST)
            };
        else
            return new MenuChoice[]
            {
                new MenuChoice("(BACK)", ScreenType.INVENTORY_ITEM_LIST)
            };
    }

    // ------------ ACCESSORS / MUTATORS ------------
    // ----------------- DEBUGGING ------------------
}