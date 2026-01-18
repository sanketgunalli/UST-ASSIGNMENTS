package com.assignment.service;

import org.springframework.stereotype.Service;

@Service
public class AssignmentService {
	
	//welcome message
	public String welcomeMsg() {
		return "Welcome to spring boot rest api.";
	}
	//add 2 values
	public int add(int a, int b) {
		return a+b;
	}
	//Check even or odd
	public String evenOrOdd(int num) {
		return num%2 == 0 ? "Even" : "Odd";
	}
	//age category
	public String ageCategory(int age) {
		if(age<18) return "Child";
		else if(age<60) return "Adult";
		else return "Senior citizen";
	}
	// grade system
	public String grade(int marks) {
        if (marks >= 90) return "A";
        else if (marks >= 75) return "B";
        else if (marks >= 60) return "C";
        else return "Fail";
    }
	//heat convertion
	public double celsiusToFahrenheit(double c) {
        return (c * 9 / 5) + 32;
    }
	// reverse string
    public String reverseString(String text) {
        return new StringBuilder(text).reverse().toString();
    }
    // palindrome
    public String palindrome(String word) {
        String rev = new StringBuilder(word).reverse().toString();
        return word.equalsIgnoreCase(rev) ? "Palindrome" : "Not Palindrome";
    }
    //factorial
    public long factorial(int num) {
        long fact = 1;
        for (int i = 1; i <= num; i++) fact *= i;
        return fact;
    }
    //prime number
    public String prime(int num) {
        if (num <= 1) return "Not Prime";
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) return "Not Prime";
        }
        return "Prime";
    }
    //discount
    public double discount(double price, double discount) {
        return price - (price * discount / 100);
    }
    //login
    public String login(String username, String password) {
        return (username.equals("admin") && password.equals("admin123"))
                ? "Login Successful"
                : "Invalid Credentials";
    }
    // SIP
    public double simpleInterest(double p, double r, double t) {
        return (p * r * t) / 100;
    }
    // word count
    public int wordCount(String sentence) {
        return sentence.trim().split("\\s+").length;
    }
    // max of three
    public int maxOfThree(int a, int b, int c) {
        return Math.max(a, Math.max(b, c));
    }
}
