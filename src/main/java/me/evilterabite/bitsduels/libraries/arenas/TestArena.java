package me.evilterabite.bitsduels.libraries.arenas;

import me.evilterabite.bitsduels.libraries.Arena;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

import java.util.ArrayList;
import java.util.List;

public class TestArena extends Arena {
    @Override
    public Location spectatorLocation() {
        return new Location(world, 0, 0, 0);
    }

    @Override
    public Location playerOneSpawn(Player player) {
        return new Location(world, 0,0,0);
    }

    @Override
    public Location playerTwoSpawn(Player player) {
        return new Location(world, 0,0,0);
    }

    @Override
    public List<ItemStack> kit() {
        List<ItemStack> itemStackList = new ArrayList<>();
        itemStackList.add(new ItemStack(Material.LEATHER_CHESTPLATE));
        return itemStackList;
    }

    @Override
    public double timeLimit() {
        return 500;
    }

    @Override
    public boolean init() {
        return true;
    }
}
