package com.sasa.playerevolutions.items;

import com.sasa.playerevolutions.util.ModItemTier;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.Item;
import net.minecraft.item.SwordItem;

public class SasaSword extends SwordItem {
    public SasaSword() {
        // Pass our custom tier, set additional weapon damage, set attack speed, and add to a creative tab
        super(ModItemTier.SASA, 3, -2.4F, new Item.Properties().group(ItemGroup.COMBAT));
    }
}