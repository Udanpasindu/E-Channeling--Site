package com.patient;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpSession;

import com.book.Booking;

public class PatientDAO {
	private static boolean isSuccess;
	private static Connection con = null;
	private static Statement stmt = null;
	private static ResultSet rs= null;
	
	
	
public static boolean validate(String username, String password) {
	
	try {
		con = DBconnect.getConnection();
		 stmt = con.createStatement();
		 String sql= "SELECT * FROM patient WHERE name='"+username+"' and  password = '"+password+"' ";
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


public static boolean insertPatient(String name,String age,String nic,String phone,String address, String password) {
	
	boolean isSuccess = false;

		 try {		
			 con = DBconnect.getConnection();
			 stmt = con.createStatement();
			 String sql= "INSERT INTO patient VALUES (0, '"+name+"','"+age+"' , '"+nic+"', '"+phone+"', '"+address+"', '"+password+"') ";
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

public static List<Patient> displaydata(String username) {
	List<Patient> patients = new ArrayList<>();
	   try {
	    	con = DBconnect.getConnection();
			 stmt = con.createStatement();
			 String sql= "SELECT * FROM patient Where name='"+username+"' ";
			  rs = stmt.executeQuery(sql);
	        while (rs.next()) {
	            int pid = rs.getInt("id");
	            String name = rs.getString("name");
	            String age = rs.getString("age");
	            String nic = rs.getString("nic");
	            String phone = rs.getString("phone");
	            String address = rs.getString("address");
	            String password = rs.getString("password");
	            Patient patient = new Patient(pid, name, age, nic, phone, address, password);
	            patients.add(patient);
	        }
	        con.close();
	    } catch (Exception e) {
	        e.printStackTrace();
	    }
	
	
	return patients;
	
	
}
public static boolean UpdatePatient(int number,String name,String age,String nic,String phone,String address) {
	
	boolean isSuccess = false;

		 try {		
			 con = DBconnect.getConnection();
			 stmt = con.createStatement();
			 String sql= "UPDATE patient SET name = '"+name+"', age = '"+age+"', nic = '"+nic+"', phone = '"+phone+"', address = '"+address+"' WHERE id ='"+number+"'";
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
public static boolean deletepatient(String usname) {


	boolean isSuccess = false;
	
	try {
		con = DBconnect.getConnection();
		stmt = con.createStatement();

		String sql = "delete from patient where name='"+usname+"'";

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

public static List<Booking> displayBooking(String username) {
	List<Booking> book1 = new ArrayList<>();
	   try {
	    	con = DBconnect.getConnection();
			 stmt = con.createStatement();
			 String sql= "SELECT * FROM booking Where name = '"+username+"' ";
			  rs = stmt.executeQuery(sql);
	        while (rs.next()) {
	            int pid = rs.getInt("bid");
	            String usname = rs.getString("username");
	            String name = rs.getString("Bname");
	            String age = rs.getString("age");
	            String gender = rs.getString("gender");
	            String nic = rs.getString("nic");
	            String phone = rs.getString("phone");
	            String address = rs.getString("address");
	            Booking book = new Booking(pid, usname, name, age, gender, nic, phone, address);
	            book1.add(book);
	        }
	        con.close();
	    } catch (Exception e) {
	        e.printStackTrace();
	    }
	
	
	return book1;
	
	
}

} 