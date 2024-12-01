package com.wisitor.entities;

public class Visitormember {
	private String visitorname;
	private String visitorphone;
	private String visitorpurpose;
	private String memberemail;
	
	public Visitormember() {
		// TODO Auto-generated constructor stub
	}
	
	public Visitormember(String visitorname,String visitorphone,String visitorpurpose,String memberemail) {
		this.visitorname = visitorname;
		this.visitorphone = visitorphone;
		this.visitorpurpose = visitorpurpose;
		this.memberemail = memberemail;
	}

	public String getVisitorname() {
		return visitorname;
	}

	public void setVisitorname(String visitorname) {
		this.visitorname = visitorname;
	}

	public String getVisitorphone() {
		return visitorphone;
	}

	public void setVisitorphone(String visitorphone) {
		this.visitorphone = visitorphone;
	}

	public String getVisitorpurpose() {
		return visitorpurpose;
	}

	public void setVisitorpurpose(String visitorpurpose) {
		this.visitorpurpose = visitorpurpose;
	}

	public String getMemberemail() {
		return memberemail;
	}

	public void setMemberemail(String memberemail) {
		this.memberemail = memberemail;
	}
	
}
