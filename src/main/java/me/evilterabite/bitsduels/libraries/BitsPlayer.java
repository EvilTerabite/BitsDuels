package me.evilterabite.bitsduels.libraries;

public class BitsPlayer {
    private boolean chatBanned;
    private boolean rankedBanned;
    private Rank rank;

    public BitsPlayer(boolean chatBanned, boolean rankedBanned, Rank rank) {
        this.chatBanned = chatBanned;
        this.rankedBanned = rankedBanned;
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
}
