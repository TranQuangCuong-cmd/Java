package cuong_bo;

import java.util.ArrayList;

import cuong_bean.loaibean;
import cuong_dao.loaidao;

public class loaibo {
	loaidao ldao = new loaidao();
	ArrayList<loaibean> ds;
	public ArrayList<loaibean> getloai(){
		ds=ldao.getloai();
    	return ds;
	}
}
