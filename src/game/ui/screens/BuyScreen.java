
// BUY SCREEN

package game.ui.screens;

import game.ui.MenuChoice;
import game.ui.MenuScreen;
import game.ui.ScreenType;

public class BuyScreen extends MenuScreen
{
    // ---------------- DATA MEMBERS ----------------
    // ---------------- CONSTRUCTORS ----------------

    public BuyScreen()
    {
        super("SHOP (BUY)", new MenuChoice[]
        {
            new MenuChoice("WEAPONS", ScreenType.STAY),
            new MenuChoice("ARMOR", ScreenType.STAY),
            new MenuChoice("(BACK)", ScreenType.SHOP)
        });
    }

    // ------------------ METHODS -------------------
    // ------------ ACCESSORS / MUTATORS ------------
    // ----------------- DEBUGGING ------------------
}