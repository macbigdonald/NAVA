
// DEPOSIT SCREEN

package game.ui.screens;

import game.ui.MenuChoice;
import game.ui.MenuScreen;
import game.ui.ScreenType;

public class DepositScreen extends MenuScreen
{
    // ---------------- DATA MEMBERS ----------------
    // ---------------- CONSTRUCTORS ----------------

    public DepositScreen()
    {
        super("STASH (DEPOSIT)", new MenuChoice[]
        {
            new MenuChoice("WEAPONS", ScreenType.DEPOSIT_WEAPON_LIST),
            new MenuChoice("ARMOR", ScreenType.DEPOSIT_ARMOR_LIST),
            new MenuChoice("JUNK", ScreenType.DEPOSIT_JUNK_LIST),
            new MenuChoice("(BACK)", ScreenType.STASH)
        });
    }

    // ------------------ METHODS -------------------
    // ------------ ACCESSORS / MUTATORS ------------
    // ----------------- DEBUGGING ------------------
}