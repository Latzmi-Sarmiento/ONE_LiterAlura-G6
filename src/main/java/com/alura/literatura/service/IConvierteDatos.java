package com.alura.literatura.service;

import java.util.List;

public interface IConvierteDatos {
    // Método para obtener un objeto de tipo T a partir de un JSON
    <T> T obtenerDatos(String json, Class<T> clase);
    // Método para obtener una lista de objetos de tipo T a partir de un JSON
    <T> List<T> obtenerDatosArray(String json, Class<T> clase);
}
