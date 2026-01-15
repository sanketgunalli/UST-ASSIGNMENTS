package com.assignment10;

public class App10 {
	public static void isAgeNegative(int age) {
		if(age<0) {
			throw new IllegalArgumentException("Age can not be negative");
		}
	}
}
