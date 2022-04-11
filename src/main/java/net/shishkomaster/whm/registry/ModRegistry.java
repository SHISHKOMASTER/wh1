package net.shishkomaster.whm.registry;

import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.Item;
import net.minecraft.item.SwordItem;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.shishkomaster.whm.Whm;
import net.shishkomaster.whm.item.ModArmorMaterial;
import net.shishkomaster.whm.item.ModItemTier;
import net.shishkomaster.whm.item.PowerArmorItem;
import net.shishkomaster.whm.utils.ModItemGroups;

public class ModRegistry {

    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, Whm.MOD_ID);

    public static final RegistryObject<Item> Whm_logo1 = ITEMS.register("whm_logo1",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> Bolter = ITEMS.register("bolter",
            () -> new Item(new Item.Properties().tab(ModItemGroups.WHM_TAB).stacksTo(1)));

    public static final RegistryObject<Item> Chainsword = ITEMS.register("chainsword",
            () -> new SwordItem(ModItemTier.Chainsword, 2, -3f, new Item.Properties().tab(ModItemGroups.WHM_TAB)));
    
    
    public static final RegistryObject<Item> POWERARMOR_BOOTS = ITEMS.register("power_armor_boots",
            () -> new PowerArmorItem(ModArmorMaterial.POWERARMOR, EquipmentSlotType.FEET));

    public static final RegistryObject<Item> POWERARMOR_CHESTPLATE = ITEMS.register("power_armor_chestplate",
                () -> new PowerArmorItem(ModArmorMaterial.POWERARMOR, EquipmentSlotType.CHEST));

    public static final RegistryObject<Item> POWERARMOR_LEGGINGS = ITEMS.register("power_armor_leggings",
                () -> new PowerArmorItem(ModArmorMaterial.POWERARMOR, EquipmentSlotType.LEGS));

    public static final RegistryObject<Item> POWERARMOR_HELMET = ITEMS.register("power_armor_helmet",
                () -> new PowerArmorItem(ModArmorMaterial.POWERARMOR, EquipmentSlotType.HEAD));

    
    

    public  static void register(IEventBus eventBus){
        ITEMS.register(eventBus);

    }
}
