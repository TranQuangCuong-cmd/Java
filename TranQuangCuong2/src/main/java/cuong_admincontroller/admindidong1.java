package cuong_admincontroller;

import java.io.File;
import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.FileUploadException;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;

import cuong_dao.admindidongdao;


/**
 * Servlet implementation class admindidong1
 */
@WebServlet("/admindidong1")
public class admindidong1 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public admindidong1() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		response.setCharacterEncoding("utf-8");
		
		DiskFileItemFactory factory = new DiskFileItemFactory();
		 DiskFileItemFactory fileItemFactory = new DiskFileItemFactory();
		 ServletFileUpload upload = new ServletFileUpload(fileItemFactory);
		 String dirUrl1 = request.getServletContext().getRealPath("") +  File.separator + "image_didong";
		// response.getWriter().println(dirUrl1);
		 String mdd = null, tdd = null,sl= null,gia= null,date= null,ml= null, xx=null ,edit=null, old_img =null, add= "";
		 String name = null;
		 RequestDispatcher rd = null ;
		 
		try {
				List<FileItem> fileItems = upload.parseRequest(request);//Lấy về các đối tượng gửi lên
				//duyệt qua các đối tượng gửi lên từ client gồm file và các control
					for (FileItem fileItem : fileItems) {
			 			 if (!fileItem.isFormField()) {//Nếu ko phải các control=>upfile lên
							// xử lý file
							String nameimg = fileItem.getName();
							System.out.println("Tên ở đây: "+nameimg);
							name = nameimg;
							if (!nameimg.equals("")) {
						           //Lấy đường dẫn hiện tại, chủ ý xử lý trên dirUrl để có đường dẫn đúng
								String dirUrl = request.getServletContext().getRealPath("") +  File.separator + "image_didong";
								File dir = new File(dirUrl);
								if (!dir.exists()) {//nếu ko có thư mục thì tạo ra
									dir.mkdir();
								}
							           String fileImg = dirUrl + File.separator + nameimg;
							           
							           File file = new File(fileImg);//tạo file
							            try {
							               fileItem.write(file);//lưu file
							              System.out.println("UPLOAD THÀNH CÔNG...!");
							              System.out.println("Đường dẫn lưu file là: "+dirUrl);
							 } catch (Exception e) {
							    e.printStackTrace();
							}
						}
					 }
						else//Neu la control
						{
							String tentk=fileItem.getFieldName();
							if(tentk.equals("mdd"))
								 mdd = fileItem.getString();
							if(tentk.equals("tdd"))
								 tdd = fileItem.getString("UTF-8");
							if(tentk.equals("g"))
								 gia = fileItem.getString();
							if(tentk.equals("sl"))
								 sl = fileItem.getString();
							if(tentk.equals("nn"))
								 date = fileItem.getString();
							if(tentk.equals("xx"))
								 xx = fileItem.getString();
							if(tentk.equals("ml"))
								 ml = fileItem.getString();
							if(tentk.equals("edit"))
								 edit = fileItem.getString();
							if(tentk.equals("add"))
								 add = fileItem.getString();
						}
			 			
					}
					System.out.println("---------------------");
					System.out.println("mdd: "+mdd);
					System.out.println("tendd: "+tdd);
					System.out.println("gia: "+gia);
					System.out.println("sl: "+sl);
					System.out.println("date: "+date);
					System.out.println("xx: "+xx);
					System.out.println("ml: "+ml);
					System.out.println("edit: "+edit);
					System.out.println("---------------------");
					admindidongdao sd = new admindidongdao();
					
					if(add !=null) {
						if(sd.adddidong(mdd, tdd, Integer.parseInt(sl), Integer.parseInt(gia), ml,  "image_didong/"+name, date, xx)) {
							System.out.println("them thanhcong");
						}
					}
					if(edit!=null ){
						//Chỉnh sửa sách
						System.out.println("sửa sách");
							//Xóa ảnh của sách cũ trước
						String dirUrl = request.getServletContext().getRealPath("") +  File.separator + old_img;
						File dir = new File(dirUrl);
						dir.delete();

		 				response.sendRedirect("admindidong2?dss=1");
					}
					else if(mdd!=null && tdd !=null && sl!=null && gia!=null) {
						// Thêm sách
						System.out.println("Thêm sách");
						sd.adddidong(mdd, tdd, Integer.parseInt(sl), Integer.parseInt(gia), ml,date, "image_didong/"+name,xx );
		 				
		 				response.sendRedirect("admindidong2?dss=1");
		 			}
		 			else {
		 				response.sendRedirect("admindidong2?add=1");
		 			}
			
	 			
	 			
	 			
		} catch (FileUploadException e) {
			e.printStackTrace();
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
