package cuong_bean;

import java.util.Date;

public class lichsubean {
	private Date NgayMua;
	private String madd;
	private String tendd;
	private int SoLuongMua;
	private int gia;
	private int thanhtien;
	public lichsubean() {
		super();
		// TODO Auto-generated constructor stub
	}
	public lichsubean(Date ngayMua, String madd, String tendd, int soLuongMua, int gia, int thanhtien) {
		super();
		NgayMua = ngayMua;
		this.madd = madd;
		this.tendd = tendd;
		SoLuongMua = soLuongMua;
		this.gia = gia;
		this.thanhtien = thanhtien;
	}
	public Date getNgayMua() {
		return NgayMua;
	}
	public void setNgayMua(Date ngayMua) {
		NgayMua = ngayMua;
	}
	public String getMadd() {
		return madd;
	}
	public void setMadd(String madd) {
		this.madd = madd;
	}
	public String getTendd() {
		return tendd;
	}
	public void setTendd(String tendd) {
		this.tendd = tendd;
	}
	public int getSoLuongMua() {
		return SoLuongMua;
	}
	public void setSoLuongMua(int soLuongMua) {
		SoLuongMua = soLuongMua;
	}
	public int getGia() {
		return gia;
	}
	public void setGia(int gia) {
		this.gia = gia;
	}
	public int getThanhtien() {
		return thanhtien;
	}
	public void setThanhtien(int thanhtien) {
		this.thanhtien = thanhtien;
	}
	
}
