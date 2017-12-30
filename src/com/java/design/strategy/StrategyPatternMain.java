package com.java.design.strategy;

public class StrategyPatternMain {
	public static void main(String[] args) {
		Strategy addStrategy = new AddOperation();
		Strategy subStrategy = new SubtractOperation();
		Strategy multiplyStrategy = new MultiplyOperation();
		Strategy divStrategy = new DivisionOperation();
		
		System.out.println("2 + 2 ="+addStrategy.executeOperation(2, 2));
		System.out.println("2 - 2 ="+subStrategy.executeOperation(2, 2));
		System.out.println("2 * 2 ="+multiplyStrategy.executeOperation(2, 2));
		System.out.println("2 / 2 ="+divStrategy.executeOperation(2, 2));
	}
}
