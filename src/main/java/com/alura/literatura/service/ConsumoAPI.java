package com.alura.literatura.service;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ConsumoAPI {
    // Método para obtener datos desde una URL
    public String obtenerDatos(String url){
        // Crear un cliente HTTP
        HttpClient client = HttpClient.newHttpClient();
        // Construir la solicitud HTTP con la URL proporcionada
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(url))
                .build();
        HttpResponse<String> response = null;
        try {
            // Enviar la solicitud HTTP y obtener la respuesta
            response = client
                    .send(request, HttpResponse.BodyHandlers.ofString());
        } catch (IOException e) {
            // Manejar excepción de E/S
            throw new RuntimeException(e);
        } catch (InterruptedException e) {
            // Manejar excepción de interrupción
            throw new RuntimeException(e);
        }
        String json = response.body();
        return json;
    }
}
