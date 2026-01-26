package com.simplemovie.service;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.simplemovie.entity.Booking;
import com.simplemovie.entity.Show;
import com.simplemovie.repository.BookingRepository;
import com.simplemovie.repository.ShowRepository;

@Service
public class BookingService {
	@Autowired
	private BookingRepository bookingRepo;
	@Autowired
	private ShowRepository showRepo;
	
	public Booking bookTickets(Booking booking) {
		Show show = showRepo.findById(
				booking.getShow().getShowId()
				).orElseThrow();
		
		if(booking.getSeatsBooked() > show.getAvailableSeats()) {
			throw new RuntimeException("Not enough seat availabble");
		}
		show.setAvailableSeats(
				show.getAvailableSeats() - booking.getSeatsBooked()
				);
		
		booking.setBookingDate(LocalDate.now());
		
		showRepo.save(show);
		return bookingRepo.save(booking);
	}
	public List<Booking> getAllBookings() {
        return bookingRepo.findAll();
    }
	
	public void cancelBooking(Integer bookingId) {
        Booking booking = bookingRepo.findById(bookingId).orElseThrow();

        Show show = booking.getShow();
        show.setAvailableSeats(
            show.getAvailableSeats() + booking.getSeatsBooked()
        );

        showRepo.save(show);
        bookingRepo.deleteById(bookingId);
    }
	
}
