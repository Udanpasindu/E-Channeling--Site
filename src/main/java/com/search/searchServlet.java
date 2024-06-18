package com.search;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.doctor.Doctor;
import com.doctor.DoctorDAO;



@WebServlet("/searchServlet")
public class searchServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String special = request.getParameter("Special");
        String docname = request.getParameter("docname");
        List<Doctor> doctors1 = searchDAO.displaydoc(special, docname);
        HttpSession session3 = request.getSession();
        session3.setAttribute("doctors", doctors1);

       
        RequestDispatcher dis1 = request.getRequestDispatcher("DocProfile.jsp");
        dis1.forward(request, response);
    }
}