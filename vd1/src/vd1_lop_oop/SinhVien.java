package vd1_lop_oop;
import java.util.Scanner;
public class SinhVien {
	    private String ten;
	    private int tuoi;
	    private String masv;

	    public SinhVien() {
	    }

	    public SinhVien(String ten, int tuoi, String masv) {
	        this.ten = ten;
	        this.tuoi = tuoi;
	        this.masv = masv;
	    }

	    public void hocbai(String mon) {
	        System.out.println(ten + " dang hoc " + mon);
	    }

	    public void hienThi() {
	        System.out.printf("%s nam nay %d co ma sinh vien la %s\n", ten, tuoi, masv);
	    }
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

        System.out.print("Nhap ten: ");
        String ten = sc.nextLine();

        System.out.print("Nhap tuoi: ");
        int tuoi = sc.nextInt();
        sc.nextLine();

        System.out.print("Nhap ma SV: ");
        String masv = sc.nextLine();

        SinhVien sv = new SinhVien(ten, tuoi, masv);
        sv.hocbai("Java");
        sv.hienThi();

        sc.close();
	}

}
