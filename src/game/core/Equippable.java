
package game.core;

public abstract class Equippable extends Item
{
    @Override
    public abstract Class<? extends Equippable> baseType();
}