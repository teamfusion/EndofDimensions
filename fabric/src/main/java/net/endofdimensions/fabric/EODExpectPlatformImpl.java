package net.endofdimensions.fabric;

import net.endofdimensions.EODExpectPlatform;
import net.fabricmc.loader.api.FabricLoader;

import java.nio.file.Path;

public class EODExpectPlatformImpl {
    /**
     * This is our actual method to {@link EODExpectPlatform#getConfigDirectory()}.
     */
    public static Path getConfigDirectory() {
        return FabricLoader.getInstance().getConfigDir();
    }
}
