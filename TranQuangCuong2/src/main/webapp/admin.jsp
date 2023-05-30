<%@page import="cuong_bean.admindangnhap"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@page import="java.util.ArrayList"%>
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
      <li class="active"><a href="admin">Trang chủ</a></li>
      <li><a href="adminloai">Quản lý loại</a></li>
        <li><a href="admindidong2">Quản lý sách</a></li>
        
        <li><a href="adminxacnhan">Xác nhận</a></li>
    </ul>
    <ul class="nav navbar-nav navbar-right">
      <li><a href="thoat.jsp"><span class="glyphicon glyphicon-user"></span> Logout</a></li>
      <%if(session.getAttribute("admin")==null){ %>
      <li><a href="admindangnhap">
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
<div class="container">
        <div class="row">
            <div class="col-md-3">
                 <div >
                	<c:forEach var="l" items="${dsloai}">
                    	<a href="htdidong?ml=${l.getMaloai()}" class="list-group-item">
			               ${l.getTenloai()}
			     
			            </a>
                      </c:forEach>
                </div>
            </div>


            <div class="col-md-9">
                <div>
                    <div class="row">
                    <c:forEach var="s" items="${dsdidong}">
                    <div class=" col-lg-4 col-md-4" style="height: 420px">
                            <div class="thumbnail">
                                    <img alt="${s.getTendd()}" src="${s.getAnh()}" style="width: 300px; height: 280px;"/>
                                    <div>
                                        <br />
                                        <div >
                                        	<p style="font-weight: bold;font-size: 18px; text-align: center;">
	                                           ${s.getTendd()}
	                                        </p>
                                        </div>
                                        
                                    </div>
                                      <div style="width:100px; margin-left: 80px">
                                      	<a href="giohang?mdd=${s.getMadd()}&tdd=${s.getTendd()}&gia=${s.getGia()}&anh=${	s.getAnh()}">
							              <img src="mua.jpg">
							            </a>
                                      </div>
                                
                            </div>
                        </div>
                       </c:forEach>   
                    </div>

                </div>
            </div>
        </div>
    </div>
  
</body>
</html>
