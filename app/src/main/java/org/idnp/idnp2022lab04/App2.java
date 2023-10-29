package org.idnp.idnp2022lab04;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;

import androidx.appcompat.app.AppCompatActivity;

public class App2 extends AppCompatActivity {
    final private String TAG = "App2";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.app2);

        Intent intent = new Intent("com.example.APP1_ACTION");
        intent.putExtra("key", "App2"); // Puedes poner datos extras si es necesario

        sendBroadcast(intent);
        Log.d(TAG, "Mensaje enviado");
    }
}
