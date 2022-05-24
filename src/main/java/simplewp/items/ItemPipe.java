package simplewp.items;

import net.minecraft.item.Item;
import simplewp.CreativeTabWP;

import static simplewp.SimpleWP.CREATIVE_TAB_WP;

public class ItemPipe extends Item {
    public ItemPipe(){
        setCreativeTab(CREATIVE_TAB_WP);
        setMaxStackSize(1);
    }

}
