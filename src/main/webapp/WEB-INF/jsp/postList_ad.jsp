<%-- 
    Document   : prodList_ad
    Created on : Jul 18, 2017, 4:42:40 PM
    Author     : User
--%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<style type="text/css">
    img{
        width: 55%;
        height: auto;
    }
</style>
<aside class="right-side">
    <!-- Main content -->
    <section class="content">

        <div class="row">
            <div class="col-xs-12">
                <div class="panel">
                    <header class="panel-heading">
                        <strong>Danh sách sản phẩm</strong>
                    </header>
                    <!-- <div class="box-header"> -->
                    <!-- <h3 class="box-title">Responsive Hover Table</h3> -->

                    <!-- </div> -->
                    <div class="panel-body table-responsive">
                        <div class="box-tools m-b-15">
                            <div class="input-group">
                                <form action="/e-shopper/admin/searchProd" method="post">
                                    <input type="text" name="searchProd" class="form-control input-sm pull-left" style="width: 150px;" placeholder="Search product"/>
                                    <div class="input-group-btn">
                                        <button class="btn btn-sm btn-default" type="submit"><i class="fa fa-search"></i></button>
                                    </div>
                                </form>
                            </div>
                        </div>

                        <table class="table table-hover">
                            <tr>
                                <th>STT</th>
                                <th>Hình sản phẩm</th>
                                <th>Tên sản phẩm</th>
                                <th>Giá</th>
                                <th>Số lượng còn</th>
                                <th></th>
                                <th></th>
                            </tr>
                            <%
                                int i = 1;
                            %>
                            <c:forEach items="${proList}" var="prod" >
                                <tr>
                                    <td><%
                                        out.print(i++);
                                        %></td>
                                    <td><a href="productDetail?id=${prod.pro_id}">
                                            <img alt="" src="${prod.pro_img_link}">
                                        </a>
                                    </td>
                                    <td>${prod.pro_name}</td>
                                    <td><strong></strong>${prod.pro_price} VND</td>
                                    <td>${prod.pro_stock}</td>
                                    <td> <a href="/e-shopper/admin/editProd?pro_id=${prod.pro_id}" data-toggle="modal" class="btn btn-xs btn-warning" >
                                            Sửa
                                        </a>
                                    </td>
                                    <td>
                                        <a href="/e-shopper/admin/deleteProd?pro_id=${prod.pro_id}" data-toggle="modal" class="btn btn-xs btn-danger">
                                            Xóa
                                        </a>
                                    </td>
                                </tr>
                            </c:forEach>
                        </table>
                    </div><!-- /.box-body -->
                </div><!-- /.box -->
            </div>
        </div>

    </section>
</aside>

