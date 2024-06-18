package com.doctor;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.patient.DBconnect;
import com.patient.Patient;

public class DoctorDAO {
	private static boolean isSuccess;
	private static Connection con = null;
	private static Statement stmt = null;
	private static ResultSet rs= null;
	
	public static boolean validate(String username, String password) {
		
		try {
			con = DBconnect.getConnection();
			 stmt = con.createStatement();
			 String sql= "SELECT * FROM doctor0 WHERE Username='"+username+"' and  DPassword = '"+password+"' ";
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
	
public static boolean insertDoctor(String dname,String imageFileName,String MedID,String Special,String Email,String phone,String username,String password,String roomNo,String time,String date) {
		
		

			 try {		
				 con = DBconnect.getConnection();
				 stmt = con.createStatement();
				 String sql= "INSERT INTO doctor0 VALUES (0, '"+dname+"','"+imageFileName+"' , '"+MedID+"', '"+Special+"', '"+Email+"', '"+phone+"','"+username+"' , '"+password+"', '"+roomNo+"', '"+time+"', '"+date+"') ";
				 int rs = stmt.executeUpdate(sql);
				 
				 if(rs > 0) {
					 isSuccess = true;
				 }else {
					 isSuccess = false;
				 }
				 
			 }catch(Exception e){
				 e.printStackTrace();
				 System.out.println("Database connection Failed!!!!!!!!!!!!!!!!!");
				 
			 }
			return isSuccess;
		}
public static List<Doctor> DisplayDocProfile(String username) {
	List<Doctor> doctors = new ArrayList<>();
	   try {
	    	con = DBconnect.getConnection();
			 stmt = con.createStatement();
			 String sql= "SELECT * FROM doctor0 where Username='"+username+"'";
			  rs = stmt.executeQuery(sql);
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
	            String Date = rs.getString("AvailableDate");
	            Doctor doctor = new Doctor(did, name, image, MedID, Specialization, Email, Phone, Username, DPassword, RoomNo, Time, Date);
	            doctors.add(doctor);
	        }
	        con.close();
	    } catch (Exception e) {
	        e.printStackTrace();
	    }
	
	
	return doctors;
}
public static List<Doctor> DisplayAllDoctor() {
	List<Doctor> doctors1 = new ArrayList<>();
	   try {
	    	con = DBconnect.getConnection();
			 stmt = con.createStatement();
			 String sql= "SELECT * FROM doctor0";
			  rs = stmt.executeQuery(sql);
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
	            String Date = rs.getString("AvailableDate");
	            Doctor doctor = new Doctor(did, name, image, MedID, Specialization, Email, Phone, Username, DPassword, RoomNo, Time, Date);
	            doctors1.add(doctor);
	        }
	        con.close();
	    } catch (Exception e) {
	        e.printStackTrace();
	    }
	
	
	return doctors1;
}
public static boolean UpdateDoctor(int num,String name,String Email,String phone) {
	
	boolean isSuccess = false;

		 try {		
			 con = DBconnect.getConnection();
			 stmt = con.createStatement();
			 String sql= "UPDATE doctor0 SET DName = '"+name+"', Email = '"+Email+"', Phone = '"+phone+"'  WHERE id = '"+num+"'";
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

}
