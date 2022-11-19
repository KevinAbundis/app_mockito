package org.abundis.appmockito.ejemplos.repositories;

import org.abundis.appmockito.ejemplos.models.Examen;

import java.util.Arrays;
import java.util.List;

public class ExamenRepositoryImpl implements ExamenRepository{
    @Override
    public List<Examen> findAll() {
        return Arrays.asList(new Examen(5L,"Matemáticas"),
                new Examen(6L, "Inglés"),
                new Examen(7L, "Historia"));
    }
}
