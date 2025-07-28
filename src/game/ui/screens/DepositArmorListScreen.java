
// DEPOSIT ARMOR LIST SCREEN

package game.ui.screens;

import game.core.GameState;
import game.core.Armor;
import game.ui.MenuChoice;
import game.ui.MenuScreen;
import game.ui.ScreenType;

public class DepositArmorListScreen extends MenuScreen
{
    // ---------------- DATA MEMBERS ----------------
    // ---------------- CONSTRUCTORS ----------------

    public DepositArmorListScreen(GameState gameState)
    {
        super("DEPOSIT ARMOR", buildChoices(gameState));
    }

    // ------------------ METHODS -------------------

    private static MenuChoice[] buildChoices(GameState gameState)
    {
        int numberOfArmors = gameState.getNumberOfInventoryArmors();
        MenuChoice[] choices = new MenuChoice[numberOfArmors + 1];
        for (int i = 0; i < numberOfArmors; i++)
        {
            Armor inventoryArmor = gameState.getInventoryArmor(i);
            choices[i] = new MenuChoice(inventoryArmor.getName(), ScreenType.DEPOSIT_ARMOR,
                () -> gameState.setSelectedArmor(inventoryArmor));
        }
        choices[numberOfArmors] = new MenuChoice("(BACK)", ScreenType.DEPOSIT);
        return choices;
    }

    // ------------ ACCESSORS / MUTATORS ------------
    // ----------------- DEBUGGING ------------------
}