package com.alura.literatura.dto;

/**
 * DTO (Data Transfer Object) que representa los datos de un autor para transferencia de datos.
 */
public record AutorDTO(
        Long Id,
        String nombre,
        int fechaNacimiento,
        int fechaFallecimiento) {
}
