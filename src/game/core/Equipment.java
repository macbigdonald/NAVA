
// EQUIPMENT

package game.core;

import java.util.*;

    /**
     * <p>Equipment class. Represents the player's {@code Item} gear slots.
     * <p>Maintains a mapping of {@code Item} types (classes) to their equipped {@code Item} instance.
     * <p>Provides API logic for equipping, unequipping, and querying of {@code Equipment} items.
     */
public final class Equipment
{
    // ------------------- FIELDS ------------------- todo

    /**
     * A map of {@code Item} classes to their equipped {@code Item} instances.
     */
    private final Map<Class<? extends Equippable>, Equippable> slots;

    // ---------------- CONSTRUCTORS ---------------- todo

    /**
     * Constructs a new {@code Equipment} instance with an empty slot mapping and no equipped items.
     */
    public Equipment()
    {
        slots = new HashMap<>();
    }

    // --------------- PUBLIC METHODS ---------------

    /**
     * Equips the specified {@code Item} to its slot.
     *
     * @param item the specified {@code Item}
     */
    public void equip(Equippable item)
    {
        slots.put(item.baseType(), item);
    }

    /**
     * Unequips the {@code Item} of the specified {@code Class}.
     *
     * @param type the specified {@code Class}
     */
    public void unequip(Class<? extends Equippable> type)
    {
        slots.remove(type);
    }

    /**
     * Returns whether {@code boolean} an item of the specified {@code Class} is equipped.
     *
     * @param type the specified {@code Class}
     * @return whether {@code boolean} the item of the {@code Class} is equipped
     */
    public boolean isEquipped(Class<? extends Equippable> type)
    {
        return slots.get(type) != null;
    }

    // -------------- PRIVATE METHODS ---------------
    // ------------ ACCESSORS / MUTATORS ------------

    /**
     * Returns the equipped {@code Item} of the specified {@code Class}.
     *
     * @param key the specified {@code Class}
     * @param <T> the specified {@code Item}
     * @return the equipped {@code Item} of the class, or {@code null} if none is equipped
     */
    public <T extends Equippable> T get(Class<T> key)
    {
        return key.cast(slots.get(key));
    }

    // ----------------- DEBUGGING ------------------
}