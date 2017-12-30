/**
 * 
 */
package com.java.design.factory;

/**
 * @author Sathish
 *
 */
public class CarFactory {
	public Car getCar(String carName) {
		if(carName.equals("ford"))
			return new Ford();
		else if(carName.equals("honda"))
			return new Honda();
		else if(carName.equals("toyota"))
			return new Toyota();
		else if(carName.equals("chevy"))
			return new Chevy();
		return null;		
	}
}
