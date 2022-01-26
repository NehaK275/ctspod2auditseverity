package com.cognizant.exception;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class TokenExpiredExceptionTest {

	@Mock
	TokenExpiredException handler;

	@Test
	public void contextLoads() {
		assertNotNull(handler);
	}

	@Test
	public void testConstructor() {
		assertNotNull(new TokenExpiredException("Exception"));
	}
}
