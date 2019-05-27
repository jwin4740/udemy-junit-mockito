package com.winkle.unittesting.unittesting.business;

import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;


public class ListMockTest {

	List mock = mock(List.class);

	@Test
	public void size_basic() {

		when(mock.size()).thenReturn(5);
		assertEquals(5, mock.size());

	}

	@Test
	public void returnDifferentValues() {
		when(mock.size()).thenReturn(5).thenReturn(10);
		assertEquals(5, mock.size());
		assertEquals(10, mock.size());

	}

	@Test
	public void returnWithParameters(){
		when(mock.get(0)).thenReturn("in 28 minutes");
		assertEquals("in 28 minutes", mock.get(0));
		assertEquals(null, mock.get(1));
	}


}
