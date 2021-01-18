/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tro.beans;

import java.sql.Date;

/**
 *
 * @author User
 */
public class Post {

    private int post_id;
    private String post_title;
    private String post_address;
    private int post_area;
    private int post_price;
    private String post_description;
    private String post_images;
    private int post_typeid;
    private String post_map;
    private int post_createby;
    private Date post_createat;
    private int post_updateby;
    private Date post_updateat;
    private String post_phone;
	public String getPost_phone() {
		return post_phone;
	}
	public void setPost_phone(String post_phone) {
		this.post_phone = post_phone;
	}
	public int getPost_id() {
		return post_id;
	}
	public void setPost_id(int post_id) {
		this.post_id = post_id;
	}
	public String getPost_title() {
		return post_title;
	}
	public void setPost_title(String post_title) {
		this.post_title = post_title;
	}
	public String getPost_address() {
		return post_address;
	}
	public void setPost_address(String post_address) {
		this.post_address = post_address;
	}
	public int getPost_area() {
		return post_area;
	}
	public void setPost_area(int post_area) {
		this.post_area = post_area;
	}
	public int getPost_price() {
		return post_price;
	}
	public void setPost_price(int post_price) {
		this.post_price = post_price;
	}
	public String getPost_description() {
		return post_description;
	}
	public void setPost_description(String post_description) {
		this.post_description = post_description;
	}
	public String getPost_images() {
		return post_images;
	}
	public void setPost_images(String post_images) {
		this.post_images = post_images;
	}
	public int getPost_typeid() {
		return post_typeid;
	}
	public void setPost_typeid(int post_typeid) {
		this.post_typeid = post_typeid;
	}
	public String getPost_map() {
		return post_map;
	}
	public void setPost_map(String post_map) {
		this.post_map = post_map;
	}
	public int getPost_createby() {
		return post_createby;
	}
	public void setPost_createby(int post_createby) {
		this.post_createby = post_createby;
	}
	public Date getPost_createat() {
		return post_createat;
	}
	public void setPost_createat(Date post_createat) {
		this.post_createat = post_createat;
	}
	public int getPost_updateby() {
		return post_updateby;
	}
	public void setPost_updateby(int post_updateby) {
		this.post_updateby = post_updateby;
	}
	public Date getPost_updateat() {
		return post_updateat;
	}
	public void setPost_updateat(Date post_updateat) {
		this.post_updateat = post_updateat;
	}
	
	public Post() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Post(int post_id, String post_title, String post_address, int post_area, int post_price,
			String post_description, String post_images, int post_typeid, String post_map, int post_createby,
			Date post_createat, int post_updateby, Date post_updateat, String post_phone) {
		super();
		this.post_id = post_id;
		this.post_title = post_title;
		this.post_address = post_address;
		this.post_area = post_area;
		this.post_price = post_price;
		this.post_description = post_description;
		this.post_images = post_images;
		this.post_typeid = post_typeid;
		this.post_map = post_map;
		this.post_createby = post_createby;
		this.post_createat = post_createat;
		this.post_updateby = post_updateby;
		this.post_updateat = post_updateat;
		this.post_phone = post_phone;
	}
	
   
    
}
