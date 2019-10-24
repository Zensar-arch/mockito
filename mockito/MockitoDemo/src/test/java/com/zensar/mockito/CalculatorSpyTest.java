package com.zensar.mockito;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.mockito.Mockito;

public class CalculatorSpyTest {
	

	Calculator calculator = new Calculator();
	@Test
	public void addTest() {
		//Calculator calculatorSpy = Mockito.spy(calculator);
		Calculator calculatorSpy = Mockito.spy(Calculator.class);
		//Mockito.when(calculatorSpy.add(100, 50)).thenReturn(100);
		Mockito.when(calculatorSpy.add(100, 50)).thenCallRealMethod();
		assertEquals(100, calculatorSpy.add(100, 50));
	}


}
