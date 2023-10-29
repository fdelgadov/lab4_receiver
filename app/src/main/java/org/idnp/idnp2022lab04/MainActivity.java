package org.idnp.idnp2022lab04;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    final private String TAG = "App1";

    private EditText et_msg;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        et_msg = findViewById(R.id.tbx_msg);
        Button btn = findViewById(R.id.button);

        IntentFilter filter = new IntentFilter("com.example.APP1_ACTION");
        MyBroadcastReceiver mbr = new MyBroadcastReceiver();
        registerReceiver(mbr, filter);
    }

    public void enviarMensaje(View view){
        String msg = et_msg.getText().toString();

        Intent intent = new Intent("com.example.APP1_ACTION");
        intent.putExtra("key", msg); // Puedes poner datos extras si es necesario

        sendBroadcast(intent);
        Log.d(TAG, "Mensaje enviado");

        et_msg.setText("");
    }
}