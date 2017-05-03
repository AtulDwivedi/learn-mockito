package com.atuldwivedi.learnmockito.stubmethodcalls;

import static org.mockito.Mockito.*;

import java.util.LinkedList;

import org.junit.Before;
import org.junit.Test;
import org.mockito.MockitoAnnotations;

public class MockConcreteClass {

	@Before
	public void setup() {
		MockitoAnnotations.initMocks(this);
	}

	@Test
	public void test1() {
		// you can mock concrete classes, not only interfaces
		LinkedList mockedList = mock(LinkedList.class);

		// stubbing appears before the actual execution
		when(mockedList.get(0)).thenReturn("first");

		// the following prints "first"
		System.out.println(mockedList.get(0));

		// the following prints "null" because get(999) was not stubbed
		System.out.println(mockedList.get(999));
	}
}
