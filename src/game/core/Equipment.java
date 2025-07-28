
// EQUIPMENT

package game.core;

import java.util.EnumMap;

public class Equipment
{
    // ---------------- DATA MEMBERS ----------------

    private final EnumMap<ItemType, Item> equipmentMap;

    // ---------------- CONSTRUCTORS ----------------

    public Equipment()
    {
        equipmentMap = new EnumMap<>(ItemType.class);
        equipmentMap.put(ItemType.WEAPON, null);
        equipmentMap.put(ItemType.ARMOR, null);
    }

    // ------------------ METHODS -------------------

    public void add(Item item)
    {
        ItemType type = item.getType();
        if (type.isEquippable())
            equipmentMap.put(type, item);
    }

    public void remove(Item item)
    {
        ItemType type = item.getType();
        if (equipmentMap.get(type) == item)
            equipmentMap.remove(type, item);
    }

    public boolean contains(Item item)
    {
        return equipmentMap.get(item.getType()) == item;
    }

    // ------------ ACCESSORS / MUTATORS ------------ todo

    public Item get(ItemType type)
    {
        return equipmentMap.get(type);
    }

    // ----------------- DEBUGGING ------------------
}