package com.jiahaoliuliu.simplelayertest;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;

public class LayerPushReceiver extends BroadcastReceiver {
    private static final String TAG = "LayerPushReceiver";

    public LayerPushReceiver() {
    }

    @Override
    public void onReceive(Context context, Intent intent) {
        Log.w(TAG, "New intent received " + intent);
    }
}
