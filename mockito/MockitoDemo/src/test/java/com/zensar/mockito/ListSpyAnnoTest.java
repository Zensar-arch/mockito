package com.zensar.mockito;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.Rule;
import org.junit.Test;
import org.mockito.Mockito;
import org.mockito.Spy;
import org.mockito.junit.MockitoJUnit;
import org.mockito.junit.MockitoRule;

public class ListSpyAnnoTest {
	
	@Spy
	List<String> spiedCities = new ArrayList<String>();
	@Rule
	public MockitoRule rule = MockitoJUnit.rule();
	@Test
	public void testSpyList() {
		spiedCities.add("Pune");
		spiedCities.add("Bangalore");
		spiedCities.add("Kolkata");
		
		System.out.println(spiedCities.size());
		
		Mockito.verify(spiedCities).add("Pune");
		Mockito.verify(spiedCities).add("Bangalore");
		Mockito.verify(spiedCities).add("Kolkata");
		
		assertEquals(3, spiedCities.size());
		
		Mockito.doReturn(100).when(spiedCities).size();
		assertEquals(36, spiedCities.size());
	}

}
