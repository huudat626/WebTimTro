
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page import="com.tro.beans.Post"%>
<section class="main-content">				
    <div class="row">						
        <div class="span9">
            <div class="row">
                <div class="span4">
                    <a href="${post.post_images}" class="thumbnail" data-fancybox-group="group1" title="Description 1"><img alt="" src="${post.post_images}"></a>												
                    <ul class="thumbnails small">								
                        <li class="span1">
                            <a href="/tro/assets/themes/images/ladies/2.jpg" class="thumbnail" data-fancybox-group="group1" title="Description 2"><img src="/tro/assets/themes/images/ladies/2.jpg" alt=""></a>
                        </li>								
                        <li class="span1">
                            <a href="/tro/assets/themes/images/ladies/3.jpg" class="thumbnail" data-fancybox-group="group1" title="Description 3"><img src="/tro/assets/themes/images/ladies/3.jpg" alt=""></a>
                        </li>													
                        <li class="span1">
                            <a href="/tro/assets/themes/images/ladies/4.jpg" class="thumbnail" data-fancybox-group="group1" title="Description 4"><img src="/tro/assets/themes/images/ladies/4.jpg" alt=""></a>
                        </li>
                        <li class="span1">
                            <a href="/tro/assets/themes/images/ladies/5.jpg" class="thumbnail" data-fancybox-group="group1" title="Description 5"><img src="/tro/assets/themes/images/ladies/5.jpg" alt=""></a>
                        </li>
                    </ul>
                </div>
                <div class="span5">
               
                    <address>
                        <strong>Mã Tin:</strong> <span>${post.post_id}</span><br>
                        <strong>Tên:</strong> <span style ="color:red">${post.post_title}</span><br>
                        <strong>Địa chỉ</strong> <span style ="color:red">${post.post_address}</span><br>	
                         <strong>Diện tích</strong> <span style ="color:red">${post.post_area}</span><br>
                         <strong>Giá</strong> <span style ="color:red">${post.post_price}</span><br>
                         <strong>Liên hệ</strong> <span style ="color:red">${ac.phone_number}</span><br>						
                    </address>									
                   
                </div>
               
                    
                </div>							
            </div>
            <div class="row">
                <div class="span9">
                    <ul class="nav nav-tabs" id="myTab">
                        <li class="active"><a href="#home">Mô Tả</a></li>
                      
                    </ul>							 
                    <div class="tab-content">
                        <div class="tab-pane active" id="home">${post.post_description}</div>
                       
                            
                        </div>
                         <ul class="nav nav-tabs" id="myTab">
                        <li class="active"><a href="#home">Map</a></li>
                      
                    </ul>							 
                    <div class="tab-content">
                        <div class="tab-pane active" id="home"><img alt="" src="${post.post_map}"></div>
                       <div id="map" style="width:500px;height:500px;"><map name=""></map>"${post.post_map}</div>
                            
                        </div>
                    </div>							
                </div>						
                
        </div>
       
        </div>
   
</section>			

<script>
    $(function () {
        $('#myTab a:first').tab('show');
        $('#myTab a').click(function (e) {
            e.preventDefault();
            $(this).tab('show');
        })
    })
    $(document).ready(function () {
        $('.thumbnail').fancybox({
            openEffect: 'none',
            closeEffect: 'none'
        });

        $('#myCarousel-2').carousel({
            interval: 2500
        });
    });
</script>
