package me.evilterabite.bitsduels.libraries;

import java.util.UUID;

public class BitsPlayer {
    private final UUID id;
    private boolean chatBanned;
    private boolean rankedBanned;
    private int coins;
    private int elo;
    private Rank rank;

    public BitsPlayer(UUID id, boolean chatBanned, boolean rankedBanned, int coins, int elo, Rank rank) {
        this.id = id;
        this.chatBanned = chatBanned;
        this.rankedBanned = rankedBanned;
        this.coins = coins;
        this.elo = elo;
        this.rank = rank;
    }


    public boolean isChatBanned() {
        return chatBanned;
    }

    public void setChatBanned(boolean chatBanned) {
        this.chatBanned = chatBanned;
    }

    public boolean isRankedBanned() {
        return rankedBanned;
    }

    public void setRankedBanned(boolean rankedBanned) {
        this.rankedBanned = rankedBanned;
    }

    public Rank getRank() {
        return rank;
    }

    public void setRank(Rank rank) {
        this.rank = rank;
    }

    public int getCoins() {
        return coins;
    }

    public void setCoins(int coins) {
        this.coins = coins;
    }

    public int getElo() {
        return elo;
    }

    public void setElo(int elo) {
        this.elo = elo;
    }

    public UUID getId() {
        return id;
    }
}
