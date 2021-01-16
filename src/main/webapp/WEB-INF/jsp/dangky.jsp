<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!-- Right side column. Contains the navbar and content of the page -->
<aside class="right-side">
    <!-- Content Header (Page header) -->
    <!-- Main content -->
    <section class="content">
        <div class="row">
        
            <div class="col-lg-8">
                <section class="panel">
                    <header class="panel-heading">
                        Đăng ký 
                    </header>
                    <div class="panel-body">
                        <form role="form" action="/tro/dangky" method="post" enctype="multipart/form-data">
                            <div class="form-group">
                                <label for="exampleInputEmail1">Tên</label>
                                <input type="text" class="form-control" id="exampleInputTitle1" name="account_name" value="${account_name}">
                                <c:choose>
                                    <c:when test="${proNamVali==1}">
                                        <div class="error" style="color: red">Vui lòng nhập tên.</div>
                                    </c:when>
                                    <c:when test="${proNamVali==2}">
                                        <div class="error" style="color: red">Tên dài ít nhất 6 kí tự.</div>
                                    </c:when>
                                </c:choose>
                            </div>
                             <div class="form-group">
                                <label for="exampleInputEmail1">SĐT</label>
                                <input type="text" class="form-control" id="exampleInputAdress" name="account_phonenumber" value="${phone_number}">
                                </div>
                             <div class="form-group">
                                <label for="exampleInputEmail1">Địa chỉ</label>
                                <input type="text" class="form-control" id="exampleInputAdress" name="account_address" value="${address}">
                                </div>
                                
                                 <div class="form-group">
                                <label for="exampleInputEmail1">Email</label>
                                <input type="text" class="form-control" id="exampleInputArea" name="account_email" value="${email}">
                                </div>
                                <div class="form-group">
                                <label for="exampleInputEmail1">Password</label>
                                <input type="text" class="form-control" id="exampleInputArea" name="account_password" value="${password}">
                                </div>
                                
								<button type="submit" class="btn btn-info">Đăng ký</button>					
								</form>
				</div>
	</section>
	</div>
	</div>
	</section>
</aside>
