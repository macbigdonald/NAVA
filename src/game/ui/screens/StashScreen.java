
// STASH SCREEN

package game.ui.screens;

import game.ui.MenuChoice;
import game.ui.MenuScreen;
import game.ui.ScreenType;

public class StashScreen extends MenuScreen
{
    // ---------------- DATA MEMBERS ----------------
    // ---------------- CONSTRUCTORS ----------------

    public StashScreen()
    {
        super("STASH", null, new MenuChoice[]
        {
            new MenuChoice("DEPOSIT", ScreenType.DEPOSIT),
            new MenuChoice("WITHDRAW", ScreenType.WITHDRAW),
            new MenuChoice("(BACK)", ScreenType.HUB)
        });
    }

    // ------------------ METHODS -------------------
    // ------------ ACCESSORS / MUTATORS ------------
    // ----------------- DEBUGGING ------------------
}