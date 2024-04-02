package net.endofdimensions.forge;

import net.endofdimensions.EODExpectPlatform;
import net.minecraftforge.fml.loading.FMLPaths;

import java.nio.file.Path;

public class EODExpectPlatformImpl {
    /**
     * This is our actual method to {@link EODExpectPlatform#getConfigDirectory()}.
     */
    public static Path getConfigDirectory() {
        return FMLPaths.CONFIGDIR.get();
    }
}
