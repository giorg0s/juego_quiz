package com.ldm.juegoquiz;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;


public class ActividadQuiz_img extends AppCompatActivity {
    private Button botonRespuesta_a_img,botonRespuesta_b_img,botonRespuesta_c_img,botonRespuesta_d_img;

    private TextView textoPuntuacion;

    ImageView senal;

    public ColeccionImagenes mis_preguntas = new ColeccionImagenes();

    private String respuesta_img;

    private int numPregunta = 0;
    private int puntuacion= 0;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_img);

        senal = (ImageView) findViewById(R.id.pregunta_img);

        botonRespuesta_a_img = findViewById(R.id.respuesta_a_img);
        botonRespuesta_b_img = findViewById(R.id.respuesta_b_img);
        botonRespuesta_c_img = findViewById(R.id.respuesta_c_img);
        botonRespuesta_d_img = findViewById(R.id.respuesta_d_img);

        textoPuntuacion = findViewById(R.id.puntuacion);

        textoPuntuacion.setText("Puntuacion: "+puntuacion);

        actualizarPregunta();


        botonRespuesta_a_img.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(botonRespuesta_a_img.getText() == respuesta_img) {
                    puntuacion = puntuacion+3;
                    textoPuntuacion.setText("Puntuacion: "+puntuacion);
                    Toast.makeText(ActividadQuiz_img.this, "¡Acierto!", Toast.LENGTH_SHORT).show();
                    actualizarPregunta();
                }
                else {
                    AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(ActividadQuiz_img.this);
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

                    AlertDialog alertDialog = alertDialogBuilder.create();
                    alertDialog.show();
                }

            }
        });

        botonRespuesta_b_img.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(botonRespuesta_b_img.getText() == respuesta_img) {
                    puntuacion = puntuacion+3;
                    textoPuntuacion.setText("Puntuacion: "+puntuacion);
                    Toast.makeText(ActividadQuiz_img.this, "¡Acierto!", Toast.LENGTH_SHORT).show();
                    actualizarPregunta();
                }
                else {
                    AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(ActividadQuiz_img.this);
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
                AlertDialog alertDialog = alertDialogBuilder.create();
                alertDialog.show();

                }

            }
        });

        botonRespuesta_c_img.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(botonRespuesta_c_img.getText() == respuesta_img) {
                    puntuacion = puntuacion+3;
                    textoPuntuacion.setText("Puntuacion: "+puntuacion);
                    Toast.makeText(ActividadQuiz_img.this, "¡Acierto!", Toast.LENGTH_SHORT).show();
                    actualizarPregunta();
                }
                else {
                    AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(ActividadQuiz_img.this);
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

        botonRespuesta_d_img.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(botonRespuesta_d_img.getText() == respuesta_img) {
                    puntuacion = puntuacion+3;
                    textoPuntuacion.setText("Puntuacion: "+puntuacion);
                    Toast.makeText(ActividadQuiz_img.this, "¡Acierto!", Toast.LENGTH_SHORT).show();
                    actualizarPregunta();
                }
                else {
                    textoPuntuacion.setText("Puntuacion: "+puntuacion);
                    AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(ActividadQuiz_img.this);
                    alertDialogBuilder
                            .setMessage("¡Has fallado!")
                            .setCancelable(false)
                            .setPositiveButton("Continuar",
                                    new DialogInterface.OnClickListener() {
                                        @Override
                                        public void onClick(DialogInterface dialog, int which) {
                                            puntuacion = puntuacion-2;
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

                    AlertDialog alertDialog = alertDialogBuilder.create();
                    alertDialog.show();
                }

            }
        });
    }

    private void actualizarPregunta(){
        if (numPregunta<5) {
            senal.setImageResource(mis_preguntas.getImagenes(numPregunta));
            botonRespuesta_a_img.setText(mis_preguntas.getRespuesta_a(numPregunta));
            botonRespuesta_b_img.setText(mis_preguntas.getRespuesta_b(numPregunta));
            botonRespuesta_c_img.setText(mis_preguntas.getRespuesta_c(numPregunta));
            botonRespuesta_d_img.setText(mis_preguntas.getRespuesta_d(numPregunta));

            respuesta_img = mis_preguntas.getRespuestaCorrecta(numPregunta);

            numPregunta += 1;
        }

        else{
            Intent i = new Intent(getApplicationContext(), ActividadResultado.class);
            i.putExtra("puntuacion_final", puntuacion);
            startActivity(i);
        }
    }


}
