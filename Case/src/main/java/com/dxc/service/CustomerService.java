package com.dxc.service;
import java.util.List;

import com.dxc.dao.CustomerDao;

import com.dxc.pojos.BookingDetails;

import com.dxc.pojos.Customers;

import com.dxc.pojos.Hotel;

public class CustomerService{
	CustomerDao dao=new CustomerDao();

	public boolean registerCustomers(Customers cust) {

		return dao.registerCustomers(cust);

	}

	public boolean loginCustomers(String name, String password) {

		return dao.loginCustomers(name,password);

	}

	public List<Hotel> getHotelList() {

		return dao.getHotelList();

	}

	public List<Hotel> getHotelDetails(String phno) {

		return dao.getHotelDetails(phno);

	}

	public boolean payBill(BookingDetails bdetails) {

		return dao.payBill(bdetails);

	}

	public double checkBalance(String phno) {

		return dao.availableBalance(phno);

	}


	public List<BookingDetails> pastBookings(String phno) {

		return dao.pastBookings(phno);

	}

	public boolean cancelBooking(BookingDetails bd) {

		return dao.cancelBooking(bd);

	}



}