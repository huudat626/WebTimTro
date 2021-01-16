
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
                        Đăng tin 
                    </h1>
                    <div class="panel-body">
                        <form role="form" action="/tro/addPost" method="post" enctype="multipart/form-data">
                            <div class="form-group">
                                <label for="exampleInputEmail1">Tên tin</label>
                                <input type="text" class="form-control" id="exampleInputTitle1" name="post_title" value="${post_title}">
                                <c:choose>
                                    <c:when test="${proNamVali==1}">
                                        <div class="error" style="color: red">Vui lòng nhập tên sản phẩm.</div>
                                    </c:when>
                                    <c:when test="${proNamVali==2}">
                                        <div class="error" style="color: red">Tên dài ít nhất 6 kí tự.</div>
                                    </c:when>
                                </c:choose>
                            </div>
                             <div class="form-group">
                                <label for="exampleInputEmail1">Loại tin</label>
                                <input type="text" class="form-control" id="exampleInputEmail1" name="post_typeid" value="${post_typeid}">
                                
                            </div>
                             <div class="form-group">
                                <label for="exampleInputEmail1">Địa chỉ cụ thể</label>
                                <input type="text" class="form-control" id="exampleInputAdress" name="post_address" value="${post_address}">
                                </div>
                                 <div class="form-group">
                                <label>Thành phố</label> 
                                 <select id="search_city" name="city_id">
                                 
								<option value="0">Tất cả</option>
									<c:forEach items="${citiList}" var="city">
									<option value="${city.city_id}">${city.city_name}</option>
							</c:forEach>
								</select>
								</div>
								<div class="form-group">
								<label>Quận huyện</label>
							 <select id="search_quanhuyen" name="district_id">
								<option value="0">Tất cả</option>
								<c:forEach items="${disList}" var="dis">
								<option value="${dis.district_id}">${dis.district_name}</option>
							</c:forEach>
							</select>
							</div>
                                 <div class="form-group">
                                <label for="exampleInputEmail1">Diện tích</label>
                                <input type="text" class="form-control" id="exampleInputArea" name="post_area" value="${post_area}">
                                </div>
                            <div class="form-group">
                                <label for="exampleInputPassword1">Giá</label>
                                <input type="text" class="form-control" id="exampleInputPrice" name="post_price"value="${post_price}">
                                 <c:choose>
                                    <c:when test="${proPricVali==1}">
                                        <div class="error" style="color: red">Vui lòng nhập Giá.</div>
                                    </c:when>
                                    <c:when test="${proPricVali==2}">
                                        <div class="error" style="color: red">Giá phải là 1 số.</div>
                                    </c:when>
                                 </c:choose>
                            </div>
                           
                            <div class="form-group">
                                <label for="exampleInputEmail1">Mô tả</label>
                                <input type="text" class="form-control" id="exampleInputEmail1" name="post_description" value="${post_description}">
                                
                            </div>
                            <div class="form-group">
                                <label for="exampleInputPassword1">Ảnh sản phẩm</label>
                                <input type="file" name="post_images"/>
                                 <c:choose>
                                    <c:when test="${proImgLinkVali==1}">
                                        <div class="error" style="color: red">Vui lòng chọn Hình ảnh.</div>
                                    </c:when>
                                    <c:when test="${proImgLinkVali==2}">
                                        <div class="error" style="color: red">Vui lòng chọn chính xác địa chỉ hình ảnh</div>
                                    </c:when>
                                 </c:choose>
                                        
                            </div>
                           
							<div class="form-group">
                                <label for="exampleInputPassword1">Map</label>
                                <input type="text" name="post_map"/>
                                 
                                   
                                        
                            </div>				
                            <button type="submit" class="btn btn-info">Đăng tin</button>
                        </form>

                    </div>
                </section>
            </div>
        </div>          
    </section>
</aside>
