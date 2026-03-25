package ht_taikhoannganhang;

public class TaiKhoanThanhToan extends TaiKhoan {
    private double hanMuc;
    private double laiSuat; // thêm lãi suất

    public TaiKhoanThanhToan(String soTK, String ten, double soDu, double hanMuc, double laiSuat) {
        super(soTK, ten, soDu);
        this.hanMuc = hanMuc;
        this.laiSuat = laiSuat;
    }

    @Override
    public void rutTien(double soTien) {
        if (soTien > 0 && soTien <= soDu + hanMuc) {
            soDu -= soTien;
            System.out.println("Rút tiền (TK thanh toán) thành công!");
        } else {
            System.out.println("Vượt quá hạn mức!");
        }
    }

    //  Hàm tính lãi
    public void tinhLai() {
        double lai = soDu * laiSuat;
        soDu += lai;
        System.out.println("Lãi TK thanh toán: " + lai);
    }

    @Override
    public void hienThiThongTin() {
        super.hienThiThongTin();
        System.out.println("Hạn mức: " + hanMuc);
        System.out.println("Lãi suất: " + laiSuat);
    }
}