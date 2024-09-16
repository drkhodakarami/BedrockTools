/***********************************************************************************
 * Copyright (c) 2024 Alireza Khodakarami (Jiraiyah)                               *
 * ------------------------------------------------------------------------------- *
 * MIT License                                                                     *
 * =============================================================================== *
 * Permission is hereby granted, free of charge, to any person obtaining a copy    *
 * of this software and associated documentation files (the "Software"), to deal   *
 * in the Software without restriction, including without limitation the rights    *
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell       *
 * copies of the Software, and to permit persons to whom the Software is           *
 * furnished to do so, subject to the following conditions:                        *
 * ------------------------------------------------------------------------------- *
 * The above copyright notice and this permission notice shall be included in all  *
 * copies or substantial portions of the Software.                                 *
 * ------------------------------------------------------------------------------- *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR      *
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,        *
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE     *
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER          *
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,   *
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE   *
 * SOFTWARE.                                                                       *
 ***********************************************************************************/

package jiraiyah.bedrock_tools.registry;

import net.minecraft.block.Blocks;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.ArmorMaterial;
import net.minecraft.recipe.Ingredient;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.entry.RegistryEntry;
import net.minecraft.sound.SoundEvent;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.Util;

import java.util.EnumMap;
import java.util.List;
import java.util.function.Supplier;

import static jiraiyah.bedrock_tools.Reference.identifier;

public class ModArmorMaterials
{
    public static final RegistryEntry<ArmorMaterial> BEDROCK = register("bedrock",
                                                                         Util.make(new EnumMap<>(ArmorItem.Type.class),
                                                                                   map ->
                                                                                   {
                                                                                       map.put(ArmorItem.Type.BOOTS, 6);
                                                                                       map.put(ArmorItem.Type.LEGGINGS, 10);
                                                                                       map.put(ArmorItem.Type.CHESTPLATE, 14);
                                                                                       map.put(ArmorItem.Type.HELMET, 6);
                                                                                       map.put(ArmorItem.Type.BODY, 16);
                                                                                   }),
                                                                         30, SoundEvents.ITEM_ARMOR_EQUIP_NETHERITE,
                                                                         5.0f, 0.6f,
                                                                         () -> Ingredient.ofItems(Blocks.BEDROCK));

    public static final RegistryEntry<ArmorMaterial> OBSIDIAN = register("obsidian",
                                                                     Util.make(new EnumMap<>(ArmorItem.Type.class),
                                                                               map ->
                                                                               {
                                                                                   map.put(ArmorItem.Type.BOOTS, 4);
                                                                                   map.put(ArmorItem.Type.LEGGINGS, 6);
                                                                                   map.put(ArmorItem.Type.CHESTPLATE, 8);
                                                                                   map.put(ArmorItem.Type.HELMET, 4);
                                                                                   map.put(ArmorItem.Type.BODY, 8);
                                                                               }),
                                                                     0, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND,
                                                                     2.0f, 0.2f,
                                                                     () -> Ingredient.ofItems(Blocks.OBSIDIAN));

    public ModArmorMaterials()
    {
        throw new AssertionError();
    }

    //region HELPER METHODS
    private static RegistryEntry<ArmorMaterial> register(String id, EnumMap<ArmorItem.Type, Integer> defense, int enchantability, RegistryEntry<SoundEvent> equipSound, float toughness, float knockbackResistance, Supplier<Ingredient> repairIngredient)
    {
        List<ArmorMaterial.Layer> list = List.of(new ArmorMaterial.Layer(identifier(id)));
        return register(id, defense, enchantability, equipSound, toughness, knockbackResistance, repairIngredient, list);
    }

    private static RegistryEntry<ArmorMaterial> register(String id, EnumMap<ArmorItem.Type, Integer> defense, int enchantability, RegistryEntry<SoundEvent> equipSound, float toughness, float knockbackResistance, Supplier<Ingredient> repairIngredient, List<ArmorMaterial.Layer> layers)
    {
        EnumMap<ArmorItem.Type, Integer> enumMap = new EnumMap<ArmorItem.Type, Integer>(ArmorItem.Type.class);
        for (ArmorItem.Type type : ArmorItem.Type.values())
        {
            enumMap.put(type, defense.get(type));
        }
        return Registry.registerReference(Registries.ARMOR_MATERIAL, identifier(id),
                                          new ArmorMaterial(enumMap, enchantability, equipSound, repairIngredient,
                                                            layers, toughness, knockbackResistance));
    }
    //endregion
}