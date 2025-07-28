
// STORAGE

package game.core;

import java.util.ArrayList;
import java.util.EnumMap;

// TODO : sorting

public class Storage
{
    // ---------------- DATA MEMBERS ----------------

    private final EnumMap<ItemType, ArrayList<Item>> storageMap;
    private final int capacity;

    // ---------------- CONSTRUCTORS ----------------

    public Storage()
    {
        storageMap = new EnumMap<>(ItemType.class);
        storageMap.put(ItemType.WEAPON, new ArrayList<>());
        storageMap.put(ItemType.ARMOR, new ArrayList<>());
        storageMap.put(ItemType.JUNK, new ArrayList<>());
        capacity = 10;
    }

    // ------------------ METHODS -------------------

    public void add(Item item)
    {
        storageMap.get(item.getType()).add(item);
    }

    public void remove(Item item)
    {
        storageMap.get(item.getType()).remove(item);
    }

    public boolean contains(Item item)
    {
        return storageMap.get(item.getType()).contains(item);
    }

    public boolean isFull()
    {
        return (getNumberOfItems() > capacity);
    }

    // ------------ ACCESSORS / MUTATORS ------------

    public ArrayList<Item> getList(ItemType type)
    {
        return new ArrayList<>(storageMap.get(type));
    }

    public Item get(ItemType type, int index)
    {
        ArrayList<Item> list = storageMap.get(type);
        if (index >= 0 && index < list.size())
            return list.get(index);
        return null;
    }

    public int getNumberOf(ItemType type)
    {
        return storageMap.get(type).size();
    }

    public int getNumberOfItems()
    {
        return storageMap.get(ItemType.WEAPON).size()
             + storageMap.get(ItemType.ARMOR).size()
             + storageMap.get(ItemType.JUNK).size();
    }

    // ----------------- DEBUGGING ------------------
}