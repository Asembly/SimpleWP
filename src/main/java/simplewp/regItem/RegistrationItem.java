package simplewp.regItem;
import net.minecraft.client.renderer.block.model.ModelBakery;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import simplewp.items.Butt;
import simplewp.items.Gate;
import simplewp.items.Pipe;
import simplewp.items.TriggerKey;

import javax.swing.*;

@GameRegistry.ObjectHolder("simplewp")
@Mod.EventBusSubscriber
public class RegistrationItem {
    public static final Item SPRING = new simplewp.items.Spring().setRegistryName("spring").setUnlocalizedName("spring");
    public static final Item PIPE = new Pipe().setRegistryName("pipe").setUnlocalizedName("pipe");
    public static final Item TRIGGER_KEY = new TriggerKey().setRegistryName("trigger_key").setUnlocalizedName("trigger_key");
    public static final Item BUTT = new Butt().setRegistryName("butt").setUnlocalizedName("butt");
    public static final Item GATE = new Gate().setRegistryName("gate").setUnlocalizedName("gate");
    public static final Item ARMOR_PACK = new Item().setRegistryName("armor_pack");

    @SubscribeEvent
    public static void onRegistryItem(RegistryEvent.Register<Item> event) {
        event.getRegistry().register(PIPE);
        event.getRegistry().register(TRIGGER_KEY);
        event.getRegistry().register(SPRING);
        event.getRegistry().register(BUTT);
        event.getRegistry().register(GATE);
        event.getRegistry().register(ARMOR_PACK);
    }

    @SubscribeEvent
    @SideOnly(Side.CLIENT)
    public static void onRegistryModel(ModelRegistryEvent e) {
        registryModel(PIPE);
        registryModel(TRIGGER_KEY);
        registryModel(SPRING);
        registryModel(BUTT);
        registryModel(GATE);
        registryModel(ARMOR_PACK);
    }

    @SideOnly(Side.CLIENT)
    private static void registryModel(Item item) {
        final ResourceLocation regName = item.getRegistryName();
        final ModelResourceLocation mrl = new ModelResourceLocation(regName, "inventory");
        ModelBakery.registerItemVariants(item, mrl);
        ModelLoader.setCustomModelResourceLocation(item, 0, mrl);
    }
}
