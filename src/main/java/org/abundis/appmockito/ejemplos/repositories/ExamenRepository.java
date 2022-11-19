package org.abundis.appmockito.ejemplos.repositories;

import org.abundis.appmockito.ejemplos.models.Examen;

import java.util.List;

public interface ExamenRepository {
    List<Examen> findAll();
}
