package com.CMS;

import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import com.CMS.Entity.College;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;



public class CollegeManage {
	static SessionFactory s;
	Scanner sc=new Scanner(System.in);
	public static void main( String[] args ) {
try {
	s = new Configuration().configure().buildSessionFactory();
	} catch (Exception e) {
	System.out.println(e);
	}
	CollegeManage c = new CollegeManage();
	Scanner sc=new Scanner(System.in);
	int ch;
	do{
	System.out.println("Enter your choice: ");
	System.out.println("1: Add\n2: Show\n3: Update\n4: Delete\n");
	 ch=sc.nextInt();
	switch(ch) {
	case 1:
	c.addCollege();
	break;  //calling addBook() method
	
	case 2:
	c.readCollege();
	break;
	
	case 3:
	c.updateCollege();
	break;
	
	case 4:
	c.deleteCollege();
	break;
		} 
	} while(ch>0&&ch<5);
}	//method to add students in CMS table
	public void addCollege() {
	try {
		String firstName,lastName,dept,address;
		int id;
		long phone;
		System.out.println("Enter first name: ");
		firstName=sc.next();
		System.out.println("Enter last name: ");
		lastName=sc.next();
		System.out.println("Enter department name: ");
		dept=sc.next();
		System.out.println("Enter phone number: ");
		phone=sc.nextLong();
		System.out.println("Enter address: ");
		address=sc.next();
		
		
	Session	ses = s.openSession();
	Transaction t = ses.beginTransaction();
	College c = new College();
	c.setFirstName(firstName);
	c.setLastName(lastName);
	c.setPhone(phone);
	c.setDept(dept);
	c.setAddress(address);
	ses.save(c);
	t.commit();
	System.out.println("Inserted Successfully");
	} catch (Exception e) {
	System.out.println(e);
	}
	}
	//method to show student details in CMS table
	public void readCollege() {
	try {
	Session ses = s.openSession();
	List colleges = ses.createQuery("from College").list();
	for(Iterator itr = colleges.iterator();itr.hasNext();) {
	College c = (College) itr.next();	
	System.out.println(c.getId()+" "+c.getFirstName()+" "+c.getLastName()+" "+c.getDept()+" "+c.getPhone());
	}
	} catch (Exception e) {
	System.out.println(e);
	}
	}

	//method to update student details in CMS table
	public void updateCollege() {

		int id;long phone;
		System.out.println("Enter id: ");
		id=sc.nextInt();
		System.out.println("Select what you want to update: ");
		System.out.println("Press 1: Phone no. update ");
		System.out.println("Press 2: Address update ");
		int choice = sc.nextInt();
		switch (choice) {   //giving user choice to update phone or address
		case 1:
			System.out.println("Enter new phone no. :");
			long newPhone = sc.nextLong();
			try {Session	ses = s.openSession();
			Transaction t = ses.beginTransaction();
			College c = ses.get(College.class,id);
			c.setPhone(newPhone);
			ses.update(c);
			t.commit();
			System.out.println("Phone number Updated Successfully");
			} catch (Exception e) {
			System.out.println(e);
			}
			break;

		case 2:
			System.out.println("Enter new address :");
			String newAddress = sc.next();
			try {
				Session	ses = s.openSession();
			Transaction t = ses.beginTransaction();
			College c = ses.get(College.class,id);
			c.setAddress(newAddress);
			ses.update(c);
			t.commit();
			System.out.println("Address Updated Successfully");
			} catch (Exception e) {
			System.out.println(e);
			}
			break;
		}
	}
	//method to delete student record in CMS table
	public void deleteCollege() {
		int id;
		System.out.println("Enter id: ");
		id=sc.nextInt();
	try {
	Session	ses = s.openSession();
	Transaction t = ses.beginTransaction();
	College c = ses.get(College.class,id);
	ses.delete(c);
	t.commit();
	System.out.println("Deleted Succesfully");
	} catch (Exception e) {
	System.out.println(e);
	}
	}
}
