package me.evilterabite.bitsduels.listeners;

import me.evilterabite.bitsduels.files.PlayerData;
import me.evilterabite.bitsduels.libraries.BitsPlayer;
import me.evilterabite.bitsduels.libraries.Rank;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.AsyncPlayerPreLoginEvent;

import java.util.UUID;

public class PlayerJoin implements Listener {
    @EventHandler
    void onPlayerJoin(AsyncPlayerPreLoginEvent event) {
        UUID uuid = event.getUniqueId();
        Player player = Bukkit.getPlayer(uuid);
        if(player == null) {
            event.disallow(AsyncPlayerPreLoginEvent.Result.KICK_BANNED, ChatColor.RED + "ERROR: " + "Report error 1 to staff");
        }
        assert player != null;
        if(!player.hasPlayedBefore()) {
            BitsPlayer bitsPlayer = new BitsPlayer(uuid, false, false, 0, 0, Rank.UNRANKED);
            PlayerData.store(bitsPlayer);
        }
    }
}
