package io.github.lukebemish.lesslazyitems;

import io.github.lukebemish.lesslazyitems.WalkingItems;
import net.minecraftforge.fml.common.Mod;

@Mod(WalkingItems.MODID)
public class WalkingItemsWrapper {
    public WalkingItemsWrapper() {
        //noinspection InstantiationOfUtilityClass
        new WalkingItems();
    }
}
