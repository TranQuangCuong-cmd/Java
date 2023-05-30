package cuong_bo;

import java.util.ArrayList;
import cuong_bean.didongbean;
import cuong_dao.didongdao;


public class didongbo {
	didongdao dddao = new didongdao();
	ArrayList <didongbean> ds;
	public ArrayList<didongbean> getdidong(){
		ds = dddao.getdidong();
		return ds;
	}
	public ArrayList<didongbean> TimMa(String maloai){
		   ArrayList<didongbean> tam= new ArrayList<didongbean>();
		  for(didongbean s: ds)
			  if(s.getMaloai().equals(maloai))
				  tam.add(s);
		  return tam;
	   }
	   public ArrayList<didongbean> Tim(String key){
		   ArrayList<didongbean> tam= new ArrayList<didongbean>();
		  for(didongbean s: ds)
			  if(s.getTendd().toLowerCase().contains(key.toLowerCase())||
			    s.getXuatxu().toLowerCase().contains(key.toLowerCase())||
			    s.getMaloai().toLowerCase().contains(key.toLowerCase()))
				  tam.add(s);
		  return tam;
	   }
	

}
