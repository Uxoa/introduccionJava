package org.example.palomabookmanager.controller;

import org.example.palomabookmanager.model.Book;
import org.example.palomabookmanager.model.BookRepository;
import view.BookView;

public class BookController {
    private BookRepository repository;
    private BookView view;

    // Constructor
    public BookController(BookRepository repository, BookView view) {
        this.repository = repository;
        this.view = view;
    }

    // Iniciar la aplicación
    public void start() {
        int option;
        do {
            view.showMenu();
            option = view.getOption();
            switch (option) {
                case 1:
                    addBook();
                    break;
                case 2:
                    showBooks();
                    break;
                case 3:
                    removeBook();
                    break;
                case 4:
                    view.showMessage("Saliendo de la aplicación.");
                    break;
                default:
                    view.showMessage("Opción inválida. Por favor, seleccione una opción del 1 al 4.");
                    break;
            }
        } while (option != 4);
    }

    // Método para añadir un libro
    private void addBook() {
        String title = view.getBookTitle();
        String author = view.getBookAuthor();
        String isbn = view.getBookIsbn();
        Book book = new Book(title, author, isbn);
        if (repository.addBook(book)) {
            view.showMessage("Libro añadido con éxito.");
        } else {
            view.showMessage("Ya existe un libro con ese ISBN.");
        }
    }

    // Método para mostrar todos los libros
    private void showBooks() {
        if (repository.getAllBooks().isEmpty()) {
            view.showMessage("No hay libros en la colección.");
        } else {
            for (Book book : repository.getAllBooks()) {
                view.showMessage(book.toString());
            }
        }
    }

    // Método para eliminar un libro
    private void removeBook() {
        String isbn = view.getBookIsbn();
        if (repository.removeBook(isbn)) {
            view.showMessage("Libro eliminado con éxito.");
        } else {
            view.showMessage("No se encontró un libro con ese ISBN.");
        }
    }
}
