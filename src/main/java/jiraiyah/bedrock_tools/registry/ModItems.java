package jiraiyah.bedrock_tools.registry;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.*;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;

import static jiraiyah.bedrock_tools.Reference.identifier;
import static jiraiyah.bedrock_tools.Reference.log;

public class ModItems
{
    public static Item OBSIDIAN_AXE, OBSIDIAN_HOE, OBSIDIAN_PICKAXE, OBSIDIAN_SHOVEL, OBSIDIAN_SWORD,
                       BEDROCK_AXE, BEDROCK_HOE, BEDROCK_PICKAXE, BEDROCK_SHOVEL, BEDROCK_SWORD,
                       OBSIDIAN_HELMET, OBSIDIAN_CHESTPLATE, OBSIDIAN_LEGGINGS, OBSIDIAN_BOOTS,
                       BEDROCK_HELMET, BEDROCK_CHESTPLATE, BEDROCK_LEGGINGS, BEDROCK_BOOTS;

    public ModItems()
    {
        throw new AssertionError();
    }

    public static void register()
    {
        log("Registering Items");

        OBSIDIAN_AXE = register("obsidian_axe",
                                 new AxeItem(ModToolMaterials.OBSIDIAN,
                                             new Item.Settings().attributeModifiers(
                                                     AxeItem.createAttributeModifiers(
                                                             ModToolMaterials.OBSIDIAN,
                                                             5.0f, -1.5f))));
        OBSIDIAN_HOE = register("obsidian_hoe",
                                 new HoeItem(ModToolMaterials.OBSIDIAN,
                                             new Item.Settings().attributeModifiers(
                                                     HoeItem.createAttributeModifiers(
                                                             ModToolMaterials.OBSIDIAN,
                                                             -0.0f, -0.0f))));
        OBSIDIAN_PICKAXE = register("obsidian_pickaxe",
                                     new PickaxeItem(ModToolMaterials.OBSIDIAN,
                                                     new Item.Settings().attributeModifiers(
                                                             PickaxeItem.createAttributeModifiers(
                                                                     ModToolMaterials.OBSIDIAN,
                                                                     1.0f, -1.0f))));
        OBSIDIAN_SHOVEL = register("obsidian_shovel",
                                    new ShovelItem(ModToolMaterials.OBSIDIAN,
                                                   new Item.Settings().attributeModifiers(
                                                           ShovelItem.createAttributeModifiers(
                                                                   ModToolMaterials.OBSIDIAN,
                                                                   0.0f, -0.0f))));
        OBSIDIAN_SWORD = register("obsidian_sword",
                                   new SwordItem(ModToolMaterials.OBSIDIAN,
                                                 new Item.Settings().attributeModifiers(
                                                         SwordItem.createAttributeModifiers(
                                                                 ModToolMaterials.OBSIDIAN,
                                                                 4, -1.0f))));

        OBSIDIAN_HELMET = //CONDUIT_POWER
                register("obsidian_helmet",
                         new ArmorItem(ModArmorMaterials.OBSIDIAN,
                                            ArmorItem.Type.HELMET,
                                            new Item.Settings()
                                               .maxDamage(ArmorItem.Type.HELMET.getMaxDamage(36))));
        OBSIDIAN_CHESTPLATE = //DOLPHINS_GRACE
                register("obsidian_chestplate",
                         new ArmorItem(ModArmorMaterials.OBSIDIAN,
                                                ArmorItem.Type.CHESTPLATE,
                                                new Item.Settings()
                                               .maxDamage(ArmorItem.Type.CHESTPLATE.getMaxDamage(36))));
        OBSIDIAN_LEGGINGS = //FIRE_RESISTANCE
                register("obsidian_leggings",
                         new ArmorItem(ModArmorMaterials.OBSIDIAN,
                                              ArmorItem.Type.LEGGINGS,
                                              new Item.Settings()
                                                  .maxDamage(ArmorItem.Type.LEGGINGS.getMaxDamage(36))));
        OBSIDIAN_BOOTS = //INVISIBILITY
                register("obsidian_boots",
                         new ArmorItem(ModArmorMaterials.OBSIDIAN,
                                      ArmorItem.Type.BOOTS,
                                      new Item.Settings()
                                               .maxDamage(ArmorItem.Type.BOOTS.getMaxDamage(36))));

        BEDROCK_AXE = register("bedrock_axe",
                                     new AxeItem(ModToolMaterials.BEDROCK,
                                                 new Item.Settings().attributeModifiers(
                                                         AxeItem.createAttributeModifiers(
                                                                 ModToolMaterials.BEDROCK,
                                                                 20.0f, -2.5f))));
        BEDROCK_HOE = register("bedrock_hoe",
                                     new HoeItem(ModToolMaterials.BEDROCK,
                                                 new Item.Settings().attributeModifiers(
                                                         HoeItem.createAttributeModifiers(
                                                                 ModToolMaterials.BEDROCK,
                                                                 -0.0f, -0.0f))));
        BEDROCK_PICKAXE = register("bedrock_pickaxe",
                                         new PickaxeItem(ModToolMaterials.BEDROCK,
                                                           new Item.Settings().attributeModifiers(
                                                                 PickaxeItem.createAttributeModifiers(
                                                                         ModToolMaterials.BEDROCK,
                                                                         1.0f, -1.0f))));
        BEDROCK_SHOVEL = register("bedrock_shovel",
                                        new ShovelItem(ModToolMaterials.BEDROCK,
                                                       new Item.Settings().attributeModifiers(
                                                               ShovelItem.createAttributeModifiers(
                                                                       ModToolMaterials.BEDROCK,
                                                                       0.0f, -0.0f))));
        BEDROCK_SWORD = register("bedrock_sword",
                                 new SwordItem(ModToolMaterials.BEDROCK,
                                                  new Item.Settings().attributeModifiers(
                                                          SwordItem.createAttributeModifiers(
                                                               ModToolMaterials.BEDROCK,
                                                               35, -1.6f))));

        BEDROCK_HELMET = //SATURATION
                register("bedrock_helmet",
                         new ArmorItem(ModArmorMaterials.BEDROCK,
                                           ArmorItem.Type.HELMET,
                                           new Item.Settings()
                                               .maxDamage(ArmorItem.Type.HELMET.getMaxDamage(42))));
        BEDROCK_CHESTPLATE = //FLIGHT
                register("bedrock_chestplate",
                         new ArmorItem(ModArmorMaterials.BEDROCK,
                                       ArmorItem.Type.CHESTPLATE,
                                       new Item.Settings()
                                               .maxDamage(ArmorItem.Type.CHESTPLATE.getMaxDamage(42))));
        BEDROCK_LEGGINGS = //REGENERATION
                register("bedrock_leggings",
                         new ArmorItem(ModArmorMaterials.BEDROCK,
                                          ArmorItem.Type.LEGGINGS,
                                          new Item.Settings()
                                                  .maxDamage(ArmorItem.Type.LEGGINGS.getMaxDamage(42))));
        BEDROCK_BOOTS = //INVISIBILITY
                register("bedrock_boots",
                         new ArmorItem(ModArmorMaterials.BEDROCK,
                                       ArmorItem.Type.BOOTS,
                                       new Item.Settings()
                                               .maxDamage(ArmorItem.Type.BOOTS.getMaxDamage(42))));

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.TOOLS).register(entries ->
                                                                                {
                                                                                    entries.add(OBSIDIAN_AXE);
                                                                                    entries.add(OBSIDIAN_HOE);
                                                                                    entries.add(OBSIDIAN_PICKAXE);
                                                                                    entries.add(OBSIDIAN_SHOVEL);

                                                                                    entries.add(BEDROCK_AXE);
                                                                                    entries.add(BEDROCK_HOE);
                                                                                    entries.add(BEDROCK_PICKAXE);
                                                                                    entries.add(BEDROCK_SHOVEL);
                                                                                });
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.COMBAT).register(entries ->
                                                                       {
                                                                           entries.add(OBSIDIAN_SWORD);
                                                                           entries.add(OBSIDIAN_AXE);
                                                                           entries.add(OBSIDIAN_HELMET);
                                                                           entries.add(OBSIDIAN_CHESTPLATE);
                                                                           entries.add(OBSIDIAN_LEGGINGS);
                                                                           entries.add(OBSIDIAN_BOOTS);

                                                                           entries.add(BEDROCK_SWORD);
                                                                           entries.add(BEDROCK_AXE);
                                                                           entries.add(BEDROCK_HELMET);
                                                                           entries.add(BEDROCK_CHESTPLATE);
                                                                           entries.add(BEDROCK_LEGGINGS);
                                                                           entries.add(BEDROCK_BOOTS);
                                                                       });
    }

    //region HELPER METHODS
    private static Item register(String name, Item item)
    {
        return Registry.register(Registries.ITEM, identifier(name), item);
    }
    //endregion
}
