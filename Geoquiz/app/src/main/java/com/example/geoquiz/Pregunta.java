package com.example.geoquiz;

public class Pregunta {
    private int id;
    private boolean respuesta;

    public Pregunta(int id, boolean respuesta) {
        this.id = id;
        this.respuesta = respuesta;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public boolean isRespuesta() {
        return respuesta;
    }

    public void setRespuesta(boolean respuesta) {
        this.respuesta = respuesta;
    }
}
