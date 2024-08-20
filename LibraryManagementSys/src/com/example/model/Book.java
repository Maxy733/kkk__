package com.example.model;

public class Book {
	private String title;
	private String author;
	private String ISBN;
	private boolean isAvailable=true;
	public Book(String title,String author,String ISBN) {
		this.title=title;
		this.author=author;
		this.ISBN=ISBN;
	}
	public String getTitle() {
		return this.title;
	}
	public boolean isAvailable() {
		return this.isAvailable;
	}
	public void borrow() {
		isAvailable=false;
		}
	
	public void returnBook()
	{
		isAvailable=true;
	}
	public String toString() {
		return "\n Book(title: "+title+" Author: "+author+"ISBN: "+this.ISBN+")\n";
	}
}
