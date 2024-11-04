package org.example.palomabookmanager.model;
import java.util.ArrayList;
import java.util.List;

/** Esta clase actua como un "almacenador" de los libros.
 *  Su función será gestionar la colección de libros, es decir, permitir
 *  añadir, eliminar y consultar todos los libros que el usuario quiera almacenar.
*/

// Definimos la clase BookRepository que gestionará una colección de libros
public class BookRepository {
    // Atributo privado que es una lista de libros
    private List<Book> books;

    // Constructor que inicializa la lista de libros vacía
    public BookRepository() {
        books = new ArrayList<>();
    }

    // Método para añadir un libro a la lista
    public boolean addBook(Book book) {
        for (Book b : books) {
            if (b.getIsbn().equals(book.getIsbn())) {
                return false; // ISBN ya existe, no se añade el libro
            }
        }
        books.add(book); // Si no hay un ISBN repetido, añade el libro a la lista
        return true;
    }

    // Método para obtener todos los libros en la lista
    public List<Book> getAllBooks() {
        return books;
    }

    // Método para eliminar un libro de la lista según el ISBN
    public boolean removeBook(String isbn) {
        return books.removeIf(book -> book.getIsbn().equals(isbn));
    }


}
