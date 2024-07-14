package com.alura.literatura.service;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.util.ArrayList;
import java.util.List;

public class ConvierteDatos implements IConvierteDatos {
    private ObjectMapper objectMapper = new ObjectMapper();
    // Método para obtener un objeto de tipo T a partir de un JSON
    @Override
    public <T> T obtenerDatos(String json, Class<T> clase) {
        try {
            // Parsea el JSON a un JsonNode
            JsonNode rootNode = objectMapper.readTree(json);

            // Obtiene el array de resultados
            JsonNode resultsArray = rootNode.get("results");

            // Si el array de resultados no es nulo y tiene al menos un elemento
            if (resultsArray != null && resultsArray.size() > 0) {
                // Obtiene el primer objeto en el array de resultados
                JsonNode firstResult = resultsArray.get(0);
                // Convierte el primer resultado a la clase especificada
                return objectMapper.treeToValue(firstResult, clase);
            } else {
                // Maneja el caso donde no se encontraron resultados
                throw new RuntimeException("No se encontraron resultados en el JSON.");
            }

        } catch (JsonProcessingException e) {
            throw new RuntimeException(e);
        }

    }
    // Método para obtener una lista de objetos de tipo T a partir de un JSON
    @Override
    public <T> List<T> obtenerDatosArray(String json, Class<T> clase) {
        try {
            JsonNode rootNode = objectMapper.readTree(json);

            JsonNode resultsArray = rootNode.get("results");

            if (resultsArray != null && resultsArray.size() > 0) {
                List<T> resultList = new ArrayList<>();
                for (JsonNode node : resultsArray) {
                    T result = objectMapper.treeToValue(node, clase);
                    resultList.add(result);
                }
                return resultList;
            } else {
                throw new RuntimeException("No se encontraron resultados en el JSON.");
            }
        } catch (JsonProcessingException e) {
            throw new RuntimeException(e);
        }
    }
}
