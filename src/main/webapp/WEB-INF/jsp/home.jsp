<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<section class="menutop">
<section class="header_text">
</section>
</section>
<section class="main-content">
    <div class="row">
        <div class="span12">								
            <ul class="thumbnails listing-posts">
                <c:forEach items="${posList}" var="Post" end="12" begin="0">
                    <li class="span3">
                        <div class="post-box">												
                            <a href="postDetail?id=${Post.post_id}"><img alt="" src="${Post.post_images}"></a><br/>
                            <a href="postDetail?id=${Post.post_id}" class="title">${Post.post_title}</a><br/>
                            
                        </div>
                    </li>
                </c:forEach>

            </ul>								
            <hr>
        </div>
        
    </div>
</section>



