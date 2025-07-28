
// ITEM MANAGER

package game.core;

import java.util.ArrayList;

public class ItemManager
{
    // ---------------- DATA MEMBERS ----------------

    private final Equipment equipment;
    private final Storage inventory;
    private final Storage stash;

    // ---------------- CONSTRUCTORS ----------------

    public ItemManager()
    {
        equipment = new Equipment();
        inventory = new Storage();
        stash = new Storage();
    }

    // ------------------ METHODS -------------------

    public boolean addToInventory(Item item)
    {
        if (!inventory.isFull())
        {
            inventory.add(item);
            return true;
        }
        return false;
    }

    public boolean removeFromInventory(Item item)
    {
        if (inventory.contains(item))
        {
            inventory.remove(item);
            return true;
        }
        return false;
    }

    public boolean putIntoStash(Item item)
    {
        if (inventory.contains(item) && !stash.isFull())
        {
            inventory.remove(item);
            stash.add(item);
            return true;
        }
        return false;
    }

    public boolean takeFromStash(Item item)
    {
        if (stash.contains(item) && !inventory.isFull())
        {
            stash.remove(item);
            inventory.add(item);
            return true;
        }
        return false;
    }

    public boolean equip(Item item)
    {
        if (inventory.contains(item))
        {
            inventory.remove(item);
            Item previous = equipment.get(item.getType());
            if (previous != null)
                inventory.add(previous);
            equipment.add(item);
            return true;
        }
        return false;
    }

    public boolean unequip(Item item)
    {
        if (equipment.contains(item) && !inventory.isFull())
        {
            equipment.remove(item);
            inventory.add(item);
            return true;
        }
        return false;
    }

    // ------------ ACCESSORS / MUTATORS ------------

    public Item getEquipped(ItemType type)
    {
        return equipment.get(type);
    }

    public ArrayList<Item> getInventoryList(ItemType type)
    {
        return inventory.getList(type);
    }

    public Item getInventory(ItemType type, int index)
    {
        return inventory.get(type, index);
    }

    public Item getStash(ItemType type, int index)
    {
        return stash.get(type, index);
    }

    public int getNumberOfInventory(ItemType type)
    {
        return inventory.getNumberOf(type);
    }

    public int getNumberOfStash(ItemType type)
    {
        return stash.getNumberOf(type);
    }

    public int getNumberOfInventoryItems()
    {
        return inventory.getNumberOfItems();
    }

    public int getNumberOfStashItems()
    {
        return stash.getNumberOfItems();
    }

    // ----------------- DEBUGGING ------------------
}