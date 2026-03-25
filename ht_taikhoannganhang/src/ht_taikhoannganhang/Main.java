package ht_taikhoannganhang;

public class Main {
    public static void main(String[] args) {

        TaiKhoanThanhToan tkTT = new TaiKhoanThanhToan("001", "Nguyen Van A", 5000, 2000, 0.02);

        System.out.println("===== TÀI KHOẢN THANH TOÁN =====");
        tkTT.hienThiThongTin();
        
        tkTT.guiTien(1000);
        tkTT.rutTien(6000);
        tkTT.tinhLai();

        System.out.println("Sau giao dịch:");
        tkTT.hienThiThongTin();

        TaiKhoanTietKiem tkTK = new TaiKhoanTietKiem( "002", "Tran Thi B", 10000, 12, 0.05);

        System.out.println("\n===== TÀI KHOẢN TIẾT KIỆM =====");
        tkTK.hienThiThongTin();
        System.out.println("Tiền lãi dự kiến: " + tkTK.tinhLai());
        tkTK.rutTien(2000);
        System.out.println("Sau giao dịch:");
        tkTK.hienThiThongTin();
    }
}