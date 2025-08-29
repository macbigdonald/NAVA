
// SCREEN FACTORY

package game.ui;

import game.core.*;
import game.ui.screens.*;

public class ScreenFactory
{
    // ---------------- DATA MEMBERS ----------------
    // ---------------- CONSTRUCTORS ----------------
    // ------------------ METHODS -------------------

    public Screen create(ScreenType screenType, GameState gameState)
    {
        Screen screen = switch (screenType) // todo
        {
            case DEBUG_GENERATE -> new DEBUG_GenerateScreen(gameState);
            case MAIN -> new MainScreen();
            case OPTIONS -> new OptionsScreen();
            case HUB -> new HubScreen();
            case CHARACTER -> new CharacterScreen(gameState);
            case EQUIPMENT -> new EquipmentScreen(gameState);
            case EQUIPPABLE_LIST -> new EquippableItemListScreen(gameState);
            case EQUIPPABLE_ITEM -> new EquippableItemScreen(gameState);
            case EQUIPPED_ITEM -> new EquippedItemScreen(gameState);
            case INVENTORY -> new InventoryScreen(gameState);
            case INVENTORY_LIST -> new InventoryItemListScreen(gameState);
            case INVENTORY_ITEM -> new InventoryItemScreen(gameState);
            case STASH -> new StashScreen();
            case DEPOSIT -> new DepositScreen(gameState);
            case DEPOSIT_LIST -> new DepositItemListScreen(gameState);
            case DEPOSIT_ITEM -> new DepositItemScreen(gameState);
            case WITHDRAW -> new WithdrawScreen(gameState);
            case WITHDRAW_ITEM_LIST -> new WithdrawItemListScreen(gameState);
            case WITHDRAW_ITEM -> new WithdrawItemScreen(gameState);
            case SHOP -> new ShopScreen();
            case BUY -> new BuyScreen();
            case SELL -> new SellScreen();
            default -> throw new IllegalArgumentException("Unknown screen type: " + screenType);
        };
        screen.init();
        return screen;
    }

    // ------------ ACCESSORS / MUTATORS ------------
    // ----------------- DEBUGGING ------------------
}