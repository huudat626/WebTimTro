package com.tro.model;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import com.tro.beans.Account;
import com.tro.beans.Post;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author User
 */
public class usercart {
    private Account account;
    private List<PostItem> ItemList;

    public usercart(List<PostItem> ItemList) {
        this.ItemList = ItemList;
    }
    
    public usercart() {
    }

  
    public Account getAccount() {
		return account;
	}

	public void setAccount(Account account) {
		this.account = account;
	}

	public List<PostItem> getItemList() {
		return ItemList;
	}

	public void setItemList(List<PostItem> itemList) {
		ItemList = itemList;
	}


	

    // add item in cart
    public void addItem(Post pos){
    	PostItem lineItem = new PostItem(pos);
        this.ItemList.add(lineItem);
    }
    // find item from prod_id 
    public PostItem findItemfromID(int post_id){
        for(PostItem item : this.ItemList){
            if(item.getPost().getPost_id()==post_id){
                return item;
            }
        }
        return null;
    }
    // remove item from prod_id
    public void removeItem(int post_id){
    	PostItem item = findItemfromID(post_id);
        if(item!=null){
            this.ItemList.remove(item);
        }
    }
   
}

