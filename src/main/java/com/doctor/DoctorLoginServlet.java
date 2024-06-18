package com.doctor;

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



@WebServlet("/DoctorLoginServlet")
public class DoctorLoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		response.setContentType("text/html");
		
		String username = request.getParameter("usname");
		String password = request.getParameter("pass");
		
		boolean isTrue;
		
		isTrue = DoctorDAO.validate(username, password);
		
		if (isTrue == true) {
			
			HttpSession session2 = request.getSession();
			session2.setAttribute("UDname", username);
			
			RequestDispatcher dis1 = request.getRequestDispatcher("DoctorUI.jsp");
			dis1.forward(request, response);
			
			 List<Doctor> doctors = DoctorDAO.DisplayDocProfile(username);
			 
			 	request.setAttribute("doctors", doctors);
		        HttpSession session5 = request.getSession();
				session5.setAttribute("doctors", doctors);
				request.getRequestDispatcher("DoctorProfile.jsp").forward(request, response);
				
			 List<Doctor> doctors1 = DoctorDAO.DisplayAllDoctor();
			 
				 	request.setAttribute("doctor", doctors1);
			        HttpSession session05 = request.getSession();
					session05.setAttribute("doctor", doctors1);
					request.getRequestDispatcher("AllDoctors.jsp").forward(request, response);
			
		
		}else {
			out.println("<script type='text/javascript'>");
			out.println("alert('Invalid Username or Password');");
			out.println("location='DoctorLogin.jsp'");
			out.println("</script>");
			
		}
		
		
		
	
	}

}
