package com.assignment7;

import static org.junit.Assert.*;

import org.junit.Test;

public class AppTest7 {

	@Test
	public void test() {
		System.out.println("Usernmae is not null");
		
		assertTrue(App7.userNotNull("sam"));
		assertFalse(App7.userNotNull(null));
	}

}
