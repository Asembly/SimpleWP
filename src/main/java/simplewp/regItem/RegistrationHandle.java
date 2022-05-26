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
import simplewp.regItem.init.InitItems;

import java.util.LinkedList;


public class RegistrationHandle {

    public static void init(){
        InitItems.register();
    }

    @Mod.EventBusSubscriber
    public static class Items{
        public Items(){}
        public static final LinkedList<net.minecraft.item.Item> ITEMS = new LinkedList<>();

        public static void add(net.minecraft.item.Item item){
            ITEMS.add(item);
        }

        @SubscribeEvent
        public static void register(RegistryEvent.Register<net.minecraft.item.Item> event) {
            ITEMS.forEach(item -> {
                event.getRegistry().register(item);
            });
        }
    }

    @Mod.EventBusSubscriber
    public static class Models{
        public Models(){}

        @SubscribeEvent
        public static void register(ModelRegistryEvent e) {
            RegistrationHandle.Items.ITEMS.forEach(item -> {
                registryModel(item);
            });
        }

        private static void registryModel(net.minecraft.item.Item item) {
            final ResourceLocation regName = item.getRegistryName();
            final ModelResourceLocation mrl = new ModelResourceLocation(regName, "inventory");
            ModelBakery.registerItemVariants(item, mrl);
            ModelLoader.setCustomModelResourceLocation(item, 0, mrl);
        }

    }
}
