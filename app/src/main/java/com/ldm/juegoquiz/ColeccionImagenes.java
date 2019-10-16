package com.ldm.juegoquiz;

public class ColeccionImagenes {
    public Integer[] imagenes = {
            R.drawable.adelantamiento,
            R.drawable.animales,
            R.drawable.desprendimientos,
            R.drawable.prohibido,
            R.drawable.stop
    };

    private String posiblesRespuestas[][] = {
            {"Prohibido el adelantantamiento", "Prohibida la circulación en paralelo", "No existe", "Permitidas las carreras"},
            {"Avistamiento de ciervos", "No existe", "Paso de animales en libertad", "Zoo cercano"},
            {"2", "Desprendimiento de rocas", "Caída de meteoritos", "No existe"},
            {"Calle paralela", "Calle inexistente", "No existe", "Entrada prohibida"},
            {"Carretera cortada", "Ceda el paso", "Señal de detención obligatoria", "No existe"}
    };

    private String respuestas[] = {
        "Prohibido adelantar",
        "Paso de animales en libertad",
        "Desprendimiento de rocas",
        "Entrada prohibida",
        "Señal de detención obligatoria"
    };


    public int getImagenes(int n) {
        int imagen = imagenes[n].intValue();
        return imagen;
    }

    public String getRespuesta_a(int n) {
        String eleccion_a = posiblesRespuestas[n][0];
        return eleccion_a;
    }

    public String getRespuesta_b(int n) {
        String eleccion_b = posiblesRespuestas[n][1];
        return eleccion_b;
    }

    public String getRespuesta_c(int n) {
        String eleccion_c = posiblesRespuestas[n][2];
        return eleccion_c;
    }

    public String getRespuesta_d(int n) {
        String eleccion_d = posiblesRespuestas[n][3];
        return eleccion_d;
    }

    public String getRespuestaCorrecta(int n){
        String respuesta_correcta =this.respuestas[n];
        return respuesta_correcta;
    }

}
