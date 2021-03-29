package me.evilterabite.bitsduels.libraries;

import me.evilterabite.bitsduels.libraries.arenas.TestArena;
import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.World;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public abstract class Arena {
    private boolean online = false;
    public HashMap<Integer, Player> players;
    public World world = Bukkit.getWorld("arenaWorld");

    public abstract Location spectatorLocation();

    public abstract Location playerOneSpawn(Player player);

    public abstract Location playerTwoSpawn(Player player);

    public abstract List<ItemStack> kit();

    public abstract double timeLimit();

    public abstract boolean init();

    public boolean isOnline() {
        return online;
    }

    public void setOnline(boolean online) {
        this.online = online;
    }

    public static void initArenas(){
        List<Arena> arenas = new ArrayList<>();
        arenas.add(new TestArena());
        for(Arena arena :arenas) {
            arena.setOnline(arena.init());
        }
    }
}
