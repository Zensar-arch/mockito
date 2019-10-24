package com.zensar.mockito;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.mockito.Mockito;

public class CalculatorTest1 {
	
	Calculator calculator;
	//Calculator calculator = new Calculator();
	@Test
	public void addTest1() {
		calculator = Mockito.mock(Calculator.class);
		Mockito.when(calculator.add(100, 50)).thenReturn(150);
		assertEquals(150, calculator.add(100, 50));
	}

}
