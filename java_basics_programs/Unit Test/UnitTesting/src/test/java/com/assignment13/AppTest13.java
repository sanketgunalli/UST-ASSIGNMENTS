package com.assignment13;

import static org.junit.Assert.*;

import org.junit.Test;

public class AppTest13 {

	@Test
	public void test() {
		System.out.println("check equal length");
		assertEquals(7, App13.characterLength("Welcome"));
		assertNotEquals(5, App13.characterLength("Welcome"));
	}

}
