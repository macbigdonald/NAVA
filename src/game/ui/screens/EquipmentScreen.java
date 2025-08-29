
// EQUIPMENT SCREEN

package game.ui.screens;

import game.core.*;
import game.ui.*;

public class EquipmentScreen extends MenuScreen
{
    // ---------------- DATA MEMBERS ----------------
    // ---------------- CONSTRUCTORS ----------------

    public EquipmentScreen(GameState gameState)
    {
        super("EQUIPMENT", buildChoices(gameState));
    }

    // ------------------ METHODS ------------------- todo

    private static MenuChoice[] buildChoices(GameState gameState)
    {
        Weapon equippedWeapon = gameState.getEquipped(Weapon.class);
        Armor equippedArmor = gameState.getEquipped(Armor.class);
        String weaponName = "(EMPTY)";
        String armorName = "(EMPTY)";
        if (equippedWeapon != null)
            weaponName = equippedWeapon.getName();
        if (equippedArmor != null)
            armorName = equippedArmor.getName();
        return new MenuChoice[]
        {
            new MenuChoice("WEAPON: " + weaponName, ScreenType.EQUIPPED_ITEM,
                () -> gameState.setSelectedEquippable(equippedWeapon)),
            new MenuChoice("ARMOR: " + armorName, ScreenType.EQUIPPED_ITEM,
                () -> gameState.setSelectedEquippable(equippedArmor)),
            new MenuChoice("(BACK)", ScreenType.HUB)
        };
    }

    // ------------ ACCESSORS / MUTATORS ------------
    // ----------------- DEBUGGING ------------------
}