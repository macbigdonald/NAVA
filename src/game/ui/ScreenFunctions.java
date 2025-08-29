
// SCREEN FUNCTIONS

package game.ui;

import game.core.*;
import java.util.List;

public class ScreenFunctions
{
    public static MenuChoice[] buildItemList(ScreenType previousScreen, ScreenType nextScreen, GameState gameState)
    {
        List<? extends Item> list = gameState.getSelectedItemList();
        int numberOfItems = list.size();
        MenuChoice[] menuChoices = new MenuChoice[numberOfItems + 1];
        for (int i = 0; i < numberOfItems; i++)
        {
            Item item = list.get(i);
            menuChoices[i] = new MenuChoice(item.toString(), nextScreen, () -> gameState.setSelectedItem(item));
        }
        menuChoices[numberOfItems] = new MenuChoice("(BACK)", previousScreen);
        return menuChoices;
    }

    public static MenuChoice[] buildEquippableList(ScreenType previousScreen, ScreenType nextScreen, GameState gameState)
    {
        List<? extends Equippable> list = gameState.getSelectedEquippableList();
        int numberOfItems = list.size();
        MenuChoice[] menuChoices = new MenuChoice[numberOfItems + 1];
        for (int i = 0; i < numberOfItems; i++)
        {
            Equippable item = list.get(i);
            menuChoices[i] = new MenuChoice(item.toString(), nextScreen, () -> gameState.setSelectedEquippable(item));
        }
        menuChoices[numberOfItems] = new MenuChoice("(BACK)", previousScreen);
        return menuChoices;
    }
}