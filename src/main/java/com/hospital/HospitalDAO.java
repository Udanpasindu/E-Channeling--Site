package com.hospital;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.doctor.Doctor;
import com.patient.DBconnect;

public class HospitalDAO {
	private static boolean isSuccess;
	private static Connection con = null;
	private static Statement stmt = null;
	private static ResultSet rs= null;
	
	public static boolean validate(String username, String password) {
		
		try {
			con = DBconnect.getConnection();
			 stmt = con.createStatement();
			 String sql= "SELECT * FROM hospital WHERE Hname='"+username+"' and  password = '"+password+"' ";
			  rs = stmt.executeQuery(sql);
			  
			  if(rs.next()) {
				  isSuccess = true;
				  
			  }else {
				  isSuccess = false;
			  }
			
		}catch(Exception e) {
			e.printStackTrace();
			
		}
		return isSuccess;
		
	}

	
	public static boolean insertHospital(String Hname,String imageFileName,String regNO,String phone,String password) {
		
		boolean isSuccess = false;

			 try {		
				 con = DBconnect.getConnection();
				 stmt = con.createStatement();
				 String sql= "INSERT INTO hospital VALUES (0, '"+Hname+"','"+imageFileName+"' , '"+regNO+"', '"+phone+"', '"+password+"') ";
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
	public static List<Hospital> getHospitalDetails(String username){
		
		
		
		
		ArrayList<Hospital> hos = new ArrayList<>();
		
		try {		
			 con = DBconnect.getConnection();
			 stmt = con.createStatement();
			 String sql= "SELECT * FROM hospital where Hname= '"+username+"'";
			 rs = stmt.executeQuery(sql);
			 
			 while(rs.next()) {
				 int id = rs.getInt(1);
				 String Hname1 = rs.getString(2);
				 String image = rs.getString(3);
				 String RegNO = rs.getString(4);
				 String phone = rs.getString(5);
				 String password = rs.getString(6);
				 
				 Hospital h = new Hospital(id,  Hname1,  image,  RegNO,  phone,  password);
				 hos.add(h);
			 }
			 
		 }catch(Exception e){
			 e.printStackTrace();
			 
		 }
		
		
		return hos;
		
	}
	  public static ResultSet fetchData() {
	        try {
	        	con = DBconnect.getConnection();
				 stmt = con.createStatement();
				 String sql= "SELECT * FROM doctor0";
				  rs = stmt.executeQuery(sql);

	            // Fetch data from the database

	            return rs;
	        } catch (Exception e) {
	            e.printStackTrace();
	            return null;
	        }
	    }

}
