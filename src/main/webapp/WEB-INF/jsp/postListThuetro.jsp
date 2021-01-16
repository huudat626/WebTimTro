<%-- 
    Document   : productList
    Created on : Jul 6, 2017, 8:40:56 PM
    Author     : User
--%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<section class="main-content">

    <div class="row">						
        <div class="span9">								
            <ul class="thumbnails listing-products">
                <c:forEach items="${proListMan}" var="prod" >

                    <li class="span3">
                    <div class="product-box">												
                        <a href="productDetail?id=${prod.pro_id}"><img alt="" src="${prod.pro_img_link}"></a><br/>
                        <a href="productDetail?id=${prod.pro_id}" class="title">${prod.pro_name}</a><br/>
                        <p class="price">${prod.pro_price} VND</p>
                    </div>
                </li>
                }
                </c:forEach>
                
            </ul>								
            <hr>
            
        </div>
        <div class="span3 col">
            
            <div class="block">
                <h4 class="title">
                    <span class="pull-left"><span class="text">Gợi ý</span></span>
                    <span class="pull-right">
                        <a class="left button" href="#myCarousel" data-slide="prev"></a><a class="right button" href="#myCarousel" data-slide="next"></a>
                    </span>
                </h4>
                <div id="myCarousel" class="carousel slide">
                    <div class="carousel-inner">
                        <div class="active item">
                            <ul class="thumbnails listing-products">
                                <li class="span3">
                                    <div class="product-box">
                                        <span class="sale_tag"></span>												
                                        <img alt="" src="/e-shopper/assets/themes/images/ladies/1.jpg"><br/>
                                        <a href="productDetail.html" class="title">Áo công sở</a><br/>
                                        <a href="#" class="category">Công sở</a>
                                        <p class="price">260000 VND</p>
                                    </div>
                                </li>
                            </ul>
                        </div>
                        <div class="item">
                            <ul class="thumbnails listing-products">
                                <li class="span3">
                                    <div class="product-box">												
                                        <img alt="" src="/e-shopper/assets/themes/images/ladies/2.jpg"><br/>
                                        <a href="productDetail.html" class="title">Tempor sem sodales</a><br/>
                                        <a href="#" class="category">Urna nec lectus mollis</a>
                                        <p class="price">$134</p>
                                    </div>
                                </li>
                            </ul>
                        </div>
                    </div>
                </div>
            </div>
            <div class="block">								
                <h4 class="title"><strong>Sản phẩm bán chạy nhất</strong></h4>								
                <ul class="small-product">
                    <li>
                        <a href="#" title="Praesent tempor sem sodales">
                            <img src="/e-shopper/assets/themes/images/ladies/3.jpg" alt="Praesent tempor sem sodales">
                        </a>
                        <a href="#">Váy công sở</a>
                    </li>
                    <li>
                        <a href="#" title="Luctus quam ultrices rutrum">
                            <img src="/e-shopper/assets/themes/images/ladies/4.jpg" alt="Luctus quam ultrices rutrum">
                        </a>
                        <a href="#">Váy đi chơi</a>
                    </li>
                    <li>
                        <a href="#" title="Fusce id molestie massa">
                            <img src="/e-shopper/assets/themes/images/ladies/5.jpg" alt="Fusce id molestie massa">
                        </a>
                        <a href="#">Váy nữ thời trang</a>
                    </li>   
                </ul>
            </div>
        </div>
    </div>
</section>