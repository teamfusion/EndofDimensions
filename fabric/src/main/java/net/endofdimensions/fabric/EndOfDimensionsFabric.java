package net.endofdimensions.fabric;

import net.endofdimensions.EndOfDimensions;
import net.fabricmc.api.ModInitializer;

public class EndOfDimensionsFabric implements ModInitializer {
    @Override
    public void onInitialize() {
        EndOfDimensions.init();
    }
}
