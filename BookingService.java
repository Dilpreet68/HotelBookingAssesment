package com.cg.service;

import java.util.List;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cg.entity.HotelBooking;
import com.cg.exception.ApplicationException;
import com.cg.dao.HotelBookingDAO;


@Service
@Transactional
public class BookingService implements BookingOperation {

	
	@Autowired HotelBookingDAO dao;

	@Transactional
	public boolean addBooking(HotelBooking ob) {
		// TODO Auto-generated method stub
	   dao.save(ob);
	   return true;
	}

	@Transactional
	public boolean deleteBooking(Long bookingid) {
		// TODO Auto-generated method stub
		dao.deleteById(bookingid);
		return true;
	}

	@Transactional(readOnly=true)
	public List<HotelBooking> findBooking(Long bookingid) {
		// TODO Auto-generated method stub
		List<HotelBooking> hotelbooking=dao.findBybookingId(bookingid);
		return hotelbooking;
	}

	@Transactional(readOnly=true)
	public List<HotelBooking> getAllBookings() {
		// TODO Auto-generated method stub
		return dao.findAll();
	}

	@Transactional
	public boolean updateBooking(HotelBooking ob)  {
		// TODO Auto-generated method stub
		//Long bookingid=ob.getBookingId();
		
	 dao.save(ob);
		return true;
	}


	@Transactional
	public void deleteAll() {
		dao.deleteAll();
	}

	
	

}
