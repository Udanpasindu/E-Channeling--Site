package com.payment;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.book.Booking;
import com.patient.DBconnect;
import com.patient.Patient;

public class PaymentDAO {
	
	private static boolean isSuccess;
	private static Connection con = null;
	private static Statement stmt = null;
	private static ResultSet rs= null;
	
	
	public static boolean insertPayment(String type,String cardname,String CardNo,String exdate,String Cvv) {
		
		boolean isSuccess = false;

			 try {		
				 con = DBconnect.getConnection();
				 stmt = con.createStatement();
				 String sql= "INSERT INTO payment0 VALUES (0, '"+type+"','"+cardname+"' , '"+CardNo+"', '"+exdate+"', '"+Cvv+"') ";
				 int rs = stmt.executeUpdate(sql);
				 
				 if(rs > 0) {
					 isSuccess = true;
				 }else {
					 isSuccess = false;
				 }
				 
			 }catch(Exception e){
				 e.printStackTrace();
				 
			 }
			return isSuccess;
		}
	public static List<Payment> displayCard(String id) {
		List<Payment> Pay = new ArrayList<>();
		   try {
		    	con = DBconnect.getConnection();
				 stmt = con.createStatement();
				 String sql= "SELECT * FROM payment0 Where id = '"+id+"' ";
				  rs = stmt.executeQuery(sql);
		        while (rs.next()) {
		            int payid = rs.getInt("bid");
		            String type = rs.getString("name");
		            String Cardname = rs.getString("age");
		            String cardno = rs.getString("nic");
		            String exdate = rs.getString("phone");
		            String cvv = rs.getString("address");
		           
		            Payment pay = new Payment(payid, type, Cardname, cardno, exdate, cvv);
		            Pay.add(pay);
		        }
		        con.close();
		    } catch (Exception e) {
		        e.printStackTrace();
		    }
		
		
		return Pay;
		
		
	}
	public static boolean deletePayment(String id) {


		boolean isSuccess = false;
		
		try {
			con = DBconnect.getConnection();
			stmt = con.createStatement();

			String sql = "delete from payment0 where pid='"+id+"'";

			int rs = stmt.executeUpdate(sql);

			if(rs>0) {
				isSuccess = true;
			} else {
				isSuccess = false;
			}
		}
		catch(Exception e) {
			e.printStackTrace();
		}

		return isSuccess;	
	}

}
