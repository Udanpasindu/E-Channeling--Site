package com.doctor;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/DocterUpdateServlet")
public class DocterUpdateServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String did = request.getParameter("did");
		String name = request.getParameter("dname");

		String Email = request.getParameter("Email");
		String phone = request.getParameter("Phone");
		
		int intDid = Integer.parseInt(did);	
		boolean isTrue;
		
		isTrue = DoctorDAO.UpdateDoctor(intDid,name, Email, phone);
		
		if(isTrue) {
			RequestDispatcher dis1 = request.getRequestDispatcher("DoctorProfile.jsp");
			dis1.forward(request, response);
		}else {
			RequestDispatcher dis2 = request.getRequestDispatcher("error.jsp");
			dis2.forward(request, response);
		}
		
	}

}
