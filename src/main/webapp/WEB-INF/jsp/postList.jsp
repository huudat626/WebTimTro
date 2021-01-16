
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<section class="main-content">
	<c:forEach items="${thongbao}" var="tb">
     	<p>${tb}</p>
     </c:forEach>	
    <div class="row">						
        <div class="span9">								
            <ul class="thumbnails listing-posts">
                <c:forEach items="${posList}" var="post" end="9" begin="0">
                    <li class="span3">
                    <div class="post-box">												
                        <a href="postDetail?id=${post.post_id}"><img alt="" src="${post.post_images}"></a><br/>
                        <a href="postDetail?id=${post.post_id}" class="title">${post.post_title}</a><br/>
                       
                    </div>
                </li>
                </c:forEach>
                
            </ul>								
            <hr>
        </div>
       
    </div>
</section>