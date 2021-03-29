package me.evilterabite.bitsduels;

import me.evilterabite.bitsduels.files.PlayerData;
import me.evilterabite.bitsduels.libraries.Queue;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.plugin.java.JavaPlugin;

public final class BitsDuels extends JavaPlugin {

    public static Queue queue = new Queue(true);

    @Override
    public void onEnable() {
        PlayerData.create();

    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }

    public static FileConfiguration config() {
        return BitsDuels.getProvidingPlugin(BitsDuels.class).getConfig();
    }
}
