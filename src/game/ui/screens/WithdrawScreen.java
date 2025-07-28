
// WITHDRAW SCREEN

package game.ui.screens;

import game.ui.MenuChoice;
import game.ui.MenuScreen;
import game.ui.ScreenType;

public class WithdrawScreen extends MenuScreen
{
    // ---------------- DATA MEMBERS ----------------
    // ---------------- CONSTRUCTORS ----------------

    public WithdrawScreen()
    {
        super("STASH (WITHDRAW)", new MenuChoice[]
        {
            new MenuChoice("WEAPONS", ScreenType.WITHDRAW_WEAPON_LIST),
            new MenuChoice("ARMOR", ScreenType.WITHDRAW_ARMOR_LIST),
            new MenuChoice("JUNK", ScreenType.WITHDRAW_JUNK_LIST),
            new MenuChoice("(BACK)", ScreenType.STASH)
        });
    }

    // ------------------ METHODS -------------------
    // ------------ ACCESSORS / MUTATORS ------------
    // ----------------- DEBUGGING ------------------
}