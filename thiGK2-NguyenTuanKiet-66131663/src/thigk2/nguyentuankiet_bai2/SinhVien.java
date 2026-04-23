package thigk2.nguyentuankiet_bai2;

public class SinhVien {
     
	private String MSSV;
	private String hoTen;
	private int namSinh;
	private double diemSo;
	public SinhVien() {
		
	}
	public SinhVien(String mSSV, String hoTen, int namSinh,double diemSo) {
		super();
		MSSV = mSSV;
		this.hoTen = hoTen;
		this.namSinh = namSinh;
		this.diemSo = diemSo;
	}
	public String getMSSV() {
		return MSSV;
	}
	public void setMSSV(String mSSV) {
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
	@Override
	public String toString() {
		return "Bai2_QLSV [MSSV=" + MSSV + ", hoTen=" + hoTen + ", namSinh=" + namSinh + ", diemSo=" + diemSo + "]";
	}
	
	
	
}
