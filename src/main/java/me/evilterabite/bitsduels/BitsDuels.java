package me.evilterabite.bitsduels;

import me.evilterabite.bitsduels.libraries.BitsPlayer;
import me.evilterabite.bitsduels.libraries.Rank;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;

public final class BitsDuels extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic

    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }

    public static FileConfiguration config() {
        return BitsDuels.getProvidingPlugin(BitsDuels.class).getConfig();
    }
}
