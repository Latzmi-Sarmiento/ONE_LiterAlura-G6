package com.alura.literatura.repository;

import com.alura.literatura.model.Autor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;
import java.util.Optional;

/**
 * Repositorio para realizar operaciones relacionadas con la entidad Autor en la base de datos.
 */

public interface AutorRepository extends JpaRepository<Autor,Long> {
    /**
     * Busca un autor por su nombre, ignorando mayúsculas y minúsculas.
     *
     * @param nombreAutor Nombre del autor a buscar.
     * @return Una instancia de Autor envuelta en un Optional.
     */
    Optional<Autor> findByNombreContainingIgnoreCase(String nombreAutor);

    /**
     * Busca autores nacidos después de un año específico.
     *
     * @param fecha Año límite de nacimiento.
     * @return Una lista de autores nacidos después del año especificado.
     */
    @Query("SELECT a FROM Autor a WHERE a.fechaNacimiento > :fecha")
    List<Autor> findByFechaNacimientoAfter(@Param("fecha") int fecha);

    /**
     * Busca autores fallecidos antes de un año específico.
     *
     * @param fecha Año límite de fallecimiento.
     * @return Una lista de autores fallecidos antes del año especificado.
     */
    @Query("SELECT a FROM Autor a WHERE a.fechaFallecimiento < :fecha")
    List<Autor> findByFechaFallecimientoBefore(@Param("fecha") int fecha);

}
