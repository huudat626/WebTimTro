package com.tro.beans;
/**
*
* @author User
*/
public class Account {
private int account_id;
private String account_name;
private String phone_number;
private String address;
private String email;
private String password;
public int getAccount_id() {
	return account_id;
}
public void setAccount_id(int account_id) {
	this.account_id = account_id;
}
public String getAccount_name() {
	return account_name;
}
public void setAccount_name(String account_name) {
	this.account_name = account_name;
}
public String getPhone_number() {
	return phone_number;
}
public void setPhone_number(String phone_number) {
	this.phone_number = phone_number;
}
public String getAddress() {
	return address;
}
public void setAddress(String address) {
	this.address = address;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}

public Account() {
	super();
	// TODO Auto-generated constructor stub
}
public Account(int account_id, String account_name, String phone_number, String address, String email,
		String password) {
	
	this.account_id = account_id;
	this.account_name = account_name;
	this.phone_number = phone_number;
	this.address = address;
	this.email = email;
	this.password = password;
}

	
}




