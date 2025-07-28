
// SELL SCREEN

package game.ui.screens;

import game.ui.MenuChoice;
import game.ui.MenuScreen;
import game.ui.ScreenType;

public class SellScreen extends MenuScreen
{
    // ---------------- DATA MEMBERS ----------------
    // ---------------- CONSTRUCTORS ----------------

    public SellScreen()
    {
        super("SHOP (SELL)", new MenuChoice[]
        {
            new MenuChoice("WEAPONS", ScreenType.STAY),
            new MenuChoice("ARMOR", ScreenType.STAY),
            new MenuChoice("JUNK", ScreenType.STAY),
            new MenuChoice("(BACK)", ScreenType.SHOP)
        });
    }

    // ------------------ METHODS -------------------
    // ------------ ACCESSORS / MUTATORS ------------
    // ----------------- DEBUGGING ------------------
}