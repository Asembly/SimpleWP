package simplewp;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import simplewp.regItem.RegistrationHandle;
import simplewp.regItem.init.InitItems;

@Mod(modid = "simplewp",dependencies = "required-after:forge@[14.23.5.2768,);required-after:flansmod")
public class SimpleWP {

    public static CreativeTabs CREATIVE_TAB_WP = new CreativeTabWP();

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        RegistrationHandle.init();
    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent event) {
    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event) {
    }
}
