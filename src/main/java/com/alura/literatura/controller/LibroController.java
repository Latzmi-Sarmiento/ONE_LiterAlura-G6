package com.alura.literatura.controller;

import com.alura.literatura.dto.LibroDTO;
import com.alura.literatura.service.LibroServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/libros")
public class LibroController {
    @Autowired
    private LibroServicio servicio;

    @GetMapping()
    public List<LibroDTO> obtenerTodosLosLibros(){
        return servicio.obtenerTodosLosLibros();
    }
}
