package com.assignment4;

import static org.junit.Assert.*;

import org.junit.Test;

public class AppTest4 {

	@Test
	public void test() {
		String str1 = "root@gmail.com";
		String str2 = "rootgmail";
		assertTrue(App4.emailContains(str1));
		assertFalse(App4.emailContains(str2));
	}

}
