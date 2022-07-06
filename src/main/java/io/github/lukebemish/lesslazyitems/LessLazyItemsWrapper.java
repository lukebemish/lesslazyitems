package io.github.lukebemish.lesslazyitems;

import net.minecraftforge.fml.common.Mod;

@Mod(LessLazyItems.MODID)
public class LessLazyItemsWrapper {
    public LessLazyItemsWrapper() {
        //noinspection InstantiationOfUtilityClass
        new LessLazyItems();
    }
}
