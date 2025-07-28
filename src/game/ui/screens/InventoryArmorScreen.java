
// INVENTORY ARMOR SCREEN

package game.ui.screens;

import game.core.GameState;
import game.core.Armor;
import game.ui.MenuChoice;
import game.ui.MenuScreen;
import game.ui.ScreenType;

public class InventoryArmorScreen extends MenuScreen
{
    // ---------------- DATA MEMBERS ----------------
    // ---------------- CONSTRUCTORS ----------------

    public InventoryArmorScreen(GameState gameState)
    {
        super(buildTitle(gameState), buildSections(gameState), buildChoices(gameState));
    }

    // ------------------ METHODS -------------------

    private static String buildTitle(GameState gameState)
    {
        Armor selectedArmor = gameState.getSelectedArmor();
        if (selectedArmor != null)
            return selectedArmor.getName();
        else
            return "ARMOR";
    }

    private static String[] buildSections(GameState gameState)
    {
        Armor selectedArmor = gameState.getSelectedArmor();
        if (selectedArmor != null)
            return new String[]{selectedArmor.toString()};
        else
            return null;
    }

    private static MenuChoice[] buildChoices(GameState gameState)
    {
        Armor selectedArmor = gameState.getSelectedArmor();
        if (selectedArmor != null)
            return new MenuChoice[]
            {
                new MenuChoice("EQUIP", ScreenType.INVENTORY_ARMOR, () ->
                {
                    if (gameState.equip(selectedArmor))
                        gameState.setSelectedArmor(null);
                }),
                new MenuChoice("(BACK)", ScreenType.INVENTORY_ARMOR_LIST)
            };
        else
            return new MenuChoice[]
            {
                new MenuChoice("(BACK)", ScreenType.INVENTORY_ARMOR_LIST)
            };
    }

    // ------------ ACCESSORS / MUTATORS ------------
    // ----------------- DEBUGGING ------------------
}