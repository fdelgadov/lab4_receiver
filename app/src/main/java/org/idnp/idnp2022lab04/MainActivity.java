package org.idnp.idnp2022lab04;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {
    final private String TAG = "MainActivity";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        IntentFilter filter = new IntentFilter("com.example.APP1_ACTION");
        MyBroadcastReceiver mbr = new MyBroadcastReceiver();
        registerReceiver(mbr, filter);

        Intent intent = new Intent("com.example.APP1_ACTION");
        intent.putExtra("key", "value"); // Puedes poner datos extras si es necesario

        sendBroadcast(intent);
        Log.d(TAG, "Mensaje enviado");

    }
}