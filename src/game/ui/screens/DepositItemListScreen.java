
// DEPOSIT ITEM LIST SCREEN

package game.ui.screens;

import game.core.*;
import game.ui.*;

public class DepositItemListScreen extends MenuScreen
{
    // ---------------- DATA MEMBERS ----------------
    // ---------------- CONSTRUCTORS ----------------

    public DepositItemListScreen(GameState gameState)
    {
        super("DEPOSIT ITEM", ScreenFunctions.buildItemList(ScreenType.DEPOSIT, ScreenType.DEPOSIT_ITEM, gameState));
    }

    // ------------------ METHODS -------------------
    // ------------ ACCESSORS / MUTATORS ------------
    // ----------------- DEBUGGING ------------------
}