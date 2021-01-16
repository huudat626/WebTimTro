<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<meta charset="utf8">
<html>
	<head>
		
	</head>
	<body>
		<div id="top-bar" class="container">
			<%
				if (session.getAttribute("account") != null) {
			%>
			<p>
				Username :<strong>${loggedUser.getAccount_name()}</strong>
			</p>
			<%
			}
			%>
				<ul class="user-menu">
					<c:choose>
						<c:when test="${sessionScope.Account==null}">
							<li><a href="/tro/login">Đăng Nhập</a></li>
							<li><a href="/tro/dangky">Đăng Ký</a></li>
							<li><a href="/tro/addPost">Đăng tin</a></li>
							<li><a href="/tro/seenlistPost">Quản lý bài đăng</a></li>
						</c:when>
						<c:otherwise>
							<li><a href="">Đăng Xuất</a></li>
						</c:otherwise>
					</c:choose>
				</ul>
		</div>
		<div id="wrapper" class="container">
			<div class="navbar-inner main-menu">
				<a href="/tro" class="logo pull-left"> 
					<img src="/tro/assets/themes/images/logo 1.png" class="site_logo" alt="">
				</a>
				<nav id="menu" class="pull-right">
					<ul>
						<li><a href="/tro/login.jsp">Cho thuê trọ</a></li>
						<li><a href="">Tìm ng ở ghép</a></li>
					</ul>
				</nav>
			</div>
			
			<div id="searchbar">
				<div class="container">
					<div>
					 <form method="GET" action="/tro/search_post"class="search_form">
						
						
					
				</div>
				<div>
					<select id="search_room_type" name="post_typeid">
						<option value="0">Loại tin</option>
						<c:forEach items="${tyList}" var="tyid">
							<c:choose>
							    <c:when test="${post_typeid==tyid.type_id}">
							        <option value="${tyid.type_id}" selected>${tyid.type_name}</option>
							    </c:when>    
							    <c:otherwise>
							        <option value="${tyid.type_id}">${tyid.type_name}</option>
							    </c:otherwise>
							</c:choose>
						</c:forEach>
					</select> <select id="search_quanhuyen" name="search_quanhuyen">
						<option value="0">Quận huyện</option>
						<c:forEach items="${disList}" var="dis">
							<option value="${dis.district_id}">${dis.district_name}</option>
						</c:forEach>
					</select> <select id="gia" name="gia">
						<option value="0" selected="">Chọn mức giá</option>
						<option value="1">Dưới 1 triệu</option>
						<option value="2">1 triệu - 2 triệu</option>
						<option value="3">2 triệu - 3 triệu</option>
						<option value="4">3 triệu - 5 triệu</option>
						
					</select> <select id="search_dientich" name="dt">
						<option value="0" selected="">Chọn diện tích</option>
						<option value="1">Dưới 20 m2</option>
						<option value="2">20 m2 - 30 m2</option>
						<option value="3">30 m2 - 50 m2</option>
						<option value="4">50 - 60 m2</option>
						<option value="5">60 - 100 m2</option>
						
					</select> <select id="search_city" name="search_city">
						<option value="0">Thành phó</option>
						<c:forEach items="${citiList}" var="city">
							<option value="${city.city_id}">${city.city_name}</option>
						</c:forEach>
					</select>
					<button type="submit" class="btn btn-info">Lọc</button>
					</form>
				</div>
				</div>
			</div>
		</div>
	
</body>
</html>
<style>
#searchbar {
	margin-top: 10px;
}
#user-menu
{
	margin-top: 10px;
}
</style>

