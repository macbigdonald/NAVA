
// WITHDRAW ITEM SCREEN

package game.ui.screens;

import game.core.*;
import game.ui.*;

public class WithdrawItemScreen extends MenuScreen
{
    // ---------------- DATA MEMBERS ----------------
    // ---------------- CONSTRUCTORS ----------------

    public WithdrawItemScreen(GameState gameState)
    {
        super(buildTitle(gameState), buildSections(gameState), buildChoices(gameState));
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

    private static MenuChoice[] buildChoices(GameState gameState)
    {
        Item selectedItem = gameState.getSelectedItem();
        if (selectedItem == null) return new MenuChoice[]{new MenuChoice("(BACK)", ScreenType.WITHDRAW_ITEM_LIST)};
        return new MenuChoice[]
        {
            new MenuChoice("MOVE TO INVENTORY", ScreenType.WITHDRAW_ITEM, () ->
            {
                if (gameState.takeFromStash(selectedItem)) gameState.setSelectedItem(null);
            }),
            new MenuChoice("(BACK)", ScreenType.WITHDRAW_ITEM_LIST)
        };
    }

    // ------------ ACCESSORS / MUTATORS ------------
    // ----------------- DEBUGGING ------------------
}