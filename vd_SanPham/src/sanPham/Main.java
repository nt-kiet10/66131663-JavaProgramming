package sanPham;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		SanPham sp = new SanPham();
		sp.Nhap(sc);
		sp.Xuat();
		
		sc.close();
	}

}
