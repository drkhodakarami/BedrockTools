package jiraiyah.bedrock_tools.event;

import jiraiyah.bedrock_tools.registry.ModEffects;
import jiraiyah.bedrock_tools.registry.ModItems;
import net.fabricmc.fabric.api.event.lifecycle.v1.ServerEntityEvents;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.entity.player.PlayerEntity;

public class ServerPlayerEquipChangeHandler
{
    public ServerPlayerEquipChangeHandler()
    {
        throw new AssertionError();
    }

    public static void register()
    {
        ServerEntityEvents.EQUIPMENT_CHANGE.register(((livingEntity, equipmentSlot, previousStack, currentStack) ->
        {
            if(!(livingEntity instanceof PlayerEntity player))
                return;
            if(!equipmentSlot.isArmorSlot())
                return;
            if(previousStack.isOf(ModItems.OBSIDIAN_HELMET))
                player.removeStatusEffect(StatusEffects.CONDUIT_POWER);
            else if(previousStack.isOf(ModItems.OBSIDIAN_CHESTPLATE))
                player.removeStatusEffect(StatusEffects.DOLPHINS_GRACE);
            else if(previousStack.isOf(ModItems.OBSIDIAN_LEGGINGS))
                player.removeStatusEffect(StatusEffects.FIRE_RESISTANCE);
            else if(previousStack.isOf(ModItems.BEDROCK_HELMET))
                player.removeStatusEffect(StatusEffects.SATURATION);
            else if(previousStack.isOf(ModItems.BEDROCK_CHESTPLATE))
                player.removeStatusEffect(StatusEffects.REGENERATION);
            else if(previousStack.isOf(ModItems.BEDROCK_LEGGINGS))
                player.removeStatusEffect(ModEffects.FLIGHT_EFFECT);
            else if(previousStack.isOf(ModItems.OBSIDIAN_BOOTS) ||
                    previousStack.isOf(ModItems.BEDROCK_BOOTS))
                player.removeStatusEffect(StatusEffects.INVISIBILITY);

            if(currentStack.isOf(ModItems.OBSIDIAN_HELMET))
            {
                player.addStatusEffect(new StatusEffectInstance(StatusEffects.CONDUIT_POWER, -1, 3, false, false, true));
                return;
            }
            if(currentStack.isOf(ModItems.OBSIDIAN_CHESTPLATE))
            {
                player.addStatusEffect(new StatusEffectInstance(StatusEffects.DOLPHINS_GRACE, -1, 3, false, false, true));
                return;
            }
            if(currentStack.isOf(ModItems.OBSIDIAN_LEGGINGS))
            {
                player.addStatusEffect(new StatusEffectInstance(StatusEffects.FIRE_RESISTANCE, -1, 3, false, false, true));
                return;
            }

            if(currentStack.isOf(ModItems.BEDROCK_HELMET))
            {
                player.addStatusEffect(new StatusEffectInstance(StatusEffects.SATURATION, -1, 3, false, false, true));
                return;
            }
            if(currentStack.isOf(ModItems.BEDROCK_CHESTPLATE))
            {
                player.addStatusEffect(new StatusEffectInstance(StatusEffects.REGENERATION, -1, 3, false, false, true));
                return;
            }
            if(currentStack.isOf(ModItems.BEDROCK_LEGGINGS))
            {
                player.addStatusEffect(new StatusEffectInstance(ModEffects.FLIGHT_EFFECT, -1, 3, false, false, true));
                return;
            }
            if(currentStack.isOf(ModItems.OBSIDIAN_BOOTS) ||
               currentStack.isOf(ModItems.BEDROCK_BOOTS))
            {
                player.addStatusEffect(new StatusEffectInstance(StatusEffects.INVISIBILITY, -1, 3, false, false, true));
                return;
            }
        }));
    }
}
