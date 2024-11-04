package org.example.palomabookmanager.model;

// Definimos la clase Book que representará un libro en nuestra aplicación
public class Book {
    // Atributos privados que contienen la información de cada libro
    private String title; // Título del libro
    private String author; // Autor del libro
    private String isbn; // Código ISBN del libro

    // Constructor de la clase Book para inicializar un libro con título, autor e ISBN
    public Book(String title, String author, String isbn) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
    }

    // Métodos getters para obtener el valor de cada atributo
    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String getIsbn() {
        return isbn;
    }

    // Método toString para mostrar la información del libro en formato legible
    @Override
    public String toString() {
        return ", Título: " + title + ", Autor: " + author + "ISBN: " + isbn;
    }
}
