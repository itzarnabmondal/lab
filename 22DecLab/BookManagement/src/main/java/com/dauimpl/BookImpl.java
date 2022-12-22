package com.dauimpl;

import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.dao.BookDao;
import com.entity.Book;
import com.hibernateutil.BookUtil;

public class BookImpl implements BookDao {

	@SuppressWarnings("deprecation")
	public void addBook() {
		Session session = BookUtil.getSession();
		Transaction t = session.beginTransaction();
		Scanner sc = new Scanner(System.in);
		Book book = new Book();
		System.out.println("Enter Book id:");
		book.setBookid(sc.nextInt());
		System.out.println("Enter Bool title:");
		book.setTitle(sc.next());
		System.out.println("Enter Book author name:");
		book.setAuthor(sc.next());
		session.save(book);
		t.commit();
		System.out.println("Record inserted successfully");
		session.close();
		sc.close();
	}

	@SuppressWarnings("resource")
	public void fetchBook() {
		Session session = BookUtil.getSession();
		Transaction t = session.beginTransaction();
		Book objBook;
		System.out.println("Enter book id to view details: ");
		objBook = session.get(Book.class, new Scanner(System.in).nextInt());
		System.out.println(objBook);
		t.commit();
	}
}
