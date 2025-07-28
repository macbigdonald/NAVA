
// JUNK

package game.core;

// TODO : generation

public class Junk extends Item
{
    // ---------------- DATA MEMBERS ----------------

    private final int tier;

    // ---------------- CONSTRUCTORS ----------------

    public Junk()
    {
        super();
        tier = 0;
    }

    // ------------------ METHODS -------------------

    @Override
    public String toString()
    {
        return "TIER: " + tier;
    }

    // ------------ ACCESSORS / MUTATORS ------------

    @Override
    public ItemType getType()
    {
        return ItemType.JUNK;
    }

    // ----------------- DEBUGGING ------------------
}