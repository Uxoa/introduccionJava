package org.example.palomabookmanager.view;

import java.util.Scanner;

// Definimos la clase BookView para interactuar con el usuario en la consola
public class BookView {
    private Scanner scanner;

    // Constructor que inicializa el escáner para leer la entrada del usuario
    public BookView() {
        scanner = new Scanner(System.in);
    }

    // Método para mostrar el menú principal en la consola
    public void showMenu() {
        System.out.println("Gestor de Libros Técnicos de Programación");
        System.out.println("1. Añadir libro");
        System.out.println("2. Ver todos los libros");
        System.out.println("3. Eliminar libro");
        System.out.println("4. Cambiar repositorio");
        System.out.println("5. Salir");
        System.out.print("Seleccione una opción: ");
    }

    // Método para leer la opción seleccionada por el usuario
    public int getOption() {
        int option = scanner.nextInt();
        scanner.nextLine(); // Limpiar el salto de línea pendiente
        return option;
    }

    // Métodos para recoger datos del usuario para añadir un libro
    public String getBookTitle() {
        System.out.print("Ingrese el título: ");
        return scanner.nextLine();
    }

    public String getBookAuthor() {
        System.out.print("Ingrese el autor: ");
        return scanner.nextLine();
    }

    public String getBookIsbn() {
        System.out.print("Ingrese el ISBN (una letra seguida de tres números, por ejemplo, A123): ");
        return scanner.nextLine();
    }

    // Método para mostrar mensajes personalizados en la consola
    public void showMessage(String message) {
        System.out.print("---------------------------------\n");
        System.out.println(message);
        System.out.print("---------------------------------\n");
    }
}
