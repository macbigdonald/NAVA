
// GAME STATE

package game.core;

import java.util.ArrayList;

public class GameState
{
    // ---------------- DATA MEMBERS ----------------

    private final Player player;
    private Item selectedItem;
    ArrayList<Item> selectedList;

    // ---------------- CONSTRUCTORS ----------------

    public GameState()
    {
        player = new Player();
        selectedItem = null;
        selectedList = null;
    }

// ------------------ METHODS -------------------

    public boolean addToInventory(Item item)
    {
        return player.addToInventory(item);
    }

    public boolean removeFromInventory(Item item)
    {
        return player.removeFromInventory(item);
    }

    public boolean putIntoStash(Item item)
    {
        return player.putIntoStash(item);
    }

    public boolean takeFromStash(Item item)
    {
        return player.takeFromStash(item);
    }

    public boolean equip(Item item)
    {
        return player.equip(item);
    }

    public boolean unequip(Item item)
    {
        return player.unequip(item);
    }

    // ------------ ACCESSORS / MUTATORS ------------

    public int getStrength()
    {
        return player.getStrength();
    }

    public int getEndurance()
    {
        return player.getEndurance();
    }

    public int getAgility()
    {
        return player.getAgility();
    }

    public int getIntellect()
    {
        return player.getIntellect();
    }

    public Item getEquipped(ItemType type)
    {
        return player.getEquipped(type);
    }

    public ArrayList<Item> getInventoryList(ItemType type)
    {
        return player.getInventoryList(type);
    }

    public Item getInventory(ItemType type, int index)
    {
        return player.getInventory(type, index);
    }

    public Item getStash(ItemType type, int index)
    {
        return player.getStash(type, index);
    }

    public int getNumberOfInventory(ItemType type)
    {
        return player.getNumberOfInventory(type);
    }

    public int getNumberOfStash(ItemType type)
    {
        return player.getNumberOfStash(type);
    }

    public int getNumberOfInventoryItems()
    {
        return player.getNumberOfInventoryItems();
    }

    public int getNumberOfStashItems()
    {
        return player.getNumberOfStashItems();
    }

    // todo =====================================================

    public Item getSelectedItem()
    {
        return selectedItem;
    }

    public ArrayList<Item> getSelectedList()
    {
        return selectedList;
    }

    public void setSelectedItem(Item selectedItem)
    {
        this.selectedItem = selectedItem;
    }

    public void setSelectedList(ItemType type)
    {
        this.selectedList = player.getInventoryList(type);
    }

    // ----------------- DEBUGGING ------------------
}