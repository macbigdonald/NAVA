
// CHARACTER SCREEN

package game.ui.screens;

import game.core.GameState;
import game.ui.*;

// TODO : level up

public class CharacterScreen extends MenuScreen
{
    // ---------------- DATA MEMBERS ----------------
    // ---------------- CONSTRUCTORS ----------------

    public CharacterScreen(GameState gameState)
    {
        super("CHARACTER", new String[]{stats(gameState)}, new MenuChoice[]
        {
            // new MenuChoice("LEVEL UP", ScreenType.LEVEL), <----- todo
            new MenuChoice("(BACK)", ScreenType.HUB)
        });
    }

    // ------------------ METHODS -------------------

    private static String stats(GameState gameState) // TODO : move
    {
        return "STRENGTH: " + gameState.getStrength()
                + "\nENDURANCE: " + gameState.getEndurance()
                + "\nAGILITY: " + gameState.getAgility()
                + "\nINTELLECT: " + gameState.getIntellect();
    }

    // ------------ ACCESSORS / MUTATORS ------------
    // ----------------- DEBUGGING ------------------
}