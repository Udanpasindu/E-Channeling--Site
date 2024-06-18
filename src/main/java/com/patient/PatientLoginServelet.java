package com.patient;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.book.Booking;
import com.book.BookingDAO;

@WebServlet("/PatientLoginServelet")
public class PatientLoginServelet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		PrintWriter out = response.getWriter();
		response.setContentType("text/html");
		
		String username = request.getParameter("usname");
		String password = request.getParameter("pass");
		
		boolean isTrue;
		
		isTrue = PatientDAO.validate(username, password);
		
		if (isTrue == true) {
			
			HttpSession session = request.getSession();
			 session.setAttribute("Uname", username);
			 
				RequestDispatcher dis1 = request.getRequestDispatcher("PatientUI.jsp");
			dis1.forward(request, response);
			
			List<Patient> patient = PatientDAO.displaydata(username);
				request.setAttribute("patients", patient);
			 	HttpSession session1 = request.getSession();
				session1.setAttribute("patients", patient);
			
			List<Booking> bookings = BookingDAO.displayBookings();	
		 	request.setAttribute("bookings", bookings);
		 	HttpSession session5 = request.getSession();
			session5.setAttribute("bookings", bookings);
			 
			 request.getRequestDispatcher("display.jsp").forward(request, response);
		
		       
			

		}else {
			out.println("<script type='text/javascript'>");
			out.println("alert('Invalid Username or Password');");
			out.println("location='PatientLogin.jsp'");
			out.println("</script>");
			
		}
		
		
		
	}

}
