
// DEPOSIT ITEM SCREEN

package game.ui.screens;

import game.core.*;
import game.ui.*;

public class DepositItemScreen extends MenuScreen
{
    // ---------------- DATA MEMBERS ----------------
    // ---------------- CONSTRUCTORS ----------------

    public DepositItemScreen(GameState gameState)
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
        if (selectedItem == null) return new MenuChoice[]{new MenuChoice("(BACK)", ScreenType.DEPOSIT_LIST)};
        return new MenuChoice[]
        {
            new MenuChoice("MOVE TO STASH", ScreenType.DEPOSIT_ITEM, () ->
            {
                if (gameState.putIntoStash(selectedItem)) gameState.setSelectedItem(null);
            }),
            new MenuChoice("(BACK)", ScreenType.DEPOSIT_LIST)
        };
    }

    // ------------ ACCESSORS / MUTATORS ------------
    // ----------------- DEBUGGING ------------------
}