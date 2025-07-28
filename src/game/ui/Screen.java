
// SCREEN

package game.ui;

public abstract class Screen
{
    // ---------------- DATA MEMBERS ----------------

    private String content;

    // ---------------- CONSTRUCTORS ----------------
    // ------------------ METHODS -------------------

    public abstract void init();

    public abstract ScreenType handle(String input);

    public void render()
    {
        System.out.print(content);
    }

    // ------------ ACCESSORS / MUTATORS ------------

    public void setContent(String content)
    {
        this.content = content;
    }

    // ----------------- DEBUGGING ------------------
}