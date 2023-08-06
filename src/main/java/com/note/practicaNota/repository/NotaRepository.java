package com.note.practicaNota.repository;

import com.note.practicaNota.model.Nota;
import org.springframework.data.jpa.repository.JpaRepository;

public interface NotaRepository extends JpaRepository<Nota,Long> {
}
