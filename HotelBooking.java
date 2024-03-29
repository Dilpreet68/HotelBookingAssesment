package com.cg.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "HotelBooking")
public  class HotelBooking {
	
	


	@Column(name = "bookingId")
	private long bookingId;
	@Id
	@Column(name = "monileno")
	private long mobileno;

	@Column(name = "hotelname")
	private String hotelname;

	@Column(name = "date1")
	private Date date1;
	
	
	public HotelBooking() {
		// TODO Auto-generated constructor stub
	}


	public HotelBooking(long bookingId, long mobileno, String hotelname, Date date1) {
		super();
		this.bookingId = bookingId;
		this.mobileno = mobileno;
		this.hotelname = hotelname;
		this.date1 = date1;
	}


	public long getBookingId() {
		return bookingId;
	}


	public void setBookingId(long bookingId) {
		this.bookingId = bookingId;
	}


	public long getMobileno() {
		return mobileno;
	}


	public void setMobileno(long mobileno) {
		this.mobileno = mobileno;
	}


	public String getHotelname() {
		return hotelname;
	}


	public void setHotelname(String hotelname) {
		this.hotelname = hotelname;
	}


	public Date getDate1() {
		return date1;
	}


	public void setDate1(Date date1) {
		this.date1 = date1;
	}


	@Override
	public String toString() {
		return "HotelBooking [bookingId=" + bookingId + ", mobileno=" + mobileno + ", hotelname=" + hotelname
				+ ", date1=" + date1 + "]";
	}


	
	
	
	
	
	

}
