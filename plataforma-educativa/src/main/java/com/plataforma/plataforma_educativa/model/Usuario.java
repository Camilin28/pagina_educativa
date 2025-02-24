package com.plataforma.plataforma_educativa.model;

import jakarta.annotation.Generated;
import jakarta.persistence.*;
import jakarta.validation.constraints.*;;;

@Entity
public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nombre;
    private String correo;
    private String rol;

    // Constructor vacío (por JPA)
    public Usuario() {
    }

    // Constructor con parámetros
    public Usuario(String nombre, String correo, String rol) {
        this.nombre = nombre;
        this.correo = correo;
        this.rol = rol;
    }

    // Getters y Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }

}
