package com.bookutil;

import java.util.Scanner;

import com.book.Book;
import com.book.BookStore;

public class BookUtil {

  public static void main(String[] args) {

    // Creating BookStore & Scanner object
    BookStore obj = new BookStore();
    Scanner sc = new Scanner(System.in); //instantiating scanner object

    for (int i = 1; i <= 3; i++) { //running for loop three times to add 3 book instances

      System.out.println("For book-" + i);

      System.out.println("Enter bookID:");
      String sc = scanBookID.nextLine(); //taking input for bookID

      System.out.println("Enter title:");
      String title = sc.nextLine(); //taking input for title

      System.out.println("Enter author:");
      String author = sc.nextLine(); //taking input for author

      System.out.println("Enter category:");
      String category = sc.nextLine(); //taking input for category

      System.out.println("Enter price:");
      float price = sc.nextFloat(); //taking input for price

      obj.addBook(new Book(bookID, title, author, category, price)); //adding Book instances into BookStore
      obj.displayAll();

      if (i != 4) { // condition
        continue;
      }

    }

    System.out.println("\nEnter title to search book: ");
    String title = sc.nextLine(); // for price
    System.out.println("\nSearched by title");
    obj.searchByTitle(title); // searching book by title 

    System.out.println("\nEnter author name to search book");
    String author = sc.nextLine(); // for price
    System.out.println("\nSearched by author");
    obj.searchByAuthor(author); //searching book by author

    System.out.println("\nPrinting all books:");
    obj.displayAll(); // displaying all books

    sc.close(); //closing Scanner
  }

}