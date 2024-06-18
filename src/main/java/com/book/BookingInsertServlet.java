package com.book;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet("/BookingInsertServlet")
public class BookingInsertServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session2 = request.getSession();
		String usname=(String) session2.getAttribute("UDname");
		String name = request.getParameter("name");
		String age = request.getParameter("age");
		String gender = request.getParameter("gender");
		String nic = request.getParameter("nic");
		String phone = request.getParameter("phone");
		String address = request.getParameter("address");
	
			
		boolean isTrue;
		
		isTrue = BookingDAO.insertBooking(usname,name, age, gender, nic, phone, address);
		
		if(isTrue) {
			RequestDispatcher dis1 = request.getRequestDispatcher("Payment.jsp");
			dis1.forward(request, response);
		}else {
			RequestDispatcher dis2 = request.getRequestDispatcher("error.jsp");
			dis2.forward(request, response);
		}
		

	}

	}


