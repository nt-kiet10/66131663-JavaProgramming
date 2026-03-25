package ht_taikhoannganhang;

public class TaiKhoanTietKiem extends TaiKhoan {
    private int kyHan;     
    private double laiSuat;  

    public TaiKhoanTietKiem(String soTK, String ten, double soDu, int kyHan, double laiSuat) {
        super(soTK, ten, soDu);
        this.kyHan = kyHan;
        this.laiSuat = laiSuat;
    }

    // tính tiền lãi
    public double tinhLai() {
        return soDu * laiSuat * kyHan / 12;
    }

    @Override
    public void rutTien(double soTien) {
        if (soTien <= soDu) {
            soDu -= soTien;
            System.out.println("Rút trước hạn → không tính lãi!");
        } else {
            System.out.println("Không đủ tiền!");
        }
    }

    @Override
    public void hienThiThongTin() {
        super.hienThiThongTin();
        System.out.println("Kỳ hạn: " + kyHan + " tháng");
        System.out.println("Lãi suất: " + (laiSuat * 100) + "%");
        System.out.println("Tiền lãi dự kiến: " + tinhLai());
    }
}