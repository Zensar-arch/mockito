package com.zensar.mockito;

public class Arithmetic {
	private Calculator calculator;
	
	public Arithmetic() {
		
	}
	public Arithmetic(Calculator calculator) {
		super();
		this.calculator = calculator;
	}

	public int doAddition(int no1,int no2) {
		return calculator.add(no1, no2);
	}
}
