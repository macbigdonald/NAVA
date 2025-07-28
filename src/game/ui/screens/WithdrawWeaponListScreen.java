
// WITHDRAW WEAPON LIST SCREEN

package game.ui.screens;

import game.core.GameState;
import game.core.Weapon;
import game.ui.MenuChoice;
import game.ui.MenuScreen;
import game.ui.ScreenType;

public class WithdrawWeaponListScreen extends MenuScreen
{
    // ---------------- DATA MEMBERS ----------------
    // ---------------- CONSTRUCTORS ----------------

    public WithdrawWeaponListScreen(GameState gameState)
    {
        super("WITHDRAW WEAPONS", buildChoices(gameState));
    }

    // ------------------ METHODS -------------------

    private static MenuChoice[] buildChoices(GameState gameState)
    {
        int numberOfWeapons = gameState.getNumberOfStashWeapons();
        MenuChoice[] choices = new MenuChoice[numberOfWeapons + 1];
        for (int i = 0; i < numberOfWeapons; i++)
        {
            Weapon stashWeapon = gameState.getStashWeapon(i);
            choices[i] = new MenuChoice(stashWeapon.getName(), ScreenType.WITHDRAW_WEAPON,
                () -> gameState.setSelectedWeapon(stashWeapon));
        }
        choices[numberOfWeapons] = new MenuChoice("(BACK)", ScreenType.WITHDRAW);
        return choices;
    }

    // ------------ ACCESSORS / MUTATORS ------------
    // ----------------- DEBUGGING ------------------
}