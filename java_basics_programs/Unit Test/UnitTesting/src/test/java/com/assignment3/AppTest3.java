package com.assignment3;

import static org.junit.Assert.*;

import org.junit.Test;

public class AppTest3 {

	@Test
	public void testStringConvert() {
		System.out.println("Test Upper case Covertion");
		String res1 = App3.convertToUpper("java");
		assertEquals("JAVA",res1);
	}

}
