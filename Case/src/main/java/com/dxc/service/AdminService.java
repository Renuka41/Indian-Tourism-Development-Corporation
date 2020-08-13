package com.dxc.service;
import java.util.List;
import com.dxc.dao.AdminDao;
import com.dxc.pojos.Admin;

import com.dxc.pojos.BookingDetails;

import com.dxc.pojos.Customers;

import com.dxc.pojos.Hotel;

public class AdminService {

		AdminDao dao=new AdminDao();
		public boolean admin_login(Admin admin) {

		return dao.admin_login(admin);

	}

		public boolean addHotel(Hotel hotel) {

		return dao.addHotel(hotel);

	}
	
	public boolean deleteHotel(String phno) {

		return dao.deleteHotel(phno);

	}
	public List<Hotel> selectHotel() {

		return dao.selectHotel();

	}

	public List<BookingDetails> selectBookingDetails() {

		return dao.selectBookingDetails();

	}
	public boolean cancelBooking(BookingDetails bd) {

		return dao.cancelBooking(bd);

	}
	public boolean cancelBookingOrders(BookingDetails bd) {

		return dao.cancelBookingOrders(bd);

	}
	public List<BookingDetails> cancel_request_order() {

		return dao.cancel_request_order();

	}
	public List<Customers> getCustomers() {

		return dao.getCustomers();

	}
}