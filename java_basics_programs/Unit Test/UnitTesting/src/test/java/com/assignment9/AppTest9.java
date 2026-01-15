package com.assignment9;

import static org.junit.Assert.*;

import org.junit.Test;

public class AppTest9 {

	@Test
	public void test() {
		System.out.println("List have the given element");
		assertTrue(App9.listHaveTheElement(3));
		assertFalse(App9.listHaveTheElement(8));
	}

}
