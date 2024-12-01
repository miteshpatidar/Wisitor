package com.wisitor.entities;

public class Usermember {
	private String membername;
	private String memberemail;
	private String memberaddress;
	private String memberstate;
	private String membercity;
	private String memberzip;
	private String memberphone;


	//constructors
	public Usermember(String membername, String memberemail, String memberaddress,String memberstate, String membercity, String memberzip,
			String memberphone) {
		super();
		this.membername = membername;
		this.memberemail = memberemail;
		this.memberaddress = memberaddress;
		this.memberstate = memberstate;
		this.membercity = membercity;
		this.memberzip = memberzip;
		this.memberphone = memberphone;
	}
	public Usermember() {
		super();
	}
	public String getMembername() {
		return membername;
	}
	public void setMembername(String membername) {
		this.membername = membername;
	}
	public String getMemberemail() {
		return memberemail;
	}
	public void setMemberemail(String memberemail) {
		this.memberemail = memberemail;
	}
	public String getMemberaddress() {
		return memberaddress;
	}
	public void setMemberaddress(String memberaddress) {
		this.memberaddress = memberaddress;
	}
	public String getMemberstate() {
		return memberstate;
	}
	public void setMemberstate(String memberstate) {
		this.memberstate = memberstate;
	}
	public String getMembercity() {
		return membercity;
	}
	public void setMembercity(String membercity) {
		this.membercity = membercity;
	}
	public String getMemberzip() {
		return memberzip;
	}
	public void setMemberzip(String memberzip) {
		this.memberzip = memberzip;
	}
	public String getMemberphone() {
		return memberphone;
	}
	public void setMemberphone(String memberphone) {
		this.memberphone = memberphone;
	}



}
