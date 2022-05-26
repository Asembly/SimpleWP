package simplewp.items;

import net.minecraft.item.Item;

import static simplewp.SimpleWP.CREATIVE_TAB_WP;

public class ItemGate extends Item {
    public ItemGate(){
        setCreativeTab(CREATIVE_TAB_WP);
        setMaxStackSize(1);
    }
}
