<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
  <title>Đăng nhập</title>
  <meta charset="utf-8">
  <link href="css/sanpham.css" rel="stylesheet" type="text/css" media="all" />
 
  	
 
</head>
<body>


  
  <form action="/tro/login" id="form_login"  method="post" modelAttribute="login"> 

<span>${errors}</span>
  <div class="container" style="margin-top: 50px;">
            <div class="row" style="border: 1px darkgrey solid; border-radius: 10px;width: 50%; margin: 0 auto; padding: 20px;" >
                <div class="col-sm-12">
                <h3>Đăng nhập</h3>
                <div class="form-group">
    <label for="email"><b>Tên đăng nhập:</b></label>
    <input type="text" placeholder=""  name="email">
</div>
 <div class="form-group">
    <label for="pass"><b>Password:</b></label>
    <input type="password" placeholder="" name="pass">
</div>
    <button type="submit" class="signinbtn">Đăng nhập</button>
    <label>
      <input type="checkbox" checked="checked" name="remember"> Nhớ mật khẩu
    </label>
  </div>

  <div class="container" style="background-color:#f1f1f1">
    <button type="button" class="cancelbtn">Hủy</button>
    <span class="psw">Quên <a href="#">mật khẩu</a></span>
  </div>
  </div>
  
  
</form>

</body>
</html>
