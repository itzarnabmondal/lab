package com.demo.lab;

import java.util.Objects;

class Library {
    private String bookId, bookName, bookAuthor;
    public void addBook(String bookId, String bookName, String bookAuthor) { // for adding book
        this.bookId = bookId;
        this.bookName = bookName;
        this.bookAuthor = bookAuthor;
    }
    public void dispenseBook(String bookId, String bookName, String bookAuthor) { // for dispense book
        // checking is book details is matched or not
        if (Objects.equals(this.bookId, bookId) && Objects.equals(this.bookName,bookName) && Objects.equals(this.bookAuthor,bookAuthor)) {
            System.out.println("[ "+bookId+" ,"+bookName+" ,"+bookAuthor+" ] is Assigned to you :) ");
        } else {
            System.out.println("Sorry we don't fount any book matches with your provided details");
        }
    }
}
public class LibraryBookManagement {
    public static void main(String[] args) {
        Library library = new Library(); // creating library object
        library.addBook("00001", "theory of relativity", "albert einstein");
        library.dispenseBook("00001", "theory of relativity", "albert einstein");
    }
}
