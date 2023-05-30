package cuong_bo;

import cuong_bean.admindangnhap;
import cuong_dao.admindangnhapdao;

public class admindangnhapbo {
	 admindangnhapdao dndao=new admindangnhapdao();
	   public admindangnhap ktdn(String tendn, String pass) {
		   return dndao.ktdn(tendn, pass);
	   }
}
