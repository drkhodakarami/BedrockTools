package jiraiyah.bedrock_tools.datagen;

import jiraiyah.bedrock_tools.registry.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.data.server.recipe.RecipeExporter;
import net.minecraft.data.server.recipe.ShapedRecipeJsonBuilder;
import net.minecraft.item.Items;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.registry.RegistryWrapper;

import java.util.concurrent.CompletableFuture;

import static jiraiyah.bedrock_tools.Reference.identifier;

public class ModRecipeProvider extends FabricRecipeProvider
{
    public ModRecipeProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture)
    {
        super(output, registriesFuture);
    }

    @Override
    public void generate(RecipeExporter exporter)
    {
        //<editor-fold desc="OBSIDIAN TOOLS">
        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.OBSIDIAN_AXE, 1)
                               .pattern("OO ")
                               .pattern("OO ")
                               .pattern(" O ")
                               .input('O', Items.OBSIDIAN)
                               .criterion(hasItem(Items.OBSIDIAN), conditionsFromItem(Items.OBSIDIAN))
                               .offerTo(exporter, identifier(getRecipeName(ModItems.OBSIDIAN_AXE)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.OBSIDIAN_HOE, 1)
                               .pattern("OO ")
                               .pattern(" O ")
                               .pattern(" O ")
                               .input('O', Items.OBSIDIAN)
                               .criterion(hasItem(Items.OBSIDIAN), conditionsFromItem(Items.OBSIDIAN))
                               .offerTo(exporter, identifier(getRecipeName(ModItems.OBSIDIAN_HOE)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.OBSIDIAN_PICKAXE, 1)
                               .pattern("OOO")
                               .pattern(" O ")
                               .pattern(" O ")
                               .input('O', Items.OBSIDIAN)
                               .criterion(hasItem(Items.OBSIDIAN), conditionsFromItem(Items.OBSIDIAN))
                               .offerTo(exporter, identifier(getRecipeName(ModItems.OBSIDIAN_PICKAXE)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.OBSIDIAN_SHOVEL, 1)
                               .pattern(" O ")
                               .pattern(" O ")
                               .pattern(" O ")
                               .input('O', Items.OBSIDIAN)
                               .criterion(hasItem(Items.OBSIDIAN), conditionsFromItem(Items.OBSIDIAN))
                               .offerTo(exporter, identifier(getRecipeName(ModItems.OBSIDIAN_SHOVEL)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, ModItems.OBSIDIAN_SWORD, 1)
                               .pattern("  O")
                               .pattern(" O ")
                               .pattern("O  ")
                               .input('O', Items.OBSIDIAN)
                               .criterion(hasItem(Items.OBSIDIAN), conditionsFromItem(Items.OBSIDIAN))
                               .offerTo(exporter, identifier(getRecipeName(ModItems.OBSIDIAN_SWORD)));
        //</editor-fold>

        //<editor-fold desc="BEDROCK TOOLS">
        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.BEDROCK_AXE, 1)
                               .pattern("OO ")
                               .pattern("OO ")
                               .pattern(" O ")
                               .input('O', Items.BEDROCK)
                               .criterion(hasItem(Items.BEDROCK), conditionsFromItem(Items.BEDROCK))
                               .offerTo(exporter, identifier(getRecipeName(ModItems.BEDROCK_AXE)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.BEDROCK_HOE, 1)
                               .pattern("OO ")
                               .pattern(" O ")
                               .pattern(" O ")
                               .input('O', Items.BEDROCK)
                               .criterion(hasItem(Items.BEDROCK), conditionsFromItem(Items.BEDROCK))
                               .offerTo(exporter, identifier(getRecipeName(ModItems.BEDROCK_HOE)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.BEDROCK_PICKAXE, 1)
                               .pattern("OOO")
                               .pattern(" O ")
                               .pattern(" O ")
                               .input('O', Items.BEDROCK)
                               .criterion(hasItem(Items.BEDROCK), conditionsFromItem(Items.BEDROCK))
                               .offerTo(exporter, identifier(getRecipeName(ModItems.BEDROCK_PICKAXE)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.BEDROCK_SHOVEL, 1)
                               .pattern(" O ")
                               .pattern(" O ")
                               .pattern(" O ")
                               .input('O', Items.BEDROCK)
                               .criterion(hasItem(Items.BEDROCK), conditionsFromItem(Items.BEDROCK))
                               .offerTo(exporter, identifier(getRecipeName(ModItems.BEDROCK_SHOVEL)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, ModItems.BEDROCK_SWORD, 1)
                               .pattern("  O")
                               .pattern(" O ")
                               .pattern("O  ")
                               .input('O', Items.BEDROCK)
                               .criterion(hasItem(Items.BEDROCK), conditionsFromItem(Items.BEDROCK))
                               .offerTo(exporter, identifier(getRecipeName(ModItems.BEDROCK_SWORD)));
        //</editor-fold>

        //<editor-fold desc="OBSIDIAN ARMOR">
        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, ModItems.OBSIDIAN_HELMET, 1)
                               .pattern("OOO")
                               .pattern("O O")
                               .pattern(" O ")
                               .input('O', Items.OBSIDIAN)
                               .criterion(hasItem(Items.OBSIDIAN), conditionsFromItem(Items.OBSIDIAN))
                               .offerTo(exporter, identifier(getRecipeName(ModItems.OBSIDIAN_HELMET)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, ModItems.OBSIDIAN_CHESTPLATE, 1)
                               .pattern("O O")
                               .pattern("OOO")
                               .pattern("OOO")
                               .input('O', Items.OBSIDIAN)
                               .criterion(hasItem(Items.OBSIDIAN), conditionsFromItem(Items.OBSIDIAN))
                               .offerTo(exporter, identifier(getRecipeName(ModItems.OBSIDIAN_CHESTPLATE)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, ModItems.OBSIDIAN_LEGGINGS, 1)
                               .pattern("OOO")
                               .pattern("O O")
                               .pattern("O O")
                               .input('O', Items.OBSIDIAN)
                               .criterion(hasItem(Items.OBSIDIAN), conditionsFromItem(Items.OBSIDIAN))
                               .offerTo(exporter, identifier(getRecipeName(ModItems.OBSIDIAN_LEGGINGS)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, ModItems.OBSIDIAN_BOOTS, 1)
                               .pattern("   ")
                               .pattern("O O")
                               .pattern("O O")
                               .input('O', Items.OBSIDIAN)
                               .criterion(hasItem(Items.OBSIDIAN), conditionsFromItem(Items.OBSIDIAN))
                               .offerTo(exporter, identifier(getRecipeName(ModItems.OBSIDIAN_BOOTS)));
        //</editor-fold>

        //<editor-fold desc="BEDROCK ARMOR">
        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, ModItems.BEDROCK_HELMET, 1)
                               .pattern("OOO")
                               .pattern("O O")
                               .pattern(" O ")
                               .input('O', Items.BEDROCK)
                               .criterion(hasItem(Items.BEDROCK), conditionsFromItem(Items.BEDROCK))
                               .offerTo(exporter, identifier(getRecipeName(ModItems.BEDROCK_HELMET)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, ModItems.BEDROCK_CHESTPLATE, 1)
                               .pattern("O O")
                               .pattern("OOO")
                               .pattern("OOO")
                               .input('O', Items.BEDROCK)
                               .criterion(hasItem(Items.BEDROCK), conditionsFromItem(Items.BEDROCK))
                               .offerTo(exporter, identifier(getRecipeName(ModItems.BEDROCK_CHESTPLATE)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, ModItems.BEDROCK_LEGGINGS, 1)
                               .pattern("OOO")
                               .pattern("O O")
                               .pattern("O O")
                               .input('O', Items.BEDROCK)
                               .criterion(hasItem(Items.BEDROCK), conditionsFromItem(Items.BEDROCK))
                               .offerTo(exporter, identifier(getRecipeName(ModItems.BEDROCK_LEGGINGS)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, ModItems.BEDROCK_BOOTS, 1)
                               .pattern("   ")
                               .pattern("O O")
                               .pattern("O O")
                               .input('O', Items.BEDROCK)
                               .criterion(hasItem(Items.BEDROCK), conditionsFromItem(Items.BEDROCK))
                               .offerTo(exporter, identifier(getRecipeName(ModItems.BEDROCK_BOOTS)));
        //</editor-fold>
    }
}
