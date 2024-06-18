package com.hospital;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



@WebServlet("/HospitalLoginServlet")
public class HospitalLoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		response.setContentType("text/html");
		
		String username = request.getParameter("usname");
		String password = request.getParameter("pass");
		
		boolean isTrue;
		
		isTrue = HospitalDAO.validate(username, password);
		
		if (isTrue == true) {
			
			List <Hospital> HosDetails = HospitalDAO.getHospitalDetails(username);
			request.setAttribute("HosDetails", HosDetails);
			
			RequestDispatcher dis1 = request.getRequestDispatcher("HospitalUI.jsp");
			dis1.forward(request, response);
		}else {
			out.println("<script type='text/javascript'>");
			out.println("alert('Invalid Username or Password');");
			out.println("location='PatientLogin.jsp'");
			out.println("</script>");
			
		}
		
		
		
	}
	

}
