package jiraiyah.bedrock_tools.registry;

import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffectCategory;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.entry.RegistryEntry;

import static jiraiyah.bedrock_tools.Reference.identifier;
import static jiraiyah.bedrock_tools.Reference.log;

public class ModEffects
{
    //public static StatusEffect FLIGHT_EFFECT;
    public static RegistryEntry<StatusEffect> FLIGHT_EFFECT;

    public ModEffects()
    {
        throw new AssertionError();
    }

    public static void register()
    {
        log("Registering Effects");

        /*FLIGHT_EFFECT = Registry.register(Registries.STATUS_EFFECT, identifier("flight"),
                                          new FlightEffect(StatusEffectCategory.BENEFICIAL, 0xFFFFFF));*/

        FLIGHT_EFFECT = Registry.registerReference(Registries.STATUS_EFFECT, identifier("flight"),
                                          new FlightEffect(StatusEffectCategory.BENEFICIAL, 0xFFFFFF));
    }
}
