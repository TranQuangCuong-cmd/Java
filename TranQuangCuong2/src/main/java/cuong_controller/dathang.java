package cuong_controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import cuong_bean.khachhangbean;
import cuong_bo.giohangbo;
import cuong_dao.hoadondao;

/**
 * Servlet implementation class dathang
 */
@WebServlet("/dathang")
public class dathang extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public dathang() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession();
		khachhangbean kh= (khachhangbean)session.getAttribute("dn");
		if(kh==null)
			response.sendRedirect("ktdn");
		else {
			hoadondao hdbo= new hoadondao();
			giohangbo gh=(giohangbo)session.getAttribute("gio");
			//Tao ra 1 hoa don
			hdbo.taohoadon(gh.ds , kh.getMakh());
			response.sendRedirect("danggiaohang");
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
