package com.book;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.patient.DBconnect;
import com.patient.Patient;

public class BookingDAO {
	private static boolean isSuccess;
	private static Connection con = null;
	private static Statement stmt = null;
	private static ResultSet rs= null;
	
    public static boolean insertBooking(String docname, String name, String age, String gender, String nic, String phone, String address) {
        Connection con = null;
        PreparedStatement pstmt = null;

        try {
            con = DBconnect.getConnection();
            String sql = "INSERT INTO book001 (DocName, Uname, age, gender, nic, phone, address) VALUES (?, ?, ?, ?, ?, ?, ?)";
            pstmt = con.prepareStatement(sql);
            pstmt.setString(1, docname);
            pstmt.setString(2, name);
            pstmt.setString(3, age);
            pstmt.setString(4, gender);
            pstmt.setString(5, nic);
            pstmt.setString(6, phone);
            pstmt.setString(7, address);

            int rowsInserted = pstmt.executeUpdate();

            return rowsInserted > 0;
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Database connection error: " + e.getMessage());
            return false;
        } finally {
            try {
                if (pstmt != null) {
                    pstmt.close();
                }
                if (con != null) {
                    con.close();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
    public static List<Booking> displayBookings() {
    	List<Booking> bookings = new ArrayList<>();
    	   try {
    	    	con = DBconnect.getConnection();
    			 stmt = con.createStatement();
    			 String sql= "SELECT * FROM book001";
    			  rs = stmt.executeQuery(sql);
    	        while (rs.next()) {
    	            int bid = rs.getInt("bid");
    	            String DocName = rs.getString("DocName");
    	            String Uname = rs.getString("Uname");
    	            String age = rs.getString("age");
    	            String gender = rs.getString("gender");
    	            String nic = rs.getString("nic");
    	            String phone = rs.getString("phone");
    	            String address = rs.getString("address");
    	            Booking book = new Booking(bid, DocName, Uname, age, gender, nic, phone,address);
    	            bookings.add(book);
    	        }
    	        con.close();
    	    } catch (Exception e) {
    	        e.printStackTrace();
    	    }
    	
    	
    	return bookings;
    	
    	
    }

}
