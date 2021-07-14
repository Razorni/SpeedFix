package dev.razorni.speedfix;

import dev.razorni.speedfix.listeners.SpeedListener;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

/**
 * Created by DevRazorni
 * 7/14/2021 / 7:07 PM
 * SpeedFix
 */

public final class SpeedFix extends JavaPlugin {

    public SpeedFix instance;

    public static FileConfiguration config;

    @Override
    public void onEnable() {
        instance = this;
        registerListeners();
        config = getConfig();
        config.options().copyDefaults(true);
        saveDefaultConfig();

    }

    @Override
    public void onDisable() {
        instance = null;
    }

    private void registerListeners() {
        PluginManager manager = getServer().getPluginManager();
        manager.registerEvents(new SpeedListener(), this);
    }

}
