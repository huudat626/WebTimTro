package com.tro.beans;

public class District {
private int district_id;
private String district_code;
private String district_name;
private int city_id;
public int getCity_id() {
	return city_id;
}
public void setCity_id(int city_id) {
	this.city_id = city_id;
}
public int getDistrict_id() {
	return district_id;
}
public void setDistrict_id(int district_id) {
	this.district_id = district_id;
}
public String getDistrict_code() {
	return district_code;
}
public void setDistrict_code(String district_code) {
	this.district_code = district_code;
}
public String getDistrict_name() {
	return district_name;
}
public void setDistrict_name(String district_name) {
	this.district_name = district_name;
}

}
