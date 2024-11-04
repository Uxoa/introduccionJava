package org.example.palomabookmanager.controller;

import org.example.palomabookmanager.model.Book;
import org.example.palomabookmanager.model.BookRepository;
import org.example.palomabookmanager.view.BookView;

// Definimos la clase BookController que gestionará la lógica de la aplicación
public class BookController {
    private BookRepository repository;
    private BookView view;

    // Constructor que inicializa el repositorio y la vista
    public BookController(BookRepository repository, BookView view) {
        this.repository = repository;
        this.view = view;
    }

    // Método que inicia la aplicación y gestiona el menú principal
    public void start() {
        int option;
        do {
            view.showMenu(); // Mostrar el menú
            option = view.getOption(); // Leer la opción del usuario
            switch (option) {
                case 1:
                    showOptionSelected(1, "Añadir Libro");
                    addBook();
                    break;
                case 2:
                    showOptionSelected(2, "Ver todos los libros");
                    showBooks();
                    break;
                case 3:
                    showOptionSelected(2, "Eliminar libro");
                    removeBook();
                    break;
                case 4:
                    view.showMessage("Opción 4: Cambiar repositorio seleccionada.");
                    break;
                case 5:
                    view.showMessage("Saliendo de la aplicación.");
                    break;
                default:
                    view.showMessage("Opción inválida. Por favor, seleccione una opción del 1 al 5.");
                    break;
            }
        } while (option != 5);

    }

    // Método para mostrar la opción seleccionada
    private void showOptionSelected(int option, String description) {
        System.out.println("---> Ha seleccionado la opción " + option + ": " + description + " <---");
    }




    // Método para añadir un libro
    private void addBook() {
        String title = view.getBookTitle(); // Pedir el título del libro
        String author = view.getBookAuthor(); // Pedir el autor del libro
        String isbn = view.getBookIsbn(); // Pedir el ISBN del libro
        Book book = new Book(title, author, isbn); // Crear un nuevo libro con los datos proporcionados
        if (repository.addBook(book)) { // Si el libro se añade exitosamente
            view.showMessage("Libro añadido con éxito.");
        } else { // Si el ISBN ya existe
            view.showMessage("Ya existe un libro con ese ISBN.");
        }
    }

    // Método para mostrar todos los libros
    private void showBooks() {
        if (repository.getAllBooks().isEmpty()) { // Si la lista de libros está vacía
            view.showMessage("No hay libros en la colección.");
        } else {
            for (Book book : repository.getAllBooks()) { // Para cada libro en la lista
                view.showMessage(book.toString()); // Mostrar la información del libro
            }
        }
    }

    // Método para eliminar un libro
    private void removeBook() {
        String isbn = view.getBookIsbn(); // Pedir el ISBN del libro a eliminar
        if (repository.removeBook(isbn)) { // Si el libro se elimina con éxito
            view.showMessage("Libro eliminado con éxito.");
        } else { // Si el ISBN no se encuentra en la lista
            view.showMessage("No se encontró un libro con ese ISBN.");
        }
    }
}

