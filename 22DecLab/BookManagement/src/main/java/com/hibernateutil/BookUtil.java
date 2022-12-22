package com.hibernateutil;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.entity.Book;

public class BookUtil {
	public static Session getSession() {
		Configuration configuration = new Configuration().configure().addAnnotatedClass(Book.class);
		SessionFactory sessionFactory = configuration.buildSessionFactory();
		return sessionFactory.openSession();
		
	}
}
