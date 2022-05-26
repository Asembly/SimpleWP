package simplewp.regItem.init;

import net.minecraft.item.Item;
import net.minecraft.item.ItemArmorStand;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.registry.GameRegistry;
import scala.collection.immutable.List;
import simplewp.items.*;
import simplewp.regItem.RegistrationHandle;

import java.util.LinkedList;

@GameRegistry.ObjectHolder("simplewp")
public class InitItems {

    public static final Item GRIP = new ItemGrip().setRegistryName("grip_1");

    public InitItems(){}
    public static void register(){

        RegistrationHandle.Items.add((Item)new ItemGrip().setRegistryName("grip_1"));
        RegistrationHandle.Items.add((Item)new ItemGrip().setRegistryName("grip_2"));
        RegistrationHandle.Items.add((Item)new ItemGrip().setRegistryName("grip_3"));
        RegistrationHandle.Items.add((Item)new ItemGrip().setRegistryName("grip_4"));
        RegistrationHandle.Items.add((Item)new ItemGrip().setRegistryName("grip_5"));
        RegistrationHandle.Items.add((Item)new ItemGrip().setRegistryName("grip_6"));
        RegistrationHandle.Items.add((Item)new ItemGrip().setRegistryName("grip_7"));
        RegistrationHandle.Items.add((Item)new ItemGrip().setRegistryName("grip_8"));
        RegistrationHandle.Items.add((Item)new ItemGrip().setRegistryName("grip_9"));
        RegistrationHandle.Items.add((Item)new ItemGrip().setRegistryName("grip_10"));
        RegistrationHandle.Items.add((Item)new ItemGrip().setRegistryName("grip_11"));
        RegistrationHandle.Items.add((Item)new ItemGrip().setRegistryName("grip_12"));
        RegistrationHandle.Items.add((Item)new ItemButt().setRegistryName("butt_1"));
        RegistrationHandle.Items.add((Item)new ItemButt().setRegistryName("butt_2"));
        RegistrationHandle.Items.add((Item)new ItemButt().setRegistryName("butt_3"));
        RegistrationHandle.Items.add((Item)new ItemButt().setRegistryName("butt_4"));
        RegistrationHandle.Items.add((Item)new ItemGate().setRegistryName("gate_1"));
        RegistrationHandle.Items.add((Item)new ItemGate().setRegistryName("gate_2"));
        RegistrationHandle.Items.add((Item)new ItemRoll().setRegistryName("roll"));
        RegistrationHandle.Items.add((Item)new ItemPipe().setRegistryName("pipe"));
        RegistrationHandle.Items.add((Item)new ItemPlate().setRegistryName("plate"));
        RegistrationHandle.Items.add((Item)new ItemSpring().setRegistryName("spring"));
        RegistrationHandle.Items.add((Item)new ItemTriggerKey().setRegistryName("trigger_key"));
        RegistrationHandle.Items.add((Item)new ItemArmorPack().setRegistryName("armor_pack"));

    }
}
