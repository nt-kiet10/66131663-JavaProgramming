package quanlinhanvien;

public class NhanVienKD extends NhanVien {
	private double doanhSo;
	private double tyleHoaHong;
	
	public NhanVienKD(String maNV, String hoTen, double luongCoBan,double doanhSo, double tyLeHoaHong) {
        super(maNV, hoTen, luongCoBan);
        this.doanhSo = doanhSo;
        this.tyleHoaHong = tyLeHoaHong;
    }
    
    @Override
    public double tinhluong() {
        return getLuongcoban() + (doanhSo * tyleHoaHong / 100);
    }
    
    @Override
    public void hienThiThongTin() {
        super.hienThiThongTin();
        System.out.println("Doanh số: " + this.doanhSo);
        System.out.println("Tỷ lệ hoa hồng: " + tyleHoaHong);
        System.out.println("Tổng lương: " + this.tinhluong());
        System.out.println("Chức vụ: Nhân viên kinh doanh");
    }
    public void chamSocKhachHang() {
        System.out.println(getHoTen() + " đang chăm sóc khách hàng...");
    }
}
    
