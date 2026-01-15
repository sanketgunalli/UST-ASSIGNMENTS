package com.assignment12;

import static org.junit.Assert.*;

import org.junit.Test;

public class AppTest12 {

	@Test
	public void test() {
		
		System.out.println("Check status is user active");
		assertTrue(App12.checkStatus(true));
		assertFalse(App12.checkStatus(false));
	}

}
