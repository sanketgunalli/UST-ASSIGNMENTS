package com.assignment10;

import static org.junit.Assert.*;

import org.junit.Test;

public class AppTest10 {
	
	//false
	@Test(expected = IllegalArgumentException.class)
	public void testInvalidAge() {
		App10.isAgeNegative(-4);
	}
	
	@Test
	public void testValidAge() {
		try {
			App10.isAgeNegative(23);
			assertTrue(true);
		}catch (Exception e) {
			assertTrue(false);
		}
		
	}

}
