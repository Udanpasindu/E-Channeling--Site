package com.payment;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.patient.PatientDAO;

@WebServlet("/PaymentDeleteServelet")
public class PaymentDeleteServelet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		response.setContentType("text/html");
		
		HttpSession session = request.getSession();
		String usname=(String) session.getAttribute("Uname");
		
		String id = request.getParameter("id");
		
boolean isTrue;
		
		isTrue = PaymentDAO.deletePayment(id);
		
		if(isTrue == true) {
			HttpSession session1 = request.getSession();
			session1.invalidate();
			response.sendRedirect("Home.jsp");
		} else {
			
			out.println("<script type='text/javascript'>");
			out.println("alert('Account Delete unSucessfully');");
			out.println("location='PatientProfile.jsp'");
			out.println("</script>");
		}
	
	
	}

}
