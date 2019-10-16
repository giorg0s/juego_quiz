package com.ldm.juegoquiz;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Switch;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class ActividadInicio extends AppCompatActivity {

    private Button botonInicio;

    private Switch botonModoJuego;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inicio);

        botonInicio = findViewById(R.id.botonInicio);
        botonModoJuego = findViewById(R.id.modo_juego);


        botonInicio.setOnClickListener(new View.OnClickListener() {
            Intent juego_normal = new Intent(getApplicationContext(), ActividadQuiz.class);
            Intent juego_imagen = new Intent(getApplicationContext(), ActividadQuiz_img.class);

            @Override
            public void onClick(View v) {
                if(botonModoJuego.isChecked()) {
                    startActivity(juego_imagen);
                }
                else {
                    startActivity(juego_normal);
                }
            }
        });

    }
}
