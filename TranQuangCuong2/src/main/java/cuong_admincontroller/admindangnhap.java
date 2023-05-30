package cuong_admincontroller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


import cuong_bo.admindangnhapbo;

/**
 * Servlet implementation class admindangnhap
 */
@WebServlet("/admindangnhap")
public class admindangnhap extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public admindangnhap() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String un=request.getParameter("txtun");
		  String pass=request.getParameter("txtpass");
		  RequestDispatcher rd;
		  if(un!=null&&pass!=null){
			  admindangnhapbo dnbo= new admindangnhapbo();
			  cuong_bean.admindangnhap  dn= dnbo.ktdn(un, pass);
		  if(dn!=null){
			  //Tao ra doi tuong session
			  HttpSession session=request.getSession();
			  session.setAttribute("admin", dn);
			   rd= request.getRequestDispatcher("admin");
			}else //Dang nhap sai
			rd= request.getRequestDispatcher("admindangnhap.jsp?kt=1");
		  } else//Chay lan dau
			  rd= request.getRequestDispatcher("admindangnhap.jsp");
		  
		  rd.forward(request, response);  
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
