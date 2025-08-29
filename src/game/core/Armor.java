
// ARMOR

package game.core;

// TODO : generation

public class Armor extends Equippable
{
    // ------------------- FIELDS -------------------

    private final int reduction;

    // ---------------- CONSTRUCTORS ----------------

    public Armor()
    {
        super();
        reduction = 0;
    }

    // ------------------ METHODS -------------------
    // ------------ ACCESSORS / MUTATORS ------------

    @Override
    public Class<? extends Equippable> baseType()
    {
        return Armor.class;
    }

    // ----------------- DEBUGGING ------------------
}