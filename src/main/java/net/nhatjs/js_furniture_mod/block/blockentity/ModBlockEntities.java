package net.nhatjs.js_furniture_mod.block.blockentity;

import net.minecraft.core.registries.Registries;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;
import net.nhatjs.js_furniture_mod.NhatJSFurnitureMod;
import net.nhatjs.js_furniture_mod.block.ModBlocks;
import net.nhatjs.js_furniture_mod.block.blockentity.client.CeilingFanBlockEntity;
import net.nhatjs.js_furniture_mod.block.blockentity.client.CoffeeTableBlockEntity;


public final class ModBlockEntities {
    public static final DeferredRegister<BlockEntityType<?>> BLOCK_ENTITIES = DeferredRegister.create(Registries.BLOCK_ENTITY_TYPE, NhatJSFurnitureMod.MOD_ID);

//1.0.2 update
    public static final RegistryObject<BlockEntityType<CeilingFanBlockEntity>> CEILING_FAN = BLOCK_ENTITIES.register("ceiling_fan", () ->
        BlockEntityType.Builder.of(CeilingFanBlockEntity::new, ModBlocks.CEILING_FAN.get()).build(null));

    public static final RegistryObject<BlockEntityType<CoffeeTableBlockEntity>> COFFEE_TABLE = BLOCK_ENTITIES.register("coffee_table", () ->
            BlockEntityType.Builder.of(CoffeeTableBlockEntity::new, ModBlocks.WOOD_COFFEE_TABLE.get(), ModBlocks.WHITE_COFFEE_TABLE.get()).build(null));
//end

    public static void registerModBlockEntities(IEventBus eventBus) {
        BLOCK_ENTITIES.register(eventBus);
    }
}
