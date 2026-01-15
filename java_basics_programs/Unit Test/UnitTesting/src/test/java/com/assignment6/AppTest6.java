package com.assignment6;

import static org.junit.Assert.*;

import org.junit.Test;

public class AppTest6 {

	@Test
	public void test() {

		System.out.println("Endswith csv");
		
		String str1 = "student.csv";
		String str2 = "employee.txt";
		
		assertTrue(App6.endWithCsv(str1));
		assertFalse(App6.endWithCsv(str2));
	}

}
