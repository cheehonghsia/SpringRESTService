package com.xia.service;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import com.xia.dao.PersonDao;

@RunWith(MockitoJUnitRunner.class)
public class TestPersonService {

	@Mock
	private PersonDao daoMock;

	@InjectMocks
	private PersonServiceImpl serviceMock;

	@Test
	public void testgetPersonCount() {
		when(serviceMock.getPersonCount()).thenReturn(1);
		assertEquals(2, serviceMock.getPersonCount());
	}

}
