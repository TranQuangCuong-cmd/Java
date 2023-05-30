package cuong_bean;

public class giohangbean {
	private String madd;
	private String tendd;
	private long gia;
	private long soluong;
	private long thanhtien;
	public giohangbean() {
		super();
		// TODO Auto-generated constructor stub
	}
	public giohangbean(String madd, String tendd, long gia, long soluong, long thanhtien) {
		super();
		this.madd = madd;
		this.tendd = tendd;
		this.gia = gia;
		this.soluong = soluong;
		this.thanhtien = thanhtien;
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
	public long getGia() {
		return gia;
	}
	public void setGia(long gia) {
		this.gia = gia;
	}
	public long getSoluong() {
		return soluong;
	}
	public void setSoluong(long soluong) {
		this.soluong = soluong;
	}
	public long getThanhtien() {
		return  soluong*gia;
	}
	public void setThanhtien(long thanhtien) {
		this.thanhtien = thanhtien;
	}
	
}
