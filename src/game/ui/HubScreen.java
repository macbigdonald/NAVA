
// HUB SCREEN

package game.ui;

public class HubScreen extends MenuScreen
{
    // ---------------- DATA MEMBERS ----------------
    // ---------------- CONSTRUCTORS ----------------

    public HubScreen()
    {
        super("HUB", new MenuChoice[]
        {
            new MenuChoice("(DEBUG) ADD ITEMS", ScreenType.DEBUG_GENERATE),
            new MenuChoice("SHOP", ScreenType.SHOP), // todo
            new MenuChoice("STASH", ScreenType.STASH),
            new MenuChoice("INVENTORY", ScreenType.INVENTORY),
            new MenuChoice("EQUIPMENT", ScreenType.EQUIPMENT),
            new MenuChoice("CHARACTER", ScreenType.CHARACTER), // todo
            new MenuChoice("DEPART", ScreenType.STAY), // todo
            new MenuChoice("(EXIT)", ScreenType.MAIN)
        });
    }

    // ------------------ METHODS -------------------
    // ------------ ACCESSORS / MUTATORS ------------
    // ----------------- DEBUGGING ------------------
}