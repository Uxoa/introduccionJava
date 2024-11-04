package view;

import java.util.Scanner;

public class BookView {
    private Scanner scanner;

    // Constructor
    public BookView() {
        scanner = new Scanner(System.in);
    }

    // Mostrar el menú principal
    public void showMenu() {
        System.out.println("Gestor de Libros Técnicos de Programación");
        System.out.println("1. Añadir libro");
        System.out.println("2. Ver todos los libros");
        System.out.println("3. Eliminar libro");
        System.out.println("4. Salir");
        System.out.print("Seleccione una opción: ");
    }

    // Obtener opción del usuario
    public int getOption() {
        return scanner.nextInt();
    }

    // Métodos para interactuar con el usuario
    public String getBookTitle() {
        System.out.print("Ingrese el título: ");
        return scanner.next();
    }

    public String getBookAuthor() {
        System.out.print("Ingrese el autor: ");
        return scanner.next();
    }

    public String getBookIsbn() {
        System.out.print("Ingrese el ISBN (una letra seguida de tres números, por ejemplo, A123): ");
        return scanner.next();
    }

    public void showMessage(String message) {
        System.out.println(message);
    }
}
