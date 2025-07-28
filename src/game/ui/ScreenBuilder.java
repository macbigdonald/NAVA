
// SCREEN BUILDER

package game.ui;

public class ScreenBuilder
{
    // ---------------- DATA MEMBERS ----------------

    private final StringBuilder output = new StringBuilder();

    // ---------------- CONSTRUCTORS ----------------
    // ------------------ METHODS -------------------

    public void addTitle(String title)
    {
        output.append("=== ").append(title).append(" ===\n\n");
    }

    public void addSection(String section)
    {
        output.append(section).append("\n\n");
    }

    public void addMenu(MenuChoice[] choices)
    {
        for (int i = 0; i < choices.length; i++)
        {
            output.append(i + 1).append(". ").append(choices[i].getLabel()).append("\n");
        }
        output.append("\n> ");
    }

    public String build()
    {
        return output.toString();
    }

    // ------------ ACCESSORS / MUTATORS ------------
    // ----------------- DEBUGGING ------------------
}