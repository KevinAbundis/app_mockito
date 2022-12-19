package org.abundis.appmockito.ejemplos.services;

import org.abundis.appmockito.ejemplos.models.Examen;

import java.util.Arrays;
import java.util.List;

public class Datos {
    public final static List<Examen> EXAMENES = Arrays.asList(new Examen(5L,"Matemáticas"),
            new Examen(6L, "Inglés"),
            new Examen(7L, "Historia"));

    public final static List<String> PREGUNTAS = Arrays.asList("aritmética",
            "integrales",
            "derivadas",
            "trigonometría",
            "geometría");
}
