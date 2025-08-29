
// JUNK

package game.core;

// TODO : generation

public class Junk extends Item
{
    // ------------------- FIELDS -------------------

    private final int tier;

    // ---------------- CONSTRUCTORS ----------------

    public Junk()
    {
        super();
        tier = 0;
    }

    // ------------------ METHODS -------------------
    // ------------ ACCESSORS / MUTATORS ------------

    @Override
    public Class<? extends Item> baseType()
    {
        return Junk.class;
    }

    // ----------------- DEBUGGING ------------------
}