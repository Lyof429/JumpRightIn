package com.mrbysco.jumprightin;

import com.mojang.logging.LogUtils;
import com.mrbysco.jumprightin.config.JumpConfig;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.fml.DistExecutor;
import net.minecraftforge.fml.ModLoadingContext;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.config.ModConfig;
import org.slf4j.Logger;

@Mod(JumpRightIn.MOD_ID)
public class JumpRightIn {
	public static final String MOD_ID = "jumprightin";
	public static final Logger LOGGER = LogUtils.getLogger();

	public JumpRightIn() {
		DistExecutor.unsafeRunWhenOn(Dist.CLIENT, () -> () -> {
			ModLoadingContext.get().registerConfig(ModConfig.Type.CLIENT, JumpConfig.clientSpec);
		});
	}

}
