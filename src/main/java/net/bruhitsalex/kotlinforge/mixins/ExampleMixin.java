package net.bruhitsalex.kotlinforge.mixins;

import net.minecraft.client.Minecraft;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(Minecraft.class)
public class ExampleMixin {

    @Inject(method = "startGame", at = @At("HEAD"))
    public void startGame(CallbackInfo ci) {
        System.out.println("Hello from kotlinforge!");
    }

}
