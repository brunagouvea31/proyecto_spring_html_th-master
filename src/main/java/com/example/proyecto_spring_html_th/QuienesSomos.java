package com.example.proyecto_spring_html_th;

public class QuienesSomos {
    private String fotoQuienes;
    private String descripcion;

    public QuienesSomos(String fotoQuienes, String descripcion) {
        this.fotoQuienes = fotoQuienes;
        this.descripcion = descripcion;
    }

    public String getFotoQuines() {
        return fotoQuienes;
    }

    public void setFotoQuines(String fotoQuines) {
        this.fotoQuienes = fotoQuines;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}


