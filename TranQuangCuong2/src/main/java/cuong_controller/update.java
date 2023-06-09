package cuong_controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import cuong_bo.giohangbo;

/**
 * Servlet implementation class update
 */
@WebServlet("/update")
public class update extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public update() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String madd=request.getParameter("btnUpdate");	
		String sl=request.getParameter("soluong"+madd);				// sl đang là string
		String delete = request.getParameter("btnDalete");
		String clear= request.getParameter("deleteall");
		HttpSession session = request.getSession();
		//out.print(n+":"+masach);
   		//tao biến session
		giohangbo gh;
		// bước 1:
		gh=(giohangbo) session.getAttribute("gio");
		//b2: Thao tac trên bien: gh
		if (sl!=null && madd!=null){		
			long nn=Long.parseLong(sl); // số lượng là kiểu long, Long là kiểu .parselong là đổi sl String về long
			// cập nhật số lương
			gh.UpdateSl(madd,(long) nn);	
		}
		if (delete!=null){					
			gh.xoa1pt(delete);
		}
		// bước 3
		//đưa vào ass
		session.setAttribute("gio", gh);
		if (clear!=null){					// 
			session.removeAttribute("gio");	// 
		}
		
		
		//Hien thi gio
		response.sendRedirect("htgio");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
