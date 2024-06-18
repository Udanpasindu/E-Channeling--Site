package com.doctor;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;

import com.hospital.HospitalDAO;

@MultipartConfig
@WebServlet("/DoctorAddServlet")
public class DoctorAddServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String dname = request.getParameter("dname");
		Part dfile = request.getPart("dimage");
		String MedID = request.getParameter("MedID");
		String Special = request.getParameter("Special");
		String Email = request.getParameter("Email");
		String phone = request.getParameter("Phone");
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		String roomNo = request.getParameter("RoomNO");
		String time= request.getParameter("Time");		
		String date= request.getParameter("day");
		
		String imageFileName=dfile.getSubmittedFileName();
		String uploadPath="D:\\E-Channeling\\E_Channeling_Site\\src\\main\\webapp\\images\\"+imageFileName;
		try
		{
		
		FileOutputStream fos=new FileOutputStream(uploadPath);
		InputStream is=dfile.getInputStream();
		
		byte[] data=new byte[is.available()];
		is.read(data);
		fos.write(data);
		fos.close();
		
		}
		
		catch(Exception e)
		{
			e.printStackTrace();
		}
			
		boolean isTrue;
		
		isTrue = DoctorDAO.insertDoctor(dname, imageFileName, MedID, Special, Email, phone, username, password, roomNo, time, date );
		
		if(isTrue) {
			RequestDispatcher dis1 = request.getRequestDispatcher("HospitalUI.jsp");
			dis1.forward(request, response);
		}else {
			RequestDispatcher dis2 = request.getRequestDispatcher("error.jsp");
			dis2.forward(request, response);
		}
		}
	}


