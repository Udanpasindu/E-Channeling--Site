package com.payment;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;



@WebServlet("/PaymentInsertServlet")
public class PaymentInsertServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String type = request.getParameter("type");
		String cardname = request.getParameter("name");
		String CardNo = request.getParameter("cardNO");
		String exdate = request.getParameter("exdate");
		String Cvv = request.getParameter("cvv");
		String SaveCard = request.getParameter("saveCard");
	
		HttpSession session = request.getSession();
		 session.setAttribute("Cid", cardname);
		
		boolean isTrue;
		if(SaveCard == "save" ){
			
			isTrue = PaymentDAO.insertPayment(type, cardname, CardNo, exdate, Cvv);

				if(isTrue) {
				
					RequestDispatcher dis1 = request.getRequestDispatcher("PatientUI.jsp");
					dis1.forward(request, response);
				}else {
					RequestDispatcher dis2 = request.getRequestDispatcher("error.jsp");
					dis2.forward(request, response);
				}
		}else {
			RequestDispatcher dis3 = request.getRequestDispatcher("success.jsp");
			dis3.forward(request, response);
		}
	}

}
