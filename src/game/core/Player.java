
// PLAYER

package game.core;

import java.util.List;

public class Player
{
    // ---------------- DATA MEMBERS ---------------- todo : stats map

    private final ItemManager itemManager;
    private int strength;
    private int endurance;
    private int agility;
    private int intellect;

    // ---------------- CONSTRUCTORS ----------------

    public Player()
    {
        itemManager = new ItemManager();
        strength = 0;
        endurance = 0;
        agility = 0;
        intellect = 0;
    }

    // ------------------ METHODS -------------------

    public boolean addToInventory(Item item)
    {
        return itemManager.addToInventory(item);
    }

    public boolean removeFromInventory(Item item)
    {
        return itemManager.removeFromInventory(item);
    }

    public boolean putIntoStash(Item item)
    {
        return itemManager.putIntoStash(item);
    }

    public boolean takeFromStash(Item item)
    {
        return itemManager.takeFromStash(item);
    }

    public boolean equip(Equippable equippable)
    {
        return itemManager.equip(equippable);
    }

    public boolean unequip(Class<? extends Equippable> type)
    {
        return itemManager.unequip(type);
    }

    // ------------ ACCESSORS / MUTATORS ------------

    public int getStrength()
    {
        return strength;
    }

    public int getEndurance()
    {
        return endurance;
    }

    public int getAgility()
    {
        return agility;
    }

    public int getIntellect()
    {
        return intellect;
    }

    public <T extends Equippable> T getEquipped(Class<T> type)
    {
        return itemManager.getEquipped(type);
    }

    public <T extends Item> List<T> getList(StorageSlot slot, Class<T> type)
    {
        return itemManager.getList(slot, type);
    }

    public Item get(StorageSlot slot, Class<? extends Item> type, int index)
    {
        return itemManager.get(slot, type, index);
    }

    public int getNumberOf(StorageSlot slot, Class<? extends Item> type)
    {
        return itemManager.getNumberOf(slot, type);
    }

    public int getNumberOfItems(StorageSlot slot)
    {
        return itemManager.getNumberOfItems(slot);
    }

    // ----------------- DEBUGGING ------------------
}