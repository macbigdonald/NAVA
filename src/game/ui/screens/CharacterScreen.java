
// CHARACTER SCREEN

package game.ui.screens;

import game.core.GameState;
import game.ui.MenuChoice;
import game.ui.MenuScreen;
import game.ui.ScreenType;

// TODO : level up

public class CharacterScreen extends MenuScreen
{
    // ---------------- DATA MEMBERS ----------------
    // ---------------- CONSTRUCTORS ----------------

    public CharacterScreen(GameState gameState)
    {
        super("CHARACTER", buildSections(gameState), buildChoices(gameState));
    }

    // ------------------ METHODS -------------------

    private static String stats(GameState gameState) // TODO : move
    {
        return "STRENGTH: " + gameState.getStrength()
                + "\nENDURANCE: " + gameState.getEndurance()
                + "\nAGILITY: " + gameState.getAgility()
                + "\nINTELLECT: " + gameState.getIntellect();
    }

    private static String[] buildSections(GameState gameState) // also pass String[] sections
    {
        return new String[]{stats(gameState)};
    }

    private static MenuChoice[] buildChoices(GameState gameState)
    {
        return new MenuChoice[]
        {
            // new MenuChoice("LEVEL UP", ScreenType.LEVEL), <----- todo
            new MenuChoice("(BACK)", ScreenType.HUB)
        };
    }

    // ------------ ACCESSORS / MUTATORS ------------
    // ----------------- DEBUGGING ------------------
}