package me.evilterabite.bitsduels.files;

import me.evilterabite.bitsduels.libraries.BitsPlayer;
import org.json.JSONObject;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class PlayerData {

    public static void create() {
        try {
            File playerdata = new File("playerdata.json");
            if (playerdata.createNewFile()) {
                System.out.println("File created: " + playerdata.getName());
            } else {
                System.out.println("Found playerdata.json");
            }
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }

    public static void store(BitsPlayer bitsPlayer) {
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("uuid", bitsPlayer.getId());
        jsonObject.put("chatBanned", bitsPlayer.isChatBanned());
        jsonObject.put("rankedBanned", bitsPlayer.isRankedBanned());
        jsonObject.put("coins", bitsPlayer.getCoins());
        jsonObject.put("elo", bitsPlayer.getElo());
        jsonObject.put("rank", bitsPlayer.getRank());

        try (FileWriter file = new FileWriter("playerdata.json")) {
            file.write(jsonObject.toString());
            file.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
