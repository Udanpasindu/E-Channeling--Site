package com.hospital;

public class Hospital {
	private int Hid;
	private String Hospital_name;
	private String Image;
	private String regNo;
	private String phone;
	private String password;
	
	public Hospital(int id, String hospital_name, String image, String regNo, String phone, String password) {
		
		Hid = id;
		Hospital_name = hospital_name;
		Image = image;
		this.regNo = regNo;
		this.phone = phone;
		this.password = password;
	}

	public int getHid() {
		return Hid;
	}

	public String getHospital_name() {
		return Hospital_name;
	}

	public String getImage() {
		return Image;
	}

	public String getRegNo() {
		return regNo;
	}

	public String getPhone() {
		return phone;
	}

	public String getPassword() {
		return password;
	}

	
	
	

	
	
}
