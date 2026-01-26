package com.simplemovie.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.simplemovie.entity.Booking;
import com.simplemovie.service.BookingService;

@RestController
@RequestMapping("/api/bookings")
public class BookingController {
	@Autowired
	private BookingService bookingService;
	
	@PostMapping
	public Booking book(@RequestBody Booking booking) {
		return bookingService.bookTickets(booking);
	}
	
	@GetMapping
	public List<Booking> getBookings(){
		return bookingService.getAllBookings();
	}
	@DeleteMapping("/{bookingId}")
	public String cancel(@PathVariable int id) {
		bookingService.cancelBooking(id);
		return "Booking cancelled successfully";
	}
}
