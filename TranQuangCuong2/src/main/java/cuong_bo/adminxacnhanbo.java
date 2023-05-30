package cuong_bo;

import java.util.ArrayList;

import cuong_bean.adminxacnhanbean;
import cuong_dao.adminxacnhandao;


public class adminxacnhanbo {
	adminxacnhandao xndao=new adminxacnhandao();
	  public ArrayList<adminxacnhanbean> getdanhsach(){
		  return xndao.getdanhsach();
	  }
}
