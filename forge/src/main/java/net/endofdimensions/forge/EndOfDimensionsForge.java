package net.endofdimensions.forge;

import dev.architectury.platform.forge.EventBuses;
import net.endofdimensions.EndOfDimensions;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(EndOfDimensions.MOD_ID)
public class EndOfDimensionsForge {
    public EndOfDimensionsForge() {
        // Submit our event bus to let architectury register our content on the right time
        EventBuses.registerModEventBus(EndOfDimensions.MOD_ID, FMLJavaModLoadingContext.get().getModEventBus());
        EndOfDimensions.init();
    }
}
