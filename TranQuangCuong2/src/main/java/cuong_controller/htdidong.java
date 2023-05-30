package cuong_controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import cuong_bean.didongbean;
import cuong_bo.didongbo;
import cuong_bo.loaibo;



/**
 * Servlet implementation class htdidong
 */
@WebServlet("/htdidong")
public class htdidong extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public htdidong() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 loaibo lbo= new loaibo();
		 request.setAttribute("dsloai",lbo.getloai());
		 request.setCharacterEncoding("utf-8");
	     response.setCharacterEncoding("utf-8");
	     String ml=request.getParameter("ml");
	     String key=request.getParameter("txttk");
	     didongbo sbo=new didongbo();
	     ArrayList<didongbean> dsdidong=sbo.getdidong();
	     if(ml!=null)
	    	 dsdidong=sbo.TimMa(ml);
	     else
	    	 if(key!=null)
		    	 dsdidong=sbo.Tim(key);
	     request.setAttribute("dsdidong", dsdidong);
	     RequestDispatcher rd=request.getRequestDispatcher("htdidong.jsp");
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
