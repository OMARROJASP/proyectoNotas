package com.note.practicaNota.controller;

import com.note.practicaNota.model.Nota;
import com.note.practicaNota.repository.NotaRepository;
import com.note.practicaNota.service.NotaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/notas")
@CrossOrigin(origins = "http://localhost:5173")
public class NotaController {
    @Autowired
    private NotaService notaService;


    @GetMapping("/")
    public Iterable<Nota> obtenerNotas(){
        return notaService.obtenerNotas();
    }

    @PostMapping("/")
    public Nota guardarNota(@RequestBody Nota nota){
        return notaService.guardarNotas(nota);
    }

}
