package org.example.palomabookmanager;

import org.example.palomabookmanager.controller.BookController;
import org.example.palomabookmanager.model.BookRepository;
import view.BookView;

public class Main {
    public static void main(String[] args) {
        BookRepository repository = new BookRepository();
        BookView view = new BookView();
        BookController controller = new BookController(repository, view);

        controller.start();
    }
}
