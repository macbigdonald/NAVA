
// ITEM MANAGER

package game.core;

import java.util.EnumMap;
import java.util.Map;
import java.util.List;

/**
 * <p>Item Manager class. Represents the control center for {@code Item} management.
 * <p>Manages all {@code Item} containers for the player, including the inventory, the stash, and the equipment slots.
 * <p>Provides API logic for adding, removing, moving, equipping, unequipping, querying and retrieving {@code Equipment}
 * and {@code Storage} items.
 */
public final class ItemManager
{
    // ------------------- FIELDS -------------------

    /**
     * A map of each storage {@code Slot} to its {@code Storage} instance.
     */
    private final Map<StorageSlot, Storage> storages;
    /**
     * A map of each storage {@code Slot} to its capacity {@code int} limit.
     */
    private final Map<StorageSlot, Integer> capacity;
    private final Equipment equipment;

    // ---------------- CONSTRUCTORS ----------------

    /**
     * Constructs a new {@code ItemManager} instance with empty {@code Equipment} and {@code Storage} containers, and
     * default capacity limits.
     */
    public ItemManager()
    {
        equipment = new Equipment();
        storages = new EnumMap<>(StorageSlot.class);
        capacity = new EnumMap<>(StorageSlot.class);
        storages.put(StorageSlot.INVENTORY, new Storage());
        storages.put(StorageSlot.STASH, new Storage());
        capacity.put(StorageSlot.INVENTORY, 10);
        capacity.put(StorageSlot.STASH, 5);
    }

    // --------------- PUBLIC METHODS ---------------

    /**
     * Attempts to add the specified {@code Item} to the inventory.
     *
     * @param item the specified {@code Item}
     * @return whether {@code boolean} the item was successfully added
     */
    public boolean addToInventory(Item item)
    {
        if (item == null) return false;
        if (isFull(StorageSlot.INVENTORY)) return false;
        storageFor(StorageSlot.INVENTORY).add(item);
        return true;
    }

    /**
     * Attempts to remove the specified {@code Item} from the inventory.
     *
     * @param item the specified {@code Item}
     * @return whether {@code boolean} the item was successfully removed
     */
    public boolean removeFromInventory(Item item)
    {
        if (item == null) return false;
        final Storage inventory = storageFor(StorageSlot.INVENTORY);
        if (!inventory.contains(item)) return false;
        inventory.remove(item);
        return true;
    }

    /**
     * Attempts to move the specified {@code Item} from the inventory into the stash.
     *
     * @param item the specified {@code Item}
     * @return whether {@code boolean} the item was successfully moved into the stash
     */
    public boolean putIntoStash(Item item)
    {
        if (item == null) return false;
        final Storage inventory = storageFor(StorageSlot.INVENTORY);
        if (!inventory.contains(item)) return false;
        if (isFull(StorageSlot.STASH)) return false;
        storageFor(StorageSlot.STASH).add(item);
        inventory.remove(item);
        return true;
    }

    /**
     * Attempts to move the specified {@code Item} from the stash back into the inventory.
     *
     * @param item the specified {@code Item}
     * @return whether {@code boolean} the item was successfully moved into the inventory
     */
    public boolean takeFromStash(Item item)
    {
        if (item == null) return false;
        final Storage stash = storageFor(StorageSlot.STASH);
        if (!stash.contains(item)) return false;
        if (isFull(StorageSlot.INVENTORY)) return false;
        storageFor(StorageSlot.INVENTORY).add(item);
        stash.remove(item);
        return true;
    }

    /**
     * Attempts to equip the specified {@code Item} from the inventory.
     *
     * @param item the specified {@code Item}
     * @return whether {@code boolean} the item was successfully equipped
     */
    public boolean equip(Equippable item)
    {
        if (item == null) return false;
        final Storage inventory = storageFor(StorageSlot.INVENTORY);
        if (!inventory.contains(item)) return false;
        final Class<? extends Equippable> type = item.baseType();
        final Equippable previous = equipment.get(type);
        inventory.remove(item);
        if (previous != null)
        {
            equipment.unequip(type);
            inventory.add(previous);
        }
        equipment.equip(item);
        return true;
    }

    /**
     * Attempts to unequip the currently equipped {@code Item} of the specified {@code Class}.
     *
     * @param type the specified {@code Class}
     * @return whether {@code boolean} the item was successfully unequipped
     */
    public boolean unequip(Class<? extends Equippable> type)
    {
        if (type == null) return false;
        final Equippable previous = equipment.get(type);
        if (previous == null) return false;
        if (isFull(StorageSlot.INVENTORY)) return false;
        storageFor(StorageSlot.INVENTORY).add(previous);
        equipment.unequip(type);
        return true;
    }

    // -------------- PRIVATE METHODS ---------------

    /**
     * Returns the {@code Storage} at the specified {@code Slot}.
     *
     * @param slot the specified {@code Slot}
     * @return the reference to the {@code Storage}
     * @throws NullPointerException if the {@code slot} is {@code null}, or if its {@code Storage} is {@code null}
     */
    private Storage storageFor(StorageSlot slot)
    {
        if (slot == null) throw new NullPointerException("slot is null");
        Storage storage = storages.get(slot);
        if (storage == null) throw new NullPointerException(slot + " storage is null");
        return storage;
    }

    /**
     * Returns whether {@code boolean} the storage at the specified {@code Slot} has reached capacity.
     *
     * @param slot the specified {@code Slot}
     * @return whether {@code boolean} the storage is full
     * @throws IllegalStateException if the capacity of the {@code slot} is {@code null}
     */
    private boolean isFull(StorageSlot slot)
    {
        Integer cap = capacity.get(slot);
        if (cap == null) throw new IllegalStateException(slot + " capacity is null");
        return storageFor(slot).getNumberOfItems() >= cap;
    }

    // ------------ ACCESSORS / MUTATORS ------------

    /**
     * Returns the equipped {@code Item} of the specified {@code Class}.
     *
     * @param type the specified {@code Class}
     * @param <T>  the {@code Class} of the item
     * @return the reference to the equipped {@code Item}, or {@code null} if none is equipped
     * @throws NullPointerException if the {@code type} is {@code null}
     */
    public <T extends Equippable> T getEquipped(Class<T> type)
    {
        if (type == null) throw new NullPointerException("type is null");
        return type.cast(equipment.get(type));
    }

    /**
     * Returns the {@code Item} of a specified {@code Class} at the given index in the storage of a certain
     * {@code Slot}.
     *
     * @param slot  the specified {@code Slot}
     * @param type  the specified {@code Class}
     * @param index the specified index {@code int}
     * @param <T>   the {@code Class} of the item
     * @return the reference to the {@code Item} at the index
     * @throws NullPointerException if the {@code type} is {@code null}
     */
    public <T extends Item> T get(StorageSlot slot, Class<T> type, int index)
    {
        if (type == null) throw new NullPointerException("type is null");
        return storageFor(slot).get(type, index);
    }

    /**
     * Returns a {@code List} of all items of the specified {@code Class} in the storage of the given {@code Slot}.
     *
     * @param slot the specified {@code Slot}
     * @param type the specified {@code Class}
     * @param <T>  the {@code Class} of the item
     * @return the {@code List} of all items of the class
     * @throws NullPointerException if the {@code type} is {@code null}
     */
    public <T extends Item> List<T> getList(StorageSlot slot, Class<T> type)
    {
        if (type == null) throw new NullPointerException("type is null");
        return storageFor(slot).getList(type);
    }

    /**
     * Returns the number {@code int} of items of the specified {@code Class} in the storage of the given {@code Slot}.
     *
     * @param slot the specified {@code Slot}
     * @param type the specified {@code Class}
     * @return the number {@code int} of items of the class
     * @throws NullPointerException if the {@code type} is {@code null}
     */
    public int getNumberOf(StorageSlot slot, Class<? extends Item> type)
    {
        if (type == null) throw new NullPointerException("type is null");
        return storageFor(slot).getNumberOf(type);
    }

    /**
     * Returns the number {@code int} of all items in the storage of the specified {@code Slot}.
     *
     * @param slot the specified {@code Slot}
     * @return the number {@code int} of items in the storage
     */
    public int getNumberOfItems(StorageSlot slot)
    {
        return storageFor(slot).getNumberOfItems();
    }

    // ----------------- DEBUGGING ------------------
}