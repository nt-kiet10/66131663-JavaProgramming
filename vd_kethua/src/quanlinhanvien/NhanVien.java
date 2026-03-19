package quanlinhanvien;

public class NhanVien {
	private String maNV;
	private String hoTen;
	private double luongcoban;
//	public NhanVien() {
//		maNV="0";
//		hoTen="ABC";
//		luongcoban=1000;
//	}
	public NhanVien(String maNhanVien,String tenNhanVien,double luongCB) {
		this.maNV=maNhanVien;
		this.hoTen=tenNhanVien;
		this.luongcoban=luongCB;
    }
	public NhanVien() {
		super();
	}
	public double tinhluong() {
		return luongcoban;
	}
	@Override
	public String toString() {
		return "NhanVien [maNV=" + maNV + ", hoTen=" + hoTen + ", luongcoban=" + luongcoban + "]";
	}
	public void hienThiThongTin() {
		System.out.println("Mã nhân viên :" + maNV );
		System.out.println("Họ tên :" + hoTen );
		System.out.println("Lương cơ bản :" + luongcoban);
	}
	public String getMaNV() {
		return maNV;
	}
	public void setMaNV(String maNV) {
		this.maNV = maNV;
	}
	public String getHoTen() {
		return hoTen;
	}
	public void setHoTen(String hoTen) {
		this.hoTen = hoTen;
	}
	public double getLuongcoban() {
		return luongcoban;
	}
	public void setLuongcoban(double luongcoban) {
		this.luongcoban = luongcoban;
	}
	
	
}
	
