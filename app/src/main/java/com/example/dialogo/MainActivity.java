package com.example.dialogo;

import static com.example.dialogo.R.id.button;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements DialogoSexo.RespuestaDialogoSexo {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button b= findViewById(button);
        b.setOnClickListener(this::onClick);

    }

    @Override
    public void onRespuesta(String s){
        Toast.makeText(getApplicationContext(),s, Toast.LENGTH_LONG).show();
    }

    public void onClick(View v){
        DialogoSexo ds = new DialogoSexo();
        ds.show(getFragmentManager(), "Mi Diálogo");
    }
}