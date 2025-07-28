
// DEPOSIT ARMOR SCREEN

package game.ui.screens;

import game.core.GameState;
import game.core.Armor;
import game.ui.MenuChoice;
import game.ui.MenuScreen;
import game.ui.ScreenType;

public class DepositArmorScreen extends MenuScreen
{
    // ---------------- DATA MEMBERS ----------------
    // ---------------- CONSTRUCTORS ----------------

    public DepositArmorScreen(GameState gameState)
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
                new MenuChoice("MOVE TO STASH", ScreenType.DEPOSIT_ARMOR, () ->
                {
                    if (gameState.putIntoStash(selectedArmor))
                        gameState.setSelectedArmor(null);
                }),
                new MenuChoice("(BACK)", ScreenType.DEPOSIT_ARMOR_LIST)
            };
        else
            return new MenuChoice[]
            {
                new MenuChoice("(BACK)", ScreenType.DEPOSIT_ARMOR_LIST)
            };
    }

    // ------------ ACCESSORS / MUTATORS ------------
    // ----------------- DEBUGGING ------------------
}