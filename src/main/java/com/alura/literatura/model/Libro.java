package com.alura.literatura.model;

import jakarta.persistence.*;

import java.util.List;
import java.util.OptionalDouble;

@Entity
@Table(name="libros")
public class Libro {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String titulo;
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "autor_id")
    private Autor autor;
    private String idioma;
    private Double descargas;

    // Constructor sin argumentos
    public Libro() {}

    // Constructor con argumentos
    public Libro(String titulo, Autor autor, List<String> idiomas, Double descargas) {
        this.titulo = titulo;
        this.autor = autor;
        this.idioma = idiomas != null && !idiomas.isEmpty() ? String.join(",", idiomas) : null;
        this.descargas = OptionalDouble.of(descargas).orElse(0);
    }
    // Métodos de acceso para el campo id
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }

    // Métodos de acceso para el campo titulo
    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    // Métodos de acceso para el campo autor
    public Autor getAutor() {
        return autor;
    }
    public void setAutor(Autor autor) {
        this.autor = autor;
    }

    // Métodos de acceso para el campo idioma
    public String getIdioma() {
        return idioma;
    }
    public void setIdioma(String idioma) {
        this.idioma = idioma;
    }

    // Métodos de acceso para el campo descargas
    public Double getDescargas() {
        return descargas;
    }
    public void setDescargas(Double descargas) {
        this.descargas = descargas;
    }

    // Método toString para representar el objeto Libro como una cadena de texto
    @Override
    public String toString() {
        return "-------- Libro --------" +"\n"+
                "Título: " + titulo + "\n" +
                "Autor: " + autor.getNombre() + "\n" +
                "Idioma: " + idioma + "\n" +
                "Número de descargas: " + descargas + "\n" +
                "-----------------------";
    }
}
