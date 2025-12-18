package net.nhatjs.js_furniture_mod.item;

import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.nhatjs.js_furniture_mod.NhatJSFurnitureMod;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS,  NhatJSFurnitureMod.MOD_ID);

    public static final RegistryObject<Item> REMOTE_CONTROL_RGB = ITEMS.register("remote_control_rgb", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> CPU = ITEMS.register("cpu", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> MAINBOARD = ITEMS.register("mainboard", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> RAM = ITEMS.register("ram", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> AIO_COOLER = ITEMS.register("aio_cooler", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> COMPUTER_FAN = ITEMS.register("computer_fan", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> GPU = ITEMS.register("gpu", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> PSU = ITEMS.register("psu", () -> new Item(new Item.Properties()));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
