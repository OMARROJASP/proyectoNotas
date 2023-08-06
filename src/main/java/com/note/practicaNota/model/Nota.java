package com.note.practicaNota.model;

import jakarta.persistence.*;

@Entity
@Table(name = "notas")
public class Nota {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private  String texcto;


    public Nota(Long id, String texcto, Usuario usuario) {
        this.id = id;
        this.texcto = texcto;
        this.usuario = usuario;
    }

    public Nota() {
    }

    @ManyToOne
    @JoinColumn(name = "usuario_id")
    private Usuario usuario;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTexcto() {
        return texcto;
    }

    public void setTexcto(String texcto) {
        this.texcto = texcto;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
}
