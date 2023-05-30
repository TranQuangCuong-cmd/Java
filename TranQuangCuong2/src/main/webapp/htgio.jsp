<%@page import="cuong_bean.khachhangbean"%>
<%@page import="cuong_bean.giohangbean"%>
<%@page import="cuong_bo.giohangbo"%>
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

<table width ="1200" align="center">
   <tr>
     <td width ="160" valign="top">
       <table class="table table-hover">
         <%
         ArrayList<loaibean> dsloai = (ArrayList<loaibean>)request.getAttribute("dsloai");
        
         for(loaibean l: dsloai){ %>
         <tr><td>
         <a href="htdidong?ml=<%=l.getMaloai()%>">
               <%=l.getTenloai() %>
         </a>
           </td>
           </tr>
           <%} %>
       
       </table>
     </td>
      <td width ="790" valign="top">
      
      <form action="update">
      <table class="table table-hover">
      <tr>
      		<td>Check	</td>
      		<td>Mã di động	</td>
			<td>Tên sách</td>
			<td>Giá sách 	</td>
			<td>Số lượng	</td>
			<td>Thành tiền	</td>
      </tr>
	    <%
	   giohangbo gh;
	   gh = (giohangbo)session.getAttribute("gio");
	    // ở đây đã hoàn thành bước 1 là lấy dữ liệu ra nên tới bước 2
	   if(gh!=null){
		   for(giohangbean h: gh.ds){%>
		   	<tr>
		   	<td>
		   		<input type="checkbox" name="check" value="<%=h.getMadd() %>" form="clickme">
		   	</td>
		   	<td> <%=h.getMadd() %></td>
		   	<td> <%=h.getTendd() %> 	</td>
		   	<td> <%=h.getGia() %> 	</td>
		   	<td>	<input type="number" min="0" name="soluong<%=h.getMadd()%>" value=<%=h.getSoluong()%> style = "width: 50px";>  
			   		<button class="btn btn-outline-info" name="btnUpdate" value=<%=h.getMadd() %> type="submit" > 
			   			Update
			   		</button>
			</td>
		   	<td> 	<%=h.getThanhtien() %> 	</td>
		   	<td>	<button class="btn btn-outline-danger" name="btnDalete" value=<%=h.getMadd() %>  type="submit" >	
			   			Delete
			   		</button> 
		   	</td>
		   	</tr>
			 
			  
		<%   }
	   }
%>
    </table>
     
    <button class="btn btn-warning" style="padding-left: 15px" name="deleteall" value=""  type="submit" >	
			   			Xóa Tất Cả
	</button>
	</form>
	<form action="xoacheck" id="clickme">
	 <button class="btn btn-danger" style="margin-top: 20px;padding-left: 15px" name="deleteclick" value=""  type="submit" >	
			   			Xóa mục chọn
	</button> 
   </form>
  	<h1 style="padding-left: 15px">Tổng tiền:  <%	if(gh!=null){
  		 					out.print(gh.Tongtien());
  						}
					  	else{
					  		out.print("0");	
					  	}
  					%>
  	</h1>	
  		<form action="dathang">
  	 <button class="btn btn-success" style="margin-top: 20px ; font-size: 30px; margin-left: 120px; border-radius: 10px" name="but1" value=""  type="submit" >	
			   			Xác Nhận Đặt Hàng
	</button> 
	</form>
	<td width ="350" valign="top">
	    <div class="row row-cols-1">
		    <div class="col">
		    	<img style ="border-radius: 10px;margin-bottom: 10px;width: 100%" class="d-block w-100"  src="anhdohoa/11.jpg">
		    </div>
		    <div class="col"><img style ="border-radius: 10px;" class="d-block w-100"  src="anhdohoa/22.jpg"></div>
		    
		    <div class="col"><img style ="border-radius: 10px;" class="d-block w-100"  src="anhdohoa/33.jpg"></div>
		  </div>
    </div>
    </td>
   </tr>
</table>
</body>
</html>

