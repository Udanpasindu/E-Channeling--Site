package com.book;

public class Booking {
    private int bid;
    private String docName;
    private String uname;
    private String age;
    private String gender;
    private String nic;
    private String phone;
    private String address;

    public Booking() {
        // Default constructor
    }

    public Booking(int bid, String docName, String uname, String age, String gender, String nic, String phone, String address) {
        this.bid = bid;
        this.docName = docName;
        this.uname = uname;
        this.age = age;
        this.gender = gender;
        this.nic = nic;
        this.phone = phone;
        this.address = address;
    }

    public int getBid() {
        return bid;
    }

    public void setBid(int bid) {
        this.bid = bid;
    }

    public String getDocName() {
        return docName;
    }

    public void setDocName(String docName) {
        this.docName = docName;
    }

    public String getUname() {
        return uname;
    }

    public void setUname(String uname) {
        this.uname = uname;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
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
}
