
// ITEM

package game.core;

// TODO : generation

public abstract class Item // todo
{
    // ---------------- DATA MEMBERS ----------------

    private static int debugId = 0;

    private final String name;
    private final int level;
    private final int value;
    private final int quality;
    private final int weight;

    // ---------------- CONSTRUCTORS ----------------

    public Item()
    {
        debugId++;
        name = getClass().getSimpleName() + " " + debugId;
        level = 0;
        value = 0;
        quality = 0;
        weight = 0;
    }

    // ------------------ METHODS -------------------

    @Override
    public String toString()
    {
        return "NAME: " + name;
    }

    // ------------ ACCESSORS / MUTATORS ------------

    public abstract ItemType getType();

    public String getName()
    {
        return name;
    }

    // ----------------- DEBUGGING ------------------
}