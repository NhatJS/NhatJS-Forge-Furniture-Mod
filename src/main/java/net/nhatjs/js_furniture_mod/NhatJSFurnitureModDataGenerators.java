package net.nhatjs.js_furniture_mod;

import net.minecraft.core.HolderLookup;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.PackOutput;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.data.event.GatherDataEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.nhatjs.js_furniture_mod.datagen.ModLootTableProvider;
import net.nhatjs.js_furniture_mod.datagen.ModRecipeProvider;

import java.util.concurrent.CompletableFuture;

@Mod.EventBusSubscriber(modid = NhatJSFurnitureMod.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class NhatJSFurnitureModDataGenerators {
    @SubscribeEvent
    public static void gaterData(GatherDataEvent event) {
        DataGenerator generator = event.getGenerator();
        PackOutput packOutput = generator.getPackOutput();
        ExistingFileHelper existingFileHelper = event.getExistingFileHelper();
        CompletableFuture<HolderLookup.Provider> lookupProvider = event.getLookupProvider();

        generator.addProvider(event.includeServer(), ModLootTableProvider.create(packOutput));
        generator.addProvider(event.includeServer(), new ModRecipeProvider(packOutput));

    }
}
