<%@page import="cuong_bean.khachhangbean"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
  <title>Bootstrap Example</title>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-rbsA2VBKQhggwzxH7pPCaAqO46MgnOM80zW1RWuH61DGLwZJEdK2Kadq2F9CUG65" crossorigin="anonymous">
  <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap-icons@1.10.2/font/bootstrap-icons.css">

</head>
<body>
<nav class="navbar navbar-light" style="background-color: #e3f2fd;">
  <!-- Header -->
  <nav class="navbar navbar-expand-lg navbar-light bg-light" style ="width: 100%">
  <div class="container-fluid">
    <div class="collapse navbar-collapse" id="navbarSupportedContent">
      <ul class="navbar-nav me-auto mb-2 mb-lg-0">
        <li class="nav-item">
          <a class="nav-link active" aria-current="page" href="htdidong"><i class="bi bi-house-check-fill"></i> Trang Chủ</a>
        </li>
        <li class="nav-item">
          <a class="nav-link" href="htgio"><i class="bi bi-cart3"></i> Giỏ Hàng</a>
        </li>
        <li class="nav-item">
          <a class="nav-link" href="danggiaohang"><i class="bi bi-car-front-fill"></i> Đang Giao Hàng</a>
        </li>
        <li class="nav-item">
          <a class="nav-link" href="lichsugiaohang"><i class="bi bi-calendar2-day-fill"></i> Lịch sử mua hàng</a>
        </li>
        <li class="nav-item">
          <a class="nav-link" href="#"><i class="bi bi-telephone-plus"></i> Phone :1800 1901</a>
        </li>
      </ul>
      <form class="d-flex " action="htdidong" method="post">
       	<input class="form-control me-2"  name="txttk" type="text" value="" placeholder="Nhập sản phẩm cần tìm"> <br>
		  		
        <input class="btn btn-outline-success"  name="butt" type="submit" value="Search">
      </form>
      <ul class="d-flex navbar-nav  mb-2 mb-lg-0" style="padding-left: 30px">
	      <li class="nav-item" style="float: right;"><a  class="nav-link active" aria-current="page"  href="thoat.jsp">  Logout</a></li>
	      <%if(session.getAttribute("dn")==null){ %>
	      <li class="nav-item" style="float: right;"><a class="nav-link active" aria-current="page" href="ktdn">
	      		Login
	      </a></li>
	      <%}else{ %>
	      <li><a class="nav-link active" aria-current="page" href="#">
	      	Hi: <%=((khachhangbean)session.getAttribute("dn")).getHoten() %>
	      </a></li>
	      <%} %>	
	    </ul>

    </div>
  </div>
</nav>
</nav>

<div style="padding-top: 15px">
<table  class="table table-dark table-striped">
      <tr>
      		<td>Ngày mua</td>
      		<td>Mã sách	</td>
      		<td>Tên sách</td>
			<td>Số lượng mua</td>
			<td>Giá</td>
			<td>Thành tiền	</td>
      </tr>
	   <c:forEach var="t"  items="${ls}">
		   	<tr>
		   	
		   	<td> ${t.getNgayMua()}	</td>
		   	<td> ${t.getMadd()}	</td>
		   	<td> ${t.getTendd()}	</td>
		   	<td> ${t.getSoLuongMua()}	</td>
		   	<td> ${t.getGia()}	</td>
		   	<td> ${t.getThanhtien()}	</td>
		   	</tr>
			 </c:forEach>
			  
    </table>
</div>	
</body>
</html>