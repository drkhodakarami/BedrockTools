package jiraiyah.bedrock_tools.datagen;

import jiraiyah.bedrock_tools.registry.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.ItemTags;

import java.util.concurrent.CompletableFuture;

import static jiraiyah.bedrock_tools.Reference.logRGB256;

public class ModItemTagProvider extends FabricTagProvider.ItemTagProvider
{

    public ModItemTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> completableFuture)
    {
        super(output, completableFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup wrapperLookup)
    {
        logRGB256("Generating Item Tag Data", 0, 255, 0);

        getOrCreateTagBuilder(ItemTags.AXES)
                .add(ModItems.OBSIDIAN_AXE)
                .add(ModItems.BEDROCK_AXE);
        getOrCreateTagBuilder(ItemTags.HOES)
                .add(ModItems.OBSIDIAN_HOE)
                .add(ModItems.BEDROCK_HOE);
        getOrCreateTagBuilder(ItemTags.PICKAXES)
                .add(ModItems.OBSIDIAN_PICKAXE)
                .add(ModItems.BEDROCK_PICKAXE);
        getOrCreateTagBuilder(ItemTags.SHOVELS)
                .add(ModItems.OBSIDIAN_SHOVEL)
                .add(ModItems.BEDROCK_SHOVEL);
        getOrCreateTagBuilder(ItemTags.SWORDS)
                .add(ModItems.OBSIDIAN_SWORD)
                .add(ModItems.BEDROCK_SWORD);
        getOrCreateTagBuilder(ItemTags.TRIMMABLE_ARMOR)
                .add(ModItems.BEDROCK_HELMET)
                .add(ModItems.BEDROCK_CHESTPLATE)
                .add(ModItems.BEDROCK_LEGGINGS)
                .add(ModItems.BEDROCK_BOOTS)
                .add(ModItems.OBSIDIAN_HELMET)
                .add(ModItems.OBSIDIAN_CHESTPLATE)
                .add(ModItems.OBSIDIAN_LEGGINGS)
                .add(ModItems.OBSIDIAN_BOOTS);
        getOrCreateTagBuilder(ItemTags.HEAD_ARMOR)
                .add(ModItems.BEDROCK_HELMET)
                .add(ModItems.OBSIDIAN_HELMET);
        getOrCreateTagBuilder(ItemTags.CHEST_ARMOR)
                .add(ModItems.BEDROCK_CHESTPLATE)
                .add(ModItems.OBSIDIAN_CHESTPLATE);
        getOrCreateTagBuilder(ItemTags.LEG_ARMOR)
                .add(ModItems.BEDROCK_LEGGINGS)
                .add(ModItems.OBSIDIAN_LEGGINGS);
        getOrCreateTagBuilder(ItemTags.FOOT_ARMOR)
                .add(ModItems.BEDROCK_BOOTS)
                .add(ModItems.OBSIDIAN_BOOTS);
    }
}
