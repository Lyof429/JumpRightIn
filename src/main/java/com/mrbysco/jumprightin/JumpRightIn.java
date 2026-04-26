package com.mrbysco.jumprightin;

import com.mojang.logging.LogUtils;
import com.mrbysco.jumprightin.config.JumpConfig;
import fuzs.forgeconfigapiport.api.config.v2.ForgeConfigRegistry;
import net.fabricmc.api.ClientModInitializer;
import net.minecraftforge.fml.config.ModConfig;
import org.slf4j.Logger;

public class JumpRightIn implements ClientModInitializer {
	public static final String MOD_ID = "jumprightin";
	public static final Logger LOGGER = LogUtils.getLogger();

	public void onInitializeClient() {
		ForgeConfigRegistry.INSTANCE.register(MOD_ID, ModConfig.Type.CLIENT, JumpConfig.clientSpec);
	}
}
