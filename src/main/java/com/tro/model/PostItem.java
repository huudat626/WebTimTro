package com.tro.model;

import com.tro.beans.Post;

public class PostItem {
	 private Post pos;
	    

	   

	    public PostItem(Post pos) {
	        this.pos = pos;
	      
	    }

	    public Post getPost(){
	        return pos;
	    }

	    public void setPost(Post pos) {
	        this.pos = pos;
	    }

}
