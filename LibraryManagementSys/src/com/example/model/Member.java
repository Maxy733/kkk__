package com.example.model;

import java.util.ArrayList;

public class Member {
	
	private String name;
	private int memberId;
	private ArrayList<Book>borrowedBooks=new ArrayList<Book>();
	public Member(String name,int memberId) {
		
		this.name=name;
		this.memberId=memberId;
		
	}
	
	public String getName() {
		
		return this.name;
		
	}
	
	public void borrowBook(Book book) {
		if(book.isAvailable()) {
			book.borrow();
			borrowedBooks.add(book);
			System.out.println("Borrowed Success!!!");
		}else {
			System.out.println("Can't Borrow");
		}
	
		
	}
	public void returnBook(Book book) {
		
		borrowedBooks.remove(book);
		book.returnBook();
		System.out.print("Book returned.");
		
		
	}
	
	public String toString() {
		
		return "\n (Member: "+name+" ID: "+memberId+")\n";
		
	}

	
	
}
