
<%@page import="cuong_bean.admindangnhap"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<%@page import="java.util.ArrayList"%>

<%@page import="cuong_bo.loaibo"%>
<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
  <title>Bootstrap Example</title>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.0/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
</head>
<body>
<nav class="navbar navbar-inverse">
  <div class="container-fluid">
    
    <ul class="nav navbar-nav">
      <li class="active"><a href="adminController">Trang chủ</a></li>
      <li><a href="adminloai">Quản lý loại</a></li>
        <li><a href="adimdidong2?dss=1">Quản lý sách</a></li>
        <li><a href="adminxacnhan">Xác nhận</a></li>
    </ul>
    <ul class="nav navbar-nav navbar-right">
      <li><a href="thoat.jsp"><span class="glyphicon glyphicon-user"></span> Logout</a></li>
      <%if(session.getAttribute("admin")==null){ %>
      <li><a href="dangnhapadminController">
      <span class="glyphicon glyphicon-log-in"></span> 
      		Login
      </a></li>
      <%}else{ %>
      <li><a href="#">
      <span class="glyphicon glyphicon-log-in"></span> 
      		Hi: <%admindangnhap kh =
      		(admindangnhap)session.getAttribute("admin");
      		    out.print(kh.getTenDangNhap());
      		%>
      </a></li>
      <%} %>
    </ul>
  </div>
</nav>
<div style="padding-left: 40px;padding-right: 40px">
	<table class="table table-hover">
      <tr>
      		<td> <h3>Mã Di Động</h3></td>
      		<td> <h3>Tên di động</h3>	</td>
      		<td> <h3>Số Lượng</h3>	</td>
      		<td> <h3>Giá</h3>	</td>
      		<td> <h3>Mã Loại</h3>	</td>
      		<td> <h3>Ảnh </h3>	</td>
      		<td> <h3>Ngày Nhập</h3>	</td>
      		<td> <h3>xuất xứ</h3>	</td>
      </tr>
<button style ="font-size: 30px; text-align: center;align-items: center;"><a href="admindidong2?add=1">Thêm sách</a></button>


	   <c:forEach var="t"  items="${dssach}">
		   	<tr>
		   	
		   	<td> ${t.getMadd()}	</td>
		    <td> ${t.getTendd()}	</td>
		    <td> ${t.getSoluong()}	</td>
		    <td> ${t.getGia()}	</td>
		    <td> ${t.getMaloai()}	</td>
		    <td>  <img  src="${t.getAnh()}" style="width: 130px; height: 180px;"/>	</td>
		    <td> ${t.getNgaynhap()}	</td>
		    <td> ${t.getXuatxu()}	</td>
		   	</tr>
			 </c:forEach>
			  
    </table>
</div>
  
</body>
</html>
