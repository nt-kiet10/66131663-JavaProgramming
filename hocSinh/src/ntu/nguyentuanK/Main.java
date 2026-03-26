package ntu.nguyentuanK;
import java.util.Scanner;
import java.util.ArrayList;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<HocSinh> list = new ArrayList<>();
		//Nhap so luong hoc sinh
		System.out.print("Nhap so luong hoc sinh: ");
		int n = Integer.parseInt(sc.nextLine());
		
		for(int i=1;i <= n;i++) {
			System.out.println("Nhap thong tin hoc sinh thu " + i + ":");
			HocSinh hs = new HocSinh();
			System.out.print("Nhap ten hoc sinh : ");
			hs.setTenHS(sc.nextLine());
			System.out.print("Nhap tuoi hoc sinh : ");
			hs.setTuoiHS(Integer.parseInt(sc.nextLine()));
			System.out.print("Nhap lop hoc sinh : ");
		    hs.setLopHS(sc.nextLine());
			list.add(hs);
		}
			System.out.println("\n===== DANH SACH HOC SINH =====");
	        for (HocSinh hs : list) {
	            System.out.println(hs.toString());
	        }
        // Thêm 1 học sinh mới
	        System.out.println("\n===== thêm 1 bạn học sinh mới =====");
	        HocSinh newHS = new HocSinh();
			System.out.print("Nhap ten hoc sinh : ");
			newHS.setTenHS(sc.nextLine());
			System.out.print("Nhap tuoi hoc sinh : ");
			newHS.setTuoiHS(Integer.parseInt(sc.nextLine()));
			System.out.print("Nhap lop hoc sinh : ");
		    newHS.setLopHS(sc.nextLine());
			list.add(newHS);
		//Xoa hoc sinh ten cu the
		    System.out.println("\n===== xoá 1 học sinh =====");
		    String tenXoa = sc.nextLine();
		    boolean daXoa = list.removeIf(hs -> hs.getTenHS().equalsIgnoreCase(tenXoa));
			if(daXoa) {
				 System.out.println("Da xoa hoc sinh ten: " + tenXoa);
			} else {
			    System.out.println("Khong tim thay hoc sinh ten: " + tenXoa);
			}
	        sc.close();
	}

}
