package cuong_bo;

import java.util.ArrayList;

import cuong_bean.giohangbean;

public class giohangbo {
	public ArrayList<giohangbean> ds =  new ArrayList<giohangbean>();
	public void Them (String madd, String tendd, long gia, long soluong) {
		 for(giohangbean h: ds)
			   if(h.getMadd().equals(madd)) {
				   h.setSoluong(h.getSoluong()+ soluong);
				   return;
			   }
		ds.add(new giohangbean(madd, tendd, gia, soluong, soluong));
	}
	 public long Tongtien() {
		   long s=0;
		   if(ds.size()>=1) {
			   for(giohangbean h: ds)
				   s=s+h.getThanhtien();
		   }
		   
		   return s;
	 }
	 public void UpdateSl(String masach, long soluong) {
		 if (masach!=null) 
	    	{		for(giohangbean g: ds)
	    			if(g.getMadd().equals(masach)) {
	    				g.setSoluong(soluong);
	    				return;
	    			}
	    	}
	 }
	 public void xoa1pt(String masach) {
		 if (masach!=null) 
	    	{		for(int i = 0; i<ds.size();i++)
	    			if(ds.get(i).getMadd().equals(masach)) {
	    				ds.remove(i);
	    				return;
	    			}
	    	}
	 }
}
