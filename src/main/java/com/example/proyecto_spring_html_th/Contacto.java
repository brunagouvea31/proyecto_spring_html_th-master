package com.example.proyecto_spring_html_th;

public class Contacto {
    private String email;
    private String contactoTel;

    public Contacto(String email, String contactoTel) {
        this.email = email;
        this.contactoTel = contactoTel;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getContactoTel() {
        return contactoTel;
    }

    public void setContactoTel(String contactoTel) {
        this.contactoTel = contactoTel;
    }
}


