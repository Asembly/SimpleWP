package simplewp;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;
import simplewp.items.Pipe;
import simplewp.regItem.RegistrationItem;

public class CreativeTabWP extends CreativeTabs {
    public CreativeTabWP() {
        super("simplewp");
    }

    @Override
    public ItemStack getTabIconItem() {
        return new ItemStack(RegistrationItem.ARMOR_PACK);
    }
}
