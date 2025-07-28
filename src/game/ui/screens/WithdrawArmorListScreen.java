
// WITHDRAW ARMOR LIST SCREEN

package game.ui.screens;

import game.core.GameState;
import game.core.Armor;
import game.ui.MenuChoice;
import game.ui.MenuScreen;
import game.ui.ScreenType;

public class WithdrawArmorListScreen extends MenuScreen
{
    // ---------------- DATA MEMBERS ----------------
    // ---------------- CONSTRUCTORS ----------------

    public WithdrawArmorListScreen(GameState gameState)
    {
        super("WITHDRAW ARMOR", buildChoices(gameState));
    }

    // ------------------ METHODS -------------------

    private static MenuChoice[] buildChoices(GameState gameState)
    {
        int numberOfArmors = gameState.getNumberOfStashArmors();
        MenuChoice[] choices = new MenuChoice[numberOfArmors + 1];
        for (int i = 0; i < numberOfArmors; i++)
        {
            Armor stashArmor = gameState.getStashArmor(i);
            choices[i] = new MenuChoice(stashArmor.getName(), ScreenType.WITHDRAW_ARMOR,
                () -> gameState.setSelectedArmor(stashArmor));
        }
        choices[numberOfArmors] = new MenuChoice("(BACK)", ScreenType.WITHDRAW);
        return choices;
    }

    // ------------ ACCESSORS / MUTATORS ------------
    // ----------------- DEBUGGING ------------------
}