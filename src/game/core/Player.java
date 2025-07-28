
// PLAYER

package game.core;

import java.util.ArrayList;

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

    public boolean equip(Item item)
    {
        return itemManager.equip(item);
    }

    public boolean unequip(Item item)
    {
        return itemManager.unequip(item);
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

    public Item getEquipped(ItemType type)
    {
        return itemManager.getEquipped(type);
    }

    public ArrayList<Item> getInventoryList(ItemType type)
    {
        return itemManager.getInventoryList(type);
    }

    public Item getInventory(ItemType type, int index)
    {
        return itemManager.getInventory(type, index);
    }

    public Item getStash(ItemType type, int index)
    {
        return itemManager.getStash(type, index);
    }

    public int getNumberOfInventory(ItemType type)
    {
        return itemManager.getNumberOfInventory(type);
    }

    public int getNumberOfStash(ItemType type)
    {
        return itemManager.getNumberOfStash(type);
    }

    public int getNumberOfInventoryItems()
    {
        return itemManager.getNumberOfInventoryItems();
    }

    public int getNumberOfStashItems()
    {
        return itemManager.getNumberOfStashItems();
    }

    // ----------------- DEBUGGING ------------------
}