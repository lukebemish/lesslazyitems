package io.github.lukebemish.walkingitems;

import net.minecraftforge.fml.common.Mod;

// The value here should match an entry in the META-INF/mods.toml file
@Mod(WalkingItems.MODID)
public class WalkingItemsWrapper {
    public WalkingItemsWrapper() {
        new WalkingItems();
    }
}
