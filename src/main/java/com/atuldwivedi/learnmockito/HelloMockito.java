package com.atuldwivedi.learnmockito;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.doReturn;
import static org.mockito.Matchers.anyInt;

import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.MockitoAnnotations;
import org.mockito.runners.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class HelloMockito {

	@Before
	public void setup() {
		MockitoAnnotations.initMocks(this);
	}

	@Test
	public void test1() {
		// mock creation
		List mockedList = mock(List.class);

		// using mock object - it does not throw any "unexpected interaction"
		// exception
		mockedList.add("one");
//		doReturn(anyInt()).when(mockedList).add("two");
		mockedList.clear();

//		System.out.println(mockedList.add("two"));

		// selective, explicit, highly readable verification
		verify(mockedList).add("one");
		verify(mockedList).clear();
	}
}
