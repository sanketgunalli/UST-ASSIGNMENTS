package com.assignment2;

import static org.junit.Assert.*;

import org.junit.Test;

public class AppTest2 {

	@Test
	public void testCheckEligible() {
		System.out.println("Eligible Test");
//		App2 a=new App2();
		boolean resul1 = App2.checkEligible(18);
		assertTrue(resul1);
//		boolean result2 = a.checkEligible(12);
		assertFalse(App2.checkEligible(12));
	}

}
