package com.xworkz.phonepe;

public class Phonepe {
	
	private String ifsccode;
	private String addharno;
	private String accno;
	private int password;
	
	public Phonepe(String ifsccode, String addharno, String accno, int password) {
		
		this.ifsccode=ifsccode;
		this.addharno=addharno;
		this.accno=accno;
		this.password=password;
	}
	
	public String getIfscCode() {
		return ifsccode;
	}
	
	public void setIfscCode(String ifsccode) {
		this.ifsccode=ifsccode;
	} 
	
	public String getAddharNo() {
		return addharno;
	}
	
	public void setAddharNo(String addharno) {
		this.addharno=addharno;
	}
	
	public String getAccNo() {
		return accno;
	}
	
	public void setAccNo(String accno) {
		this.accno=accno;
	}
	
	public int getPassword() {
		return password;
	}
	
	public void setPassword(int password) {
		this.password=password;
	}
}
