package com.teampotato.redirectionor.mixin.world.level.block;

import com.teampotato.redirectionor.Redirectionor;
import net.minecraft.core.Direction;
import net.minecraft.world.level.block.SpongeBlock;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

@Mixin(SpongeBlock.class)
public class SpongeBlockMixin {
    @Redirect(method = "removeWaterBreadthFirstSearch", at = @At(value = "INVOKE", target = "Lnet/minecraft/core/Direction;values()[Lnet/minecraft/core/Direction;"))
    private Direction[] redirectDirection() {
        return Redirectionor.DIRECTIONS;
    }
}
