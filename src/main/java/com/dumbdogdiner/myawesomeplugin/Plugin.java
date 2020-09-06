package com.dumbdogdiner.myawesomeplugin;

import kr.entree.spigradle.annotations.PluginMain;
import org.bukkit.plugin.java.JavaPlugin;

@PluginMain
public class Plugin extends JavaPlugin {
    @Override
    public void onEnable() {
        getLogger().info("Enabled!");
    }

    @Override
    public void onDisable() {
        getLogger().info("Disabled!");
    }
}
