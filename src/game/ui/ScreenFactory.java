
// SCREEN FACTORY

package game.ui;

import game.core.GameState;
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
            case EQUIPPED_ITEM -> new EquippedItemScreen(gameState);
            case INVENTORY -> new InventoryScreen(gameState);
            case INVENTORY_ITEM_LIST -> new InventoryItemListScreen(gameState);
            case INVENTORY_ITEM -> new InventoryEquippableItemScreen(gameState);
            case STASH -> new StashScreen();
            case DEPOSIT -> new DepositScreen();
            case DEPOSIT_WEAPON_LIST -> new DepositWeaponListScreen(gameState);
            case DEPOSIT_ARMOR_LIST -> new DepositArmorListScreen(gameState);
            case DEPOSIT_JUNK_LIST -> new DepositJunkListScreen(gameState);
            case DEPOSIT_WEAPON -> new DepositWeaponScreen(gameState);
            case DEPOSIT_ARMOR -> new DepositArmorScreen(gameState);
            case DEPOSIT_JUNK -> new DepositJunkScreen(gameState);
            case WITHDRAW -> new WithdrawScreen();
            case WITHDRAW_WEAPON_LIST -> new WithdrawWeaponListScreen(gameState);
            case WITHDRAW_ARMOR_LIST -> new WithdrawArmorListScreen(gameState);
            case WITHDRAW_JUNK_LIST -> new WithdrawJunkListScreen(gameState);
            case WITHDRAW_WEAPON -> new WithdrawWeaponScreen(gameState);
            case WITHDRAW_ARMOR -> new WithdrawArmorScreen(gameState);
            case WITHDRAW_JUNK -> new WithdrawJunkScreen(gameState);
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