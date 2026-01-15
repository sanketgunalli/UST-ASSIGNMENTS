package com.assignment14;

import static org.junit.Assert.*;

import org.junit.Test;

public class AppTest14 {

	@Test
	public void test() {
		System.out.println("Default country code");
		
		assertEquals("IN",App14.defaultCountryCode());
		assertNotEquals("US", App14.defaultCountryCode());
	}

}
