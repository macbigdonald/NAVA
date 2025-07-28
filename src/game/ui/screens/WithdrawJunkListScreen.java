
// WITHDRAW JUNK LIST SCREEN

package game.ui.screens;

import game.core.GameState;
import game.core.Junk;
import game.ui.MenuChoice;
import game.ui.MenuScreen;
import game.ui.ScreenType;

public class WithdrawJunkListScreen extends MenuScreen
{
    // ---------------- DATA MEMBERS ----------------
    // ---------------- CONSTRUCTORS ----------------

    public WithdrawJunkListScreen(GameState gameState)
    {
        super("WITHDRAW JUNK", buildChoices(gameState));
    }

    // ------------------ METHODS -------------------

    private static MenuChoice[] buildChoices(GameState gameState)
    {
        int numberOfJunks = gameState.getNumberOfStashJunks();
        MenuChoice[] choices = new MenuChoice[numberOfJunks + 1];
        for (int i = 0; i < numberOfJunks; i++)
        {
            Junk stashJunk = gameState.getStashJunk(i);
            choices[i] = new MenuChoice(stashJunk.getName(), ScreenType.WITHDRAW_JUNK,
                () -> gameState.setSelectedJunk(stashJunk));
        }
        choices[numberOfJunks] = new MenuChoice("(BACK)", ScreenType.WITHDRAW);
        return choices;
    }

    // ------------ ACCESSORS / MUTATORS ------------
    // ----------------- DEBUGGING ------------------
}