package com.java.design.prototype;

import java.util.ArrayList;
import java.util.List;

public class DataLoader {
	
	public List<Book> loadBooks(){
		
		List<Book> books = new ArrayList<>();
		
		for(int i=1;i<=10;i++) {
			Book book = new Book();
			book.setBookId(i);
			book.setBookName("Book"+i);
			books.add(book);
		}
		
		/*book.setBookId(2);
		book.setBookName("Book2");
		book.setBookId(3);
		book.setBookName("Book3");
		book.setBookId(4);
		book.setBookName("Book4");
		book.setBookId(5);
		book.setBookName("Book5");*/
		return books; 
	}

}
