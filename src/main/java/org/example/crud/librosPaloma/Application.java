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



    // método borrar un libro por Isbn
    public void borrarLibroPorIsbn(String isbn){
        for(Libro libro : libros){
            if(libro.getIsbn().equals(isbn)){
                libros.remove(libro);
                System.out.println("Libro con Isbn " + isbn + " eliminado exitosamente.");
                return;
            }

        }
    }

    // método buscar un libro por ID
    public void buscarLibroPorIsbn(String isbn){
        for(Libro libro : libros){
            if (libro.getIsbn().equals(isbn)){
                System.out.println("El libro correspondiente al Isbn " + isbn + " es: " + libro.getTitulo());
            }
        }
    }

    // método para finalizar la aplicación
}
