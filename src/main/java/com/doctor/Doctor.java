package com.doctor;

public class Doctor {
	private int did;
	private String Dname;
	private String Image;
	private String MedID;
	private String Special;
	private String email;
	private String phone;
	private String username;
	private String password;
	private String roomNo;
	private String Time;
	private String Date;
	
	public Doctor(int did, String dname, String image, String medID, String special, String email, String phone,
			String username, String password, String roomNo, String time, String date) {
		
		this.did = did;
		Dname = dname;
		Image = image;
		MedID = medID;
		Special = special;
		this.email = email;
		this.phone = phone;
		this.username = username;
		this.password = password;
		this.roomNo = roomNo;
		Time = time;
		Date = date;
		
		
	}

	public int getDid() {
		return did;
	}

	public String getDname() {
		return Dname;
	}

	public String getImage() {
		return Image;
	}

	public String getMedID() {
		return MedID;
	}

	public String getSpecial() {
		return Special;
	}

	public String getEmail() {
		return email;
	}

	public String getPhone() {
		return phone;
	}

	public String getUsername() {
		return username;
	}

	public String getPassword() {
		return password;
	}

	public String getRoomNo() {
		return roomNo;
	}

	public String getTime() {
		return Time;
	}

	public String getDate() {
		return Date;
	}


	
	
	

}
