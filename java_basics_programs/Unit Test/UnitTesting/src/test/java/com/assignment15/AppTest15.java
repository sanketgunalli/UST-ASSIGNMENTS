package com.assignment15;

import static org.junit.Assert.*;

import org.junit.Test;

public class AppTest15 {

	@Test
	public void test() {
		System.out.println("The data exist or not");
		
		assertTrue(App15.dataIsExist("Sample"));
		assertFalse(App15.dataIsExist(null));
	}

}
