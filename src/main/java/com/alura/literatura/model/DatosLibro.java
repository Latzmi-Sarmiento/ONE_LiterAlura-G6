package com.alura.literatura.model;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.List;

/**
 * Clase que representa los datos de un libro obtenidos de una fuente externa.
 */

@JsonIgnoreProperties(ignoreUnknown = true)
public record DatosLibro(
    @JsonAlias("title") String titulo,
    @JsonAlias("name") Autor autor,
    @JsonAlias("languages") List<String> idioma,
    @JsonAlias("download_count") Double descargas){
}
