package com.teampotato.directionoptimizer.mixin.util.math.vector;

import com.teampotato.directionoptimizer.DirectionOptimizer;
import net.minecraft.util.Direction;
import net.minecraft.util.math.vector.Orientation;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

@Mixin(Orientation.class)
public abstract class OrientationMixin {
    @Redirect(method = "rotate(Lnet/minecraft/util/Direction;)Lnet/minecraft/util/Direction;", at = @At(value = "INVOKE", target = "Lnet/minecraft/util/Direction;values()[Lnet/minecraft/util/Direction;"))
    private Direction[] implOpt1() {
        return DirectionOptimizer.DIRECTIONS;
    }
}