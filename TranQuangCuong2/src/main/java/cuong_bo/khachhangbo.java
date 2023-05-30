package cuong_bo;

import cuong_bean.khachhangbean;
import cuong_dao.khachhangdao;

public class khachhangbo {
	khachhangdao khdao= new khachhangdao();
	   public khachhangbean ktdn(String tendn, String pass) {
		   return khdao.ktdn(tendn, pass);
	   }
}
