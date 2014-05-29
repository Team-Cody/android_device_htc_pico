package com.cyanogenmod.settings.device;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

public class Startup extends BroadcastReceiver {

    @Override
    public void onReceive(final Context context, final Intent bootintent) {
        FastCharge.restore(context);
        Sweep2Wake.restore(context);
        DoubleTap2Wake.restore(context);
    }
}