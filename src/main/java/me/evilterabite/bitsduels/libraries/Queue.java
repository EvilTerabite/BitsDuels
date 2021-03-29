package me.evilterabite.bitsduels.libraries;

import org.bukkit.GameMode;
import org.bukkit.entity.Player;

import java.util.HashMap;
import java.util.UUID;

public class Queue {
    private int players;
    private boolean enabled;
    public HashMap<Integer, UUID> playerList;

    public Queue(boolean enabled) {
        this.enabled = enabled;
    }

    public int getPlayerAmount(){
        return this.players;
    }

    public HashMap<Integer, UUID> getPlayers(){
        return this.playerList;
    }

    public boolean isEnabled() {
        return enabled;
    }

    public void setEnabled(boolean enabled) {
        this.enabled = enabled;
    }
    public void addPlayer(Player player) {
        HashMap<Integer, UUID> playerList = this.playerList;
        playerList.put(playerList.size() + 1, player.getUniqueId());
    }

    public void setInQueue(Player player) {
        player.setGameMode(GameMode.SPECTATOR);
    }
}
