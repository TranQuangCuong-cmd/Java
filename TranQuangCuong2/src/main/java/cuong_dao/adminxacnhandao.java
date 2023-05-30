package cuong_dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Date;

import cuong_bean.adminxacnhanbean;
import cuong_dao.KetNoi;

public class adminxacnhandao {
	public ArrayList<adminxacnhanbean> getdanhsach(){
    	ArrayList<adminxacnhanbean> ds= new ArrayList<adminxacnhanbean>();
    	try {
    		//B1: ket noi vao csdl QlSach
    		KetNoi kn= new KetNoi();
    		kn.ketnoi();
    		//B2: lay du lieu ve
    		String sql="select * from ViewXacNhan";
    		PreparedStatement cmd=kn.cn.prepareStatement(sql);
    		ResultSet rs= cmd.executeQuery();
    		//B3: Duyet rs de luu vao ds
    		while(rs.next()) {
    			  long MaChiTietHD=rs.getLong("MaChiTietHD");
    			   String hoten=rs.getString("hoten");
    			   String tendd=rs.getString("tendd");;
    			    Date NgayMua=rs.getDate("NgayMua");
    			    long SoLuongMua=rs.getLong("SoLuongMua");;
    			    long gia=rs.getLong("gia");;
    			    long ThanhTien=rs.getLong("ThanhTien");;
    			    boolean damua=rs.getBoolean("damua");
    			    ds.add(new adminxacnhanbean(MaChiTietHD, hoten, tendd, NgayMua, SoLuongMua, gia, ThanhTien, damua));
    		}
    		//b4: Dong cac doi tuong
    		rs.close();kn.cn.close();
    		return ds;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
    	
}
 public boolean xacnhan( int macthd) {
	 try {
    		//B1: ket noi vao csdl QlSach
    		KetNoi kn= new KetNoi();
    		kn.ketnoi();
    		//B2: lay du lieu ve
    		String sql="update ChiTietHoaDon set damua = 1 where MaChiTietHD = ?";
    		PreparedStatement cmd=kn.cn.prepareStatement(sql);
    		cmd.setInt(1, macthd);
    		cmd.executeUpdate();
    		kn.cn.close();
    		return true;
		} catch (Exception e) {
			return false;
		}
 }
}
