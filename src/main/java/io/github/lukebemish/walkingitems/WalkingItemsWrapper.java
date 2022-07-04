package io.github.lukebemish.walkingitems;

import net.minecraftforge.fml.common.Mod;

@Mod(WalkingItems.MODID)
public class WalkingItemsWrapper {
    public WalkingItemsWrapper() {
        //noinspection InstantiationOfUtilityClass
        new WalkingItems();
    }
}
