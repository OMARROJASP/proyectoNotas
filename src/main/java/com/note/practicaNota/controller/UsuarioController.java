package com.note.practicaNota.controller;

import com.note.practicaNota.model.Usuario;
import com.note.practicaNota.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/usuarios")
@CrossOrigin(origins = "http://localhost:5173")
public class UsuarioController {

    @Autowired
    private UsuarioService usuarioService;

    @GetMapping("/")
    public Iterable<Usuario> ObtenerUsuario(){
        return usuarioService.obtenerUsuario();
    }

    @PostMapping("/")
    public Usuario guardarUsuario(@RequestBody Usuario usuario){
        return usuarioService.guardarUsuario(usuario);
    }


}
