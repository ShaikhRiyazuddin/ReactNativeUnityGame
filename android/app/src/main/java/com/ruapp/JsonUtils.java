package com.ruapp;

import com.google.gson.Gson;
import com.ruapp.PlayerData;

public class JsonUtils {
    public static String convertPlayerDataToJson(PlayerData playerData) {
        Gson gson = new Gson();
        return gson.toJson(playerData);
    }
}
