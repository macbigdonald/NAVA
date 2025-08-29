
// GAME STATE

package game.core;

import java.util.List;

public class GameState
{
    // ---------------- DATA MEMBERS ----------------

    private final Player player;
    private Item selectedItem;
    private Equippable selectedEquippable;
    List<? extends Item> selectedItemList;
    List<? extends Equippable> selectedEquippableList;

    // ---------------- CONSTRUCTORS ----------------

    public GameState()
    {
        player = new Player();
        selectedItem = null;
        selectedItemList = null;
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

    public boolean equip(Equippable equippable)
    {
        return player.equip(equippable);
    }

    public boolean unequip(Class<? extends Equippable> type)
    {
        return player.unequip(type);
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

    public <T extends Equippable> T getEquipped(Class<T> type)
    {
        return player.getEquipped(type);
    }

    public <T extends Item> List<T> getList(StorageSlot slot, Class<T> type)
    {
        return player.getList(slot, type);
    }

    public Item get(StorageSlot slot, Class<? extends Item> type, int index)
    {
        return player.get(slot, type, index);
    }

    public int getNumberOf(StorageSlot slot, Class<? extends Item> type)
    {
        return player.getNumberOf(slot, type);
    }

    public int getNumberOfItems(StorageSlot slot)
    {
        return player.getNumberOfItems(slot);
    }

    // todo =====================================================

    public Item getSelectedItem()
    {
        return selectedItem;
    }

    public Equippable getSelectedEquippable()
    {
        return selectedEquippable;
    }

    public List<? extends Item> getSelectedItemList()
    {
        return selectedItemList;
    }

    public List<? extends Equippable> getSelectedEquippableList()
    {
        return selectedEquippableList;
    }

    public void setSelectedItem(Item selectedItem)
    {
        this.selectedItem = selectedItem;
    }

    public void setSelectedEquippable(Equippable selectedEquippable)
    {
        this.selectedEquippable = selectedEquippable;
    }

    public void setSelectedItemList(StorageSlot slot, Class<? extends Item> type)
    {
        this.selectedItemList = player.getList(slot, type);
    }

    public void setSelectedEquippableList(StorageSlot slot, Class<? extends Equippable> type)
    {
        this.selectedEquippableList = player.getList(slot, type);
    }

    // ----------------- DEBUGGING ------------------
}