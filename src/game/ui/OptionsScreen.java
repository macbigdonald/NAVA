
// OPTIONS SCREEN

package game.ui;

public class OptionsScreen extends MenuScreen
{
    // ---------------- DATA MEMBERS ----------------
    // ---------------- CONSTRUCTORS ----------------

    public OptionsScreen()
    {
        super("OPTIONS", new MenuChoice[]
        {
            new MenuChoice("(BACK)", ScreenType.MAIN)
        });
    }

    // ------------------ METHODS -------------------
    // ------------ ACCESSORS / MUTATORS ------------
    // ----------------- DEBUGGING ------------------
}
