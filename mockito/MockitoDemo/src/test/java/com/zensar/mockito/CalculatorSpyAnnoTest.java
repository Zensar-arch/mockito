package com.zensar.mockito;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.mockito.Spy;

public class CalculatorSpyAnnoTest {
	@Spy
	private Calculator calculator = new Calculator();
	@Test
	public void addTest() {
		assertEquals(150, calculator.add(100, 50));
	}
}
