package jiraiyah.bedrock_tools.datagen;

import jiraiyah.bedrock_tools.registry.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;
import net.minecraft.data.client.Models;
import net.minecraft.item.ArmorItem;

import static jiraiyah.bedrock_tools.Reference.logRGB256;

public class ModModelProvider extends FabricModelProvider
{
    public ModModelProvider(FabricDataOutput output)
    {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator)
    {
        logRGB256("Generating Block Model Data", 0, 255, 0);
    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator)
    {
        logRGB256("Generating Item Model Data", 0, 255, 0);

        itemModelGenerator.register(ModItems.OBSIDIAN_AXE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.OBSIDIAN_HOE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.OBSIDIAN_PICKAXE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.OBSIDIAN_SHOVEL, Models.HANDHELD);
        itemModelGenerator.register(ModItems.OBSIDIAN_SWORD, Models.HANDHELD);

        itemModelGenerator.register(ModItems.BEDROCK_AXE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.BEDROCK_HOE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.BEDROCK_PICKAXE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.BEDROCK_SHOVEL, Models.HANDHELD);
        itemModelGenerator.register(ModItems.BEDROCK_SWORD, Models.HANDHELD);

        itemModelGenerator.registerArmor((ArmorItem) ModItems.OBSIDIAN_HELMET);
        itemModelGenerator.registerArmor((ArmorItem) ModItems.OBSIDIAN_CHESTPLATE);
        itemModelGenerator.registerArmor((ArmorItem) ModItems.OBSIDIAN_LEGGINGS);
        itemModelGenerator.registerArmor((ArmorItem) ModItems.OBSIDIAN_BOOTS);

        itemModelGenerator.registerArmor((ArmorItem) ModItems.BEDROCK_HELMET);
        itemModelGenerator.registerArmor((ArmorItem) ModItems.BEDROCK_CHESTPLATE);
        itemModelGenerator.registerArmor((ArmorItem) ModItems.BEDROCK_LEGGINGS);
        itemModelGenerator.registerArmor((ArmorItem) ModItems.BEDROCK_BOOTS);
    }
}
