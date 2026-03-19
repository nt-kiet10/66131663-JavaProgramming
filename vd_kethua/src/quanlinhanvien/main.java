package quanlinhanvien;

public class Main {

    public static void main(String[] args) {

        // Nhân viên thường
        NhanVien nv1 = new NhanVien("001", "Tuấn Kiệt", 10000);
        System.out.println(nv1);
        System.out.println();

        // Nhân viên văn phòng
        NhanVienVP nv2 = new NhanVienVP(
                "002", "Trần Thị Tươi Thắm", 2300000, 3, 200000);
        System.out.println(nv2);
        System.out.println();

        // Quản lý
        QuanLy ql = new QuanLy(
                "003", "Nguyễn Văn A", 5000000, 1000000, 2.0);
        System.out.println(ql);
        ql.hopBanGiamDoc();
        System.out.println();

        // (Nếu đã tạo class này)
        // Nhân viên kinh doanh
        /*
        NhanVienKinhDoanh kd = new NhanVienKinhDoanh(
                "004", "Lê Văn B", 3000000, 20000000, 5);
        System.out.println(kd);
        kd.chamSocKhachHang();
        */
    }
}