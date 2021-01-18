/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tro.config.controller;


import com.tro.dao.connectDAO;
import com.tro.beans.Account;
import com.tro.beans.Cities;
import com.tro.beans.District;
import com.tro.beans.Post;
import com.tro.beans.Typespost;
import com.tro.beans.admin;
import com.tro.model.FileProcess;



import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;


 
 
@Controller
@RequestMapping(value = "/admin")
public class admin_controller {
    
    @Autowired
    private connectDAO dao_admin;
    
    @RequestMapping(value = {"/", "", "/login_admin"}, method = RequestMethod.GET)
    public String getlogin(ModelMap mm, HttpSession session) {
    	 if (session.getAttribute("admin") == null) {
             return "login_admin";
         } else {
        	 admin ad = (admin) session.getAttribute("admin");
             mm.put("admin_name", ad.getAdmin_id());
     	
             return "redirect:home_ad";
           }
        }
        
    @RequestMapping(value = "/login_admin", method = RequestMethod.POST)
    public String loginad(ModelMap mm, HttpSession session,
            @RequestParam(value = "user") String username,
            @RequestParam(value = "pass") String admin_pass) {
    		admin	ad = dao_admin.findAdInfo(username, admin_pass );	
    		if (ad!=null) {
    			session.setAttribute("admin", ad);
                return "redirect:home_ad"; 
    		} else {
    			return "login_admin"; 
    		} 
          }
    
    @RequestMapping(value = {"/home_ad"}, method = RequestMethod.GET)
    public String gethome_ad(ModelMap mm, HttpSession session) {
    	
    			
    	       List<Post> postList = dao_admin.getPosList();
    	       List<Typespost>tyList= dao_admin.getTypeposst();
    	       List<Cities>citiList=dao_admin.getCtiesList();
    	       List<District>disList=dao_admin.getDisList();
    	        mm.put("posList", postList);
    	        mm.put("citiList",citiList);
    	        mm.put("disList",disList);
    	        mm.put("tyList", tyList);
    	        admin loggedad = (admin)session.getAttribute("admin");
    	        mm.put("loggedUser", loggedad);
    	        return "home_ad";
           }
    
   
    @RequestMapping(value = "/seenlistPost_ad", method = RequestMethod.GET )
    public String seenlistad(ModelMap mm,HttpSession session ) {
    	 if (session.getAttribute("admin") == null) {
             return "login_admin";
   	  } else {
   		
        
        admin loggedUser = (admin)session.getAttribute("login_admin");
        mm.put("loggedUser", loggedUser);
        
       
		List<Post> posList= dao_admin.getPosList();
		mm.put("posList", posList);
              return "seenlistPost";
   	  }
    }    
//    @RequestMapping(value = "/seenlistPost", method = RequestMethod.POST)
//    public String editlist(ModelMap mm,HttpSession session ) throws ClassNotFoundException, SQLException {
//        
//        return "seenlistPost";
//    }

    
    @RequestMapping(value = "/editPost", method = RequestMethod.GET)
    public String editPost(ModelMap mm, @RequestParam(value = "post_id") int post_id) {
        // get product from its id
    
        Post post = dao_admin.getPost(post_id);
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

                 dao_admin.updatePost(post_id,  post_title,  post_address,  post_area,  post_price,
             			 post_description,  postimgLink,  post_typeid,  post_map,  post_updateby,
            			 post_updateat);
             //    dao. updateAdd(  city_id,  district_id, post_id );
                 
         // send view
        
         return "redirect:seenlistPost";
    	}
    	  @RequestMapping(value = "/deletPost", method = RequestMethod.GET)
          public String deletPost(ModelMap mm, @RequestParam(value = "post_id") int post_id) {
              // get product from its id
          
              Post post = dao_admin.getPost(post_id);
              mm.put("post", post);
              return "deletPost";
          }
          @RequestMapping(value = "/deletPost", method = RequestMethod.POST)
         public String delePost(ModelMap mm, HttpSession session,
          		@RequestParam(value = "post_id") int post_id) {
         	 dao_admin.deletePost(post_id);
  			return "redirect:seenlistPost";
         		
          }
        
    }

