
// ITEM TYPE

package game.core;

public enum ItemType
{
    WEAPON(true),
    ARMOR(true),
    JUNK(false);

    // ---------------- DATA MEMBERS ----------------

    private final boolean equippable;

    // ---------------- CONSTRUCTORS ----------------

    ItemType(boolean equippable)
    {
        this.equippable = equippable;
    }

    // ------------------ METHODS -------------------
    // ------------ ACCESSORS / MUTATORS ------------

    public boolean isEquippable()
    {
        return equippable;
    }

    // ----------------- DEBUGGING ------------------
}