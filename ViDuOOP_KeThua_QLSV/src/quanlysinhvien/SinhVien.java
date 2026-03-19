package quanlysinhvien;

public class SinhVien {
      //Thuộc tính
	private String maSV;
	private String hoTen;
	private double diemTB;
	 //Hàm tạo 
		public SinhVien(String maSinhVien, String hoTen, double diemTB) {
		super();
		this.maSV = maSinhVien;
		this.hoTen = hoTen;
		this.diemTB = diemTB;
	}
		public SinhVien() {
		super();
	}
		public double diemTB() {
			return diemTB;
		}
		@Override
		public String toString() {
			return "SinhVien [maSV=" + maSV + ", hoTen=" + hoTen + ", diemTB=" + diemTB + "]";
		}

}
