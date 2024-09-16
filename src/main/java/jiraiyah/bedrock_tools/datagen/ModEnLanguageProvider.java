package jiraiyah.bedrock_tools.datagen;

import jiraiyah.bedrock_tools.registry.ModEffects;
import jiraiyah.bedrock_tools.registry.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricLanguageProvider;
import net.minecraft.registry.RegistryWrapper;

import java.util.concurrent.CompletableFuture;

import static jiraiyah.bedrock_tools.Reference.ModID;

public class ModEnLanguageProvider extends FabricLanguageProvider
{
    public ModEnLanguageProvider(FabricDataOutput dataOutput, CompletableFuture<RegistryWrapper.WrapperLookup> registryLookup)
    {
        super(dataOutput, "en_us", registryLookup);
    }

    @Override
    public void generateTranslations(RegistryWrapper.WrapperLookup registryLookup, TranslationBuilder builder)
    {
        builder.add(ModItems.OBSIDIAN_AXE, "Obsidian Axe");
        builder.add(ModItems.OBSIDIAN_HOE, "Obsidian Hoe");
        builder.add(ModItems.OBSIDIAN_PICKAXE, "Obsidian Pickaxe");
        builder.add(ModItems.OBSIDIAN_SHOVEL, "Obsidian Shovel");
        builder.add(ModItems.OBSIDIAN_SWORD, "Obsidian Sword");

        builder.add(ModItems.OBSIDIAN_HELMET, "Obsidian Helmet");
        builder.add(ModItems.OBSIDIAN_CHESTPLATE, "Obsidian Chestplate");
        builder.add(ModItems.OBSIDIAN_LEGGINGS, "Obsidian Leggings");
        builder.add(ModItems.OBSIDIAN_BOOTS, "Obsidian Boots");

        builder.add(ModItems.BEDROCK_AXE, "Bedrock Axe");
        builder.add(ModItems.BEDROCK_HOE, "Bedrock Hoe");
        builder.add(ModItems.BEDROCK_PICKAXE, "Bedrock Pickaxe");
        builder.add(ModItems.BEDROCK_SHOVEL, "Bedrock Shovel");
        builder.add(ModItems.BEDROCK_SWORD, "Bedrock Sword");

        builder.add(ModItems.BEDROCK_HELMET, "Bedrock Helmet");
        builder.add(ModItems.BEDROCK_CHESTPLATE, "Bedrock Chestplate");
        builder.add(ModItems.BEDROCK_LEGGINGS, "Bedrock Leggings");
        builder.add(ModItems.BEDROCK_BOOTS, "Bedrock Boots");

        builder.add("effect." + ModID + ".flight", "Flight");
    }
}
