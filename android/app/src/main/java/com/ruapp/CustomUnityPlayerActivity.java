package com.ruapp;

import android.os.Bundle;
import com.unity3d.player.UnityPlayerActivity;
import com.unity3d.player.UnityPlayer;

public class CustomUnityPlayerActivity extends UnityPlayerActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Get the intent extras from React Native
        String playerName = "test";// getIntent().getStringExtra("playerName");
        String walletAmount = "100";//getIntent().getStringExtra("walletAmount");
        String bettingAmount = "10";//getIntent().getStringExtra("bettingAmount");

        // Pass the data to Unity game (using UnitySendMessage)
        UnityPlayer.UnitySendMessage("RockPaperScissorsGame", "SetPlayerData", playerName + "," + walletAmount + "," + bettingAmount);
    }
}
