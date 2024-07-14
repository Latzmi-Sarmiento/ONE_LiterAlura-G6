package com.alura.literatura.service;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.util.ArrayList;
import java.util.List;


public class ConvierteDatosAutor implements IConvierteDatos {
    private ObjectMapper objectMapper = new ObjectMapper();

    // Método para obtener un objeto de tipo T a partir de un JSON
    @Override
    public <T> T obtenerDatos(String json, Class<T> clase) {
        try {
            JsonNode rootNode = objectMapper.readTree(json);

            JsonNode resultsArray = rootNode.get("results");

            // Verifica si el array de resultados no es nulo y tiene al menos un elemento
            if (resultsArray != null && resultsArray.size() > 0) {
                // Obtiene el primer autor del primer resultado
                JsonNode firstResult = resultsArray.get(0).get("authors").get(0);
                // Convierte el primer autor a la clase especificada
                return objectMapper.treeToValue(firstResult, clase);
            } else {
                // Maneja el caso donde no se encontraron resultados
                throw new RuntimeException("No se encontraron resultados en el JSON.");
            }
        } catch (JsonProcessingException e) {
            // Maneja excepciones de procesamiento de JSON
            throw new RuntimeException(e);
        }
    }

    // Método para obtener una lista de objetos de tipo T a partir de un JSON
    @Override
    public <T> List<T> obtenerDatosArray(String json, Class<T> clase) {
        try {
            JsonNode rootNode = objectMapper.readTree(json);

            JsonNode resultsArray = rootNode.get("results");
            // Verifica si el array de resultados no es nulo y tiene al menos un elemento
            if (resultsArray != null && resultsArray.size() > 0) {
                List<T> resultList = new ArrayList<>();
                for (int i = 0; i < resultsArray.size(); i++) {
                    // Obtiene el primer autor de cada resultado
                    JsonNode firstResult = resultsArray.get(i).get("authors").get(0);
                    // Convierte el primer autor a la clase especificada y lo agrega a la lista
                    T result = objectMapper.treeToValue(firstResult, clase);
                    resultList.add(result);
                }
                return resultList;
            } else {
                // Maneja el caso donde no se encontraron resultados
                throw new RuntimeException("No se encontraron resultados en el JSON.");
            }
        }
        catch (JsonProcessingException e) {
            // Maneja excepciones de procesamiento de JSON
            throw new RuntimeException(e);
        }
    }
}
