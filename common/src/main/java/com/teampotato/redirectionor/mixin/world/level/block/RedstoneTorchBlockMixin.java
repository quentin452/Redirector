package com.teampotato.redirectionor.mixin.world.level.block;

import com.teampotato.redirectionor.references.DirectionR;
import net.minecraft.core.Direction;
import net.minecraft.world.level.block.RedstoneTorchBlock;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

@Mixin(RedstoneTorchBlock.class)
public abstract class RedstoneTorchBlockMixin {
    @Redirect(method = {"onPlace", "onRemove"}, at = @At(value = "INVOKE", target = "Lnet/minecraft/core/Direction;values()[Lnet/minecraft/core/Direction;"))
    private Direction[] redirectDirectionValues() {
        return DirectionR.DIRECTIONS;
    }
}