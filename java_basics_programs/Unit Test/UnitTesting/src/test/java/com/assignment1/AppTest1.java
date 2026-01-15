package com.assignment1;

import static org.junit.Assert.*;

import org.junit.Test;

public class AppTest1 {

	@Test
	public void testCheckLoginDetails() {
		System.out.println("login testing ");
		App1 ls = new App1();
		boolean result1 = ls.checkLoginDetails("admin@gmail.COM", "admin123");
		assertTrue(result1);
		
		boolean result2 = ls.checkLoginDetails("admin@gmail.COM", "admin@gmail.com");
		assertFalse(result2);
	}
}
