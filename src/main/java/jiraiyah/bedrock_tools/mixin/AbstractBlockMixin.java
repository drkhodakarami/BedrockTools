package jiraiyah.bedrock_tools.mixin;

import com.llamalad7.mixinextras.injector.ModifyReturnValue;
import jiraiyah.bedrock_tools.registry.ModItems;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;

@Mixin(AbstractBlock.class)
public class AbstractBlockMixin
{
	private final float effectiveHardness = 36.0F;

	@ModifyReturnValue(method = "calcBlockBreakingDelta", at = @At("RETURN"))
	private float bedrockPickaxeBreakingValue(float original, BlockState state, PlayerEntity player)
	{
		ItemStack stack = player.getMainHandStack();

		if((state.getBlock() == Blocks.BEDROCK || state.getBlock() == Blocks.END_PORTAL_FRAME) &&
		   (stack.getItem() == ModItems.OBSIDIAN_PICKAXE || stack.getItem() == ModItems.BEDROCK_PICKAXE))
			return player.getBlockBreakingSpeed(state) / effectiveHardness;
		return original;
	}
}