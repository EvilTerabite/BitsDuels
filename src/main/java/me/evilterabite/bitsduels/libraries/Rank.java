package me.evilterabite.bitsduels.libraries;

import org.bukkit.ChatColor;

import java.util.Arrays;
import java.util.List;

public enum Rank {
    UNRANKED(0, -1, 2,2,ChatColor.DARK_GRAY + "UNRANKED"),
    IRON1(1,1, 25,10, ChatColor.DARK_GRAY + "I1"),
    IRON2(2, 100, 20, 10, ChatColor.DARK_GRAY + "I2"),
    IRON3(3, 200, 20, 15, ChatColor.DARK_GRAY + "I3"),
    BRONZE1(4,300, 19, 15, ChatColor.GOLD + "B1"),
    BRONZE2(5,400, 19, 16, ChatColor.GOLD + "B2"),
    BRONZE3(6,500, 19, 17, ChatColor.GOLD + "B3"),
    SILVER1(7,600, 15, 15, ChatColor.GRAY + "S1"),
    SILVER2(8,700, 15, 18, ChatColor.GRAY + "S2"),
    SILVER3(9,800, 15, 19, ChatColor.GRAY + "S3"),
    GOLD1(10,900, 15, 22, ChatColor.YELLOW + "G1"),
    GOLD2(11,1000, 15, 25, ChatColor.YELLOW + "G2"),
    GOLD3(12,1100, 14, 25, ChatColor.YELLOW + "G3"),
    PLATINUM1(13,1200, 10, 25, ChatColor.WHITE + "P1"),
    PLATINUM2(14,1300, 10, 25, ChatColor.WHITE + "P2"),
    PLATINUM3(15,1400, 10, 25, ChatColor.WHITE + "P3"),
    DIAMOND1(16,1500, 9, 25, ChatColor.AQUA + "D1"),
    DIAMOND2(17,1600, 9, 25, ChatColor.AQUA + "D2"),
    DIAMOND3(18,1700, 5, 25, ChatColor.AQUA + "D3"),
    IMMORTAL(19,1800, 5, 30, ChatColor.RED + "IMMORTAL"),
    RADIANT(20,3000, 3, 30, ChatColor.DARK_PURPLE + "RADIANT");

    private final int id;
    private final int eloRequired;
    private final int winAmount;
    private final int loseAmount;
    private final String rankPrefix;

    Rank(int id, int eloRequired, int winAmount, int loseAmount, String rankPrefix1) {
        this.id = id;
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

    public int getId() {
        return id;
    }

    public static Rank assign(BitsPlayer bitsPlayer) {
        int elo = bitsPlayer.getElo();
        List<Rank> rankList = getRankList();
        Rank rank = Rank.UNRANKED;
        for (int i = 1; i < 20; i++) {
            Rank tempRank =  rankList.get(i);
            int rankElo = tempRank.getEloRequired();
            if(elo > rankElo) {
                continue;
            }
            if(elo < rankElo) {
                rank = tempRank;
            }
        }
        return rank;
    }

    public static List<Rank> getRankList() {
        return Arrays.asList(Rank.values());
    }
}
