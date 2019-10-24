package com.zensar.mockito;

import static org.junit.Assert.assertEquals;

import java.util.LinkedList;
import java.util.List;

import org.junit.Rule;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnit;
import org.mockito.junit.MockitoRule;

public class ListTest {
	@Mock
	List<String> list;
	@Rule
	public MockitoRule rule = MockitoJUnit.rule();
	@Test
	public void testList() {
		Mockito.when(list.get(0)).thenReturn("Rose");
		//Mockito.when(list.get(0)).thenCallRealMethod();
		assertEquals("Rose", list.get(0));
	}
	@Test
	public void testLinkedListSpy() {
		List<String> list = new LinkedList<String>();
		List<String> spy = Mockito.spy(list);
		spy.add("Rose");
		Mockito.when(spy.get(0)).thenReturn("Rose");
		assertEquals("Rose", spy.get(0));
	}
}
