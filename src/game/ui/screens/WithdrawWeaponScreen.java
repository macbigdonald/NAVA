
// WITHDRAW WEAPON SCREEN

package game.ui.screens;

import game.core.GameState;
import game.core.Weapon;
import game.ui.MenuChoice;
import game.ui.MenuScreen;
import game.ui.ScreenType;

public class WithdrawWeaponScreen extends MenuScreen
{
    // ---------------- DATA MEMBERS ----------------
    // ---------------- CONSTRUCTORS ----------------

    public WithdrawWeaponScreen(GameState gameState)
    {
        super(buildTitle(gameState), buildSections(gameState), buildChoices(gameState));
    }

    // ------------------ METHODS -------------------

    private static String buildTitle(GameState gameState)
    {
        Weapon selectedWeapon = gameState.getSelectedWeapon();
        if (selectedWeapon != null)
            return selectedWeapon.getName();
        else
            return "WEAPON";
    }

    private static String[] buildSections(GameState gameState)
    {
        Weapon selectedWeapon = gameState.getSelectedWeapon();
        if (selectedWeapon != null)
            return new String[]{selectedWeapon.toString()};
        else
            return null;
    }

    private static MenuChoice[] buildChoices(GameState gameState)
    {
        Weapon selectedWeapon = gameState.getSelectedWeapon();
        if (selectedWeapon != null)
            return new MenuChoice[]
            {
                new MenuChoice("MOVE TO INVENTORY", ScreenType.WITHDRAW_WEAPON, () ->
                {
                    if (gameState.takeFromStash(selectedWeapon))
                        gameState.setSelectedWeapon(null);
                }),
                new MenuChoice("(BACK)", ScreenType.WITHDRAW_WEAPON_LIST)
            };
        else
            return new MenuChoice[]
            {
                new MenuChoice("(BACK)", ScreenType.WITHDRAW_WEAPON_LIST)
            };
    }

    // ------------ ACCESSORS / MUTATORS ------------
    // ----------------- DEBUGGING ------------------
}