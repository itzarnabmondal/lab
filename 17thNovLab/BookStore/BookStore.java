package com.book;

import java.util.ArrayList;

public class BookStore { //main class
  ArrayList <Book> bookList = new ArrayList<>(); //creating arrayList

  // op 1
  public void addBook(Book b) {
    bookList.add(b); //adding new book
  }

  // op 2
  public void searchByTitle(String title) { //passing title
    for (Book b: bookList) {
      if (title.contains(b.getTitle())) { //condition
        System.out.println(b);
        break;
      } else {
        System.out.println("not found");
        break;
      }
    }
  }

  // op 3
  public void searchByAuthor(String author) { //passing author
    for (Book b: bookList) {
      if (author.contains(b.getAuthor())) { //condition
        System.out.println(b);
        break;
      } else {
        System.out.println("not found");
        break;
      }
    }
  }

  // op 4
  public void displayAll() { //displayAll method 
    for (Book b: bookList)
      System.out.println(b);
  }
}