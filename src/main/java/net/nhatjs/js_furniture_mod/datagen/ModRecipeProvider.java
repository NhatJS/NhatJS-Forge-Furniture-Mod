package net.nhatjs.js_furniture_mod.datagen;

import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.FinishedRecipe;
import net.minecraft.data.recipes.RecipeCategory;
import net.minecraft.data.recipes.RecipeProvider;
import net.minecraft.data.recipes.ShapedRecipeBuilder;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraftforge.common.crafting.conditions.IConditionBuilder;
import net.nhatjs.js_furniture_mod.block.ModBlocks;

import java.util.function.Consumer;

public class ModRecipeProvider extends RecipeProvider implements IConditionBuilder {
    public ModRecipeProvider(PackOutput output) {
        super(output);
    }

    @Override
    public void buildRecipes(Consumer<FinishedRecipe> pWriter) {
        //wood
        Item saplingOak = Items.OAK_SAPLING;
        Block planksBirch = Blocks.BIRCH_PLANKS;
        Block slabBirch = Blocks.BIRCH_SLAB;
        Block planksJungle = Blocks.JUNGLE_PLANKS;
        Block slabJungle = Blocks.JUNGLE_SLAB;

        //stone
        Block buttonStone = Blocks.STONE_BUTTON;

        //wool
        Block woolBlack = Blocks.BLACK_WOOL;
        Block carpetBlack = Blocks.BLACK_CARPET;
        Block woolWhite = Blocks.WHITE_WOOL;

        //banner
        Block bannerWhite = Blocks.WHITE_BANNER;

        //concrete
        Block concreteBlack = Blocks.BLACK_CONCRETE;
        Block concreteGray = Blocks.GRAY_CONCRETE;
        Block concreteWhite = Blocks.WHITE_CONCRETE;

        //dye
        Item dyeBlack = Items.BLACK_DYE;
        Item dyeWhite = Items.WHITE_DYE;

        //misc
        Item ironIngot = Items.IRON_INGOT;
        Block ironBlock = Blocks.IRON_BLOCK;

        //glass pane
        Block glassPane = Blocks.GLASS_PANE;

        //electronic
        Item redstone = Items.REDSTONE;
        Item lever = Items.LEVER;
        Block redstoneLamp = Blocks.REDSTONE_LAMP;

        //furniture mod
        Block laptop = ModBlocks.LAPTOP.get();
        Block portableLaptopStand = ModBlocks.PORTABLE_LAPTOP_STAND.get();
        Block midiGroovebox = ModBlocks.MIDI_STANDALONE_GROOVEBOX.get();
        Block monitor = ModBlocks.MONITOR.get();
        Block keyboard = ModBlocks.KEYBOARD.get();
        Block computerMouse = ModBlocks.COMPUTER_MOUSE.get();

        //others
        Item book = Items.BOOK;
        Block noteBlock = Blocks.NOTE_BLOCK;
        Item endCrystal = Items.END_CRYSTAL;
        Block chest = Blocks.CHEST;
        Item bucket = Items.BUCKET;
        Block flowerPot = Blocks.FLOWER_POT;

        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, ModBlocks.BLACK_GAMING_CHAIR.get())
                .pattern("1  ")
                .pattern("121")
                .pattern("3 3")
                .define('1', woolBlack)
                .define('2', woolWhite)
                .define('3', concreteBlack)
                .unlockedBy(getHasName(woolBlack), has(woolBlack))
                .unlockedBy(getHasName(woolWhite), has(woolWhite))
                .unlockedBy(getHasName(concreteBlack), has(concreteBlack))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, ModBlocks.BLACK_MIRROR.get())
                .pattern("1")
                .pattern("2")
                .pattern("1")
                .define('1', concreteBlack)
                .define('2', glassPane)
                .unlockedBy(getHasName(concreteBlack), has(concreteBlack))
                .unlockedBy(getHasName(glassPane), has(glassPane))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, ModBlocks.BLACK_SOFA.get(), 2)
                .pattern("111")
                .pattern("111")
                .define('1', woolBlack)
                .unlockedBy(getHasName(woolBlack), has(woolBlack))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, ModBlocks.BLACK_STANDING_DESK.get())
                .pattern("111")
                .pattern("223")
                .pattern("1 1")
                .define('1', concreteBlack)
                .define('2', redstone)
                .define('3', lever)
                .unlockedBy(getHasName(concreteBlack), has(concreteBlack))
                .unlockedBy(getHasName(redstone), has(redstone))
                .unlockedBy(getHasName(lever), has(lever))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, ModBlocks.BLACK_STANDING_DESK_B.get())
                .pattern("111")
                .pattern("223")
                .pattern("4 4")
                .define('1', concreteBlack)
                .define('2', redstone)
                .define('3', lever)
                .define('4', concreteWhite)
                .unlockedBy(getHasName(concreteBlack), has(concreteBlack))
                .unlockedBy(getHasName(redstone), has(redstone))
                .unlockedBy(getHasName(lever), has(lever))
                .unlockedBy(getHasName(concreteWhite), has(concreteWhite))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, ModBlocks.BLACK_TABLE.get(), 2)
                .pattern("111")
                .pattern("1 1")
                .pattern("1 1")
                .define('1', concreteBlack)
                .unlockedBy(getHasName(concreteBlack), has(concreteBlack))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, ModBlocks.BOOKS.get(), 2)
                .pattern("232")
                .pattern("111")
                .pattern("232")
                .define('1', book)
                .define('2', dyeWhite)
                .define('3', dyeBlack)
                .unlockedBy(getHasName(book), has(book))
                .unlockedBy(getHasName(dyeWhite), has(dyeWhite))
                .unlockedBy(getHasName(dyeBlack), has(dyeBlack))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, ModBlocks.CEILING_FAN.get())
                .pattern(" 2 ")
                .pattern("111")
                .define('1', concreteBlack)
                .define('2', redstone)
                .unlockedBy(getHasName(concreteBlack), has(concreteBlack))
                .unlockedBy(getHasName(redstone), has(redstone))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, ModBlocks.CEILING_FAN_B.get())
                .pattern(" 2 ")
                .pattern("111")
                .define('1', concreteWhite)
                .define('2', redstone)
                .unlockedBy(getHasName(concreteWhite), has(concreteWhite))
                .unlockedBy(getHasName(redstone), has(redstone))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, ModBlocks.COMPUTER_MOUSE.get())
                .pattern("2")
                .pattern("1")
                .define('1', concreteBlack)
                .define('2', redstone)
                .unlockedBy(getHasName(concreteBlack), has(concreteBlack))
                .unlockedBy(getHasName(redstone), has(redstone))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, ModBlocks.COOKTOP.get())
                .pattern("121")
                .define('1', concreteBlack)
                .define('2', redstone)
                .unlockedBy(getHasName(concreteBlack), has(concreteBlack))
                .unlockedBy(getHasName(redstone), has(redstone))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, ModBlocks.FLOOR_STANDING_SPEAKER.get())
                .pattern("2")
                .pattern("1")
                .pattern("1")
                .define('1', concreteBlack)
                .define('2', noteBlock)
                .unlockedBy(getHasName(concreteBlack), has(concreteBlack))
                .unlockedBy(getHasName(noteBlock), has(noteBlock))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, ModBlocks.FRIDGE_A.get())
                .pattern("414")
                .pattern("232")
                .pattern("414")
                .define('1', concreteBlack)
                .define('2', ironBlock)
                .define('3', endCrystal)
                .define('4', concreteGray)
                .unlockedBy(getHasName(concreteBlack), has(concreteBlack))
                .unlockedBy(getHasName(ironBlock), has(ironBlock))
                .unlockedBy(getHasName(endCrystal), has(endCrystal))
                .unlockedBy(getHasName(concreteGray), has(concreteGray))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, ModBlocks.FRIDGE_B.get())
                .pattern("414")
                .pattern("232")
                .pattern("414")
                .define('1', concreteBlack)
                .define('2', ironBlock)
                .define('3', endCrystal)
                .define('4', concreteWhite)
                .unlockedBy(getHasName(concreteBlack), has(concreteBlack))
                .unlockedBy(getHasName(ironBlock), has(ironBlock))
                .unlockedBy(getHasName(endCrystal), has(endCrystal))
                .unlockedBy(getHasName(concreteWhite), has(concreteWhite))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, ModBlocks.KEYBOARD.get())
                .pattern("121")
                .pattern("111")
                .define('1', concreteBlack)
                .define('2', redstone)
                .unlockedBy(getHasName(concreteBlack), has(concreteBlack))
                .unlockedBy(getHasName(redstone), has(redstone))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, ModBlocks.KITCHEN_CABINET_BOTTOM.get(), 2)
                .pattern("333")
                .pattern("111")
                .pattern("121")
                .define('1', planksBirch)
                .define('2', chest)
                .define('3', slabBirch)
                .unlockedBy(getHasName(planksBirch), has(planksBirch))
                .unlockedBy(getHasName(chest), has(chest))
                .unlockedBy(getHasName(slabBirch), has(slabBirch))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, ModBlocks.KITCHEN_CABINET_BOTTOM_2.get(), 2)
                .pattern("131")
                .pattern("111")
                .pattern("121")
                .define('1', planksBirch)
                .define('2', chest)
                .define('3', ironIngot)
                .unlockedBy(getHasName(planksBirch), has(planksBirch))
                .unlockedBy(getHasName(chest), has(chest))
                .unlockedBy(getHasName(ironIngot), has(ironIngot))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, ModBlocks.KITCHEN_CABINET_BOTTOM_2_EXTRA.get(), 2)
                .pattern("111")
                .pattern("131")
                .pattern("121")
                .define('1', planksBirch)
                .define('2', chest)
                .define('3', ironIngot)
                .unlockedBy(getHasName(planksBirch), has(planksBirch))
                .unlockedBy(getHasName(chest), has(chest))
                .unlockedBy(getHasName(ironIngot), has(ironIngot))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, ModBlocks.KITCHEN_CABINET_BOTTOM_B.get(), 2)
                .pattern("333")
                .pattern("111")
                .pattern("121")
                .define('1', planksBirch)
                .define('2', chest)
                .define('3', concreteWhite)
                .unlockedBy(getHasName(planksBirch), has(planksBirch))
                .unlockedBy(getHasName(chest), has(chest))
                .unlockedBy(getHasName(concreteWhite), has(concreteWhite))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, ModBlocks.KITCHEN_CABINET_BOTTOM_B_2.get(), 2)
                .pattern("111")
                .pattern("111")
                .pattern("121")
                .define('1', planksBirch)
                .define('2', chest)
                .unlockedBy(getHasName(planksBirch), has(planksBirch))
                .unlockedBy(getHasName(chest), has(chest))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, ModBlocks.KITCHEN_CABINET_BOTTOM_B_WITH_SINK.get(), 2)
                .pattern("343")
                .pattern("111")
                .pattern("121")
                .define('1', planksBirch)
                .define('2', chest)
                .define('3', concreteWhite)
                .define('4', bucket)
                .unlockedBy(getHasName(planksBirch), has(planksBirch))
                .unlockedBy(getHasName(chest), has(chest))
                .unlockedBy(getHasName(concreteWhite), has(concreteWhite))
                .unlockedBy(getHasName(bucket), has(bucket))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, ModBlocks.KITCHEN_CABINET_BOTTOM_WITH_SINK.get(), 2)
                .pattern("343")
                .pattern("111")
                .pattern("121")
                .define('1', planksBirch)
                .define('2', chest)
                .define('3', slabBirch)
                .define('4', bucket)
                .unlockedBy(getHasName(planksBirch), has(planksBirch))
                .unlockedBy(getHasName(chest), has(chest))
                .unlockedBy(getHasName(slabBirch), has(slabBirch))
                .unlockedBy(getHasName(bucket), has(bucket))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, ModBlocks.KITCHEN_CABINET_TOP.get(), 2)
                .pattern("11")
                .pattern("23")
                .pattern("11")
                .define('1', planksBirch)
                .define('2', chest)
                .define('3', ironIngot)
                .unlockedBy(getHasName(planksBirch), has(planksBirch))
                .unlockedBy(getHasName(chest), has(chest))
                .unlockedBy(getHasName(ironIngot), has(ironIngot))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, ModBlocks.KITCHEN_CABINET_TOP_B.get(), 2)
                .pattern("11")
                .pattern("21")
                .pattern("11")
                .define('1', planksBirch)
                .define('2', chest)
                .unlockedBy(getHasName(planksBirch), has(planksBirch))
                .unlockedBy(getHasName(chest), has(chest))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, ModBlocks.KITCHEN_DRAWERS.get(), 2)
                .pattern("323")
                .pattern("121")
                .pattern("121")
                .define('1', planksBirch)
                .define('2', chest)
                .define('3', slabBirch)
                .unlockedBy(getHasName(planksBirch), has(planksBirch))
                .unlockedBy(getHasName(chest), has(chest))
                .unlockedBy(getHasName(slabBirch), has(slabBirch))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, ModBlocks.KITCHEN_DRAWERS_B.get(), 2)
                .pattern("323")
                .pattern("121")
                .pattern("121")
                .define('1', planksBirch)
                .define('2', chest)
                .define('3', concreteWhite)
                .unlockedBy(getHasName(planksBirch), has(planksBirch))
                .unlockedBy(getHasName(chest), has(chest))
                .unlockedBy(getHasName(concreteWhite), has(concreteWhite))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, ModBlocks.LAPTOP.get())
                .pattern("111")
                .pattern("523")
                .pattern("141")
                .define('1', concreteBlack)
                .define('2', endCrystal)
                .define('3', buttonStone)
                .define('4', redstone)
                .define('5', noteBlock)
                .unlockedBy(getHasName(concreteBlack), has(concreteBlack))
                .unlockedBy(getHasName(endCrystal), has(endCrystal))
                .unlockedBy(getHasName(buttonStone), has(buttonStone))
                .unlockedBy(getHasName(redstone), has(redstone))
                .unlockedBy(getHasName(noteBlock), has(noteBlock))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, ModBlocks.LAPTOP_CLOSED_PORTABLE_LAPTOP_STAND.get())
                .pattern("1")
                .pattern("2")
                .define('1', laptop)
                .define('2', portableLaptopStand)
                .unlockedBy(getHasName(laptop), has(laptop))
                .unlockedBy(getHasName(portableLaptopStand), has(portableLaptopStand))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, ModBlocks.LED_FLOOR_LAMP.get(), 2)
                .pattern(" 1 ")
                .pattern(" 2 ")
                .pattern("111")
                .define('1', concreteBlack)
                .define('2', redstoneLamp)
                .unlockedBy(getHasName(concreteBlack), has(concreteBlack))
                .unlockedBy(getHasName(redstoneLamp), has(redstoneLamp))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, ModBlocks.LED_FLOOR_LAMP_RGB_OFF.get(), 2)
                .pattern(" 1")
                .pattern(" 2")
                .pattern("11")
                .define('1', concreteBlack)
                .define('2', redstoneLamp)
                .unlockedBy(getHasName(concreteBlack), has(concreteBlack))
                .unlockedBy(getHasName(redstoneLamp), has(redstoneLamp))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, ModBlocks.LED_RGB_TRIANGLE_PANEL.get())
                .pattern("12 ")
                .pattern("131")
                .pattern(" 21")
                .define('1', concreteBlack)
                .define('2', redstoneLamp)
                .define('3', redstone)
                .unlockedBy(getHasName(concreteBlack), has(concreteBlack))
                .unlockedBy(getHasName(redstoneLamp), has(redstoneLamp))
                .unlockedBy(getHasName(redstone), has(redstone))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, ModBlocks.MIDI_KEYBOARD_CONTROLLER.get())
                .pattern("111")
                .pattern("244")
                .pattern("311")
                .define('1', concreteBlack)
                .define('2', buttonStone)
                .define('3', endCrystal)
                .define('4', concreteWhite)
                .unlockedBy(getHasName(concreteBlack), has(concreteBlack))
                .unlockedBy(getHasName(buttonStone), has(buttonStone))
                .unlockedBy(getHasName(endCrystal), has(endCrystal))
                .unlockedBy(getHasName(concreteWhite), has(concreteWhite))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, ModBlocks.MIDI_STANDALONE_GROOVEBOX.get())
                .pattern("111")
                .pattern("132")
                .pattern("222")
                .define('1', concreteBlack)
                .define('2', buttonStone)
                .define('3', endCrystal)
                .unlockedBy(getHasName(concreteBlack), has(concreteBlack))
                .unlockedBy(getHasName(buttonStone), has(buttonStone))
                .unlockedBy(getHasName(endCrystal), has(endCrystal))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, ModBlocks.MIDI_STANDALONE_GROOVEBOX_2.get())
                .pattern("424")
                .pattern("232")
                .pattern("121")
                .define('1', concreteBlack)
                .define('2', buttonStone)
                .define('3', endCrystal)
                .define('4', concreteWhite)
                .unlockedBy(getHasName(concreteBlack), has(concreteBlack))
                .unlockedBy(getHasName(buttonStone), has(buttonStone))
                .unlockedBy(getHasName(endCrystal), has(endCrystal))
                .unlockedBy(getHasName(concreteWhite), has(concreteWhite))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, ModBlocks.MIDI_STANDALONE_GROOVEBOX_3.get())
                .pattern("11")
                .define('1', midiGroovebox)
                .unlockedBy(getHasName(midiGroovebox), has(midiGroovebox))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, ModBlocks.MODERN_BATHROOM_MIRROR_SHELF.get())
                .pattern("121")
                .pattern("111")
                .define('1', concreteBlack)
                .define('2', glassPane)
                .unlockedBy(getHasName(concreteBlack), has(concreteBlack))
                .unlockedBy(getHasName(glassPane), has(glassPane))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, ModBlocks.MODERN_BATHROOM_SINK_STORAGE.get())
                .pattern(" 2 ")
                .pattern("111")
                .pattern("222")
                .define('1', concreteWhite)
                .define('2', concreteBlack)
                .unlockedBy(getHasName(concreteWhite), has(concreteWhite))
                .unlockedBy(getHasName(concreteBlack), has(concreteBlack))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, ModBlocks.MODERN_CHAIR.get(), 4)
                .pattern("2  ")
                .pattern("121")
                .pattern("1 1")
                .define('1', concreteBlack)
                .define('2', woolWhite)
                .unlockedBy(getHasName(concreteBlack), has(concreteBlack))
                .unlockedBy(getHasName(woolWhite), has(woolWhite))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, ModBlocks.MODERN_LIGHT.get(), 4)
                .pattern("121")
                .define('1', concreteBlack)
                .define('2', redstoneLamp)
                .unlockedBy(getHasName(concreteBlack), has(concreteBlack))
                .unlockedBy(getHasName(redstoneLamp), has(redstoneLamp))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, ModBlocks.MONITOR.get())
                .pattern("121")
                .pattern(" 3 ")
                .pattern(" 1 ")
                .define('1', concreteBlack)
                .define('2', glassPane)
                .define('3', redstone)
                .unlockedBy(getHasName(concreteBlack), has(concreteBlack))
                .unlockedBy(getHasName(glassPane), has(glassPane))
                .unlockedBy(getHasName(redstone), has(redstone))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, ModBlocks.MONITOR_SETUP.get())
                .pattern("14")
                .pattern("23")
                .define('1', monitor)
                .define('2', keyboard)
                .define('3', computerMouse)
                .define('4', carpetBlack)
                .unlockedBy(getHasName(monitor), has(monitor))
                .unlockedBy(getHasName(keyboard), has(keyboard))
                .unlockedBy(getHasName(computerMouse), has(computerMouse))
                .unlockedBy(getHasName(carpetBlack), has(carpetBlack))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, ModBlocks.PC.get())
                .pattern("114")
                .pattern("322")
                .pattern("111")
                .define('1', concreteBlack)
                .define('2', endCrystal)
                .define('3', redstone)
                .define('4', buttonStone)
                .unlockedBy(getHasName(concreteBlack), has(concreteBlack))
                .unlockedBy(getHasName(endCrystal), has(endCrystal))
                .unlockedBy(getHasName(redstone), has(redstone))
                .unlockedBy(getHasName(buttonStone), has(buttonStone))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, ModBlocks.PC_TOWER_GLASS.get())
                .pattern("21")
                .pattern("21")
                .define('1', concreteBlack)
                .define('2', glassPane)
                .unlockedBy(getHasName(concreteBlack), has(concreteBlack))
                .unlockedBy(getHasName(glassPane), has(glassPane))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, ModBlocks.PLANT_POT.get())
                .pattern(" 3 ")
                .pattern("121")
                .define('1', ironIngot)
                .define('2', flowerPot)
                .define('3', saplingOak)
                .unlockedBy(getHasName(ironIngot), has(ironIngot))
                .unlockedBy(getHasName(flowerPot), has(flowerPot))
                .unlockedBy(getHasName(saplingOak), has(saplingOak))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, ModBlocks.PORTABLE_LAPTOP_STAND.get())
                .pattern("1 1")
                .pattern("111")
                .pattern("1 1")
                .define('1', ironIngot)
                .unlockedBy(getHasName(ironIngot), has(ironIngot))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, ModBlocks.SHOWER.get())
                .pattern("21")
                .define('1', dyeBlack)
                .define('2', ironIngot)
                .unlockedBy(getHasName(dyeBlack), has(dyeBlack))
                .unlockedBy(getHasName(ironIngot), has(ironIngot))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, ModBlocks.SOCKET.get(), 4)
                .pattern("1")
                .pattern("2")
                .pattern("1")
                .define('1', concreteWhite)
                .define('2', redstone)
                .unlockedBy(getHasName(concreteWhite), has(concreteWhite))
                .unlockedBy(getHasName(redstone), has(redstone))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, ModBlocks.SOFA.get(), 2)
                .pattern("111")
                .pattern("111")
                .define('1', woolWhite)
                .unlockedBy(getHasName(woolWhite), has(woolWhite))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, ModBlocks.STUDIO_LIGHT.get(), 2)
                .pattern("121")
                .pattern(" 1 ")
                .pattern("1 1")
                .define('1', concreteBlack)
                .define('2', redstoneLamp)
                .unlockedBy(getHasName(concreteBlack), has(concreteBlack))
                .unlockedBy(getHasName(redstoneLamp), has(redstoneLamp))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, ModBlocks.TOILET.get())
                .pattern("1  ")
                .pattern("111")
                .pattern("11 ")
                .define('1', concreteWhite)
                .unlockedBy(getHasName(concreteWhite), has(concreteWhite))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, ModBlocks.TV.get())
                .pattern("121")
                .pattern("131")
                .define('1', concreteBlack)
                .define('2', endCrystal)
                .define('3', dyeWhite)
                .unlockedBy(getHasName(concreteBlack), has(concreteBlack))
                .unlockedBy(getHasName(endCrystal), has(endCrystal))
                .unlockedBy(getHasName(dyeWhite), has(dyeWhite))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, ModBlocks.VERTICAL_BLINDS.get())
                .pattern("111")
                .pattern("222")
                .pattern("222")
                .define('1', concreteWhite)
                .define('2', bannerWhite)
                .unlockedBy(getHasName(concreteWhite), has(concreteWhite))
                .unlockedBy(getHasName(bannerWhite), has(bannerWhite))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, ModBlocks.WASHING_MACHINE_AI.get())
                .pattern("121")
                .pattern("1 1")
                .pattern("131")
                .define('1', concreteGray)
                .define('2', redstone)
                .define('3', endCrystal)
                .unlockedBy(getHasName(concreteGray), has(concreteGray))
                .unlockedBy(getHasName(redstone), has(redstone))
                .unlockedBy(getHasName(endCrystal), has(endCrystal))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, ModBlocks.WHITE_3_DRAWER_DRESSER.get(), 2)
                .pattern("121")
                .pattern("121")
                .pattern("121")
                .define('1', concreteWhite)
                .define('2', chest)
                .unlockedBy(getHasName(concreteWhite), has(concreteWhite))
                .unlockedBy(getHasName(chest), has(chest))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, ModBlocks.WHITE_CHAIR.get(), 4)
                .pattern("2  ")
                .pattern("122")
                .pattern("1 1")
                .define('1', concreteWhite)
                .define('2', woolWhite)
                .unlockedBy(getHasName(concreteWhite), has(concreteWhite))
                .unlockedBy(getHasName(woolWhite), has(woolWhite))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, ModBlocks.WHITE_COFFEE_TABLE.get(), 2)
                .pattern("111")
                .pattern("1 1")
                .define('1', concreteWhite)
                .unlockedBy(getHasName(concreteWhite), has(concreteWhite))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, ModBlocks.WHITE_DESK.get(), 2)
                .pattern("121")
                .pattern("1 1")
                .pattern("1 1")
                .define('1', concreteWhite)
                .define('2', chest)
                .unlockedBy(getHasName(concreteWhite), has(concreteWhite))
                .unlockedBy(getHasName(chest), has(chest))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, ModBlocks.WHITE_GAMING_CHAIR.get())
                .pattern("1  ")
                .pattern("121")
                .pattern("3 3")
                .define('1', woolWhite)
                .define('2', woolBlack)
                .define('3', concreteBlack)
                .unlockedBy(getHasName(woolWhite), has(woolWhite))
                .unlockedBy(getHasName(woolBlack), has(woolBlack))
                .unlockedBy(getHasName(concreteBlack), has(concreteBlack))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, ModBlocks.WHITE_STANDING_DESK.get())
                .pattern("222")
                .pattern("334")
                .pattern("1 1")
                .define('1', concreteBlack)
                .define('2', concreteWhite)
                .define('3', redstone)
                .define('4', lever)
                .unlockedBy(getHasName(concreteBlack), has(concreteBlack))
                .unlockedBy(getHasName(concreteWhite), has(concreteWhite))
                .unlockedBy(getHasName(redstone), has(redstone))
                .unlockedBy(getHasName(lever), has(lever))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, ModBlocks.WHITE_STANDING_DESK_B.get())
                .pattern("222")
                .pattern("334")
                .pattern("2 2")
                .define('2', concreteWhite)
                .define('3', redstone)
                .define('4', lever)
                .unlockedBy(getHasName(concreteWhite), has(concreteWhite))
                .unlockedBy(getHasName(redstone), has(redstone))
                .unlockedBy(getHasName(lever), has(lever))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, ModBlocks.WHITE_TABLE.get(), 2)
                .pattern("111")
                .pattern("1 1")
                .pattern("1 1")
                .define('1', concreteWhite)
                .unlockedBy(getHasName(concreteWhite), has(concreteWhite))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, ModBlocks.WHITE_TV_STAND.get())
                .pattern("111")
                .pattern("212")
                .define('1', concreteWhite)
                .define('2', chest)
                .unlockedBy(getHasName(concreteWhite), has(concreteWhite))
                .unlockedBy(getHasName(chest), has(chest))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, ModBlocks.WOOD_3_DRAWER_DRESSER.get(), 2)
                .pattern("121")
                .pattern("121")
                .pattern("121")
                .define('1', planksBirch)
                .define('2', chest)
                .unlockedBy(getHasName(planksBirch), has(planksBirch))
                .unlockedBy(getHasName(chest), has(chest))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, ModBlocks.WOOD_CHAIR.get(), 4)
                .pattern("2  ")
                .pattern("122")
                .pattern("1 1")
                .define('1', planksBirch)
                .define('2', woolWhite)
                .unlockedBy(getHasName(planksBirch), has(planksBirch))
                .unlockedBy(getHasName(woolWhite), has(woolWhite))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, ModBlocks.WOOD_COFFEE_TABLE.get(), 2)
                .pattern("111")
                .pattern("1 1")
                .define('1', planksBirch)
                .unlockedBy(getHasName(planksBirch), has(planksBirch))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, ModBlocks.WOOD_DESK.get(), 2)
                .pattern("121")
                .pattern("1 1")
                .pattern("1 1")
                .define('1', planksBirch)
                .define('2', chest)
                .unlockedBy(getHasName(planksBirch), has(planksBirch))
                .unlockedBy(getHasName(chest), has(chest))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, ModBlocks.WOOD_LIGHT_TABLE.get(), 2)
                .pattern("222")
                .pattern("1 1")
                .pattern("1 1")
                .define('1', concreteBlack)
                .define('2', planksBirch)
                .unlockedBy(getHasName(concreteBlack), has(concreteBlack))
                .unlockedBy(getHasName(planksBirch), has(planksBirch))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, ModBlocks.WOOD_LIGHT_TV_STAND.get(), 2)
                .pattern("211")
                .pattern("1 1")
                .define('1', planksBirch)
                .define('2', concreteWhite)
                .unlockedBy(getHasName(planksBirch), has(planksBirch))
                .unlockedBy(getHasName(concreteWhite), has(concreteWhite))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, ModBlocks.WOOD_MEDIUM_3_DRAWER_DRESSER.get(), 2)
                .pattern("121")
                .pattern("121")
                .pattern("121")
                .define('1', planksJungle)
                .define('2', chest)
                .unlockedBy(getHasName(planksJungle), has(planksJungle))
                .unlockedBy(getHasName(chest), has(chest))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, ModBlocks.WOOD_MEDIUM_CHAIR.get(), 4)
                .pattern("2  ")
                .pattern("122")
                .pattern("1 1")
                .define('1', planksJungle)
                .define('2', woolWhite)
                .unlockedBy(getHasName(planksJungle), has(planksJungle))
                .unlockedBy(getHasName(woolWhite), has(woolWhite))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, ModBlocks.WOOD_MEDIUM_COFFEE_TABLE.get(), 2)
                .pattern("111")
                .pattern("1 1")
                .define('1', planksJungle)
                .unlockedBy(getHasName(planksJungle), has(planksJungle))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, ModBlocks.WOOD_MEDIUM_DESK.get(), 2)
                .pattern("121")
                .pattern("1 1")
                .pattern("1 1")
                .define('1', planksJungle)
                .define('2', chest)
                .unlockedBy(getHasName(planksJungle), has(planksJungle))
                .unlockedBy(getHasName(chest), has(chest))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, ModBlocks.WOOD_MEDIUM_KITCHEN_CABINET_BOTTOM.get(), 2)
                .pattern("333")
                .pattern("111")
                .pattern("121")
                .define('1', planksJungle)
                .define('2', chest)
                .define('3', slabJungle)
                .unlockedBy(getHasName(planksJungle), has(planksJungle))
                .unlockedBy(getHasName(chest), has(chest))
                .unlockedBy(getHasName(slabJungle), has(slabJungle))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, ModBlocks.WOOD_MEDIUM_KITCHEN_CABINET_BOTTOM_2.get(), 2)
                .pattern("131")
                .pattern("111")
                .pattern("121")
                .define('1', planksJungle)
                .define('2', chest)
                .define('3', ironIngot)
                .unlockedBy(getHasName(planksJungle), has(planksJungle))
                .unlockedBy(getHasName(chest), has(chest))
                .unlockedBy(getHasName(ironIngot), has(ironIngot))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, ModBlocks.WOOD_MEDIUM_KITCHEN_CABINET_BOTTOM_2_EXTRA.get(), 2)
                .pattern("111")
                .pattern("131")
                .pattern("121")
                .define('1', planksJungle)
                .define('2', chest)
                .define('3', ironIngot)
                .unlockedBy(getHasName(planksJungle), has(planksJungle))
                .unlockedBy(getHasName(chest), has(chest))
                .unlockedBy(getHasName(ironIngot), has(ironIngot))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, ModBlocks.WOOD_MEDIUM_KITCHEN_CABINET_BOTTOM_B.get(), 2)
                .pattern("333")
                .pattern("111")
                .pattern("121")
                .define('1', planksJungle)
                .define('2', chest)
                .define('3', concreteWhite)
                .unlockedBy(getHasName(planksJungle), has(planksJungle))
                .unlockedBy(getHasName(chest), has(chest))
                .unlockedBy(getHasName(concreteWhite), has(concreteWhite))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, ModBlocks.WOOD_MEDIUM_KITCHEN_CABINET_BOTTOM_B_2.get(), 2)
                .pattern("111")
                .pattern("111")
                .pattern("121")
                .define('1', planksJungle)
                .define('2', chest)
                .unlockedBy(getHasName(planksJungle), has(planksJungle))
                .unlockedBy(getHasName(chest), has(chest))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, ModBlocks.WOOD_MEDIUM_KITCHEN_CABINET_BOTTOM_B_WITH_SINK.get(), 2)
                .pattern("343")
                .pattern("111")
                .pattern("121")
                .define('1', planksJungle)
                .define('2', chest)
                .define('3', concreteWhite)
                .define('4', bucket)
                .unlockedBy(getHasName(planksJungle), has(planksJungle))
                .unlockedBy(getHasName(chest), has(chest))
                .unlockedBy(getHasName(concreteWhite), has(concreteWhite))
                .unlockedBy(getHasName(bucket), has(bucket))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, ModBlocks.WOOD_MEDIUM_KITCHEN_CABINET_BOTTOM_WITH_SINK.get(), 2)
                .pattern("343")
                .pattern("111")
                .pattern("121")
                .define('1', planksJungle)
                .define('2', chest)
                .define('3', slabJungle)
                .define('4', bucket)
                .unlockedBy(getHasName(planksJungle), has(planksJungle))
                .unlockedBy(getHasName(chest), has(chest))
                .unlockedBy(getHasName(slabJungle), has(slabJungle))
                .unlockedBy(getHasName(bucket), has(bucket))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, ModBlocks.WOOD_MEDIUM_KITCHEN_CABINET_TOP.get(), 2)
                .pattern("11")
                .pattern("23")
                .pattern("11")
                .define('1', planksJungle)
                .define('2', chest)
                .define('3', ironIngot)
                .unlockedBy(getHasName(planksJungle), has(planksJungle))
                .unlockedBy(getHasName(chest), has(chest))
                .unlockedBy(getHasName(ironIngot), has(ironIngot))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, ModBlocks.WOOD_MEDIUM_KITCHEN_CABINET_TOP_B.get(), 2)
                .pattern("11")
                .pattern("21")
                .pattern("11")
                .define('1', planksJungle)
                .define('2', chest)
                .unlockedBy(getHasName(planksJungle), has(planksJungle))
                .unlockedBy(getHasName(chest), has(chest))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, ModBlocks.WOOD_MEDIUM_KITCHEN_DRAWERS.get(), 2)
                .pattern("323")
                .pattern("121")
                .pattern("121")
                .define('1', planksJungle)
                .define('2', chest)
                .define('3', slabJungle)
                .unlockedBy(getHasName(planksJungle), has(planksJungle))
                .unlockedBy(getHasName(chest), has(chest))
                .unlockedBy(getHasName(slabJungle), has(slabJungle))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, ModBlocks.WOOD_MEDIUM_KITCHEN_DRAWERS_B.get(), 2)
                .pattern("323")
                .pattern("121")
                .pattern("121")
                .define('1', planksJungle)
                .define('2', chest)
                .define('3', concreteWhite)
                .unlockedBy(getHasName(planksJungle), has(planksJungle))
                .unlockedBy(getHasName(chest), has(chest))
                .unlockedBy(getHasName(concreteWhite), has(concreteWhite))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, ModBlocks.WOOD_MEDIUM_STANDING_DESK.get())
                .pattern("222")
                .pattern("334")
                .pattern("1 1")
                .define('1', concreteBlack)
                .define('2', planksJungle)
                .define('3', redstone)
                .define('4', lever)
                .unlockedBy(getHasName(concreteBlack), has(concreteBlack))
                .unlockedBy(getHasName(planksJungle), has(planksJungle))
                .unlockedBy(getHasName(redstone), has(redstone))
                .unlockedBy(getHasName(lever), has(lever))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, ModBlocks.WOOD_MEDIUM_STANDING_DESK_B.get())
                .pattern("222")
                .pattern("334")
                .pattern("1 1")
                .define('1', concreteBlack)
                .define('2', planksJungle)
                .define('3', redstone)
                .define('4', lever)
                .unlockedBy(getHasName(concreteWhite), has(concreteWhite))
                .unlockedBy(getHasName(planksJungle), has(planksJungle))
                .unlockedBy(getHasName(redstone), has(redstone))
                .unlockedBy(getHasName(lever), has(lever))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, ModBlocks.WOOD_MEDIUM_STRIPED_WALL.get(), 4)
                .pattern("111")
                .pattern("111")
                .pattern("111")
                .define('1', planksJungle)
                .unlockedBy(getHasName(planksJungle), has(planksJungle))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, ModBlocks.WOOD_MEDIUM_TABLE.get(), 2)
                .pattern("222")
                .pattern("1 1")
                .pattern("1 1")
                .define('1', concreteBlack)
                .define('2', planksJungle)
                .unlockedBy(getHasName(concreteBlack), has(concreteBlack))
                .unlockedBy(getHasName(planksJungle), has(planksJungle))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, ModBlocks.WOOD_MEDIUM_TV_STAND.get(), 2)
                .pattern("211")
                .pattern("1 1")
                .define('1', planksJungle)
                .define('2', concreteWhite)
                .unlockedBy(getHasName(planksJungle), has(planksJungle))
                .unlockedBy(getHasName(concreteWhite), has(concreteWhite))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, ModBlocks.WOOD_STANDING_DESK.get())
                .pattern("222")
                .pattern("334")
                .pattern("1 1")
                .define('1', concreteBlack)
                .define('2', planksBirch)
                .define('3', redstone)
                .define('4', lever)
                .unlockedBy(getHasName(concreteBlack), has(concreteBlack))
                .unlockedBy(getHasName(planksBirch), has(planksBirch))
                .unlockedBy(getHasName(redstone), has(redstone))
                .unlockedBy(getHasName(lever), has(lever))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, ModBlocks.WOOD_STANDING_DESK_B.get())
                .pattern("222")
                .pattern("334")
                .pattern("1 1")
                .define('1', concreteWhite)
                .define('2', planksBirch)
                .define('3', redstone)
                .define('4', lever)
                .unlockedBy(getHasName(concreteWhite), has(concreteWhite))
                .unlockedBy(getHasName(planksBirch), has(planksBirch))
                .unlockedBy(getHasName(redstone), has(redstone))
                .unlockedBy(getHasName(lever), has(lever))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, ModBlocks.WOOD_STRIPED_WALL.get(), 4)
                .pattern("111")
                .pattern("111")
                .pattern("111")
                .define('1', planksBirch)
                .unlockedBy(getHasName(planksBirch), has(planksBirch))
                .save(pWriter);
    }
}
