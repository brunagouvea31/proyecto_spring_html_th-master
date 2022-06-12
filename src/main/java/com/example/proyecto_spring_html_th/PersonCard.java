package com.example.proyecto_spring_html_th;

import java.util.Date;

public class PersonCard {
    private String nombre;
    private String apellidos;
    private String foto;
    private String direccion;
    private Date fechaNac;

    public PersonCard() {
        ;
    }

    public PersonCard(String nombre, String apellidos, String foto, String direccion, Date fechaNac) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.foto = foto;
        this.direccion = direccion;
        this.fechaNac = fechaNac;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getFoto() {
        return foto;
    }

    public void setFoto(String foto) {
        this.foto = foto;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public Date getFechaNac() {
        return fechaNac;
    }

    public void setFechaNac(Date fechaNac) {
        this.fechaNac = fechaNac;
    }

}
