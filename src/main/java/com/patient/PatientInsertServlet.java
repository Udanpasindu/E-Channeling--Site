package com.patient;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/PatientInsertServlet")
public class PatientInsertServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	String name = request.getParameter("name");
	String age = request.getParameter("age");
	String nic = request.getParameter("nic");
	String phone = request.getParameter("phone");
	String address = request.getParameter("address");
	String password = request.getParameter("password");
	String conpassword = request.getParameter("conpassword");
		
	boolean isTrue;
	
	isTrue = PatientDAO.insertPatient(name, age, nic, phone, address, password);
	
	if(isTrue) {
		RequestDispatcher dis1 = request.getRequestDispatcher("Home.jsp");
		dis1.forward(request, response);
	}else {
		RequestDispatcher dis2 = request.getRequestDispatcher("error.jsp");
		dis2.forward(request, response);
	}
	}

}
