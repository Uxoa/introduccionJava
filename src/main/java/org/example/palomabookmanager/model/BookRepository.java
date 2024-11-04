package org.example.palomabookmanager.model;
import java.util.ArrayList;
import java.util.List;

/** Esta clase almacenará los libros en una lista y proporcionará
métodos para añadir, eliminar y ver todos los libros.
*/

    public class BookRepository {
        private List<Book> books;

        // Constructor
        public BookRepository() {
            books = new ArrayList<>();
        }

        // Método para añadir un libro
        public boolean addBook(Book book) {
            for (Book b : books) {
                if (b.getIsbn().equals(book.getIsbn())) {
                    return false; // ISBN ya existe
                }
            }
            books.add(book);
            return true;
        }

        // Método para eliminar un libro por ISBN
        public boolean removeBook(String isbn) {
            return books.removeIf(book -> book.getIsbn().equals(isbn));
        }

        // Método para obtener todos los libros
        public List<Book> getAllBooks() {
            return books;
        }
    }

