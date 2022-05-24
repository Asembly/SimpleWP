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
import simplewp.items.*;

@GameRegistry.ObjectHolder("simplewp")
@Mod.EventBusSubscriber
public class RegistrationItem {
    public static final Item SPRING = new ItemSpring().setRegistryName("spring").setUnlocalizedName("spring");
    public static final Item PLATE = new ItemPlate().setRegistryName("plate").setUnlocalizedName("plate");
    public static final Item PIPE = new ItemPipe().setRegistryName("pipe").setUnlocalizedName("pipe");
    public static final Item ROLL = new ItemRoll().setRegistryName("roll").setUnlocalizedName("roll");

    public static final Item BUTT1 = new ItemButt1().setRegistryName("butt_1").setUnlocalizedName("butt_1");
    public static final Item BUTT2 = new ItemButt2().setRegistryName("butt_2").setUnlocalizedName("butt_2");
    public static final Item BUTT3 = new ItemButt3().setRegistryName("butt_3").setUnlocalizedName("butt_3");

    public static final Item GATE1 = new ItemGate1().setRegistryName("gate_1").setUnlocalizedName("gate_1");
    public static final Item GATE2 = new ItemGate2().setRegistryName("gate_2").setUnlocalizedName("gate_2");
    public static final Item GRIP1 = new ItemGrip1().setRegistryName("grip_1").setUnlocalizedName("grip_1");
    public static final Item GRIP2 = new ItemGrip2().setRegistryName("grip_2").setUnlocalizedName("grip_2");
    public static final Item GRIP3 = new ItemGrip3().setRegistryName("grip_3").setUnlocalizedName("grip_3");
    public static final Item GRIP4 = new ItemGrip4().setRegistryName("grip_4").setUnlocalizedName("grip_4");
    public static final Item GRIP5 = new ItemGrip5().setRegistryName("grip_5").setUnlocalizedName("grip_5");
    public static final Item GRIP6 = new ItemGrip6().setRegistryName("grip_6").setUnlocalizedName("grip_6");
    public static final Item GRIP7 = new ItemGrip7().setRegistryName("grip_7").setUnlocalizedName("grip_7");
    public static final Item GRIP8 = new ItemGrip8().setRegistryName("grip_8").setUnlocalizedName("grip_8");
    public static final Item GRIP9 = new ItemGrip9().setRegistryName("grip_9").setUnlocalizedName("grip_9");
    public static final Item GRIP10 = new ItemGrip10().setRegistryName("grip_10").setUnlocalizedName("grip_10");
    public static final Item GRIP11 = new ItemGrip11().setRegistryName("grip_11").setUnlocalizedName("grip_11");
    public static final Item TRIGGER_KEY = new ItemTriggerKey().setRegistryName("trigger_key").setUnlocalizedName("trigger_key");
    public static final Item ARMOR_PACK = new Item().setRegistryName("armor_pack");

    @SubscribeEvent
    public static void onRegistryItem(RegistryEvent.Register<Item> event) {

        event.getRegistry().register(GRIP1);
        event.getRegistry().register(GRIP2);
        event.getRegistry().register(GRIP3);
        event.getRegistry().register(GRIP4);
        event.getRegistry().register(GRIP5);
        event.getRegistry().register(GRIP6);
        event.getRegistry().register(GRIP7);
        event.getRegistry().register(GRIP8);
        event.getRegistry().register(GRIP9);
        event.getRegistry().register(GRIP10);
        event.getRegistry().register(GRIP11);

        event.getRegistry().register(GATE1);
        event.getRegistry().register(GATE2);

        event.getRegistry().register(BUTT1);
        event.getRegistry().register(BUTT2);
        event.getRegistry().register(BUTT3);

        event.getRegistry().register(TRIGGER_KEY);

        event.getRegistry().register(SPRING);

        event.getRegistry().register(PLATE);

        event.getRegistry().register(ROLL);

        event.getRegistry().register(ARMOR_PACK);

        event.getRegistry().register(PIPE);

    }

    @SubscribeEvent
    @SideOnly(Side.CLIENT)
    public static void onRegistryModel(ModelRegistryEvent e) {

        registryModel(GRIP1);
        registryModel(GRIP2);
        registryModel(GRIP3);
        registryModel(GRIP4);
        registryModel(GRIP5);
        registryModel(GRIP6);
        registryModel(GRIP7);
        registryModel(GRIP8);
        registryModel(GRIP9);
        registryModel(GRIP10);
        registryModel(GRIP11);

        registryModel(GATE1);
        registryModel(GATE2);

        registryModel(BUTT1);
        registryModel(BUTT2);
        registryModel(BUTT3);

        registryModel(TRIGGER_KEY);

        registryModel(SPRING);

        registryModel(PIPE);

        registryModel(PLATE);

        registryModel(ROLL);

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
