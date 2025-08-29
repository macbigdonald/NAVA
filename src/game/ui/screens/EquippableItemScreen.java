
// EQUIPPABLE ITEM SCREEN

package game.ui.screens;

import game.core.*;
import game.ui.*;

public class EquippableItemScreen extends MenuScreen
{
    // ---------------- DATA MEMBERS ----------------
    // ---------------- CONSTRUCTORS ----------------

    public EquippableItemScreen(GameState gameState)
    {
        super(buildTitle(gameState), buildSections(gameState), buildChoices(gameState));
    }

    // ------------------ METHODS -------------------

    private static String buildTitle(GameState gameState)
    {
        Equippable selectedItem = gameState.getSelectedEquippable();
        if (selectedItem == null) return "ITEM";
        return selectedItem.getName();
    }

    private static String[] buildSections(GameState gameState)
    {
        Equippable selectedItem = gameState.getSelectedEquippable();
        if (selectedItem == null) return null;
        return new String[]{selectedItem.toString()};
    }

    private static MenuChoice[] buildChoices(GameState gameState)
    {
        Equippable selectedItem = gameState.getSelectedEquippable();
        if (selectedItem == null) return new MenuChoice[]{new MenuChoice("(BACK)", ScreenType.EQUIPPABLE_LIST)};
        return new MenuChoice[]
        {
            new MenuChoice("EQUIP", ScreenType.EQUIPPABLE_ITEM, () ->
            {
                if (gameState.equip(selectedItem)) gameState.setSelectedEquippable(null);
            }),
            new MenuChoice("(BACK)", ScreenType.EQUIPPABLE_LIST)
        };
    }

    // ------------ ACCESSORS / MUTATORS ------------
    // ----------------- DEBUGGING ------------------
}