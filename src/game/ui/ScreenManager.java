
// SCREEN MANAGER

package game.ui;

import game.core.GameState;

// TODO : game state

public class ScreenManager
{
    // ---------------- DATA MEMBERS ----------------

    private final GameState gameState;
    private final ScreenFactory screenFactory;
    private Screen currentScreen;

    // ---------------- CONSTRUCTORS ----------------

    public ScreenManager(GameState gameState)
    {
        this.gameState = gameState;
        screenFactory = new ScreenFactory();
        currentScreen = screenFactory.create(ScreenType.MAIN, gameState);
    }

    // ------------------ METHODS -------------------

    public void render()
    {
        currentScreen.render();
    }

    public boolean update(String input)
    {
        ScreenType screenType = currentScreen.handle(input);         // screen type is changed
        if (screenType == ScreenType.STAY) return true;              // current screen won't be changed below
        if (screenType == ScreenType.EXIT) return false;             // game loop will break
        currentScreen = screenFactory.create(screenType, gameState); // current screen is changed
        return true;
    }

    // ------------ ACCESSORS / MUTATORS ------------
    // ----------------- DEBUGGING ------------------
}