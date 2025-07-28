
// MENU SCREEN

package game.ui;

public abstract class MenuScreen extends Screen
{
    // ---------------- DATA MEMBERS ----------------

    private final String title;
    private final String[] sections;
    private final MenuChoice[] choices;

    // ---------------- CONSTRUCTORS ----------------

    public MenuScreen(String title, MenuChoice[] choices)
    {
        this.title = title;
        this.sections = null;
        this.choices = choices;
    }

    public MenuScreen(String title, String[] sections, MenuChoice[] choices)
    {
        this.title = title;
        this.sections = sections;
        this.choices = choices;
    }

    // ------------------ METHODS -------------------

    @Override
    public void init()
    {
        ScreenBuilder screenBuilder = new ScreenBuilder();
        if (title != null)
            screenBuilder.addTitle(title);
        if (sections != null)
            for (String section : sections)
                screenBuilder.addSection(section);
        screenBuilder.addMenu(choices);
        setContent(screenBuilder.build());
    }

    @Override
    public ScreenType handle(String input)
    {
        MenuChoice choice;
        try
        {
            choice = choices[Integer.parseInt(input) - 1];
        }
        catch (NumberFormatException | IndexOutOfBoundsException e)
        {
            return ScreenType.STAY;
        }
        if (choice.getAction() != null)
            choice.getAction().run();
        return choice.getScreenType();
    }

    // ------------ ACCESSORS / MUTATORS ------------
    // ----------------- DEBUGGING ------------------
}