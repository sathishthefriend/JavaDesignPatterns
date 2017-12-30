package com.java.design.strategy;

public class AddOperation implements Strategy {
	@Override
	public Integer executeOperation(Integer num1, Integer num2) {		
		return num1 + num2;
	}
}
