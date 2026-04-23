package thigk2.nguyentuankiet_bai2;
import java.util.Scanner;
import java.util.ArrayList;
import java.time.LocalDate;
public class Main {
	

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<SinhVien> qlsv = new ArrayList<SinhVien>();
		{
			qlsv.add(new SinhVien("SV001", "Nguyễn Văn A", 2003, 8.0));
	        qlsv.add(new SinhVien("SV002", "Trần Thị B", 2006, 7.5));
	        qlsv.add(new SinhVien("SV003", "Lê Văn C", 2004, 6.0));
		}
		System.out.println("Danh sach sinh vien hien tai:");
        for (SinhVien sv : qlsv) System.out.println(sv);

        System.out.println("\n--- Them sinh vien moi ---");
        System.out.print("Ma SV: "); String mssv = sc.nextLine();
        System.out.print("Ho ten: "); String ten = sc.nextLine();
        System.out.print("Nam sinh: "); int nam = sc.nextInt();
        System.out.print("Điem TB: "); double diem = sc.nextDouble();
        qlsv.add(new SinhVien(mssv, ten, nam, diem));

        System.out.println("\nDanh sach sau khi cap nhat:");
        for (SinhVien sv : qlsv) System.out.println(sv);

        int namHienTai = LocalDate.now().getYear();
        System.out.println("\nSinh vien lon hon 20 tuoi:");
        for (SinhVien sv : qlsv) {
            if (namHienTai - sv.getNamSinh() > 20) {
                System.out.println(sv);
            }
	}sc.close();
	}
}


