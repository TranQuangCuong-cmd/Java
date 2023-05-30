package cuong_dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Date;

import cuong_bean.admindidongbean;
import cuong_dao.KetNoi;

public class admindidongdao {
	public ArrayList<admindidongbean> getsach(){
		ArrayList<admindidongbean> ds=new ArrayList<admindidongbean>();
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
				String madd = rs.getString("madd");
				String tendd = rs.getString("tendd");
				int soluong= rs.getInt("soluong");
				int gia= rs.getInt("gia");
				String maloai = rs.getString("maloai");
				String anh =rs.getString("anh");
				String NgayNhap = rs.getString("NgayNhap");
				String xuatxu = rs.getString("xuatxu");
				ds.add(new admindidongbean(madd, tendd, soluong, gia, maloai, anh, NgayNhap, xuatxu));
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
	public  Boolean adddidong(String madd, String tendd, int soluong, int gia, String maloai, String anh, String ngaynhap,String xuatxu){
    	try {
    		//b1 Kết nối vào csdl QLSach
			KetNoi kn = new KetNoi();
			kn.ketnoi();
			//B2: Lấy dữ liệu về
			String sql ="insert into didong values(?, ? ,?,?,?,?,?,?)";
			PreparedStatement cmd = kn.cn.prepareStatement(sql);
			cmd.setString(1, madd);
			cmd.setString(2,tendd);
			cmd.setInt(3, soluong);
			cmd.setInt(4, gia);
			cmd.setString(5, maloai);
			cmd.setString(6, anh);
			cmd.setString(7, ngaynhap);
			cmd.setString(8,xuatxu);
			cmd.executeUpdate();
			kn.cn.close();
			return true;
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			return false;
		}
	}
	public static void main(String[] args) {
		admindidongdao d = new admindidongdao();
		if(d.adddidong("test1", "cuong demo", 0, 0, null, null, null, null)) {
			System.out.println("ok");
		}
	}
}
