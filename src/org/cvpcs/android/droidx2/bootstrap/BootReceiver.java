package org.cvpcs.android.droidx2.bootstrap;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

public class BootReceiver extends BroadcastReceiver {

    @Override
    public void onReceive(Context context, Intent intent) {
        Intent i = new Intent(context, BootService.class);
        context.startService(i);
    }

}
