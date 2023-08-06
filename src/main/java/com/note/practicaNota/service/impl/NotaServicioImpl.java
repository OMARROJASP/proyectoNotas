package com.note.practicaNota.service.impl;

import com.note.practicaNota.model.Nota;
import com.note.practicaNota.repository.NotaRepository;
import com.note.practicaNota.service.NotaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;
@Service
public class NotaServicioImpl implements NotaService {

    @Autowired
    private  NotaRepository notaRepository;



    @Override
    public Iterable<Nota> obtenerNotas() {
        return notaRepository.findAll();
    }

    @Override
    public Nota guardarNotas(Nota nota) {
        return notaRepository.save(nota);
    }
}
