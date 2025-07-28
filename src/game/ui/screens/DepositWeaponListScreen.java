
// DEPOSIT WEAPON LIST SCREEN

package game.ui.screens;

import game.core.GameState;
import game.core.Weapon;
import game.ui.MenuChoice;
import game.ui.MenuScreen;
import game.ui.ScreenType;

public class DepositWeaponListScreen extends MenuScreen
{
    // ---------------- DATA MEMBERS ----------------
    // ---------------- CONSTRUCTORS ----------------

    public DepositWeaponListScreen(GameState gameState)
    {
        super("DEPOSIT WEAPONS", buildChoices(gameState));
    }

    // ------------------ METHODS -------------------

    private static MenuChoice[] buildChoices(GameState gameState)
    {
        int numberOfWeapons = gameState.getNumberOfInventoryWeapons();
        MenuChoice[] choices = new MenuChoice[numberOfWeapons + 1];
        for (int i = 0; i < numberOfWeapons; i++)
        {
            Weapon inventoryWeapon = gameState.getInventoryWeapon(i);
            choices[i] = new MenuChoice(inventoryWeapon.getName(), ScreenType.DEPOSIT_WEAPON,
                () -> gameState.setSelectedWeapon(inventoryWeapon));
        }
        choices[numberOfWeapons] = new MenuChoice("(BACK)", ScreenType.DEPOSIT);
        return choices;
    }

    // ------------ ACCESSORS / MUTATORS ------------
    // ----------------- DEBUGGING ------------------
}