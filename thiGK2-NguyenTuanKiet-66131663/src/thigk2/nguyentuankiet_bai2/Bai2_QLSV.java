package thigk2.nguyentuankiet_bai2;

public class Bai2_QLSV {
     
	private int MSSV;
	private String hoTen;
	private int namSinh;
	private double diemSo;
	public Bai2_QLSV() {
		
	}
	public Bai2_QLSV(int mSSV, String hoTen, int namSinh,double diemSo) {
		super();
		MSSV = mSSV;
		this.hoTen = hoTen;
		this.namSinh = namSinh;
		this.diemSo = diemSo;
	}
	public int getMSSV() {
		return MSSV;
	}
	public void setMSSV(int mSSV) {
		MSSV = mSSV;
	}
	public String getHoTen() {
		return hoTen;
	}
	public void setHoTen(String hoTen) {
		this.hoTen = hoTen;
	}
	public int getNamSinh() {
		return namSinh;
	}
	public void setNamSinh(int namSinh) {
		this.namSinh = namSinh;
	}
	public double getDiemSo() {
		return diemSo;
	}
	public void setDiemSo(double diemSo) {
		this.diemSo = diemSo;
	}
	
	
	
}
