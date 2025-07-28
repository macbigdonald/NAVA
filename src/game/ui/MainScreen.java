
// MAIN SCREEN

package game.ui;

public class MainScreen extends MenuScreen
{
    // ---------------- DATA MEMBERS ----------------
    // ---------------- CONSTRUCTORS ----------------

    public MainScreen()
    {
        super("PROJECT NAVA", new MenuChoice[]
        {
            new MenuChoice("PLAY", ScreenType.HUB),
            new MenuChoice("OPTIONS", ScreenType.OPTIONS),
            new MenuChoice("EXIT", ScreenType.EXIT)
        });
    }

    // ------------------ METHODS -------------------
    // ------------ ACCESSORS / MUTATORS ------------
    // ----------------- DEBUGGING ------------------
}