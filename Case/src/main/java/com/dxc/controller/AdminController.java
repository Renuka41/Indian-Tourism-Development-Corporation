package com.dxc.controller;

import java.util.List;



import org.springframework.stereotype.Controller;

import org.springframework.ui.Model;

import org.springframework.web.bind.annotation.ModelAttribute;

import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RequestParam;



import com.dxc.pojos.Admin;

import com.dxc.pojos.BookingDetails;

import com.dxc.pojos.Customers;

import com.dxc.pojos.Hotel;
import com.dxc.service.AdminService;

@Controller

public class AdminController {

	

	AdminService service=new AdminService();

	

	@RequestMapping("/index")

	public String displayIndex()

	{

		return "index.jsp";

	}
	@RequestMapping("alogin")

	public String adminLogin(@RequestParam String adminid,@RequestParam String password,Model m)

	{

		Admin admin=new Admin();

		admin.setAdminid(adminid);

		admin.setPassword(password);

		boolean b=service.admin_login(admin);

		if(b==true)

		{

			return "operations.jsp";

		

		}else

		{

			m.addAttribute("message", "Login Fails!!...");

			return "message.jsp";

		}

	}

	@RequestMapping("addhotel")

	public String addHotel(@ModelAttribute Hotel hotel,Model m)

	{
System.out.println("going to add");
		boolean b=service.addHotel(hotel);

		if(b==true)

		{



			m.addAttribute("message", " Hotel Detailes added");

			return "message.jsp";

		}else

		{

			m.addAttribute("message", "Failes to add Hotel");

			return "message.jsp";

		}

	}
	

	@RequestMapping("/delete_hotel")

	public String deleteHotel(@RequestParam String phno,Model m)

	{

		boolean b=service.deleteHotel(phno);

		if(b==true)

		{
			m.addAttribute("message", " Hotel Detailes Deleted");

			return "message.jsp";

		}else

		{

			m.addAttribute("message", "Failes to Delete Hotel");

			return "message.jsp";

		}

	}

	@RequestMapping("/hotellist")

	public String selectHotel(Model m)

	{

		List<Hotel> list=service.selectHotel();

		m.addAttribute("list", list);

		return "showhotellist.jsp";

	}
	@RequestMapping("/booking_details")

	public String selectBookingDetails(Model m)

	{

		List<BookingDetails> list=service.selectBookingDetails();

		m.addAttribute("list", list);

		return "viewbooking.jsp";

	}

	@RequestMapping("/cancel_bookings")

	public String cancelBooking(@ModelAttribute BookingDetails bd,Model m)

	{

		boolean b=service.cancelBooking(bd);

		if(b==true)

		{



			m.addAttribute("message", " Cancelled sucessfully");

			return "message.jsp";

		}else

		{

			m.addAttribute("message", "Failes to Cancel.");

			return "message.jsp";

		}

	}
	@RequestMapping("/cancel_request_order")

	public String cancel_request_order(Model m)

	{

		List<BookingDetails> list=service.cancel_request_order();

		m.addAttribute("list", list);

		return "cancelrequestbooking.jsp";

	}
	@RequestMapping("/cancel_booking_orders")

	public String cancelBookingorders(@ModelAttribute BookingDetails bd,Model m)

	{
		boolean b=service.cancelBookingOrders(bd);

		if(b==true)

		{

			m.addAttribute("message", " Cancelled Successfully");

			return "message.jsp";

		}else

		{

			m.addAttribute("message", "Failes to Cancel");

			return "message.jsp";

		}

	}

	@RequestMapping("/get_customers")

	public String getCustomers(Model m)

	{

		List<Customers> list=service.getCustomers();

		m.addAttribute("list", list);

		return "customersdetails.jsp";

	}

}