package me.sabitheotome.bouncy.mixin;

import me.sabitheotome.bouncy.ProjectileCollision;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

import net.minecraft.entity.projectile.ProjectileEntity;
import net.minecraft.entity.projectile.ShulkerBulletEntity;
import net.minecraft.util.hit.HitResult;

@Mixin(ShulkerBulletEntity.class)
public class ShulkerBulletEntityMixin {

    private ProjectileEntity self = (ProjectileEntity) (Object) this;

    @Inject(method = "onCollision", at = @At("HEAD"), cancellable = true)
    protected void onCollision(HitResult result, CallbackInfo c) {
        ProjectileCollision.onCollision(self, result, c);
    }

}
