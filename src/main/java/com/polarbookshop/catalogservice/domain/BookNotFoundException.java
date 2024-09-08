package com.polarbookshop.catalogservice.domain;

/**
 * @author Prathap S
 */
public class BookNotFoundException extends RuntimeException {

    public BookNotFoundException(String isbn) {
        super("The book with ISBN " + isbn + " was not found.");
    }

}