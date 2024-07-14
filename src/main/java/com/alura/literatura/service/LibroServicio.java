package com.alura.literatura.service;

import com.alura.literatura.dto.LibroDTO;
import com.alura.literatura.model.Libro;
import com.alura.literatura.repository.LibroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class LibroServicio {
    @Autowired
    private LibroRepository repository;

    // Método para obtener todos los libros y convertirlos a LibroDTO
    public List<LibroDTO> obtenerTodosLosLibros() {

        return convierteDatos(repository.findAll());
    }

    // Método para convertir una lista de libros a una lista de LibroDTO
    public List<LibroDTO> convierteDatos(List<Libro> libro) {
        return libro.stream()
                .map(l -> new LibroDTO(
                        l.getId(),
                        l.getTitulo(),
                        l.getAutor(),
                        l.getIdioma(),
                        l.getDescargas()
                ))
                .collect(Collectors.toList());
    }
}
