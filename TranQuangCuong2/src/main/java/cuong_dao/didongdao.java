package cuong_dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import cuong_bean.didongbean;

public class didongdao {
	public ArrayList<didongbean> getdidong(){
		ArrayList<didongbean> ds=new ArrayList<didongbean>();
		try {
			//b1 Kết nối vào csdl QLSach
			KetNoi kn = new KetNoi();
			kn.ketnoi();
			//B2: Lấy dữ liệu về
			String sql ="select * from didong";
			PreparedStatement cmd = kn.cn.prepareStatement(sql);
			ResultSet rs = cmd.executeQuery();
			//B3: Duyệt rs để lưu vào danh sách
			while (rs.next()) {
				//lay ve ma loai va ten loai
				String madd =rs.getString("madd");
				String tendd = rs.getString("tendd");
				int soluong = rs.getInt("soluong");
				int gia = rs.getInt("gia");
				String maloai = rs.getString("maloai");
				String anh = rs.getString("anh");
				String xuatxu =rs.getString("xuatxu");
				ds.add(new didongbean(madd, tendd, soluong, gia, maloai, anh, xuatxu));
			}
			//b4 đóng các đối tượng
			rs.close();
			kn.cn.close();
			return ds;
			
		} catch (Exception e) {
			// TODO: handle exception
		}
    	return ds;
	}
}
