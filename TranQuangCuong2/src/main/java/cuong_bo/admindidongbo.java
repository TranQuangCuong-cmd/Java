package cuong_bo;

import java.util.ArrayList;

import cuong_bean.admindidongbean;
import cuong_dao.admindidongdao;

public class admindidongbo {
	admindidongdao sdao= new admindidongdao();
	   ArrayList<admindidongbean> ds;
	   public ArrayList<admindidongbean> getsach(){
		   ds=sdao.getsach();
		   return ds;
	   }
	   public  Boolean adddidong(String madd, String tendd, int soluong, int gia, String maloai, String anh, String ngaynhap,String xuatxu){
		   return  sdao.adddidong(madd, tendd, soluong, gia, maloai, anh, ngaynhap, xuatxu);
	   }
}
