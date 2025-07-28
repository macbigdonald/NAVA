
// WEAPON

package game.core;

// TODO : generation

public class Weapon extends Item
{
    // ---------------- DATA MEMBERS ----------------

    private final int damage;

    // ---------------- CONSTRUCTORS ----------------

    public Weapon()
    {
        super();
        damage = 0;
    }

    // ------------------ METHODS -------------------

    @Override
    public String toString()
    {
        return "DAMAGE: " + damage;
    }

    // ------------ ACCESSORS / MUTATORS ------------

    @Override
    public ItemType getType()
    {
        return ItemType.WEAPON;
    }

    // ----------------- DEBUGGING ------------------
}