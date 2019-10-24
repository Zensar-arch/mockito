package com.zensar.mockito;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnit;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class ArithmeticTest {
	
	@Mock
	private Calculator calculator;
	@InjectMocks
	private Arithmetic arithmetic;
	@Test
	public void testArithmetic() {
		Mockito.when(arithmetic.doAddition(10, 20)).thenReturn(30);
		assertEquals(30,arithmetic.doAddition(10, 20));
	}
	
}
