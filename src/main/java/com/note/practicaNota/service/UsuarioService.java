package com.note.practicaNota.service;

import com.note.practicaNota.model.Usuario;
import org.springframework.stereotype.Service;


public interface UsuarioService {

    Iterable<Usuario> obtenerUsuario();

    Usuario guardarUsuario(Usuario usuario);
}
