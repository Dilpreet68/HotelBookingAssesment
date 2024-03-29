package com.cg.dao;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cg.entity.*;


public interface HotelBookingDAO extends JpaRepository<HotelBooking,Long> {
	List<HotelBooking> findBybookingId(long bookingId);
	


}
