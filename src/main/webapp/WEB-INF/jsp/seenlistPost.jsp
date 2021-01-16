
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<section class="main-content">		
		
    <div class="row">
        <div class="span9">	
        
            <h4 class="title"><span class="text"><strong>Bài đăng của bạn</strong></span></h4>
            
            <table class="table table-striped">
                <thead>
                    <tr>
                        <th>Mã BĐ</th>
                        <th>Tên bài đăng</th>
                        <th>Địa chỉ</th>
                        <th>Diện tích</th>
                        <th>Giá</th>
                        <th>Mô tả</th>
                        <th>Hình ảnh</th>
                        <th>Loại tin</th>
                        
                        
                    </tr>
                </thead>
                <tbody>
                
                    <c:forEach items="${posList}" var="post">
                    
                        <tr> 
                            
                            <td>${post.post_id}</td>
                            <td>${post.post_title}</td>
                             <td>${post.post_address}</td>
                              <td>${post.post_area}</td>
                               <td>${post.post_price}</td>
                                <td>${post.post_description}</td>
                                 <td>${post.post_images}</td>
                                  <td>${post.post_typeid}</td>
                                 
      							 <td> <a href="/tro/editPost?post_id=${post.post_id}">Sửa</a></td>
      							 <td> <a href="/tro/deletPost?post_id=${post.post_id}">Xóa</a></td>
   
                        </tr>
                      
                    </c:forEach>
       
                    <tr>
                        <td>&nbsp;</td>
                        <td>&nbsp;</td>
                        <td>&nbsp;</td>
                        <td>&nbsp;</td>
                        <td>&nbsp;</td>
                        <td>&nbsp;</td>
                        <td>&nbsp;</td>
                        <td>&nbsp;</td>
                        <td>&nbsp;</td>
                    </tr>		  
                </tbody>
            </table>
        </div>
        

    </div>
</section>	
