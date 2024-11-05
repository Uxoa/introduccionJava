package org.example.crud.librosPaloma;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Application application = new Application();

        Scanner scanner =new Scanner(System.in);

        while(true) {
            System.out.println("--------------------------------------");
            System.out.println("MIS LIBROS");
            System.out.println("1. Ver todos los libros");
            System.out.println("2. Añadir un libro");
            System.out.println("3. Borrar un libro pos su Isbn");
            System.out.println("4. Buscar un libro por su Isbn");
            System.out.println("5. Salir de la aplicación");
            System.out.println("ELIGE UNA OPCIÓN:");

            int opcion = scanner.nextInt();
            scanner.nextLine();
            System.out.println("--------------------------------------");


            switch (opcion){
                case 1 :
                    System.out.println("Has elegido -----> " + opcion + ". Ver todos los libros");
                    application.verTodosLosLibros();
                    break;
                case 2 :
                    System.out.println("Has elegido -----> " + opcion + ". Aañadir un libro");
                    System.out.print("Título: ");
                    String titulo = scanner.nextLine();
                    System.out.print("Autor: ");
                    String autor = scanner.nextLine();
                    System.out.print("ISBN: ");
                    String isbn = scanner.nextLine();

                    Libro libro = new Libro(titulo, autor, isbn);
                    application.agregarNuevoLibro(libro);

                    break;

                case 3 :
                    System.out.println("Has elegido -----> " + opcion + ". Borrar un libro por su Isbn");
                    isbn = scanner.nextLine();
                    application.borrarLibroPorIsbn(isbn);
                    break;

                case 4 :
                    System.out.println("Has elegido -----> " + opcion + ". Buscar un libro por su Isbn");
                    isbn = scanner.nextLine();
                    application.buscarLibroPorIsbn(isbn);
                    break;

                case 5 :
                    System.out.println("Finalizando la aplicación, gracias!");
                    scanner.close();
                    return;

            }



        }


    }
}
