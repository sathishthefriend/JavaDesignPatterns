package com.java.design.prototype;

import java.util.ArrayList;
import java.util.List;

public class BookShop implements Cloneable{
	private String bookShopName;
	private List<Book> books;
	public String getBookShopName() {
		return bookShopName;
	}
	public void setBookShopName(String bookShopName) {
		this.bookShopName = bookShopName;
	}
	public List<Book> getBooks() {
		return books;
	}
	public void setBooks(List<Book> books) {
		this.books = books;
	}
	@Override
	public String toString() {
		return "BookShop [bookShopName=" + bookShopName + ", books=" + books + "]";
	}
	
	// Deep Copy
	
	@Override
	protected BookShop clone() throws CloneNotSupportedException {		
		BookShop bookShop = new BookShop();
		for(Book book:this.books) {
			if(null!=bookShop.getBooks())				
				bookShop.getBooks().add(book);
			else {
				bookShop.setBooks(new ArrayList<>());
				bookShop.getBooks().add(book);
			}
		}
		return bookShop;
	}
	
	// Shallow Copy
	/*
	@Override
	protected Object clone() throws CloneNotSupportedException {				
		return super.clone();
	}*/
	
}
