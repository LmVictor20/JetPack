package me.victor20.main;

import me.victor20.main.items.GetItemCommand;
import me.victor20.main.items.JetPack;
import org.bukkit.plugin.java.JavaPlugin;

public final class Main extends JavaPlugin {

    @Override
    public void onEnable() {
        getCommand("jetpack").setExecutor(new GetItemCommand());
        getServer().getPluginManager().registerEvents(new JetPack(), this);


    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
