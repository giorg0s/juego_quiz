package com.ldm.juegoquiz;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class ActividadResultado extends AppCompatActivity {

    Button botonSalir, botonRetroceso;
    TextView etiquetaResultado, textoResultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resultado);

        Button botonSalir = findViewById(R.id.botonSalir);
        Button botonRetroceso = findViewById(R.id.botonRetroceso);

        TextView etiquetaResultado = findViewById(R.id.etiquetaResultado);
        TextView textoResultado = findViewById(R.id.textoResultado);

        Bundle b = getIntent().getExtras();

        int puntuacion = b.getInt("puntuacion_final", 0);
        etiquetaResultado.setText(puntuacion+"");


        botonSalir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finishAffinity();
            }
        });

        botonRetroceso.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent actividad_principal = new Intent(getApplicationContext(), ActividadQuiz.class);
                startActivity(actividad_principal);
            }
        });



    }
}
