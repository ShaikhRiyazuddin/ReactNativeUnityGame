package com.ruapp;

import android.content.Intent;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.unity3d.player.UnityPlayerActivity;

public class UnityModule extends ReactContextBaseJavaModule {

    private ReactApplicationContext reactContext;

    public UnityModule(ReactApplicationContext context) {
        super(context);
        this.reactContext = context;
    }

    @Override
    public String getName() {
        return "UnityModule";
    }

    @ReactMethod
    public void launchUnityWithParams(String playerName, String walletAmount, String bettingAmount) {
        Intent intent = new Intent(reactContext, UnityPlayerActivity.class);
        intent.putExtra("playerName", playerName);
        intent.putExtra("walletAmount", walletAmount);
        intent.putExtra("bettingAmount", bettingAmount);
        intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        reactContext.startActivity(intent);
    }
}
