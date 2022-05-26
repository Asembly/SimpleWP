package simplewp;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import simplewp.regItem.RegistrationHandle;
import simplewp.regItem.init.InitItems;

public class CreativeTabWP extends CreativeTabs {
    public CreativeTabWP() {
        super("simplewp");
    }

    @Override
    public ItemStack getTabIconItem() {
        return new ItemStack(RegistrationHandle.Items.ITEMS.get(23));
    }
}
