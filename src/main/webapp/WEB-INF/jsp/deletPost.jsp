<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page import="com.tro.beans.Post"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Xóa bài đăng</title>
</head>

                          
<body>

<div>
<form role="form" action="/tro/deletPost" method="post" enctype="multipart/form-data">
	<input type="hidden"  name="post_id" value="${post.post_id}">
	 <label for="exampleInputEmail1">Xác nhận xóa bài đăng ${post.post_title}</label>
	 <a href="#" class="btn btn-info">Hủy</a>
	<button type="submit" class="btn btn-info">Xóa</button>
 </form>

</div>
</body>
 

</html>