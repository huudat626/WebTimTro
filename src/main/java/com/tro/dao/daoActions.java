/*re.
 * To change this license header, choose License Heers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tro.dao;


import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import javax.sql.DataSource;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;

import com.tro.beans.Account;
import com.tro.beans.Cities;
import com.tro.beans.District;
import com.tro.beans.Ward;
import com.tro.beans.Post;
import com.tro.beans.Typespost;



/**
 *
 * @author User
 */
public class daoActions implements connectDAO {

    private final JdbcTemplate jdbcTemplate;

    public daoActions(DataSource dataSource) {
        jdbcTemplate = new JdbcTemplate(dataSource);
    }

    //get product list
    @Override
    public List<Post> getPosList() {
        String sql = "SELECT * FROM baidang";
        List<Post> posList = jdbcTemplate.query(sql, (ResultSet rs, int i) -> {
        	Post pos = new Post();
        	pos.setPost_id(rs.getInt("ID"));
        	pos.setPost_title(rs.getString("Title"));
        	pos.setPost_address(rs.getString("Address"));
        	pos.setPost_area(rs.getInt("Area"));
        	pos.setPost_price(rs.getInt("Price"));
        	pos.setPost_description(rs.getString("Description"));
        	pos.setPost_images(rs.getString("Images"));
        	pos.setPost_typeid(rs.getInt("TypeID"));
        	pos.setPost_map(rs.getString("Map"));

            return pos;
        });
        return posList;
    }
    
    @Override
    public List<Post> getPosListwithType(String Type) {
        String sql = "SELECT * FROM product WHERE TypeID = '" + Type + "'";
        List<Post> posListType = jdbcTemplate.query(sql, (ResultSet rs, int i) -> {
        	Post pos = new Post();
        	pos.setPost_id(rs.getInt("ID"));
        	pos.setPost_title(rs.getString("Title"));
        	pos.setPost_address(rs.getString("Address"));
        	pos.setPost_area(rs.getInt("Area"));
        	pos.setPost_price(rs.getInt("Price"));
        	pos.setPost_description(rs.getString("Description"));
        	pos.setPost_images(rs.getString("Images"));
        	pos.setPost_typeid(rs.getInt("TypeID"));
        	pos.setPost_map(rs.getString("Map"));

            return pos;
        });
        return posListType;
    }



    @Override
    public List<Post> getPosListTimngoghep() {
        String Timngoghep = "tim nguoi o ghep";
        String sql = "SELECT * FROM product WHERE TypeID = '" + Timngoghep + "'";
        List<Post> posListTimngoghep = jdbcTemplate.query(sql, (ResultSet rs, int i) -> {
        	Post pos = new Post();
        	pos.setPost_id(rs.getInt("ID"));
        	pos.setPost_title(rs.getString("Title"));
        	pos.setPost_address(rs.getString("Address"));
        	pos.setPost_area(rs.getInt("Area"));
        	pos.setPost_price(rs.getInt("Price"));
        	pos.setPost_description(rs.getString("Description"));
        	pos.setPost_images(rs.getString("Images"));
        	pos.setPost_typeid(rs.getInt("TypeID"));
        	pos.setPost_map(rs.getString("Map"));

            return pos;
        });
        return posListTimngoghep;
    }
    
    @Override
    public List<Post> getPosListThuetro() {
        String Thuetro = "thue tro";
        String sql = "SELECT * FROM product WHERE TypeID = '" + Thuetro + "'";
        List<Post> posListThuetro = jdbcTemplate.query(sql, (ResultSet rs, int i) -> {
        	Post pos = new Post();
        	pos.setPost_id(rs.getInt("ID"));
        	pos.setPost_title(rs.getString("Title"));
        	pos.setPost_address(rs.getString("Address"));
        	pos.setPost_area(rs.getInt("Area"));
        	pos.setPost_price(rs.getInt("Price"));
        	pos.setPost_description(rs.getString("Description"));
        	pos.setPost_images(rs.getString("Images"));
        	pos.setPost_typeid(rs.getInt("TypeID"));
        	pos.setPost_map(rs.getString("Map"));

            return pos;
        });
        return posListThuetro;
    }
    
    @Override
    public List<Post> getPosListAddress() {
        String Address = "";
        String sql = "SELECT * FROM product WHERE Address = '" + Address + "'";
        List<Post> posListAddress = jdbcTemplate.query(sql, (ResultSet rs, int i) -> {
        	Post pos = new Post();
        	pos.setPost_id(rs.getInt("ID"));
        	pos.setPost_title(rs.getString("Title"));
        	pos.setPost_address(rs.getString("Address"));
        	pos.setPost_area(rs.getInt("Area"));
        	pos.setPost_price(rs.getInt("Price"));
        	pos.setPost_description(rs.getString("Description"));
        	pos.setPost_images(rs.getString("Images"));
        	pos.setPost_typeid(rs.getInt("TypeID"));
        	pos.setPost_map(rs.getString("Map"));

            return pos;
        });
        return posListAddress;
    }
    @Override
    public List<Post> getPosListArea() {
        String Area = "";
        String sql = "SELECT * FROM product WHERE Area = '" + Area + "'";
        List<Post> posListArea = jdbcTemplate.query(sql, (ResultSet rs, int i) -> {
        	Post pos = new Post();
        	pos.setPost_id(rs.getInt("ID"));
        	pos.setPost_title(rs.getString("Title"));
        	pos.setPost_address(rs.getString("Address"));
        	pos.setPost_area(rs.getInt("Area"));
        	pos.setPost_price(rs.getInt("Price"));
        	pos.setPost_description(rs.getString("Description"));
        	pos.setPost_images(rs.getString("Images"));
        	pos.setPost_typeid(rs.getInt("TypeID"));
        	pos.setPost_map(rs.getString("Map"));

            return pos;
        });
        return posListArea;
    }
    @Override
    public List<Post> getPosListPrice() {
        String Price = "";
        String sql = "SELECT * FROM product WHERE Price = '" + Price + "'";
        List<Post> posListPrice = jdbcTemplate.query(sql, (ResultSet rs, int i) -> {
        	Post pos = new Post();
        	pos.setPost_id(rs.getInt("ID"));
        	pos.setPost_title(rs.getString("Title"));
        	pos.setPost_address(rs.getString("Address"));
        	pos.setPost_area(rs.getInt("Area"));
        	pos.setPost_price(rs.getInt("Price"));
        	pos.setPost_description(rs.getString("Description"));
        	pos.setPost_images(rs.getString("Images"));
        	pos.setPost_typeid(rs.getInt("TypeID"));
        	pos.setPost_map(rs.getString("Map"));

            return pos;
        });
        return posListPrice;
    }
  
      // get product from its id
    @Override
    public Post getPost(int id) {
        String sql = "SELECT * FROM baidang WHERE ID =" + id;
        return jdbcTemplate.query(sql, new ResultSetExtractor<Post>() {
            @Override
            public Post extractData(ResultSet rs) throws SQLException, DataAccessException {

                if (rs.next()) {
                	Post pos = new Post();
                	pos.setPost_id(rs.getInt("ID"));
                	pos.setPost_title(rs.getString("Title"));
                	pos.setPost_address(rs.getString("Address"));
                	pos.setPost_area(rs.getInt("Area"));
                	pos.setPost_price(rs.getInt("Price"));
                	pos.setPost_description(rs.getString("Description"));
                	pos.setPost_images(rs.getString("Images"));
                	pos.setPost_typeid(rs.getInt("TypeID"));
                	pos.setPost_map(rs.getString("Map"));

                    return pos;
                }
                return null;
            }
        });
    }

    
   
    

    public Account getAccount(int id) {
        String sql = "SELECT * FROM chutro WHERE ID =" + id;
        return jdbcTemplate.query(sql, new ResultSetExtractor<Account>() {
            @Override
            public Account extractData(ResultSet rs) throws SQLException, DataAccessException {

                if (rs.next()) {
                	Account ac = new Account();
                	ac.setAccount_id(rs.getInt("ID"));
                	ac.setAccount_name(rs.getString("Name"));
                	ac.setPhone_number(rs.getString("PhoneNumber"));
                	ac.setAddress(rs.getString("Address"));
                	ac.setEmail(rs.getString("Email"));
                	ac.setPassword(rs.getString("PassWord"));
                	

                    return ac;
                }
                return null;
            }
        });
    }
    @Override
    public List<Account> getAccountList() {
        String sql = "SELECT * FROM district";
        List<Account> accList = jdbcTemplate.query(sql, (ResultSet rs, int i) -> {
        	Account ac = new Account();
        	ac.setAccount_id(rs.getInt("ID"));
        	ac.setAccount_name(rs.getString("Name"));
        	ac.setPhone_number(rs.getString("PhoneNumber"));
        	ac.setAddress(rs.getString("Address"));
        	ac.setEmail(rs.getString("Email"));
        	ac.setPassword(rs.getString("PassWord"));
        	

            return ac;
        });
        return accList;
    }
    
//    public List<Post> getPosId(int id) {
//        String sql = "SELECT * FROM baidang WHERE ID = '" + id + "'";
//        List<Post> posgetid = jdbcTemplate.query(sql, (ResultSet rs, int i) -> {
//        	Post pos = new Post();
//        	pos.setPost_id(rs.getInt("ID"));
//        	pos.setPost_title(rs.getString("Title"));
//        	pos.setPost_address(rs.getString("Address"));
//        	pos.setPost_area(rs.getInt("Area"));
//        	pos.setPost_price(rs.getInt("Price"));
//        	pos.setPost_description(rs.getString("Description"));
//        	pos.setPost_images(rs.getString("Images"));
//        	pos.setPost_typeid(rs.getInt("TypeID"));
//        	pos.setPost_map(rs.getString("Map"));
//
//            return pos;
//        });
//        return posgetid;
//    }
//    
    @Override
    public void updatePost(int post_id, String post_title, String post_address, String post_area, String post_price,
			String post_description, String post_images, int post_typeid, String post_map, int post_updateby,
			String post_updateat) {
        String sql = "UPDATE `baidang` SET `Title`='" + post_title + "',`Address`='" + post_address + "',"
                + "`Area`=" + post_area + ",`Price`=" + post_price + " ,`Description` = '"+ post_description + "',`Images`='" + post_images +"',`TypeID`=" + post_typeid +",`Map`='" + post_map + "',`UpdatedBy`=" + post_updateby +",`UpdatedAt`='" + post_updateat + "' WHERE `ID`=" + post_id;
        jdbcTemplate.update(sql);
    }

    @Override
    public void deletePost(int post_id) {
        String sql = "DELETE FROM `baidang` WHERE `ID` =" + post_id;
        jdbcTemplate.update(sql);
    }

    @Override

	
   public Post insertPost(String post_title, String post_address, String post_area, String post_price, String post_description, String post_images, int post_typeid, String post_map , int post_createdBy, String post_createdat) {
      String sql = "INSERT INTO `baidang` (`Title`,`Address`,`Area`,`Price`,`Description`,`Images`,`TypeID`,`Map`,`CreatedBy`,`CreatedAt`)"
                + "VALUES ('" + post_title + "','" + post_address +"' , "+ post_area +" , "+ post_price +" ,'"+post_description+"','"+post_images+"', "+post_typeid+", '"+post_map+"',  "+post_createdBy+", '"+post_createdat+"')";
      
        jdbcTemplate.update(sql);
         sql ="SELECT * FROM `baidang` ORDER BY ID DESC LIMIT 1";
        return jdbcTemplate.queryForObject(sql, (rs, rowNum)-> new Post(
        		 rs.getInt("ID"),
              	rs.getString("Title"),
             	rs.getString("Address"),
             	rs.getInt("Area"),
             	rs.getInt("Price"),
             	rs.getString("Description"),
             	rs.getString("Images"),
             	rs.getInt("TypeID"),
             	rs.getString("Map"),
             	rs.getInt("CreatedBy"),
             	rs.getDate("CreatedAt"),
             	rs.getInt("UpdatedBy"),
             	rs.getDate("UpdatedAt")
             	
        		 ));
    }
    @Override
    public void insertAdd( int city_id, int district_id,int Post_id ) {
        String sql = "INSERT INTO `listaddresspost` (`CityID`,`DistrictID`,`Post_id`)"
                + "VALUES (" + city_id + ","+district_id+","+Post_id+" )";
        jdbcTemplate.update(sql);
    }
    @Override
    public void updateAdd( int city_id, int district_id,int post_id ) {
        String sql ="UPDATE `listaddresspost` SET `CityID`=" + city_id + ",`DistrictID'="+ district_id +" WHERE `Post_id`=" + post_id;
        jdbcTemplate.update(sql);
    }
    @Override
    public void deletAdd( int Post_id ) {
        String sql = "DELETE FROM `listaddresspost` WHERE `Post_id` =" + Post_id;
        jdbcTemplate.update(sql);
    }

    @Override
    public Account getAccount(String email) {
        String sql = "SELECT * FROM `chutro` WHERE `Email` ='" + email + "'";
        return jdbcTemplate.query(sql, new ResultSetExtractor<Account>() {
            @Override
            public Account extractData(ResultSet rs) throws SQLException, DataAccessException {
                if (rs.next()) {
                	Account ac = new Account();
                	ac.setAccount_id(rs.getInt("ID"));
                	ac.setAccount_name(rs.getString("Name"));
                	ac.setPhone_number(rs.getString("PhoneNumber"));
                	ac.setAddress(rs.getString("Address"));
                	ac.setEmail(rs.getString("Email"));
                	ac.setPassword(rs.getString("PassWord"));
                    return ac;
                }
                return null;
            }
        });
    }
 
	@Override
	
    public Account findInfo(String email, String passWord) {
        String sql = "Select * "//
                + " from chutro u where u.Email = '"+email+"' and u.PassWord='"+passWord+"'";
        Account acc = jdbcTemplate.query(sql, (ResultSet rs, int i) -> {
        	Account ac = new Account();
        	ac.setEmail(rs.getString("Email"));
        	ac.setAccount_id(rs.getInt("ID"));
        	ac.setAccount_name(rs.getString("Name"));
        	ac.setAddress(rs.getString("Address"));
        	ac.setPhone_number(rs.getString("PhoneNumber"));
        	ac.setPassword(rs.getString("PassWord"));

            return ac;
        }).get(0);
        if(acc != null) return acc;
		return null;   
    }
 
    
        @Override
        public void insertAccount(String account_name, String phone_number, String address, String email, String password) {
            String sql = "INSERT INTO `chutro` (`Name`,`PhoneNumber`,`Address`,`Email`,`PassWord`)"
                    + "VALUES ('" + account_name + "','" + phone_number + "','" + address + "','" + email + "','"+password+"' )";
            jdbcTemplate.update(sql);
        }
        

      
        
        @Override
        public List<Cities> getCtiesList() {
            String sql = "SELECT * FROM cities";
            List<Cities> citiList = jdbcTemplate.query(sql, (ResultSet rs, int i) -> {
            	Cities ci = new Cities();
            	ci.setCity_id(rs.getInt("CityID"));
            	ci.setCity_code(rs.getString("Code"));
            	ci.setCity_name(rs.getString("Name"));
            	

                return ci;
            });
            return citiList;
        
    }
        @Override
        public List<District> getDisList() {
            String sql = "SELECT * FROM district";
            List<District> disList = jdbcTemplate.query(sql, (ResultSet rs, int i) -> {
            	District di = new District();
            	di.setDistrict_id(rs.getInt("DistrictID"));
            	di.setDistrict_code(rs.getString("Code"));
            	di.setDistrict_name(rs.getString("Name"));
            	di.setCity_id(rs.getInt("CityID"));
            	

                return di;
            });
            return disList;
        }
        @Override
        public List<Ward> getWardList() {
            String sql = "SELECT * FROM ward";
            List<Ward> warList = jdbcTemplate.query(sql, (ResultSet rs, int i) -> {
            	Ward war = new Ward();
            	war.setWard_id(rs.getInt("WardID"));
            	war.setWrad_code(rs.getString("Code"));
            	war.setWard_name(rs.getString("Name"));
            	war.setDistrict_id(rs.getInt("DistrictID"));
            	

                return war;
            });
            return warList;
        }
        public List<Typespost> getTypeposst() {
            String sql = "SELECT * FROM typespost";
            List<Typespost> tyList = jdbcTemplate.query(sql, (ResultSet rs, int i) -> {
            	Typespost ty = new Typespost();
            	ty.setType_id(rs.getInt("ID"));
            	ty.setType_name(rs.getString("Name"));
            
                return ty;
            });
            return tyList;
        }

        @Override
        public Account findAccInfo(String email) {
            String sql = "Select Email,PassWord "//
                    + " from chutro  where Email = ? ";
            return jdbcTemplate.query(sql, new ResultSetExtractor<Account>() {
            	@Override
                public Account extractData(ResultSet rs) throws SQLException, DataAccessException {
                    if (rs.next()) {
                    	Account ac = new Account();
                    	ac.setEmail(rs.getString("Email"));
                    	ac.setPassword(rs.getString("PassWord"));
                    	   return ac;
                    }
                    return null;
                }
            });
//     
        }
        public int[] getFilterPrice(int id) {
        	int[] result = new int[2];
        	 switch (id) {
	             case 1:  
	            	result[0] = 0;
	             	result[1] = 1000000;
	                break;
	             case 2:  
	            	result[0] = 1000000;
	              	result[1] = 2000000;
	                 break;
	             case 3:  
		            	result[0] = 2000000;
		              	result[1] = 3000000;
		                 break;
	             case 4:  
		            	result[0] = 3000000;
		              	result[1] = 5000000;
		                 break;
	            default:
	            	result[0] = 0;
	             	result[1] = 1000000;
	             	break;
             }
        	 return result;
                }
        
        public int[] getFilterArea(int id) {
        	int[] result = new int[2];
        	 switch (id) {
	             case 1:  
	            	result[0] = 0;
	             	result[1] = 20;
	                break;
	             case 2:  
	            	result[0] = 20;
	              	result[1] = 30;
	                 break;
	             case 3:  
		            	result[0] = 30;
		              	result[1] = 50;
		                 break;
	             case 4:  
		            	result[0] = 50;
		              	result[1] = 60;
		                 break;
	             case 5:  
		            	result[0] = 60;
		              	result[1] = 100;
		                 break;
	            default:
	            	result[0] = 0;
	             	result[1] = 20;
	             	break;
             }
        	 return result;
                }
        @Override
        public List<Post> getPostfromSearch(int post_typeid, int city_id, int district_id, int post_area, int post_price   ) {
        	int[] filterPrice = this.getFilterPrice(post_price);
        	int[] filterArea = this.getFilterArea(post_area);
        	String sql = "SELECT * FROM `baidang` \r\n"
        			+ "INNER JOIN listaddresspost ON baidang.ID=listaddresspost.Post_id\r\n"
        			+ "WHERE `TypeID`= " + city_id + " AND (`Price` BETWEEN "+filterPrice[0]+" AND "+filterPrice[1]+") AND (`Area` BETWEEN "+filterArea[0]+" AND "+filterArea[1]+")  and CityID = " + city_id + " AND DistrictID = " + district_id ;
            List<Post> postList = jdbcTemplate.query(sql, (ResultSet rs, int i) -> {
            	Post pos = new Post();
            	pos.setPost_id(rs.getInt("ID"));
            	pos.setPost_title(rs.getString("Title"));
            	pos.setPost_address(rs.getString("Address"));
            	pos.setPost_area(rs.getInt("Area"));
            	pos.setPost_price(rs.getInt("Price"));
            	pos.setPost_description(rs.getString("Description"));
            	pos.setPost_images(rs.getString("Images"));
            	pos.setPost_typeid(rs.getInt("TypeID"));
            	pos.setPost_map(rs.getString("Map"));

                return pos;
            });
            return postList;
        }
        @Override
        public List<Post> getPosListAcc(int post_createby) {
            String sql = "SELECT * FROM `baidang` WHERE `CreatedBy` =" + post_createby;
            List<Post> posList = jdbcTemplate.query(sql, (ResultSet rs, int i) -> {
            	Post pos = new Post();
            	pos.setPost_id(rs.getInt("ID"));
            	pos.setPost_title(rs.getString("Title"));
            	pos.setPost_address(rs.getString("Address"));
            	pos.setPost_area(rs.getInt("Area"));
            	pos.setPost_price(rs.getInt("Price"));
            	pos.setPost_description(rs.getString("Description"));
            	pos.setPost_images(rs.getString("Images"));
            	pos.setPost_typeid(rs.getInt("TypeID"));
            	pos.setPost_map(rs.getString("Map"));

                return pos;
            });
            return posList;
        }

	

		
}

	

	


   
 
    
                      
                        
                        
                        
                        