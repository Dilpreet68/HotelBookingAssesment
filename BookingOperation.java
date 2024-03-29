package com.cg.service;


import java.util.List;
import com.cg.entity.HotelBooking;


public interface BookingOperation {
	public boolean addBooking(HotelBooking ob);
	public boolean deleteBooking(Long bookingid);
	public boolean updateBooking(HotelBooking ob)  ;
	public List<HotelBooking> findBooking(Long bookingid);
	public List<HotelBooking> getAllBookings() ;
	public void deleteAll() ;

}
