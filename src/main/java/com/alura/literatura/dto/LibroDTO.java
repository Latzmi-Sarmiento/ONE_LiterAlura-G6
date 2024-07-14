package com.alura.literatura.dto;

import com.alura.literatura.model.Autor;

/**
 * DTO (Data Transfer Object) que representa los datos de un libro para transferencia de datos.
 */

public record LibroDTO(
        Long Id,
        String titulo,
        Autor autor,
        String idioma,
        Double descargas

) {
}
