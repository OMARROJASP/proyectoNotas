package com.note.practicaNota.model;

import com.note.practicaNota.model.Nota;
import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "usuarios")
public class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String correo;

    private String nombre;

    private String apellido;

    private String contraseña;

    @OneToMany(mappedBy = "usuario")
    List<Nota> notas;

    public Usuario() {
    }

    public Usuario(Long id, String correo, String nombre, String apellido, String contraseña, List<Nota> notas) {
        this.id = id;
        this.correo = correo;
        this.nombre = nombre;
        this.apellido = apellido;
        this.contraseña = contraseña;
        this.notas = notas;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }
}
