package vd2_arraylist;

import java.util.*;

// Lớp sinh viên
class SinhVien {
    private String maSV;
    private String hoTen;
    private double diemTB;

    public SinhVien(String maSV, String hoTen, double diemTB) {
        this.maSV = maSV;
        this.hoTen = hoTen;
        this.diemTB = diemTB;
    }

    public String getMaSV() { return maSV; }
    public String getHoTen() { return hoTen; }
    public double getDiemTB() { return diemTB; }

    @Override
    public String toString() {
        return String.format("Mã: %s | Họ tên: %s | Điểm TB: %.2f",
                maSV, hoTen, diemTB);
    }
}

// Lớp quản lý
class QuanLySinhVien {
    private List<SinhVien> danhSachSV = new ArrayList<>();

    public void themSinhVien(SinhVien sv) {
        danhSachSV.add(sv);
    }

    public SinhVien timTheoMa(String maSV) {
        for (SinhVien sv : danhSachSV) {
            if (sv.getMaSV().equals(maSV)) return sv;
        }
        return null;
    }

    public SinhVien timDiemCaoNhat() {
        if (danhSachSV.isEmpty()) return null;

        SinhVien max = danhSachSV.get(0);
        for (SinhVien sv : danhSachSV) {
            if (sv.getDiemTB() > max.getDiemTB()) {
                max = sv;
            }
        }
        return max;
    }

    public double tinhDiemTrungBinhLop() {
        double tong = 0;
        for (SinhVien sv : danhSachSV) {
            tong += sv.getDiemTB();
        }
        return danhSachSV.isEmpty() ? 0 : tong / danhSachSV.size();
    }

    public void sapXepTheoDiem() {
        danhSachSV.sort((a, b) -> Double.compare(b.getDiemTB(), a.getDiemTB()));
    }

    public void hienThiDanhSach() {
        System.out.printf("%-5s %-10s %-20s %-10s\n",
                "STT", "Mã SV", "Họ tên", "Điểm");

        for (int i = 0; i < danhSachSV.size(); i++) {
            SinhVien sv = danhSachSV.get(i);
            System.out.printf("%-5d %-10s %-20s %-10.2f\n",
                    i + 1, sv.getMaSV(), sv.getHoTen(), sv.getDiemTB());
        }
    }
}

// Main (chỉ class này public)
public class MainQuanLySinhVien {
    public static void main(String[] args) {

        QuanLySinhVien ql = new QuanLySinhVien();

        ql.themSinhVien(new SinhVien("SV101", "Nguyễn Minh Anh", 9.3));
        ql.themSinhVien(new SinhVien("SV102", "Trần Quốc Bảo", 6.7));
        ql.themSinhVien(new SinhVien("SV103", "Lê Hoàng Nam", 7.8));

        ql.hienThiDanhSach();

        System.out.println("\nSV cao điểm nhất:");
        System.out.println(ql.timDiemCaoNhat());
    }
}