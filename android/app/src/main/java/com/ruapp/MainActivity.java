package com.ruapp;

import com.unity3d.player.UnityPlayerActivity;
import android.content.Intent;
import com.facebook.react.ReactApplication;
import com.facebook.react.ReactNativeHost;
import com.facebook.react.ReactPackage;
import com.facebook.react.shell.MainReactPackage;
import com.facebook.react.ReactActivity;

public class MainActivity extends ReactActivity {

    @Override
    protected String getMainComponentName() {
        return "YourReactNativeApp";
    }

    // Method to start Unity activity
    public void launchUnity() {
        Intent intent = new Intent(MainActivity.this, UnityPlayerActivity.class);
        startActivity(intent);
    }
}
