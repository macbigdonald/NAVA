
// HUB SCREEN

package game.ui.screens;

import game.ui.*;

public class HubScreen extends MenuScreen
{
    // ---------------- DATA MEMBERS ----------------
    // ---------------- CONSTRUCTORS ----------------

    public HubScreen()
    {
        super("HUB", new MenuChoice[]
        {
            new MenuChoice("(DEBUG) ADD ITEMS", ScreenType.DEBUG_GENERATE),
            new MenuChoice("SHOP", ScreenType.SHOP),
            new MenuChoice("STASH", ScreenType.STASH),
            new MenuChoice("INVENTORY", ScreenType.INVENTORY),
            new MenuChoice("EQUIPMENT", ScreenType.EQUIPMENT),
            new MenuChoice("CHARACTER", ScreenType.CHARACTER),
            new MenuChoice("DEPART", ScreenType.STAY), // todo
            new MenuChoice("(EXIT)", ScreenType.MAIN)
        });
    }

    // ------------------ METHODS -------------------
    // ------------ ACCESSORS / MUTATORS ------------
    // ----------------- DEBUGGING ------------------
}