package org.idnp.idnp2022lab04;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;

public class MyBroadcastReceiver extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {
        String mensaje = intent.getStringExtra("key");
        Log.d("MyBroadcastReceiver", "Mensaje recibido: " + mensaje);
    }
}
