package com.alura.literatura.repository;

import com.alura.literatura.model.Libro;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

/**
 * Repositorio para realizar operaciones relacionadas con la entidad Libro en la base de datos.
 */
public interface LibroRepository extends JpaRepository<Libro,Long> {

    /**
     * Busca un libro por su título, ignorando mayúsculas y minúsculas.
     *
     * @param nombreLibro Título del libro a buscar.
     * @return Una instancia de Libro envuelta en un Optional.
     */

    Optional<Libro> findByTituloContainingIgnoreCase(String nombreLibro);
}
