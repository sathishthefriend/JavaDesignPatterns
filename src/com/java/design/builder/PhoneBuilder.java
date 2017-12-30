/**
 * 
 */
package com.java.design.builder;

/**
 * @author Sathish
 *
 */
public class PhoneBuilder {

	private String processor;
	private Integer ram;
	private String model;
	private Integer battery;

	
	public PhoneBuilder setProcessor(String processor) {
		this.processor = processor;
		return this;
	}


	public PhoneBuilder setRam(Integer ram) {
		this.ram = ram;
		return this;
	}


	public PhoneBuilder setModel(String model) {
		this.model = model;
		return this;
	}


	public PhoneBuilder setBattery(Integer battery) {
		this.battery = battery;
		return this;
	}
	
	public Phone getPhone() {				
		return new Phone(processor, ram, model, battery);	
	}
}
