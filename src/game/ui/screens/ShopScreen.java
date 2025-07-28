
// SHOP SCREEN

package game.ui.screens;

import game.ui.MenuChoice;
import game.ui.MenuScreen;
import game.ui.ScreenType;

public class ShopScreen extends MenuScreen
{
    // ---------------- DATA MEMBERS ----------------
    // ---------------- CONSTRUCTORS ----------------

    public ShopScreen()
    {
        super("SHOP", null, new MenuChoice[]
        {
            new MenuChoice("BUY", ScreenType.BUY),
            new MenuChoice("SELL", ScreenType.SELL),
            new MenuChoice("(BACK)", ScreenType.HUB)
        });
    }

    // ------------------ METHODS -------------------
    // ------------ ACCESSORS / MUTATORS ------------
    // ----------------- DEBUGGING ------------------
}