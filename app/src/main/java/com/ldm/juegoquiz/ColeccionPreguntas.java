package com.ldm.juegoquiz;


public class ColeccionPreguntas {
    public String preguntas[] = {
            "¿Quién es el presidente actual de los Estados Unidos de América?",
            "¿Cuántos satélites tiene la Tierra?",
            "¿Cuál es la capital de Italia?",
            "¿Quién es el vigente campeón de la Copa Mundial de fútbol?",
            "¿Cuál es el símbolo químico del agua?"
    };

    private String posiblesRespuestas [][] = {
            {"Barack Obama", "Mariano Rajoy", "Donald Trump", "George Bush"},
            {"2", "1", "24", "No tiene"},
            {"Madrid", "Turín", "Pisa", "Roma"},
            {"Italia", "España", "Alemania", "Francia"},
            {"CO2", "H2O", "HCl", "No tiene"}
    };

    private String respuestasCorrectas[] = {"Donald Trump", "1", "Roma", "Francia", "H2O"};

    public String getPregunta(int n) {
        String pregunta = preguntas[n];
        return  pregunta;
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
        String respuesta_correcta =this.respuestasCorrectas[n];
        return respuesta_correcta;
    }
}
