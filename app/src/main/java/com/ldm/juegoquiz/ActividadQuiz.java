package com.ldm.juegoquiz;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class ActividadQuiz extends AppCompatActivity {

    private Button botonRespuesta_a, botonRespuesta_b, botonRespuesta_c, botonRespuesta_d;

    private TextView textoPregunta, textoPuntuacion;

    private ColeccionPreguntas mis_preguntas = new ColeccionPreguntas();

    private String respuesta;

    private int numPregunta = 0;
    private int puntuacion= 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        botonRespuesta_a = (Button) findViewById(R.id.respuesta_a);
        botonRespuesta_b = (Button) findViewById(R.id.respuesta_b);
        botonRespuesta_c = (Button) findViewById(R.id.respuesta_c);
        botonRespuesta_d = (Button) findViewById(R.id.respuesta_d);

        textoPregunta = (TextView) findViewById(R.id.pregunta);
        textoPuntuacion = (TextView) findViewById(R.id.puntuacion);

        textoPuntuacion.setText("Puntuacion: "+puntuacion);

        actualizarPregunta();

            botonRespuesta_a.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    if (botonRespuesta_a.getText() == respuesta) {
                        puntuacion=puntuacion+3;
                        textoPuntuacion.setText("Puntuacion: "+puntuacion);
                        Toast.makeText(ActividadQuiz.this, "¡Acierto!", Toast.LENGTH_SHORT).show();
                        actualizarPregunta();

                    }
                    else{
                        AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(ActividadQuiz.this);
                        alertDialogBuilder
                                .setMessage("¡Has fallado!")
                                .setCancelable(false)
                                .setPositiveButton("Continuar",
                                        new DialogInterface.OnClickListener() {
                                            @Override
                                            public void onClick(DialogInterface dialog, int which) {
                                                puntuacion = puntuacion-2;
                                                textoPuntuacion.setText("Puntuacion: "+puntuacion);
                                                actualizarPregunta();
                                            }
                                        })
                                .setNegativeButton("Nuevo Juego",
                                        new DialogInterface.OnClickListener() {
                                            @Override
                                            public void onClick(DialogInterface dialog, int which) {
                                                Intent inicio = new Intent(getApplicationContext(),ActividadInicio.class);
                                                startActivity(inicio);
                                            }
                                        });

                        AlertDialog alertaFallo = alertDialogBuilder.create();
                        alertaFallo.show();
                    }
                }
            });

            botonRespuesta_b.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    if (botonRespuesta_b.getText() == respuesta) {
                        puntuacion=puntuacion+3;
                        textoPuntuacion.setText("Puntuacion: "+puntuacion);
                        Toast.makeText(ActividadQuiz.this, "¡Acierto!", Toast.LENGTH_SHORT).show();
                        actualizarPregunta();
                    }
                    else {
                        AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(ActividadQuiz.this);
                        alertDialogBuilder
                                .setMessage("¡Has fallado!")
                                .setCancelable(false)
                                .setPositiveButton("Continuar",
                                        new DialogInterface.OnClickListener() {
                                            @Override
                                            public void onClick(DialogInterface dialog, int which) {
                                                puntuacion = puntuacion-2;
                                                textoPuntuacion.setText("Puntuacion: "+puntuacion);
                                                actualizarPregunta();
                                            }
                                        })
                                .setNegativeButton("Nuevo Juego",
                                        new DialogInterface.OnClickListener() {
                                            @Override
                                            public void onClick(DialogInterface dialog, int which) {
                                                Intent inicio = new Intent(getApplicationContext(),ActividadInicio.class);
                                                startActivity(inicio);
                                            }
                                        });

                        AlertDialog alertaFallo = alertDialogBuilder.create();
                        alertaFallo.show();
                    }
                }
            });

            botonRespuesta_c.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    if (botonRespuesta_c.getText() == respuesta) {
                        puntuacion=puntuacion+3;
                        textoPuntuacion.setText("Puntuacion: "+puntuacion);
                        Toast.makeText(ActividadQuiz.this, "¡Acierto!", Toast.LENGTH_SHORT).show();
                        actualizarPregunta();
                    }
                    else{
                        AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(ActividadQuiz.this);
                        alertDialogBuilder
                                .setMessage("¡Has fallado!")
                                .setCancelable(false)
                                .setPositiveButton("Continuar",
                                        new DialogInterface.OnClickListener() {
                                            @Override
                                            public void onClick(DialogInterface dialog, int which) {
                                                puntuacion = puntuacion-2;
                                                textoPuntuacion.setText("Puntuacion: "+puntuacion);
                                                actualizarPregunta();
                                            }
                                        })
                                .setNegativeButton("Nuevo Juego",
                                        new DialogInterface.OnClickListener() {
                                            @Override
                                            public void onClick(DialogInterface dialog, int which) {
                                                Intent inicio = new Intent(getApplicationContext(),ActividadInicio.class);
                                                startActivity(inicio);
                                            }
                                        });

                        AlertDialog alertaFallo = alertDialogBuilder.create();
                        alertaFallo.show();
                    }
                }
            });

            botonRespuesta_d.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    if (botonRespuesta_d.getText() == respuesta) {
                        puntuacion=puntuacion+3;
                        textoPuntuacion.setText("Puntuacion: "+puntuacion);
                        actualizarPregunta();
                        Toast.makeText(ActividadQuiz.this, "¡Acierto!", Toast.LENGTH_SHORT).show();
                    } else {
                        AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(ActividadQuiz.this);
                        alertDialogBuilder
                                .setMessage("¡Has fallado!")
                                .setCancelable(false)
                                .setPositiveButton("Continuar",
                                        new DialogInterface.OnClickListener() {
                                            @Override
                                            public void onClick(DialogInterface dialog, int which) {
                                                puntuacion = puntuacion-2;
                                                textoPuntuacion.setText("Puntuacion: "+puntuacion);
                                                actualizarPregunta();
                                            }
                                        })
                                .setNegativeButton("Nuevo Juego",
                                        new DialogInterface.OnClickListener() {
                                            @Override
                                            public void onClick(DialogInterface dialog, int which) {
                                                Intent inicio = new Intent(getApplicationContext(),ActividadInicio.class);
                                                startActivity(inicio);
                                            }
                                        });

                        AlertDialog alertaFallo = alertDialogBuilder.create();
                        alertaFallo.show();
                    }

                }

        });

    }

    private void actualizarPregunta(){
        if (numPregunta<mis_preguntas.preguntas.length) {
            textoPregunta.setText(mis_preguntas.getPregunta(numPregunta));
            botonRespuesta_a.setText(mis_preguntas.getRespuesta_a(numPregunta));
            botonRespuesta_b.setText(mis_preguntas.getRespuesta_b(numPregunta));
            botonRespuesta_c.setText(mis_preguntas.getRespuesta_c(numPregunta));
            botonRespuesta_d.setText(mis_preguntas.getRespuesta_d(numPregunta));

            respuesta = mis_preguntas.getRespuestaCorrecta(numPregunta);

            numPregunta += 1;
        }
        else {
            Intent i = new Intent(getApplicationContext(), ActividadResultado.class);
            i.putExtra("puntuacion_final", puntuacion);
            startActivity(i);
        }
    }
}
