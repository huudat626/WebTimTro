/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tro.dao;

import com.tro.beans.Post;
import com.tro.beans.Typespost;
import com.tro.beans.Ward;
import com.tro.beans.Account;
import com.tro.beans.Cities;
import com.tro.beans.District;

import java.sql.Date;
import java.util.List;

/**
 *
 * @author User
 */
public interface connectDAO {
    
    public List<Post> getPosList();
    public List<Post> getPosListwithType(String Type);
    public List<Post> getPosListTimngoghep();
    public List<Post> getPosListThuetro();
    public List<Post> getPosListAddress();
    public List<Post> getPosListArea();
    public List<Post> getPosListPrice();
    public List<Post> getPostfromSearch(int post_typeid, int city_id, int district_id, int post_area, int post_price   );
    public Post getPost(int id);
    public Account getAccount(String email);
    public List<Account> getAccountList();
   public Account getAccount(int account_id);
    public List<Cities> getCtiesList() ;
    public List<District> getDisList() ;
    public List<Ward> getWardList();
    public List<Typespost> getTypeposst();
    public Account findAccInfo(String email);
   
   
  
    public void deletePost(int post_id);
   //public void insertPost(String post_title, String post_address, String post_area, String post_price, String post_description, String post_images, int post_typeid, String post_map , int post_createby, java.util.Date post_createat);
   // public void insertPost(String post_title, String post_address, String post_area, String post_price, String post_description, String post_images, String post_typeid, String post_map  );
    public void insertAccount(String account_name, String phone_number, String address, String email, String password);
 //   public admin getAd(String name);
    Post insertPost(String post_title, String post_address, String post_area, String post_price,
			String post_description, String post_images, int post_typeid, String post_map, int post_createdBy,
			String post_createdat);
	Account findInfo(String email, String passWord);
	// public List<Post> getPosListId();
	 public void insertAdd( int city_id, int district_id,int Post_id );
	 public int[] getFilterPrice(int id);
	 public int[] getFilterArea(int id);
	 public List<Post> getPosListAcc(int post_createby);
	// public List<Post> getPosId(int id);
	void updatePost(int post_id, String post_title, String post_address, String post_area, String post_price,
			String post_description, String post_images, int post_typeid, String post_map, int post_updateby,
			String post_updateat);
	public void deletAdd(int Post_id );
	public void updateAdd( int city_id, int district_id,int Post_id );
   
}
