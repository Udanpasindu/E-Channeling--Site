package com.payment;

public class Payment {
	private int payid;
	private String type;
	private String Cardname;
	private String cardno;
	private String exdate;
	private String cvv;
	
	
	public Payment(int payid, String type, String cardname, String cardno, String exdate, String cvv) {
		super();
		this.payid = payid;
		this.type = type;
		Cardname = cardname;
		this.cardno = cardno;
		this.exdate = exdate;
		this.cvv = cvv;
	}


	public int getPayid() {
		return payid;
	}


	public String getType() {
		return type;
	}


	public String getCardname() {
		return Cardname;
	}


	public String getCardno() {
		return cardno;
	}


	public String getExdate() {
		return exdate;
	}


	public String getCvv() {
		return cvv;
	}

	
	
	
	

}
