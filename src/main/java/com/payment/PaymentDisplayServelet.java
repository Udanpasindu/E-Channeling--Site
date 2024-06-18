package com.payment;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;



@WebServlet("/PaymentDisplayServelet")
public class PaymentDisplayServelet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		HttpSession session = request.getSession();
		String id = (String) session.getAttribute("Cid");
		
		List<Payment> payment = PaymentDAO.displayCard(id);	
	 	request.setAttribute("payments", payment);
	 	HttpSession session5 = request.getSession();
		session5.setAttribute("payments", payment);
		 
		 request.getRequestDispatcher("CardDetails.jsp").forward(request, response);
	}

}
