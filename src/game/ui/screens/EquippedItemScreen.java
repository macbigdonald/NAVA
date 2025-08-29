
// EQUIPPED ITEM SCREEN

package game.ui.screens;

import game.core.*;
import game.ui.*;

public class EquippedItemScreen extends MenuScreen
{
    // ---------------- DATA MEMBERS ----------------
    // ---------------- CONSTRUCTORS ----------------

    public EquippedItemScreen(GameState gameState)
    {
        super(buildTitle(gameState), buildSections(gameState), buildChoices(gameState));
    }

    // ------------------ METHODS -------------------

    private static String buildTitle(GameState gameState)
    {
        Equippable equippedItem = gameState.getSelectedEquippable();
        if (equippedItem != null)
            return equippedItem.getName();
        else
            return "ITEM";
    }

    private static String[] buildSections(GameState gameState)
    {
        Equippable equippedItem = gameState.getSelectedEquippable();
        if (equippedItem != null)
            return new String[]{equippedItem.toString()};
        else
            return null;
    }

    private static MenuChoice[] buildChoices(GameState gameState)
    {
        Equippable equippedItem = gameState.getSelectedEquippable();
        if (equippedItem != null)
            return new MenuChoice[]
            {
                new MenuChoice("UNEQUIP", ScreenType.EQUIPMENT, () ->
                {
                    if (gameState.unequip(equippedItem.baseType()))
                        gameState.setSelectedItem(null);
                }),
                new MenuChoice("(BACK)", ScreenType.EQUIPMENT)
            };
        else
            return new MenuChoice[]
            {
                new MenuChoice("(BACK)", ScreenType.EQUIPMENT)
            };
    }

    // ------------ ACCESSORS / MUTATORS ------------
    // ----------------- DEBUGGING ------------------
}