package com.gmail.rohzek.colorfullockeddoorsnkeys.util;

import net.minecraftforge.common.ForgeConfigSpec;

public class ConfigurationManager
{
	private static final ForgeConfigSpec.Builder BUILDER = new ForgeConfigSpec.Builder();
    public static final General GENERAL = new General(BUILDER);
    public static final ForgeConfigSpec spec = BUILDER.build();

    public static class General 
    {
    	public final ForgeConfigSpec.ConfigValue<Boolean> isDebug;

        public General(ForgeConfigSpec.Builder builder) 
        {
            builder.push("General");
            
            isDebug = builder
                    .comment("Enables/Disables debug mode (SPAMS LOGS! Is for detailed bug reports; You probably don't want this for normal play) [false/true|default:false]")
                    .translation("debugmode.colorfullockeddoorsnkeys.config")
                    .define("isDebug", false);
            
            builder.pop();
        }
    }
}
