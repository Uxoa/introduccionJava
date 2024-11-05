package org.example.crud.librosPaloma;

import java.util.ArrayList;
import java.util.List;

public class Application {

    private List<Libro> libros = new ArrayList<>();


    // método mostrar todos los libros
    public void verTodosLosLibros(){
        if(libros.isEmpty()){
            System.out.println("No hay libros en este momento");
        } else {
            for (Libro libro : libros) {
                System.out.println(libro);
            }


        }

    }
    // método agregar un libro
    public void agregarNuevoLibro(Libro libro) {
        libros.add(libro);
        System.out.println("Libro agregado correctamente.");
    }



    // método borrar un libro por ID

    // método buscar un libro por ID

    // método para finalizar la aplicación
}
