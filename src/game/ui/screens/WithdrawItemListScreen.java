
// WITHDRAW ITEM LIST SCREEN

package game.ui.screens;

import game.core.*;
import game.ui.*;

public class WithdrawItemListScreen extends MenuScreen
{
    // ---------------- DATA MEMBERS ----------------
    // ---------------- CONSTRUCTORS ----------------

    public WithdrawItemListScreen(GameState gameState)
    {
        super("WITHDRAW ITEM", ScreenFunctions.buildItemList(ScreenType.WITHDRAW, ScreenType.WITHDRAW_ITEM, gameState));
    }

    // ------------------ METHODS -------------------
    // ------------ ACCESSORS / MUTATORS ------------
    // ----------------- DEBUGGING ------------------
}