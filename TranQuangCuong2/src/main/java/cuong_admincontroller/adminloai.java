package cuong_admincontroller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import cuong_bo.loaibo;
import cuong_dao.loaidao;

/**
 * Servlet implementation class adminloai
 */
@WebServlet("/adminloai")
public class adminloai extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public adminloai() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String add =request.getParameter("add");
		 String ml =request.getParameter("ml");
		 String tl =request.getParameter("tl");
		loaibo lbo = new loaibo();
		RequestDispatcher rd=null;
		
		if(ml!=null && tl !=null) {
			System.out.println("HHHHH");
			loaidao ld = new loaidao();
			ld.addloai(ml, tl);
			request.setAttribute("dsl", lbo.getloai());
			rd=request.getRequestDispatcher("adminloaiht.jsp");
		}
		else if(add!=null) {
			 rd=request.getRequestDispatcher("adminloaiadd.jsp");
		}
		else {
			System.out.println("lần đầu");
			// chay lần đầu
			request.setAttribute("dsl", lbo.getloai());
			 rd=request.getRequestDispatcher("adminloaiht.jsp");
		
		}
		 
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
