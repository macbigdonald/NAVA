
// WITHDRAW SCREEN

package game.ui.screens;

import game.core.*;
import game.ui.*;

public class WithdrawScreen extends MenuScreen
{
    // ---------------- DATA MEMBERS ----------------
    // ---------------- CONSTRUCTORS ----------------

    public WithdrawScreen(GameState gameState)
    {
        super("STASH (WITHDRAW)", new MenuChoice[]
        {
            new MenuChoice("WEAPONS", ScreenType.WITHDRAW_ITEM_LIST,
                () -> gameState.setSelectedItemList(StorageSlot.STASH, Weapon.class)),
            new MenuChoice("ARMOR", ScreenType.WITHDRAW_ITEM_LIST,
                () -> gameState.setSelectedItemList(StorageSlot.STASH, Armor.class)),
            new MenuChoice("JUNK", ScreenType.WITHDRAW_ITEM_LIST,
                () -> gameState.setSelectedItemList(StorageSlot.STASH, Junk.class)),
            new MenuChoice("(BACK)", ScreenType.STASH)
        });
    }

    // ------------------ METHODS -------------------
    // ------------ ACCESSORS / MUTATORS ------------
    // ----------------- DEBUGGING ------------------
}