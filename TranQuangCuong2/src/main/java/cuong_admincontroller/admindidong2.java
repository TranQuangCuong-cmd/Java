package cuong_admincontroller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import cuong_dao.admindidongdao;

/**
 * Servlet implementation class admindidong2
 */
@WebServlet("/admindidong2")
public class admindidong2 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public admindidong2() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String dss =request.getParameter("dss");
		RequestDispatcher rd=null;
		if(dss== null) {
		rd=request.getRequestDispatcher("admindidongadd.jsp");
		
		}
		else {
			admindidongdao ad = new admindidongdao();
			rd=request.getRequestDispatcher("admindidonght.jsp");
			request.setAttribute("dssach", ad.getsach());
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
