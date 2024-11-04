package org.example.palomabookmanager;

import org.example.palomabookmanager.controller.BookController;
import org.example.palomabookmanager.model.BookRepository;
import org.example.palomabookmanager.view.BookView;

// Clase principal que inicia la aplicación
public class Main {
    public static void main(String[] args) {
        BookRepository repository = new BookRepository(); // Crear el repositorio
        BookView view = new BookView(); // Crear la vista
        BookController controller = new BookController(repository, view); // Crear el controlador

        controller.start(); // Iniciar el controlador y la aplicación
    }
}

