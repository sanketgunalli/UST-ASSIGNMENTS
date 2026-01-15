package com.assignment8;

import static org.junit.Assert.*;

import org.junit.Test;

public class AppTest8 {

	@Test
	public void test() {
		System.out.println("Check the list length is 3");
		assertTrue(App8.listSizeThree(3));
		assertFalse(App8.listSizeThree(2));
		
	}

}
