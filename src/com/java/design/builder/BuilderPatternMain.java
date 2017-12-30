/**
 * 
 */
package com.java.design.builder;

/**
 * @author Sathish
 *
 */
public class BuilderPatternMain {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Phone phone = new Phone("Quad Core", 1, "Apple", 2100);		
		System.out.println(phone);
		
		Phone phone1 = new PhoneBuilder().setBattery(2100).getPhone();
		System.out.println(phone1);
		
		Phone phone2 = new PhoneBuilder().setBattery(2100).setModel("Samsung").getPhone();
		System.out.println(phone2);
	}

}
