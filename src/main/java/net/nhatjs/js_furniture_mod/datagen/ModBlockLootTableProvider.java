package net.nhatjs.js_furniture_mod.datagen;

import net.minecraft.core.HolderLookup;
import net.minecraft.data.loot.BlockLootSubProvider;
import net.minecraft.world.flag.FeatureFlags;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.registries.RegistryObject;
import net.nhatjs.js_furniture_mod.block.ModBlocks;

import java.util.Set;

public class ModBlockLootTableProvider extends BlockLootSubProvider {
    public ModBlockLootTableProvider(HolderLookup.Provider provider) {
        super(Set.of(), FeatureFlags.REGISTRY.allFlags(), provider);
    }

    @Override
    public void generate() {
        this.dropSelf(ModBlocks.WOOD_CHAIR.get());
        this.dropSelf(ModBlocks.WHITE_CHAIR.get());
        this.dropSelf(ModBlocks.MODERN_CHAIR.get());
        this.dropSelf(ModBlocks.SOFA.get());
        this.dropSelf(ModBlocks.WOOD_LIGHT_TABLE.get());
        this.dropSelf(ModBlocks.BLACK_TABLE.get());
        this.dropSelf(ModBlocks.WHITE_TABLE.get());
        this.dropSelf(ModBlocks.WOOD_COFFEE_TABLE.get());
        this.dropSelf(ModBlocks.WHITE_COFFEE_TABLE.get());
        this.dropSelf(ModBlocks.WOOD_DESK.get());
        this.dropSelf(ModBlocks.WHITE_DESK.get());
        this.dropSelf(ModBlocks.WOOD_STANDING_DESK.get());
        this.dropSelf(ModBlocks.WOOD_STANDING_DESK_B.get());
        this.dropSelf(ModBlocks.BLACK_STANDING_DESK.get());
        this.dropSelf(ModBlocks.BLACK_STANDING_DESK_B.get());
        this.dropSelf(ModBlocks.WHITE_STANDING_DESK.get());
        this.dropSelf(ModBlocks.WHITE_STANDING_DESK_B.get());
        this.dropSelf(ModBlocks.WOOD_3_DRAWER_DRESSER.get());
        this.dropSelf(ModBlocks.WHITE_3_DRAWER_DRESSER.get());
        this.dropSelf(ModBlocks.WOOD_LIGHT_TV_STAND.get());
        this.dropSelf(ModBlocks.WHITE_TV_STAND.get());
        this.dropSelf(ModBlocks.KITCHEN_CABINET_BOTTOM.get());
        this.dropSelf(ModBlocks.KITCHEN_CABINET_BOTTOM_WITH_SINK.get());
        this.dropSelf(ModBlocks.KITCHEN_CABINET_BOTTOM_2.get());
        this.dropSelf(ModBlocks.KITCHEN_CABINET_BOTTOM_2_EXTRA.get());
        this.dropSelf(ModBlocks.KITCHEN_CABINET_BOTTOM_B.get());
        this.dropSelf(ModBlocks.KITCHEN_CABINET_BOTTOM_B_WITH_SINK.get());
        this.dropSelf(ModBlocks.KITCHEN_CABINET_BOTTOM_B_2.get());
        this.dropSelf(ModBlocks.KITCHEN_DRAWERS.get());
        this.dropSelf(ModBlocks.KITCHEN_DRAWERS_B.get());
        this.dropSelf(ModBlocks.KITCHEN_CABINET_TOP.get());
        this.dropSelf(ModBlocks.KITCHEN_CABINET_TOP_B.get());
        this.dropSelf(ModBlocks.WOOD_STRIPED_WALL.get());
        this.dropSelf(ModBlocks.BLACK_MIRROR.get());
        this.dropSelf(ModBlocks.VERTICAL_BLINDS.get());
        this.dropSelf(ModBlocks.SOCKET.get());
        this.dropSelf(ModBlocks.TV.get());
        this.dropSelf(ModBlocks.FLOOR_STANDING_SPEAKER.get());
        this.dropSelf(ModBlocks.MODERN_CLOCK.get());
        this.dropSelf(ModBlocks.MODERN_LIGHT.get());
        this.dropSelf(ModBlocks.LED_FLOOR_LAMP.get());
        this.dropSelf(ModBlocks.LED_FLOOR_LAMP_RGB_OFF.get());
        this.dropSelf(ModBlocks.LED_RGB_TRIANGLE_PANEL.get());
        this.dropSelf(ModBlocks.STUDIO_LIGHT.get());
        this.dropSelf(ModBlocks.MONITOR_SETUP.get());
        this.dropSelf(ModBlocks.MONITOR.get());
        this.dropSelf(ModBlocks.KEYBOARD.get());
        this.dropSelf(ModBlocks.COMPUTER_MOUSE.get());
        this.dropSelf(ModBlocks.PC.get());
        this.dropSelf(ModBlocks.PC_RGB1_OFF.get());
        this.dropSelf(ModBlocks.LAPTOP.get());
        this.dropSelf(ModBlocks.PORTABLE_LAPTOP_STAND.get());
        this.dropSelf(ModBlocks.LAPTOP_CLOSED_PORTABLE_LAPTOP_STAND.get());
        this.dropSelf(ModBlocks.MIDI_STANDALONE_GROOVEBOX.get());
        this.dropSelf(ModBlocks.MIDI_STANDALONE_GROOVEBOX_2.get());
        this.dropSelf(ModBlocks.MIDI_STANDALONE_GROOVEBOX_3.get());
        this.dropSelf(ModBlocks.COOKTOP.get());
        this.dropSelf(ModBlocks.FRIDGE_A.get());
        this.dropSelf(ModBlocks.FRIDGE_B.get());
        this.dropSelf(ModBlocks.MODERN_BATHROOM_SINK_STORAGE.get());
        this.dropSelf(ModBlocks.MODERN_BATHROOM_MIRROR_SHELF.get());
        this.dropSelf(ModBlocks.SHOWER.get());
        this.dropSelf(ModBlocks.WASHING_MACHINE_AI.get());
        this.dropSelf(ModBlocks.PLANT_POT.get());
        this.dropSelf(ModBlocks.BOOKS.get());

        this.dropSelf(ModBlocks.PC_TOWER_GLASS.get());

        //1.0.2 update
        this.dropSelf(ModBlocks.CEILING_FAN.get());
        this.dropSelf(ModBlocks.BLACK_GAMING_CHAIR.get());
        this.dropSelf(ModBlocks.WHITE_GAMING_CHAIR.get());
        //end

        //1.0.3 update
        this.dropSelf(ModBlocks.TOILET.get());
        //end

        //1.0.4 update
        this.dropSelf(ModBlocks.CEILING_FAN_B.get());
        this.dropSelf(ModBlocks.BLACK_SOFA.get());
        this.dropSelf(ModBlocks.MIDI_KEYBOARD_CONTROLLER.get());
        this.dropSelf(ModBlocks.WOOD_MEDIUM_TV_STAND.get());
        this.dropSelf(ModBlocks.WOOD_MEDIUM_3_DRAWER_DRESSER.get());
        this.dropSelf(ModBlocks.WOOD_MEDIUM_CHAIR.get());
        this.dropSelf(ModBlocks.WOOD_MEDIUM_COFFEE_TABLE.get());
        this.dropSelf(ModBlocks.WOOD_MEDIUM_DESK.get());
        this.dropSelf(ModBlocks.WOOD_MEDIUM_STANDING_DESK.get());
        this.dropSelf(ModBlocks.WOOD_MEDIUM_STANDING_DESK_B.get());
        this.dropSelf(ModBlocks.WOOD_MEDIUM_STRIPED_WALL.get());
        this.dropSelf(ModBlocks.WOOD_MEDIUM_TABLE.get());
        this.dropSelf(ModBlocks.WOOD_MEDIUM_KITCHEN_CABINET_BOTTOM.get());
        this.dropSelf(ModBlocks.WOOD_MEDIUM_KITCHEN_CABINET_BOTTOM_WITH_SINK.get());
        this.dropSelf(ModBlocks.WOOD_MEDIUM_KITCHEN_CABINET_BOTTOM_2.get());
        this.dropSelf(ModBlocks.WOOD_MEDIUM_KITCHEN_CABINET_BOTTOM_2_EXTRA.get());
        this.dropSelf(ModBlocks.WOOD_MEDIUM_KITCHEN_CABINET_BOTTOM_B.get());
        this.dropSelf(ModBlocks.WOOD_MEDIUM_KITCHEN_CABINET_BOTTOM_B_WITH_SINK.get());
        this.dropSelf(ModBlocks.WOOD_MEDIUM_KITCHEN_CABINET_BOTTOM_B_2.get());
        this.dropSelf(ModBlocks.WOOD_MEDIUM_KITCHEN_DRAWERS.get());
        this.dropSelf(ModBlocks.WOOD_MEDIUM_KITCHEN_DRAWERS_B.get());
        this.dropSelf(ModBlocks.WOOD_MEDIUM_KITCHEN_CABINET_TOP.get());
        this.dropSelf(ModBlocks.WOOD_MEDIUM_KITCHEN_CABINET_TOP_B.get());
        //end
    }

    @Override
    public Iterable<Block> getKnownBlocks() {
        return ModBlocks.BLOCKS.getEntries().stream().map(RegistryObject::get)::iterator;
    }
}
