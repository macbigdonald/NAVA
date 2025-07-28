
// DEPOSIT JUNK SCREEN

package game.ui.screens;

import game.core.GameState;
import game.core.Junk;
import game.ui.MenuChoice;
import game.ui.MenuScreen;
import game.ui.ScreenType;

public class DepositJunkScreen extends MenuScreen
{
    // ---------------- DATA MEMBERS ----------------
    // ---------------- CONSTRUCTORS ----------------

    public DepositJunkScreen(GameState gameState)
    {
        super(buildTitle(gameState), buildSections(gameState), buildChoices(gameState));
    }

    // ------------------ METHODS -------------------

    private static String buildTitle(GameState gameState)
    {
        Junk selectedJunk = gameState.getSelectedJunk();
        if (selectedJunk != null)
            return selectedJunk.getName();
        else
            return "JUNK";
    }

    private static String[] buildSections(GameState gameState)
    {
        Junk selectedJunk = gameState.getSelectedJunk();
        if (selectedJunk != null)
            return new String[]{selectedJunk.toString()};
        else
            return null;
    }

    private static MenuChoice[] buildChoices(GameState gameState)
    {
        Junk selectedJunk = gameState.getSelectedJunk();
        if (selectedJunk != null)
            return new MenuChoice[]
            {
                new MenuChoice("MOVE TO STASH", ScreenType.DEPOSIT_JUNK, () ->
                {
                    if (gameState.putIntoStash(selectedJunk))
                        gameState.setSelectedJunk(null);
                }),
                new MenuChoice("(BACK)", ScreenType.DEPOSIT_JUNK_LIST)
            };
        else
            return new MenuChoice[]
            {
                new MenuChoice("(BACK)", ScreenType.DEPOSIT_JUNK_LIST)
            };
    }

    // ------------ ACCESSORS / MUTATORS ------------
    // ----------------- DEBUGGING ------------------
}