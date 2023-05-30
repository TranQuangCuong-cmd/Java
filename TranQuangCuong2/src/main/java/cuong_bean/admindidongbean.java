package cuong_bean;

import java.util.Date;

public class admindidongbean {
	private String madd;
	private String tendd;
	private int soluong;
	private int gia;
	private String maloai;
	private String anh;
	private String ngaynhap;
	private String xuatxu;
	public admindidongbean() {
		super();
		// TODO Auto-generated constructor stub
	}
	public admindidongbean(String madd, String tendd, int soluong, int gia, String maloai, String anh, String ngaynhap,
			String xuatxu) {
		super();
		this.madd = madd;
		this.tendd = tendd;
		this.soluong = soluong;
		this.gia = gia;
		this.maloai = maloai;
		this.anh = anh;
		this.ngaynhap = ngaynhap;
		this.xuatxu = xuatxu;
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
	public int getSoluong() {
		return soluong;
	}
	public void setSoluong(int soluong) {
		this.soluong = soluong;
	}
	public int getGia() {
		return gia;
	}
	public void setGia(int gia) {
		this.gia = gia;
	}
	public String getMaloai() {
		return maloai;
	}
	public void setMaloai(String maloai) {
		this.maloai = maloai;
	}
	public String getAnh() {
		return anh;
	}
	public void setAnh(String anh) {
		this.anh = anh;
	}
	public String getNgaynhap() {
		return ngaynhap;
	}
	public void setNgaynhap(String ngaynhap) {
		this.ngaynhap = ngaynhap;
	}
	public String getXuatxu() {
		return xuatxu;
	}
	public void setXuatxu(String xuatxu) {
		this.xuatxu = xuatxu;
	}
	
}
