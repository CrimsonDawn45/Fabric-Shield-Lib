package me.crimsondawn45.fabricshieldlib.mixin;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Invoker;

import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.damage.DamageSource;

@Mixin(LivingEntity.class)
public interface LivingEntityAccessor {
	
	@Invoker("blockedByShield")
	boolean fabricshieldlib$invokeBlockedByShield(DamageSource source);

	@Invoker("damageShield")
	void fabricshieldlib$invokeDamageShield(float amount);

	@Invoker("takeShieldHit")
	void fabricshieldlib$invokeTakeShieldHit(LivingEntity attacker);
}