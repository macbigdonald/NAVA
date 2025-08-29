
// WEAPON

package game.core;

// TODO : generation

public class Weapon extends Equippable
{
    // ------------------- FIELDS -------------------

    private final int damage;

    // ---------------- CONSTRUCTORS ----------------

    public Weapon()
    {
        super();
        damage = 0;
    }

    // ------------------ METHODS -------------------
    // ------------ ACCESSORS / MUTATORS ------------

    @Override
    public Class<? extends Equippable> baseType()
    {
        return Weapon.class;
    }

    // ----------------- DEBUGGING ------------------
}