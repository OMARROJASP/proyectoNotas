package com.note.practicaNota.service;

import com.note.practicaNota.model.Nota;
import org.springframework.stereotype.Service;


public interface NotaService {
    Iterable<Nota> obtenerNotas();

   Nota guardarNotas(Nota nota);
}
