
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page import="com.tro.beans.Post"%>
<!-- Right side column. Contains the navbar and content of the page -->
<aside class="right-side">
    <!-- Content Header (Page header) -->
    <!-- Main content -->
    <section class="content">
        <div class="row">
        
            <div class="col-lg-8">
                <section class="panel">
                    <h1 class="panel-heading">
                        Sửa tin 
                    </h1>
                    <div class="panel-body">
                        <form role="form" action="/tro/editPost" method="post" enctype="multipart/form-data">
                            <div class="form-group">
                           <input type="hidden"  name="post_id" value="${post.post_id}">
                                <label for="exampleInputEmail1">Tên tin</label>
                                <input type="text" class="form-control" id="exampleInputTitle1" name="post_title" value="${post.post_title}">
                                
                            </div>
                             <div class="form-group">
                                <label for="exampleInputEmail1">Loại tin</label>
                                <input type="text" class="form-control" id="exampleInputEmail1" name="post_typeid" value="${post.post_typeid}">
                                
                            </div>
                            <div class="form-group">
                                <label for="exampleInputEmail1">Địa chỉ cụ thể</label>
                                <input type="text" class="form-control" id="exampleInputAdress" name="post_address" value="${post.post_address}">
                                </div>
                                
                                 <div class="form-group">
                                <label for="exampleInputEmail1">Diện tích</label>
                                <input type="text" class="form-control" id="exampleInputArea" name="post_area" value="${post.post_area}">
                                </div>
                            <div class="form-group">
                                <label for="exampleInputPassword1">Giá</label>
                                <input type="text" class="form-control" id="exampleInputPrice" name="post_price"value="${post.post_price}">
                                
                            </div>
                           
                            <div class="form-group">
                                <label for="exampleInputEmail1">Mô tả</label>
                                <input type="text" class="form-control" id="exampleInputEmail1" name="post_description" value="${post.post_description}">
                                
                            </div>
                            <div class="form-group">
                                <label for="exampleInputPassword1">Ảnh sản phẩm</label>
                                <input type="file" name="post_images"/>
                                
                                        
                            </div>
                           
							<div class="form-group">
                                <label for="exampleInputPassword1">Map</label>
                                <input type="text" name="post_map"value="${post.post_description}">/>
                                 
                                   
                                        
                            </div>				
                            <button type="submit" class="btn btn-info">Đăng tin</button>
                        </form>

                    </div>
                </section>
            </div>
        </div>          
    </section>
</aside>
