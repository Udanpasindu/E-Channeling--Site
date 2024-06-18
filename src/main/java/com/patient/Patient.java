package com.patient;


public class Patient {
	private int pid;
	private String name;
	private String age;
	private String nic;
	private String phone;
	private String address;
	private String password;
	
	
	
	public Patient(int pid, String name, String age, String nic, String phone, String address, String password) {
		
		this.pid = pid;
		this.name = name;
		this.age = age;
		this.nic = nic;
		this.phone = phone;
		this.address = address;
		this.password = password;
	}
	
	
	public Patient(String name, String age, String nic, String phone, String address, String password) {
		super();
		this.name = name;
		this.age = age;
		this.nic = nic;
		this.phone = phone;
		this.address = address;
		this.password = password;
	}


	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}
	public String getNic() {
		return nic;
	}
	public void setNic(String nic) {
		this.nic = nic;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}

	
}

