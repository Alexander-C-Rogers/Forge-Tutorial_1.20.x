package net.alexander.tutorialmod.item.custom;

import net.minecraft.world.item.Item;

public class FuelItem extends Item {
    private int burnTime = 0;

    public FuelItem(Properties pProperties, int burnTime) {
        super(pProperties);
        this.burnTime = burnTime;
    }
}
