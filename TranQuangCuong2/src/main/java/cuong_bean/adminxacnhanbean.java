package cuong_bean;

import java.util.Date;

public class adminxacnhanbean {
	private long MaChiTietHD;
    private String hoten;
    private String tendd;
    private Date NgayMua;
    private long SoLuongMua;
    private long gia;
    private long ThanhTien;
    private boolean damua;
	public adminxacnhanbean() {
		super();
		// TODO Auto-generated constructor stub
	}
	public adminxacnhanbean(long maChiTietHD, String hoten, String tendd, Date ngayMua, long soLuongMua, long gia,
			long thanhTien, boolean damua) {
		super();
		MaChiTietHD = maChiTietHD;
		this.hoten = hoten;
		this.tendd = tendd;
		NgayMua = ngayMua;
		SoLuongMua = soLuongMua;
		this.gia = gia;
		ThanhTien = thanhTien;
		this.damua = damua;
	}
	public long getMaChiTietHD() {
		return MaChiTietHD;
	}
	public void setMaChiTietHD(long maChiTietHD) {
		MaChiTietHD = maChiTietHD;
	}
	public String getHoten() {
		return hoten;
	}
	public void setHoten(String hoten) {
		this.hoten = hoten;
	}
	public String getTendd() {
		return tendd;
	}
	public void setTendd(String tendd) {
		this.tendd = tendd;
	}
	public Date getNgayMua() {
		return NgayMua;
	}
	public void setNgayMua(Date ngayMua) {
		NgayMua = ngayMua;
	}
	public long getSoLuongMua() {
		return SoLuongMua;
	}
	public void setSoLuongMua(long soLuongMua) {
		SoLuongMua = soLuongMua;
	}
	public long getGia() {
		return gia;
	}
	public void setGia(long gia) {
		this.gia = gia;
	}
	public long getThanhTien() {
		return ThanhTien;
	}
	public void setThanhTien(long thanhTien) {
		ThanhTien = thanhTien;
	}
	public boolean isDamua() {
		return damua;
	}
	public void setDamua(boolean damua) {
		this.damua = damua;
	}
    
}
