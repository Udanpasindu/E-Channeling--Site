package com.hospital;

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


@MultipartConfig
@WebServlet("/HospitalInsertServlet")
public class HospitalInsertServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String Hname = request.getParameter("Hname");
		Part file = request.getPart("image");
		String regNO = request.getParameter("RegID");
		String phone = request.getParameter("Phone");
		String password = request.getParameter("password");
		String conpassword = request.getParameter("conpassword");
		
		String imageFileName=file.getSubmittedFileName();
		String uploadPath="D:\\E-Channeling\\E_Channeling_Site\\src\\main\\webapp\\images\\"+imageFileName;
		try
		{
		
		FileOutputStream fos=new FileOutputStream(uploadPath);
		InputStream is=file.getInputStream();
		
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
		
		isTrue = HospitalDAO.insertHospital(Hname, imageFileName, regNO, phone, password);
		
		if(isTrue) {
			RequestDispatcher dis1 = request.getRequestDispatcher("Home.jsp");
			dis1.forward(request, response);
		}else {
			RequestDispatcher dis2 = request.getRequestDispatcher("error.jsp");
			dis2.forward(request, response);
		}
		}

}
