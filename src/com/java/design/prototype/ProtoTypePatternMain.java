/*
 * 
 */
package com.java.design.prototype;

/**
 * @author Sathish
 *
 */
public class ProtoTypePatternMain {

	/**
	 * @param args
	 * @throws CloneNotSupportedException 
	 */
	public static void main(String[] args) throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		DataLoader dataLoader = new DataLoader();
		BookShop bookShop = new BookShop();
		bookShop.setBookShopName("MyBookShop");		
		bookShop.setBooks(dataLoader.loadBooks());
		
		BookShop bookShop1 = bookShop.clone();
		bookShop1.setBookShopName("SathishBookShop");
		
		bookShop1.getBooks().remove(2);
		
		System.out.println(bookShop);		
		System.out.println(bookShop1);
		
	}

}
