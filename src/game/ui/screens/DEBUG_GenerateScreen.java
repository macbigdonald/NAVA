
// DEBUG (GENERATE SCREEN)

package game.ui.screens;

import game.core.*;
import game.ui.*;

public class DEBUG_GenerateScreen extends MenuScreen
{
    // ---------------- DATA MEMBERS ----------------
    // ---------------- CONSTRUCTORS ----------------

    public DEBUG_GenerateScreen(GameState gameState)
    {
        super("GENERATE ITEMS", new MenuChoice[]
        {
            new MenuChoice("GENERATE WEAPON", ScreenType.STAY, () -> gameState.addToInventory(new Weapon())),
            new MenuChoice("GENERATE ARMOR", ScreenType.STAY, () -> gameState.addToInventory(new Armor())),
            new MenuChoice("GENERATE JUNK", ScreenType.STAY, () -> gameState.addToInventory(new Junk())),
            new MenuChoice("(BACK)", ScreenType.HUB)
        });
    }

    // ------------------ METHODS -------------------
    // ----------------- DEBUGGING ------------------
}