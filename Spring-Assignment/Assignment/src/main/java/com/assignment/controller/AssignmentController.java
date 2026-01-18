package com.assignment.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.assignment.service.AssignmentService;

@RestController
public class AssignmentController {
	
	@Autowired
	private AssignmentService service;
	
	//start up message
	@GetMapping("/welcome")
	public String welcome() {
		return service.welcomeMsg();
	}
	
	//Add 2 values
	@GetMapping("/add")
	public int add(@RequestParam int a, @RequestParam int b) {
		return service.add(a, b);
	}
	
	//Even or Odd
	@GetMapping("/evenodd/{num}")
	public String evenOrOdd(@PathVariable int num) {
		return service.evenOrOdd(num);
	}
	
	//age 
	@GetMapping("/age/{age}")
    public String age(@PathVariable int age) {
        return service.ageCategory(age);
    }
	// grade
    @GetMapping("/grade/{marks}")
    public String grade(@PathVariable int marks) {
        return service.grade(marks);
    }
    // heat converter
    @GetMapping("/celsius-to-fahrenheit/{celsius}")
    public double convert(@PathVariable double celsius) {
        return service.celsiusToFahrenheit(celsius);
    }
    //reverse string
    @GetMapping("/reverse/{text}")
    public String reverse(@PathVariable String text) {
        return service.reverseString(text);
    }
    //palindrome
    @GetMapping("/palindrome/{word}")
    public String palindrome(@PathVariable String word) {
        return service.palindrome(word);
    }
    //factorial
    @GetMapping("/factorial/{num}")
    public long factorial(@PathVariable int num) {
        return service.factorial(num);
    }
    //prime
    @GetMapping("/prime/{num}")
    public String prime(@PathVariable int num) {
        return service.prime(num);
    }
    //discount
    @GetMapping("/discount")
    public double discount(@RequestParam double price,
                           @RequestParam double discount) {
        return service.discount(price, discount);
    }
    //login
    @PostMapping("/login")
    public String login(@RequestBody LoginRequest req) {
        return service.login(req.getUsername(), req.getPassword());
    }
    //interest
    @GetMapping("/interest")
    public double interest(@RequestParam double p,
                           @RequestParam double r,
                           @RequestParam double t) {
        return service.simpleInterest(p, r, t);
    }
    //word count
    @PostMapping("/wordcount")
    public int wordCount(@RequestBody String sentence) {
        return service.wordCount(sentence);
    }
    // max
    @GetMapping("/max")
    public int max(@RequestParam int a,
                   @RequestParam int b,
                   @RequestParam int c) {
        return service.maxOfThree(a, b, c);
    }
}
