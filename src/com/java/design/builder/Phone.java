/**
 * 
 */
package com.java.design.builder;

/**
 * @author Sathish
 *
 */
public class Phone {
	
	private String processor;
	private Integer ram;
	private String model;
	private Integer battery;
		
	public Phone(String processor, Integer ram, String model, Integer battery) {
		super();
		this.processor = processor;
		this.ram = ram;
		this.model = model;
		this.battery = battery;
	}	
	@Override
	public String toString() {
		return "Phone [processor=" + processor + ", ram=" + ram + ", model=" + model + ", battery=" + battery + "]";
	}	
}
