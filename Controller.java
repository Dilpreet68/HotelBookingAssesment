package com.cg.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.cg.entity.HotelBooking;
import com.cg.service.BookingService;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/api")
public class Controller {
	
	
	@Autowired BookingService service;
	@GetMapping("/bookings")
	public List<HotelBooking> getall() {
	return service.getAllBookings();
		
	}
	
	
	@PostMapping(value = "/bookings/create",consumes= {"application/json"})
	public String add(@RequestBody HotelBooking booking) {
		 service.addBooking(booking);
		 return"Booking added";
	}
	
	@GetMapping(value = "/bookings/bookingid/{bookingid}")
	    public List<HotelBooking> findbyMobileno(@PathVariable("bookingid") Long bookingid) {
	        return service.findBooking(bookingid);
	 }

	 @DeleteMapping("/bookings/bookingid/{bookingid}")	
	    public String deletebyBookingid(@PathVariable("bookingid") Long bookingid) {
	       service.deleteBooking(bookingid);
	       return "Booking deleted";
	 }
	 
	 @DeleteMapping("/bookings/delete")	
	    public String deleteAll() {
	       service.deleteAll();
	       return "All Bookings deleted";
	 }
	 
	 
}
