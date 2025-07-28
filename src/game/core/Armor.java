
// ARMOR

package game.core;

// TODO : generation

public class Armor extends Item
{
    // ---------------- DATA MEMBERS ----------------

    private final int reduction;

    // ---------------- CONSTRUCTORS ----------------

    public Armor()
    {
        super();
        reduction = 0;
    }

    // ------------------ METHODS -------------------

    @Override
    public String toString()
    {
        return "REDUCTION: " + reduction;
    }

    // ------------ ACCESSORS / MUTATORS ------------

    @Override
    public ItemType getType()
    {
        return ItemType.ARMOR;
    }

    // ----------------- DEBUGGING ------------------
}