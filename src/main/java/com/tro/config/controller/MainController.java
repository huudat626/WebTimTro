package com.tro.config.controller;


import java.io.IOException;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import com.tro.model.FileProcess;



import com.tro.beans.Account;
import com.tro.beans.Cities;
import com.tro.beans.District;
import com.tro.beans.Post;
import com.tro.beans.Typespost;
import com.tro.dao.connectDAO;


@Controller
@RequestMapping(value = "/")
public class MainController {

    @Autowired
    private connectDAO dao;
    

    @RequestMapping(value = {"/", "/home"}, method = RequestMethod.GET)
    public String homePage(ModelMap mm,HttpSession session) {
    	
       List<Post> postList = dao.getPosList();
       List<Typespost>tyList= dao.getTypeposst();
       List<Cities>citiList=dao.getCtiesList();
       List<District>disList=dao.getDisList();
        mm.put("posList", postList);
        mm.put("citiList",citiList);
        mm.put("disList",disList);
        mm.put("tyList", tyList);
        Account loggedUser = (Account)session.getAttribute("account");
        mm.put("loggedUser", loggedUser);
        return "homepage";
    }
    @RequestMapping(value = "/addPost", method = RequestMethod.GET)
    public String addPost(ModelMap mm, HttpSession session) {
    	  if (session.getAttribute("account") == null) {
              return "login";
    	  } else {
    	 List<Cities>citiList=dao.getCtiesList();
         List<District>disList=dao.getDisList();
         mm.put("citiList",citiList);
         mm.put("disList",disList);
         Account loggedUser = (Account)session.getAttribute("account");
         mm.put("loggedUser", loggedUser);
              return "addPost";
    	  }
          }
      
    
    @RequestMapping(value = "/addPost", method = RequestMethod.POST)
    public String addProduct(ModelMap mm, HttpSession session,
            @RequestParam(value = "post_title") String post_title,
            @RequestParam(value = "post_address") String post_address,
            @RequestParam(value = "city_id") int city_id,
            @RequestParam(value = "district_id") int district_id,
            
            @RequestParam(value = "post_area") String post_area,
            @RequestParam(value = "post_price") String post_price,
            @RequestParam(value = "post_description") String post_description,
            @RequestParam(value = "post_typeid") int post_typeid,
            @RequestParam(value = "post_map") String post_map,
          
            @RequestParam(value = "post_images") MultipartFile imgFile) throws IOException {
       
            FileProcess fileProcess = new FileProcess();
            String postimgLink = null;
            if (imgFile != null) {
            	postimgLink = fileProcess.processFile(imgFile);
                System.out.println(postimgLink);
            }
            int post_createby = 1;
            Date dt = new Date();
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

            String post_createdat = sdf.format(dt);

            Post post = (Post)dao.insertPost(post_title,post_address,post_area,post_price,post_description,postimgLink,post_typeid,post_map,post_createby,post_createdat);
            dao.insertAdd( city_id, district_id,post.getPost_id() );
    // send view
   
    return "homePage";
           
            
               
            
          
    }
    	
    
        

    // get List product
    @RequestMapping(value = "/postList", method = RequestMethod.GET)
    public String getPostList(ModelMap mm) throws ClassNotFoundException, SQLException {
        List<Post> postList = dao.getPosList();
        mm.put("posList", postList);
        return "postList";
    }
  
    
    // get List post
    @RequestMapping(value = "/postList", method = RequestMethod.POST)
    public String postList(ModelMap mm) throws ClassNotFoundException, SQLException {
        List<Post> postList = dao.getPosList();
        mm.put("proList", postList);
        return "postList";
    }
    // get post detail
    @RequestMapping(value = "/postDetail", method = RequestMethod.GET, params = {"id"})
    public String getPostDetail(ModelMap mm, @RequestParam(value = "id") int id) {
        // get product from its id
        Post post = dao.getPost(id);
        Account ac = dao.getAccount(id);
        mm.put("post", post);
        mm.put("ac", ac);
        return "postDetail";
    }
     // get List product
//    @RequestMapping(value = "/postListThuetro", method = RequestMethod.GET,params = {"cate"})
//    public String getPosListThuetro(ModelMap mm,@RequestParam(value = "cate") String cate) throws ClassNotFoundException, SQLException {
//        List<Post> postListThuetro = dao.getPosListThuetro(cate);
//        mm.put("posListMan", postListThuetro);
//        return "postListThuetro";
//    }
//   
//    
//    @RequestMapping(value = "/productListTimngoghep", method = RequestMethod.GET,params = {"cate"})
//    public String postListTimngoghep(ModelMap mm,@RequestParam(value = "id") int cate) throws ClassNotFoundException, SQLException {
//        List<Post> prodListMan = dao.getProListwithCategory("nữ");
//        mm.put("proListMan", prodListMan);
//        return "productListWoman";
//    }

    // check out
    @RequestMapping(value = "/login", method = RequestMethod.GET)
    String login(ModelMap mm, HttpSession session) {
        if (session.getAttribute("Account") == null) {
            return "login";
        } else {
            Account ac = (Account) session.getAttribute("Account");
            mm.put("account_name", ac.getAccount_id());
    	
            return "redirect:home";
          }
    }
    // LoginPost
    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public String login(ModelMap mm, HttpSession session,
            @RequestParam(value = "email") String email,
            @RequestParam(value = "pass") String password) {
    		Account	acc =	dao.findInfo(email, password);	
    		if (acc!=null) {
    			session.setAttribute("account", acc);
                return "redirect:home"; 
    		} else {
    			return "login"; 
    		} 
          }
    
    // check out
    @RequestMapping(value = "/dangky", method = RequestMethod.GET)
    public String dangky(ModelMap mm ) {
    	
              return "dangky";
         
          }
    
    @RequestMapping(value = "/dangky", method = RequestMethod.POST)
    public String addAccount(ModelMap mm,
            @RequestParam(value = "account_name") String account_name,
            @RequestParam(value = "account_phonenumber") String phone_number,
            @RequestParam(value = "account_address") String address,
            @RequestParam(value = "account_email") String email,
            @RequestParam(value = "account_password") String password) {
    	dao.insertAccount(account_name,phone_number,address,address,password);
    // send view
   
    return "home";
    }
   
            
 
    
    
    // check out
    @RequestMapping(value = "/checkout", method = RequestMethod.GET)
    public String getCheckout(ModelMap mm, HttpSession session) {
            return "checkout";
    }

   
    // search product
    @RequestMapping(value ="/search_post", method = RequestMethod.GET, params = {})
    public String search_post(ModelMap mm,HttpSession session, 
    		@RequestParam(value = "post_typeid")int post_typeid,
    		@RequestParam(value = "search_quanhuyen")int district_id,
    		@RequestParam(value = "gia")int post_price ,
    		@RequestParam(value = "dt")int post_area ,
    		@RequestParam(value = "search_city")int city_id 
    		){
        // get input string
        // process input string 
        List<Post> postList = dao.getPostfromSearch( post_typeid, city_id,  district_id,  post_area, post_price);
        
	        List<Typespost>tyList= dao.getTypeposst();
	        List<Cities>citiList=dao.getCtiesList();
	        List<District>disList=dao.getDisList();
         mm.put("citiList",citiList);
         mm.put("disList",disList);
         mm.put("tyList", tyList);
         Account loggedUser = (Account)session.getAttribute("account");
         mm.put("loggedUser", loggedUser);
        
        	mm.put("posList", postList);
        	mm.put("post_typeid",post_typeid);
        	mm.put("search_quanhuyen",district_id);
        	mm.put("gia",post_price);
        	mm.put("dt",post_area);
        	mm.put("search_city",city_id);
        
//        else
//        	mm.put("thongbao", "Không tìm thấy");
        // return productlist
        return "homepage";
        
    }
    @RequestMapping(value = "/seenlistPost", method = RequestMethod.GET )
    public String seenlist(ModelMap mm,HttpSession session ) {
    	 if (session.getAttribute("account") == null) {
             return "login";
   	  } else {
   		
        
        Account loggedUser = (Account)session.getAttribute("account");
        mm.put("loggedUser", loggedUser);
        
        int post_createby =  loggedUser.getAccount_id();
		List<Post> posList= dao.getPosListAcc( post_createby);
		mm.put("posList", posList);
              return "seenlistPost";
   	  }
          }         
    @RequestMapping(value = "/seenlistPost", method = RequestMethod.POST)
    public String editlist(ModelMap mm,HttpSession session ) throws ClassNotFoundException, SQLException {
        
        return "seenlistPost";
    }

    
    @RequestMapping(value = "/editPost", method = RequestMethod.GET)
    public String editPost(ModelMap mm, @RequestParam(value = "post_id") int post_id) {
        // get product from its id
    
        Post post = dao.getPost(post_id);
        mm.put("post", post);
        return "editPost";
    }
    	
    
  
          

    	
    	@RequestMapping(value = "/editPost", method = RequestMethod.POST)
        public String editPost(ModelMap mm, HttpSession session ,
        		@RequestParam(value = "post_id") int post_id,
        		 @RequestParam(value = "post_title") String post_title,
                 @RequestParam(value = "post_address") String post_address,
               //  @RequestParam(value = "city_id") int city_id,
             //    @RequestParam(value = "district_id") int district_id,
                 
                 @RequestParam(value = "post_area") String post_area,
                 @RequestParam(value = "post_price") String post_price,
                 @RequestParam(value = "post_description") String post_description,
                 @RequestParam(value = "post_typeid") int post_typeid,
                 @RequestParam(value = "post_map") String post_map,
               
                 @RequestParam(value = "post_images") MultipartFile imgFile) throws IOException {
            
                 FileProcess fileProcess = new FileProcess();
                 String postimgLink = null;
                 if (imgFile != null) {
                 	postimgLink = fileProcess.processFile(imgFile);
                     System.out.println(postimgLink);
                 }
                 int post_updateby = 1;
                 Date dt = new Date();
                 SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

                 String post_updateat = sdf.format(dt);

                 dao.updatePost(post_id,  post_title,  post_address,  post_area,  post_price,
             			 post_description,  postimgLink,  post_typeid,  post_map,  post_updateby,
            			 post_updateat);
             //    dao. updateAdd(  city_id,  district_id, post_id );
                 
         // send view
        
         return "seenlistPost";
    	}
    	  
        @RequestMapping(value = "/deletPost", method = RequestMethod.GET)
        public String deletPost(ModelMap mm, @RequestParam(value = "post_id") int post_id) {
            // get product from its id
        
            Post post = dao.getPost(post_id);
            mm.put("post", post);
            return "deletPost";
        }
        @RequestMapping(value = "/deletPost", method = RequestMethod.POST)
       public String delePost(ModelMap mm, HttpSession session,
        		@RequestParam(value = "post_id") int post_id) {
       	 dao.deletePost(post_id);
			return "redirect:seenlistPost";
       		
}
}
   


