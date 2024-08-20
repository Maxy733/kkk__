package com.example.main;

import com.example.model.Book;
import com.example.model.Library;
import com.example.model.Member;

public class MainApp {

	public static void main(String[] args) {
		
		Library library= new Library();
		
		Book b1 = new Book("To Kill a Mockingbird", "Harper Lee", "0061120081");
		Book b2 = new Book("1984", "George Orwell", "0451524934");
		Book b3 = new Book("Pride and Prejudice", "Jane Austen", "1503290565");
		
		library.addBook(b1);
		library.addBook(b2);
		library.addBook(b3);
		
		Member m1 = new Member("Min Maung Hein", 0001);
		Member m2 = new Member("Kyaw Tay Za", 0002);
		Member m3 = new Member("Kyaw Thiha", 0003);
		
		
		library.addMember(m1);
		library.addMember(m2);
		library.addMember(m3);
		
		
		library.borrowBook(m1, b3);
		library.borrowBook(m2, b1);
		library.borrowBook(m3, b2);
		
		library.displayMembers();
		library.displayBooks();
		
		library.returnBook(m1, b3);
		library.returnBook(m2, b1);
		library.returnBook(m3, b2);
		
		library.displayMembers();
		library.displayBooks();
		
		
		
		
		
		

	}

}