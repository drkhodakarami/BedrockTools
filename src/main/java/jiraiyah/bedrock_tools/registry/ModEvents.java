package jiraiyah.bedrock_tools.registry;

import jiraiyah.bedrock_tools.event.KillingEntityHandler;
import jiraiyah.bedrock_tools.event.ServerPlayerEquipChangeHandler;
import net.fabricmc.fabric.api.entity.event.v1.ServerEntityCombatEvents;

import static jiraiyah.bedrock_tools.Reference.log;

public class ModEvents
{
    public ModEvents() { throw new AssertionError(); }

    public static void register()
    {
        log("Registering Events");

        ServerPlayerEquipChangeHandler.register();

        ServerEntityCombatEvents.AFTER_KILLED_OTHER_ENTITY.register(new KillingEntityHandler());
    }
}
