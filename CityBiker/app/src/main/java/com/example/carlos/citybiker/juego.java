package com.example.carlos.citybiker;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class juego extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_juego);
    }
    public void volverMenu(View v) {

        Intent intent = new Intent(juego.this, MainActivity.class);


        startActivity(intent);
    }
}
