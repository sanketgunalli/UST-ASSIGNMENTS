package com.assignment11;

import static org.junit.Assert.*;

import org.junit.Test;

public class AppTest11 {

	@Test
	public void test() {
		System.out.println("Greeting message");
		
		assertEquals("Welcome, Harish",App11.greetingMsg("Harish"));
		assertNotEquals("Welcome,Raja",App11.greetingMsg("Raja"));
	}

}
