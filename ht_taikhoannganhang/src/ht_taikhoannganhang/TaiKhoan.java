package ht_taikhoannganhang;

public class TaiKhoan {
    protected String soTaiKhoan;
    protected String tenChuTaiKhoan;
    protected double soDu;

    // Constructor mặc định
    public TaiKhoan() {
        this.soTaiKhoan = "";
        this.tenChuTaiKhoan = "";
        this.soDu = 0;
    }

    // Constructor đầy đủ
    public TaiKhoan(String soTK, String ten, double soDu) {
        this.soTaiKhoan = soTK;
        this.tenChuTaiKhoan = ten;
        this.soDu = soDu;
    }

    // Getter & Setter 
    public String getSoTaiKhoan() {
        return soTaiKhoan;
    }

    public void setSoTaiKhoan(String soTaiKhoan) {
        this.soTaiKhoan = soTaiKhoan;
    }

    public String getTenChuTaiKhoan() {
        return tenChuTaiKhoan;
    }

    public void setTenChuTaiKhoan(String tenChuTaiKhoan) {
        this.tenChuTaiKhoan = tenChuTaiKhoan;
    }

    public double getSoDu() {
        return soDu;
    }

    public void setSoDu(double soDu) {
        if (soDu >= 0) {
            this.soDu = soDu;
        }
    }

    // Gửi tiền
    public void guiTien(double soTien) {
        if (soTien > 0) {
            soDu += soTien;
            System.out.println("Gửi tiền thành công!");
        } else {
            System.out.println("Số tiền không hợp lệ!");
        }
    }

    // Rút tiền
    public void rutTien(double soTien) {
        if (soTien <= 0) {
            System.out.println("Số tiền không hợp lệ!");
        } else if (soTien > soDu) {
            System.out.println("Không đủ tiền!");
        } else {
            soDu -= soTien;
            System.out.println("Rút tiền thành công!");
        }
    }

    // Hiển thị
    public void hienThiThongTin() {
        System.out.println("Số TK: " + soTaiKhoan);
        System.out.println("Chủ TK: " + tenChuTaiKhoan);
        System.out.println("Số dư: " + soDu);
    }
}