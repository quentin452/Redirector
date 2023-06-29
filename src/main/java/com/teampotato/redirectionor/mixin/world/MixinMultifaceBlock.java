package com.teampotato.redirectionor.mixin.world;

import com.teampotato.redirectionor.Redirectionor;
import net.minecraft.core.Direction;
import net.minecraft.world.level.block.MultifaceBlock;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

@Mixin(MultifaceBlock.class)
public abstract class MixinMultifaceBlock {
    @Redirect(method = "availableFaces", at = @At(value = "INVOKE", target = "Lnet/minecraft/core/Direction;values()[Lnet/minecraft/core/Direction;"))
    private static Direction[] implValues1() {
        return Redirectionor.DIRECTIONS;
    }

    @Redirect(method = "unpack", at = @At(value = "INVOKE", target = "Lnet/minecraft/core/Direction;values()[Lnet/minecraft/core/Direction;"))
    private static Direction[] implValues2() {
        return Redirectionor.DIRECTIONS;
    }
}
