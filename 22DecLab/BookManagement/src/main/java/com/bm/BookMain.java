package com.bm;

import java.util.Scanner;
import com.dauimpl.BookImpl;

public class BookMain {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		char i;
		BookImpl bl = new BookImpl();
		do {
			
			System.out
					.println("\nEnter 1 for add book\n2 for fetch book details\nOr enter any other character for exit");
			char input = new Scanner(System.in).next().charAt(0);
			switch (input) {
			case '1':
				bl.addBook();
				break;
			case '2':
				bl.fetchBook();
				break;
			default:
				System.exit(0);
				break;
			}

			System.out.println("\nDo you want to run again (Y for yes any others for NO");
			
			i = new Scanner(System.in).next().charAt(0);
		} while (i == 'Y' || i == 'y');

	}
}
