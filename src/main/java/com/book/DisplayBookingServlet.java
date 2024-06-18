package com.book;

import java.io.IOException;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.patient.PatientDAO;

@WebServlet("/DisplayBookingServlet")
public class DisplayBookingServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {   	
		
		List<Booking> bookings = BookingDAO.displayBookings();	
	 	request.setAttribute("bookings", bookings);
	 	HttpSession session5 = request.getSession();
		session5.setAttribute("bookings", bookings);
		 
		 request.getRequestDispatcher("display.jsp").forward(request, response);
		 
		 

    }
}
