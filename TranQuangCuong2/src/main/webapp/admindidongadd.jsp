<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>Insert title here</title>
<meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
</head>
<style>
	.container{
		padding-top: 50px;
		padding-left: 300px;
	}
	.test{
		padding-top: 10px;
		font-size: 20px;
		
	}
	.input{
		font-size: 25px
	}
</style>
<body>
	<!-- enctype= "multipart/form-data" -->
	<form method="post" action="admindidong1" enctype= "multipart/form-data">
	<div class="container">
	<div>
		<div class="test"> Mã Di Động:</div>
		<div class ="input"> <input type="text" name="mdd" value=""> </div>
	</div>
	<div>
		<div class="test">Tên Di Động:</div>
		<div class ="input"><input type="text" name="tdd" value=""></div>
	</div>
	<div>
		<div class="test">Số lượng:</div>
		<div class ="input"><input type="text" name="sl" value=""></div>
	</div>
  	<div>
		<div class="test">Giá:</div>
		<div class ="input"><input type="text" name="g" value=""></div>
	</div>
	<div>
		<div class="test">Mã loại:</div>
		<div class ="input"><input type="text" name="ml" value=""></div>
	</div>
  	<div>
		<div class="test">Ngày Nhập:</div>
		<div class ="input"><input type="date" name="nn" value=""></div>
	</div>
  	<div>
		<div class="test">Xuất Xứ:</div>
		<div class ="input"><input type="text" name="xx" value=""></div>
	</div>
  	<div>
		<div class="test">Thêm Ảnh:</div>
		<div><input type="file" name="txtfile"></div>
	</div>
  	<div class="test">	<input type="submit" name="add"> </div>
  
  	</div>
  </form> 
</body>
</html>