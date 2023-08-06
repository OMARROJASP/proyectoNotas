package com.note.practicaNota.service.impl;

import com.note.practicaNota.model.Usuario;
import com.note.practicaNota.repository.UsuarioRepository;
import com.note.practicaNota.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UsuarioServicioImpl implements UsuarioService {

    @Autowired
    private UsuarioRepository usuarioRepository;

    @Override
    public Iterable<Usuario> obtenerUsuario() {
        return usuarioRepository.findAll();
    }

    @Override
    public Usuario guardarUsuario(Usuario usuario) {
        return usuarioRepository.save(usuario);
    }
}
