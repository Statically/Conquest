package com.Statically.conquest;

// Imports
import org.bukkit.plugin.java.JavaPlugin;

/**
 *
 * @author Blackveiled
 * @author thedarklord197
 *
 */
public class Conquest extends JavaPlugin {

    public static byte GAME_MODE = 0x00; // default game mode: Conquest

    // On Enable
    @Override
    public void onEnable() {
        getConfig();
        saveDefaultConfig();
    }

    // On Disable
    @Override
    public void onDisable() {

    }

}
