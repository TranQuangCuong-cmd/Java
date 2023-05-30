<%@page import="cuong_bean.khachhangbean"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@page import="cuong_bean.didongbean"%>
<%@page import="java.util.ArrayList"%>
<%@page import="cuong_bean.loaibean"%>
<%@page import="cuong_bo.didongbo"%>
<%@page import="cuong_bo.loaibo"%>
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
         <li class="nav-item">
          <a class="nav-link" href="#"> <i class="bi bi-geo-alt-fill"></i> Cửa hàng gần bạn</a>
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



<!-- Container -->
<div class="container text-center" >
  <!-- button loại di động -->


<!-- Ảnh động(sile)  -->
  <div class="row">
    <div class="col-sm-2">
    	<div style="border: 2px solid;border-radius: 10px">
            <c:forEach var="l" items="${dsloai}">
                <a style="padding-bottom: 10px" href="htdidong?ml=${l.getMaloai()}" class="list-group-item">
			        ${l.getTenloai()}
			    </a>
            </c:forEach>
       </div>	
    </div>
    <div class="col-sm-7">
    	<div id="carouselExampleSlidesOnly" class="carousel slide" data-bs-ride="carousel">
		  <div class="carousel-inner">
		    <div class="carousel-item active">
		      <img src="anhdohoa/1.jpg" class="d-block w-100" alt="...">
		    </div>
		    <div class="carousel-item">
		      <img src="anhdohoa/2.jpg" class="d-block w-100" alt="...">
		    </div>
		    <div class="carousel-item">
		      <img src="anhdohoa/3.jpg" class="d-block w-100" alt="...">
		    </div>
		    <div class="carousel-item">
		      <img src="anhdohoa/4.jpg" class="d-block w-100" alt="...">
		    </div>
		    <div class="carousel-item">
		      <img src="anhdohoa/5.jpg" class="d-block w-100" alt="...">
		    </div>
		    <div class="carousel-item">
		      <img src="anhdohoa/6.jpg" class="d-block w-100" alt="...">
		    </div>
	  	</div>
	 </div>
    </div>
    <div class="col-sm-3">
    	<div class="row row-cols-1">
		    <div class="col">
		    	<img style ="border-radius: 10px;margin-bottom: 10px;" class="d-block w-100"  src="anhdohoa/11.jpg">
		    </div>
		    <div class="col"><img style ="border-radius: 10px;" class="d-block w-100"  src="anhdohoa/22.jpg"></div>
		  </div>
    </div>
  </div>
  
  
  <div style="padding-top: 20px" >
	<div style = "display: flex;justify-content: space-evenly;">
					<button class="btn btn-warning" >Điện Thoại Nổi Bật Nhất</button>
                	<c:forEach var="l" items="${dsloai}">
                    	<a href="htdidong?ml=${l.getMaloai()}" class="btn btn-outline-info">
			               ${l.getTenloai()}
			            </a>
                      </c:forEach>
    </div> 
</div>
  
  <div class="row row-cols-4" style="padding-top: 30px ;width: 96%;padding-left: 30px ;">
  	<%int i=10; %>
  	<c:forEach var="s" items="${dsdidong}">
    <div class="col " style="height:520px ;">
      <div class="" style="border-radius: 10px;box-shadow: 2px 2px 4px 4px #888888;">
      <div style ="padding: 12px 0 10px 0">
    		<img alt="${s.getTendd()}" src="${s.getAnh()}" style="width: 260px; height: 230px;"/>
    	</div>
                      <div >
                          <p style="font-weight: bold;font-size: 18px; text-align: center;">
	                          ${s.getTendd()}
	                      </p>
                	 </div>
                       <div style="padding-bottom: 10px" >
                            <button style="font-size: 18px; text-align: center;width: 60%; "class="btn btn-info">
	                           Giá: ${s.getGia()}
	                        </button>
                       </div> 
                  <div >
                      <div style="width:100%;padding-bottom: 10px;">
                           <a  href="giohang?mdd=${s.getMadd()}&tdd=${s.getTendd()}&gia=${s.getGia()}&anh=${	s.getAnh()}">
							<img style="font-size: 30px" src="mua.jpg">
							</a>
					  </div>
					  
					  <div style="padding-bottom: 15px" class="row row-cols-2">
    						<div class="col" style="color: red">
    							<i class="bi bi-star-fill"></i>
						  		<i class="bi bi-star-fill"></i>
						  		<i class="bi bi-star-fill"></i>
						  		<i class="bi bi-star-fill"></i>
						  		<i class="bi bi-star-half"></i>
    						</div>
    						<div class="col"><p><%=i++%> <i style="color: red" class="bi bi-star-fill"></i> Revies</p></div>
  					</div>
				</div>
	  </div>			
	</div>
	</c:forEach>
    </div>
  </div>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-kenU1KFdBIe4zVF0s0G1M5b4hcpxyD9F7jL+jjXkk+Q2h455rYXK/7HAuoJl+0I4" crossorigin="anonymous"></script>
</body>
</html>
