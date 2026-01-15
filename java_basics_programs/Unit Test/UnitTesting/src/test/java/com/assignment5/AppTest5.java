package com.assignment5;

import static org.junit.Assert.*;

import org.junit.Test;

public class AppTest5 {

	@Test
	public void test() {

		System.out.println("At least 8 char");
		String str1 = "root123";
		String str2 = "Unit_test123.";
		
		assertTrue(App5.atLeaste8char(str2));
		assertFalse(App5.atLeaste8char(str1));
		
	}

}
