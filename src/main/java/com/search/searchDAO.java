package com.search;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.doctor.Doctor;
import com.patient.DBconnect;

public class searchDAO {
	private static Connection con = null;
	private static Statement stmt = null;
	private static ResultSet rs= null;


	public static List<Doctor> displaydoc(String special, String docname) {
	    List<Doctor> doctors = new ArrayList<>();
	    Connection con = null;
	    PreparedStatement pstmt = null;
	    ResultSet rs = null;

	    try {
	        con = DBconnect.getConnection();

	        String sql = "SELECT * FROM doctor0 WHERE Specialization = ? AND Username LIKE ?";
	        pstmt = con.prepareStatement(sql);

	        pstmt.setString(1, special);
	        pstmt.setString(2, "%" + docname + "%");

	        rs = pstmt.executeQuery();

	        while (rs.next()) {
	        	int did = rs.getInt("DID");
	            String name = rs.getString("DName");
	            String image = rs.getString("ImageFileName");
	            String MedID = rs.getString("MedID");
	            String Specialization = rs.getString("Specialization");
	            String Email = rs.getString("Email");
	            String Phone = rs.getString("Phone");
	            String Username = rs.getString("Username");
	            String DPassword = rs.getString("DPassword");
	            String RoomNo = rs.getString("RoomNo");
	            String Time = rs.getString("TimeSlot");
	            String Date0 = rs.getString("AvailableDate");
	            Doctor doctor = new Doctor(did, name, image, MedID, Specialization, Email, Phone, Username, DPassword, RoomNo, Time, Date0);
	            doctors.add(doctor);
	            boolean doc=true;
	        }
	    } catch (Exception e) {
	        e.printStackTrace();
	        System.out.println("Error: " + e.getMessage());
	    } finally {
	        try {
	            if (rs != null) {
	                rs.close();
	            }
	            if (pstmt != null) {
	                pstmt.close();
	            }
	            if (con != null) {
	                con.close();
	            }
	        } catch (SQLException e) {
	            e.printStackTrace();
	        }
	    }

	    return doctors;
	}
}