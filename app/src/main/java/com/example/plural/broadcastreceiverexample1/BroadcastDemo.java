package com.example.plural.broadcastreceiverexample1;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

public class BroadcastDemo extends BroadcastReceiver {
    public BroadcastDemo() {
    }

    @Override
    public void onReceive(Context context, Intent intent) {
        boolean powerOn;

        powerOn = intent.getAction().equals(Intent.ACTION_POWER_CONNECTED);

        if(powerOn)
        {
            Toast.makeText(context, "Power ON :))))", Toast.LENGTH_LONG);
        }
        else
        {
            Toast.makeText(context, "Power OFF :((((", Toast.LENGTH_LONG);
        }

    }
}
