
// ITEM

package game.core;

// TODO : generation

/**
 * <p>Item class. {@link #baseType()}.
 */
public abstract class Item
{
    // ------------------- FIELDS -------------------

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

    public abstract Class<? extends Item> baseType();

    public String getName()
    {
        return name;
    }

    // ----------------- DEBUGGING ------------------
}