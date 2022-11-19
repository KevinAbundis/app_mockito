package org.abundis.appmockito.ejemplos.services;

import org.abundis.appmockito.ejemplos.models.Examen;

public interface ExamenService {
    Examen findExamenPorNombre(String nombre);
}
