package me.evilterabite.bitsduels.libraries;

import org.bukkit.ChatColor;

public enum Rank {
    IRON1(0, 25,10, ChatColor.DARK_GRAY + "I1"),
    IRON2(100, 20, 10, ChatColor.DARK_GRAY + "I2"),
    IRON3(200, 20, 15, ChatColor.DARK_GRAY + "I3"),
    BRONZE1(300, 19, 15, ChatColor.GOLD + "B1"),
    BRONZE2(400, 19, 16, ChatColor.GOLD + "B2"),
    BRONZE3(500, 19, 17, ChatColor.GOLD + "B3"),
    SILVER1(600, 15, 15, ChatColor.GRAY + "S1"),
    SILVER2(700, 15, 18, ChatColor.GRAY + "S2"),
    SILVER3(800, 15, 19, ChatColor.GRAY + "S3"),
    GOLD1(900, 15, 22, ChatColor.YELLOW + "G1"),
    GOLD2(1000, 15, 25, ChatColor.YELLOW + "G2"),
    GOLD3(1100, 14, 25, ChatColor.YELLOW + "G3"),
    PLATINUM1(1200, 10, 25, ChatColor.WHITE + "P1"),
    PLATINUM2(1300, 10, 25, ChatColor.WHITE + "P2"),
    PLATINUM3(1400, 10, 25, ChatColor.WHITE + "P3"),
    DIAMOND1(1500, 9, 25, ChatColor.AQUA + "D1"),
    DIAMOND2(1600, 9, 25, ChatColor.AQUA + "D2"),
    DIAMOND3(1700, 5, 25, ChatColor.AQUA + "D3"),
    IMMORTAL(1800, 5, 30, ChatColor.RED + "IMMORTAL"),
    RADIANT(2000, 3, 30, ChatColor.DARK_PURPLE + "RADIANT");


    private final int eloRequired;
    private int winAmount;
    private int loseAmount;
    private final String rankPrefix;

    Rank(int eloRequired, int winAmount, int loseAmount, String rankPrefix1) {
        this.eloRequired = eloRequired;
        this.winAmount = winAmount;
        this.loseAmount = loseAmount;
        this.rankPrefix = rankPrefix1;
    }

    public int getEloRequired() {
        return eloRequired;
    }

    public int getWinAmount() {
        return winAmount;
    }

    public int getLoseAmount() {
        return loseAmount;
    }

    public String getRankPrefix() {
        return rankPrefix;
    }
}
