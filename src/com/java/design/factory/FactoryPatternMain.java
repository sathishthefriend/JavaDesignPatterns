/**
 * 
 */
package com.java.design.factory;

/**
 * @author Sathish
 *
 */
public class FactoryPatternMain {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		// Legacy
		
		/*Car car = new Honda();
		car.spec();
		
		car = new Toyota();
		car.spec();*/
		
		Car car = new CarFactory().getCar("honda");
		car.spec();
		
		car = new CarFactory().getCar("ford");
		car.spec();
		
		car = new CarFactory().getCar("chevy");
		car.spec();
	}

}
