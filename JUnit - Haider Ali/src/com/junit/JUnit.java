package com.junit;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

public class JUnit {

	@Test
	public void setUp() {
		String str = "This is my first Juni Program";
		
		assertEquals("This is my first Juni Program", str);
	}
	
}
