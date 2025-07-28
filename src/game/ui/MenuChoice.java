
// MENU CHOICE

package game.ui;

public class MenuChoice
{
    // ---------------- DATA MEMBERS ----------------

    private final String label;
    private final ScreenType screenType;
    private final Runnable action;

    // ---------------- CONSTRUCTORS ----------------

    public MenuChoice(String label, ScreenType screenType)
    {
        this.label = label;
        this.screenType = screenType;
        this.action = null;
    }

    public MenuChoice(String label, ScreenType screenType, Runnable action)
    {
        this.label = label;
        this.screenType = screenType;
        this.action = action;
    }

    // ------------------ METHODS -------------------
    // ------------ ACCESSORS / MUTATORS ------------

    public String getLabel()
    {
        return label;
    }

    public ScreenType getScreenType()
    {
        return screenType;
    }

    public Runnable getAction()
    {
        return action;
    }

    // ----------------- DEBUGGING ------------------
}