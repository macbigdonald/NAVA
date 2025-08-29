
// DEPOSIT SCREEN

package game.ui.screens;

import game.core.*;
import game.ui.*;

public class DepositScreen extends MenuScreen
{
    // ---------------- DATA MEMBERS ----------------
    // ---------------- CONSTRUCTORS ----------------

    public DepositScreen(GameState gameState)
    {
        super("STASH (DEPOSIT)", new MenuChoice[]
        {
            new MenuChoice("WEAPONS", ScreenType.DEPOSIT_LIST,
                () -> gameState.setSelectedItemList(StorageSlot.INVENTORY, Weapon.class)),
            new MenuChoice("ARMOR", ScreenType.DEPOSIT_LIST,
                () -> gameState.setSelectedItemList(StorageSlot.INVENTORY, Armor.class)),
            new MenuChoice("JUNK", ScreenType.DEPOSIT_LIST,
                () -> gameState.setSelectedItemList(StorageSlot.INVENTORY, Junk.class)),
            new MenuChoice("(BACK)", ScreenType.STASH)
        });
    }

    // ------------------ METHODS -------------------
    // ------------ ACCESSORS / MUTATORS ------------
    // ----------------- DEBUGGING ------------------
}